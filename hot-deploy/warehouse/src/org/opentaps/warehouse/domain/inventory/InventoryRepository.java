/*
 * Copyright (c) 2006 - 2009 Open Source Strategies, Inc.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the Honest Public License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Honest Public License for more details.
 *
 * You should have received a copy of the Honest Public License
 * along with this program; if not, write to Funambol,
 * 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
 */
package org.opentaps.warehouse.domain.inventory;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javolution.util.FastList;
import javolution.util.FastMap;

import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.UtilDateTime;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.base.util.UtilValidate;
import org.ofbiz.entity.GenericDelegator;
import org.ofbiz.entity.condition.EntityConditionList;
import org.ofbiz.entity.condition.EntityExpr;
import org.ofbiz.entity.condition.EntityOperator;
import org.ofbiz.entity.util.EntityFindOptions;
import org.opentaps.domain.base.entities.Facility;
import org.opentaps.domain.base.entities.InventoryItemAndLocation;
import org.opentaps.domain.base.entities.InventoryItemDetail;
import org.opentaps.domain.base.entities.InventoryItemTraceDetail;
import org.opentaps.domain.base.entities.InventoryItemValueHistory;
import org.opentaps.domain.base.entities.InventoryItemVariance;
import org.opentaps.domain.base.entities.InventoryTransfer;
import org.opentaps.domain.base.entities.ItemIssuance;
import org.opentaps.domain.base.entities.Lot;
import org.opentaps.domain.base.entities.OrderItemShipGrpInvRes;
import org.opentaps.domain.base.entities.PhysicalInventory;
import org.opentaps.domain.base.entities.WorkEffort;
import org.opentaps.domain.base.entities.WorkEffortInventoryAssign;
import org.opentaps.domain.base.entities.WorkEffortInventoryProduced;
import org.opentaps.domain.inventory.InventoryItem;
import org.opentaps.domain.inventory.InventoryItemTrace;
import org.opentaps.domain.inventory.InventoryRepositoryInterface;
import org.opentaps.domain.inventory.PicklistAndBinAndItem;
import org.opentaps.domain.product.Product;
import org.opentaps.domain.product.ProductRepositoryInterface;
import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.entity.EntityNotFoundException;
import org.opentaps.foundation.infrastructure.Infrastructure;
import org.opentaps.foundation.infrastructure.InfrastructureException;
import org.opentaps.foundation.infrastructure.User;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.ofbiz.Repository;


/** {@inheritDoc} */
public class InventoryRepository extends Repository implements InventoryRepositoryInterface {

    private ProductRepositoryInterface productRepository;
    private static final String MODULE = InventoryRepository.class.getName();

    /**
     * Default constructor.
     */
    public InventoryRepository() {
        super();
    }

    /**
     * Use this for Repositories which will only access the database via the delegator.
     * @param delegator the delegator
     */
    public InventoryRepository(GenericDelegator delegator) {
        super(delegator);
    }

    /**
     * Use this for domain Repositories.
     * @param infrastructure the domain infrastructure
     * @param user the domain user
     * @throws RepositoryException if an error occurs
     */
    public InventoryRepository(Infrastructure infrastructure, User user) throws RepositoryException {
        super(infrastructure, user);
    }

    /** {@inheritDoc} */
    public org.opentaps.domain.inventory.InventoryItem getInventoryItemById(String inventoryItemId) throws RepositoryException, EntityNotFoundException {
        return (org.opentaps.domain.inventory.InventoryItem) getInventoryItemById(inventoryItemId, org.opentaps.domain.inventory.InventoryItem.class);
    }

    /** {@inheritDoc} */
    public org.opentaps.domain.base.entities.InventoryItem getInventoryItemById(
            String inventoryItemId,
            Class<? extends org.opentaps.domain.base.entities.InventoryItem> clazz)
            throws RepositoryException, EntityNotFoundException {

        return findOneNotNull(clazz, map(org.opentaps.domain.base.entities.InventoryItem.Fields.inventoryItemId, inventoryItemId), "InventoryItem [" + inventoryItemId + "] not found");
    }

    /** {@inheritDoc} */
    public Facility getFacilityById(String facilityId) throws RepositoryException, EntityNotFoundException {
        return findOneNotNull(Facility.class, map(Facility.Fields.facilityId, facilityId), "Facility entity [" + facilityId + "] not found");
    }

    /** {@inheritDoc} */
    public List<InventoryItem> getInventoryItemsForProductId(String productId) throws RepositoryException {
        return findList(InventoryItem.class, map(InventoryItem.Fields.productId, productId));
    }

    /** {@inheritDoc} */
    public List<InventoryItem> getInventoryItemsWithNegativeATP(String facilityId, String productId) throws RepositoryException {
        EntityConditionList conditions1 = new EntityConditionList(UtilMisc.toList(
                new EntityExpr("availableToPromiseTotal", EntityOperator.EQUALS, null),
                new EntityExpr("availableToPromiseTotal", EntityOperator.LESS_THAN, 0)),
                EntityOperator.OR);
        EntityConditionList conditions = new EntityConditionList(UtilMisc.toList(
                conditions1,
                new EntityExpr("facilityId", EntityOperator.EQUALS, facilityId),
                new EntityExpr("productId", EntityOperator.EQUALS, productId),
                new EntityExpr("inventoryItemTypeId", EntityOperator.EQUALS, "NON_SERIAL_INV_ITEM")),
                EntityOperator.AND);
        return findList(InventoryItem.class, conditions);
    }

    /** {@inheritDoc} */
    public List<InventoryItem> getInventoryItemsWithNegativeATP(InventoryItem inventoryItem) throws RepositoryException {
        return getInventoryItemsWithNegativeATP(inventoryItem.getFacilityId(), inventoryItem.getProductId());
    }

    /** {@inheritDoc} */
    public List<OrderItemShipGrpInvRes> getOrderItemShipGroupInventoryReservations(InventoryItem inventoryItem) throws RepositoryException {
        if (inventoryItem.getQuantityOnHandTotal() != inventoryItem.getAvailableToPromiseTotal()) {
            return findList(OrderItemShipGrpInvRes.class, map(OrderItemShipGrpInvRes.Fields.inventoryItemId, inventoryItem.getInventoryItemId()));
        } else {
            return new ArrayList<OrderItemShipGrpInvRes>();
        }
    }

    /** {@inheritDoc} */
    public List<OrderItemShipGrpInvRes> getOrderItemShipGroupInventoryReservations(
            String orderId, String orderItemSeqId, String inventoryItemId, String shipGroupSeqId)
            throws RepositoryException {

        // Doesn't include InventoryItemId to conditions if it is null.
        Map<EntityFieldInterface<? super OrderItemShipGrpInvRes>, Object> conditions = FastMap.newInstance();
        conditions.put(OrderItemShipGrpInvRes.Fields.orderId, orderId);
        conditions.put(OrderItemShipGrpInvRes.Fields.orderItemSeqId, orderItemSeqId);
        if (UtilValidate.isNotEmpty(inventoryItemId)) {
            conditions.put(OrderItemShipGrpInvRes.Fields.inventoryItemId, inventoryItemId);
        }
        if (UtilValidate.isNotEmpty(shipGroupSeqId)) {
            conditions.put(OrderItemShipGrpInvRes.Fields.shipGroupSeqId, shipGroupSeqId);
        }

        return findList(OrderItemShipGrpInvRes.class, conditions);
    }

    /** {@inheritDoc} */
    public List<PicklistAndBinAndItem> getOpenPicklistBinItems(OrderItemShipGrpInvRes reservation) throws RepositoryException {
        return getOpenPicklistBinItems(reservation.getOrderId(), reservation.getShipGroupSeqId(), reservation.getOrderItemSeqId(), reservation.getInventoryItemId());
    }

    /** {@inheritDoc} */
    public List<PicklistAndBinAndItem> getOpenPicklistBinItems(String orderId, String shipGroupSeqId, String orderItemSeqId, String inventoryItemId) throws RepositoryException {
        EntityConditionList conditions = new EntityConditionList(UtilMisc.toList(
                new EntityExpr("orderId", EntityOperator.EQUALS, orderId),
                new EntityExpr("shipGroupSeqId", EntityOperator.EQUALS, shipGroupSeqId),
                new EntityExpr("orderItemSeqId", EntityOperator.EQUALS, orderItemSeqId),
                new EntityExpr("inventoryItemId", EntityOperator.EQUALS, inventoryItemId),
                new EntityExpr("statusId", EntityOperator.NOT_EQUAL, PicklistAndBinAndItem.STATUS_PICKED),
                new EntityExpr("statusId", EntityOperator.NOT_EQUAL, PicklistAndBinAndItem.STATUS_CANCELLED)),
                EntityOperator.AND);
        return findList(PicklistAndBinAndItem.class, conditions);
    }

    /** {@inheritDoc} */
    public List<InventoryItem> getInventoryItems(Product product, FacilityLocationType locationType, InventoryReservationOrder method, String facilityId, String containerId) throws RepositoryException {

        String type = null;
        if (locationType != null) {
            if (locationType.equals(FacilityLocationType.PRIMARY)) {
                type = "FLT_PICKLOC";
            } else if (locationType.equals(FacilityLocationType.BULK)) {
                type = "FLT_BULK";
            }
        }

        List<String> orderBy = FastList.newInstance();
        if (InventoryReservationOrder.GREATER_UNIT_COST.equals(method)) {
            orderBy.add("unitCost DESC");
        } else if (InventoryReservationOrder.LESS_UNIT_COST.equals(method)) {
            orderBy.add("unitCost ASC");
        } else if (InventoryReservationOrder.FIFO_EXPIRE.equals(method)) {
            orderBy.add("expireDate ASC");
        } else if (InventoryReservationOrder.LIFO_EXPIRE.equals(method)) {
            orderBy.add("expireDate DESC");
        } else if (InventoryReservationOrder.LIFO_RECEIVED.equals(method)) {
            orderBy.add("datetimeReceived DESC");
        } else {
            orderBy.add("datetimeReceived ASC");
        }

        // once the method order by set, get the higher ATP first
        //orderBy.add("availableToPromiseTotal DESC");
        // then at equal ATP get the higher QOH
        //orderBy.add("quantityOnHandTotal DESC");
        // finally add order by ID, we should get the latest inventory at the end
        orderBy.add("inventoryItemId ASC");

        List<EntityExpr> conditionList = FastList.newInstance();
        conditionList.add(new EntityExpr("productId", EntityOperator.EQUALS, product.getProductId()));
        if (UtilValidate.isNotEmpty(facilityId)) {
            conditionList.add(new EntityExpr("facilityId", EntityOperator.EQUALS, facilityId));
        }
        if (UtilValidate.isNotEmpty(containerId)) {
            conditionList.add(new EntityExpr("containerId", EntityOperator.EQUALS, containerId));
        }
        if (UtilValidate.isNotEmpty(type)) {
            conditionList.add(new EntityExpr("locationTypeEnumId", EntityOperator.EQUALS, type));
        }

        List<InventoryItemAndLocation> values = findList(InventoryItemAndLocation.class, conditionList, Arrays.asList("inventoryItemId"));
        if (UtilValidate.isEmpty(values)) {
            return null;
        }

        List<InventoryItem> result = findList(InventoryItem.class, new EntityExpr("inventoryItemId", EntityOperator.IN, Entity.getDistinctFieldValues(values, InventoryItemAndLocation.Fields.inventoryItemId)), orderBy);

        if (UtilValidate.isEmpty(result)) {
            return null;
        }
        return result;
    }

    /** {@inheritDoc} */
    public List<InventoryTransfer> getPendingInventoryTransfers(InventoryItem inventoryItem) throws RepositoryException {
        return findList(InventoryTransfer.class, map(InventoryTransfer.Fields.inventoryItemId, inventoryItem.getInventoryItemId(), InventoryTransfer.Fields.statusId, "IXF_REQUESTED"));
    }

    /** {@inheritDoc} */
    public Product getRelatedProduct(InventoryItem inventoryItem) throws RepositoryException {
        try {
            return getProductRepository().getProductById(inventoryItem.getProductId());
        } catch (EntityNotFoundException e) {
            return null;
        }
    }

    protected ProductRepositoryInterface getProductRepository() throws RepositoryException {
        if (productRepository == null) {
            productRepository = getDomainsDirectory().getProductDomain().getProductRepository();
        }
        return productRepository;
    }

    /* (non-Javadoc)
     * @see org.opentaps.domain.inventory.InventoryRepositoryInterface#getLotById(java.lang.String)
     */
    public Lot getLotById(String lotId) throws RepositoryException, EntityNotFoundException {
        return findOne(Lot.class, map(Lot.Fields.lotId, lotId));
    }

    /* (non-Javadoc)
     * @see org.opentaps.domain.inventory.InventoryRepositoryInterface#createInventoryTrace(org.opentaps.domain.base.entities.InventoryItem)
     */
    public InventoryItemTrace createInventoryTrace(org.opentaps.domain.base.entities.InventoryItem inventoryItem)  throws RepositoryException, InfrastructureException {

        InventoryItemTrace inventoryItemTrace = new InventoryItemTrace();
        inventoryItemTrace.setInventoryItemTraceId(getNextSeqId("InventoryItemTrace"));
        inventoryItemTrace.setInventoryItemId(inventoryItem.getInventoryItemId());
        inventoryItemTrace.setLotId(inventoryItem.getLotId());
        inventoryItemTrace.setRunDatetime(UtilDateTime.nowTimestamp());
        inventoryItemTrace.setRunByUserLogin(getUser().getUserId());

        createOrUpdate(inventoryItemTrace);

        return inventoryItemTrace;
    }

    /* (non-Javadoc)
     * @see org.opentaps.domain.inventory.InventoryRepositoryInterface#createInventoryTraceEvent(org.opentaps.domain.base.entities.InventoryItemTraceDetail)
     */
    @SuppressWarnings("unchecked")
    public void createInventoryTraceEvent(InventoryItemTraceDetail event, InventoryItemTrace traceEntry) throws RepositoryException {
        createOrUpdate(event);

        // if the item has just been received, transferred, or otherwise popped into existence somehow (UNKNOWN), then the inventoryItemId is stored in toInventoryItemId
        // otherwise, it's in inventoryItemId
        String inventoryItemIdForVariance = event.getInventoryItemId();
        List<String> usageTypeIdsForToInventoryItemId = UtilMisc.toList("TRANSFER", "RECEIPT", "UNKNOWN");
        if (usageTypeIdsForToInventoryItemId.contains(event.getInventoryItemUsageTypeId())) {
            inventoryItemIdForVariance = event.getToInventoryItemId();
        }

        // find the inventory item's variance
        List<InventoryItemVariance> variances = 
            findList(InventoryItemVariance.class, new EntityExpr("inventoryItemId", EntityOperator.EQUALS, inventoryItemIdForVariance), Arrays.asList("physicalInventoryId"));
        Debug.logVerbose("Found inventory item ID [" + event.getToInventoryItemId() + "] variances :" + variances, MODULE);

        // record all the variances which have not already been recorded.  We want each inventory variance to show up only once, ie the first time it is recorded
        if (UtilValidate.isNotEmpty(variances)) {
            for (InventoryItemVariance variance : variances) { 
                // find existing trace details for this inventory variance.  Just physical inventory ID should be enough--each one should be unique
                List<InventoryItemTraceDetail> existingVarianceTraceDetails =  findList(InventoryItemTraceDetail.class, 
                        new EntityExpr(InventoryItemTraceDetail.Fields.physicalInventoryId.getName(), EntityOperator.EQUALS, variance.getPhysicalInventoryId()));
                Debug.logVerbose("condition: " + new EntityExpr(InventoryItemTraceDetail.Fields.physicalInventoryId, EntityOperator.EQUALS, variance.getPhysicalInventoryId()), MODULE);
                Debug.logVerbose("existing variance trace details: " + existingVarianceTraceDetails, MODULE);

                if (UtilValidate.isEmpty(existingVarianceTraceDetails)) {
                    // retrieve physical inventory
                    PhysicalInventory physicalInventory = variance.getPhysicalInventory();

	                // create separate details for every physical variance
	                InventoryItemTraceDetail adjustmentEvent = new InventoryItemTraceDetail();
	                adjustmentEvent.setInventoryItemTraceId(event.getInventoryItemTraceId());
	                adjustmentEvent.setInventoryItemTraceSeqId(traceEntry.getNextSeqNum());
	                adjustmentEvent.setTraceLevel(event.getTraceLevel() + 1);  // put variance one level lower
	                adjustmentEvent.setInventoryItemId(event.getToInventoryItemId());
	                adjustmentEvent.setUsageDatetime(physicalInventory.getPhysicalInventoryDate());
	                adjustmentEvent.setInventoryItemUsageTypeId("VARIANCE");
	                adjustmentEvent.setQuantity(variance.getQuantityOnHandVar());
	                adjustmentEvent.setPhysicalInventoryId(variance.getPhysicalInventoryId());
	                adjustmentEvent.setVarianceReasonId(variance.getVarianceReasonId());

	                Debug.logVerbose("Added adjustment event [" + adjustmentEvent + "]", MODULE);

	                createOrUpdate(adjustmentEvent);
                } else {
                    Debug.logVerbose("Inventory item id [" + variance.getInventoryItemId() + "] physical inventory ID [" + variance.getPhysicalInventoryId() + "] has already been recorded in InventoryItemTraceDetail and will be skipped for "
                            + event , MODULE);
                }
            }
        }
    }

    /**
     * Return inventory transfer with most lower date.
     * @param xfrs list of <code>InventoryTransfer</code>
     * @return Instance of <code>InventoryTransfer</code>
     */
    private InventoryTransfer getFirstInventoryTransfer(List<? extends InventoryTransfer> xfrs) {

        Timestamp received = null;
        InventoryTransfer firstTransfer = null;

        for (InventoryTransfer transfer : xfrs) {
            Timestamp receiveDate = transfer.getReceiveDate();
            if (received == null) {
                received = receiveDate;
                firstTransfer = transfer;
                continue;
            };

            if (receiveDate.compareTo(received) >= 0) {
                continue;
            }

            received = receiveDate;
            firstTransfer = transfer;
        }

        return firstTransfer;
    }

    /* (non-Javadoc)
     * @see org.opentaps.domain.inventory.InventoryRepositoryInterface#getDerivativeInventoryTraceEvents(org.opentaps.domain.base.entities.InventoryItem)
     */
    public List<InventoryItemTraceDetail> getDerivativeInventoryTraceEvents(org.opentaps.domain.base.entities.InventoryItem inventoryItem) throws RepositoryException {
        List<InventoryItemTraceDetail> details = FastList.newInstance();

        String currentInventoryItemId = inventoryItem.getInventoryItemId();

        // find inventory item that were created by splitting
        List<InventoryItem> directChilds =
            findList(InventoryItem.class,
                    Arrays.asList(new EntityExpr("parentInventoryItemId", EntityOperator.EQUALS, currentInventoryItemId)));
        Debug.logVerbose("***directChilds from InventoryItem.parentInventoryItemId " + directChilds, MODULE);
        
        if (UtilValidate.isNotEmpty(directChilds)) {
            for (InventoryItem item : directChilds) {
                InventoryItemTraceDetail detailEvent = new InventoryItemTraceDetail();
                detailEvent.setInventoryItemId(currentInventoryItemId);
                detailEvent.setInventoryItemUsageTypeId("TRANSFER");
                detailEvent.setToInventoryItemId(item.getInventoryItemId());
                List<? extends InventoryItemDetail> inventoryItemDetails = item.getInventoryItemDetails();
                if (UtilValidate.isNotEmpty(inventoryItemDetails)) {
                    String seqId = null;
                    InventoryItemDetail firstRecord = null;
                    for (InventoryItemDetail inventoryItemDetail : inventoryItemDetails) {
                        if (seqId == null || inventoryItemDetail.getInventoryItemDetailSeqId().compareTo(seqId) < 0) {
                            firstRecord = inventoryItemDetail;
                            seqId = inventoryItemDetail.getInventoryItemDetailSeqId();
                        }
                    }
                    detailEvent.setQuantity(firstRecord.getQuantityOnHandDiff());
                }
                InventoryTransfer transfer = getFirstInventoryTransfer(item.getInventoryTransfers());
                if (transfer != null) {
                    detailEvent.setUsageDatetime(transfer.getReceiveDate());
                    detailEvent.setInventoryTransferId(transfer.getInventoryTransferId());
                }
                details.add(detailEvent);
            }
        }

        Debug.logVerbose("details list after adding inventory transfers: " + details, MODULE);
        
        // find issuances against orders.  These have been shipped.
        List<ItemIssuance> issuances =
            findList(ItemIssuance.class,
                    Arrays.asList(new EntityExpr("inventoryItemId", EntityOperator.EQUALS, inventoryItem.getInventoryItemId())));

        if (UtilValidate.isNotEmpty(issuances)) {
            for (ItemIssuance issuance : issuances) {
                InventoryItemTraceDetail detailEvent = new InventoryItemTraceDetail();
                detailEvent.setInventoryItemId(inventoryItem.getInventoryItemId());
                detailEvent.setInventoryItemUsageTypeId("ORDER_ISSUED");
                detailEvent.setItemIssuanceId(issuance.getItemIssuanceId());
                detailEvent.setQuantity(issuance.getQuantity());
                detailEvent.setUsageDatetime(issuance.getIssuedDateTime());
                details.add(detailEvent);
            }
        }

        Debug.logVerbose("details list after adding item issuances to orders (shipped): " + details, MODULE);
        
        // find reservations against orders.  These have not been shipped.
        List<OrderItemShipGrpInvRes> orderReservations =
            findList(OrderItemShipGrpInvRes.class,
                    Arrays.asList(new EntityExpr("inventoryItemId", EntityOperator.EQUALS, inventoryItem.getInventoryItemId())));

        if (UtilValidate.isNotEmpty(orderReservations)) {
            for (OrderItemShipGrpInvRes orderReservation : orderReservations) {
                InventoryItemTraceDetail detailEvent = new InventoryItemTraceDetail();
                detailEvent.setInventoryItemId(inventoryItem.getInventoryItemId());
                detailEvent.setInventoryItemUsageTypeId("ORDER_RESERVED");
                detailEvent.setOrderId(orderReservation.getOrderId());
                detailEvent.setOrderItemSeqId(orderReservation.getOrderItemSeqId());
                detailEvent.setShipGroupSeqId(orderReservation.getShipGroupSeqId());
                detailEvent.setQuantity(orderReservation.getQuantity());
                detailEvent.setUsageDatetime(orderReservation.getReservedDatetime());
                details.add(detailEvent);
            }
        }

        Debug.logVerbose("details list after adding reservations to orders (unshipped): " + details, MODULE);
        
        // find inventories which are used in manufacturing
        List<WorkEffortInventoryAssign> assignedToProduction =
            findList(WorkEffortInventoryAssign.class,
                    Arrays.asList(new EntityExpr("inventoryItemId", EntityOperator.EQUALS, inventoryItem.getInventoryItemId())));

        if (UtilValidate.isNotEmpty(assignedToProduction)) {
            for (WorkEffortInventoryAssign assignedItem : assignedToProduction) {
                WorkEffort productionRunTask = assignedItem.getWorkEffort();
                if (productionRunTask != null) {
                    WorkEffort productionRunHeader = productionRunTask.getParentWorkEffort();
                    if (productionRunHeader != null) {
                        List<WorkEffortInventoryProduced> producedItems =
                            findList(WorkEffortInventoryProduced.class,
                                    Arrays.asList(new EntityExpr("workEffortId", EntityOperator.EQUALS, productionRunHeader.getWorkEffortId())));

                        if (UtilValidate.isNotEmpty(producedItems)) {
                            for (WorkEffortInventoryProduced producedItem : producedItems) {
                                InventoryItemTraceDetail detailEvent = new InventoryItemTraceDetail();
                                detailEvent.setInventoryItemId(inventoryItem.getInventoryItemId());
                                detailEvent.setToInventoryItemId(producedItem.getInventoryItemId());
                                detailEvent.setInventoryItemUsageTypeId("MANUF_RAW_MAT");
                                detailEvent.setAssignWorkEffortId(assignedItem.getWorkEffortId());
                                detailEvent.setProducedWorkEffortId(producedItem.getWorkEffortId());
                                detailEvent.setUsageDatetime(productionRunHeader.getActualStartDate());
                                List<? extends InventoryItemDetail> producedInventoryItemDetails = producedItem.getInventoryItemDetails();
                                if (UtilValidate.isNotEmpty(producedInventoryItemDetails)) {
                                    String seqId = null;
                                    InventoryItemDetail firstRecord = null;
                                    for (InventoryItemDetail inventoryItemDetail : producedInventoryItemDetails) {
                                        if (seqId == null || inventoryItemDetail.getInventoryItemDetailSeqId().compareTo(seqId) < 0) {
                                            firstRecord = inventoryItemDetail;
                                            seqId = inventoryItemDetail.getInventoryItemDetailSeqId();
                                        }
                                    }
                                    detailEvent.setQuantity(firstRecord.getQuantityOnHandDiff());
                                }
                                details.add(detailEvent);
                            }
                        }
                    }
                }
            }
        }
        
        Debug.logVerbose("details list after adding inventory assigned to manufacturing: " + details, MODULE);
        
        return (details.size() > 0) ? details : null;
    }

    /* (non-Javadoc)
     * @see org.opentaps.domain.inventory.InventoryRepositoryInterface#getSoughtTraceEntry(java.lang.String, boolean)
     */
    public InventoryItemTraceDetail getSoughtTraceEntry(String inventoryItemId, boolean forward) throws RepositoryException {
        EntityConditionList conditionList = new EntityConditionList(
                Arrays.asList(
                        new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemId.getName(), EntityOperator.EQUALS, inventoryItemId),
                        new EntityExpr(InventoryItemTraceDetail.Fields.toInventoryItemId.getName(), EntityOperator.EQUALS, inventoryItemId)),
                        EntityOperator.OR
        );
        // find all detail records that corresponds to given inventory item id
        List<InventoryItemTraceDetail> traceDetails = findList(InventoryItemTraceDetail.class, conditionList);

        // ORDER_ISSUED has no toInventoryItemId value, handle this special case for backward search
        if (!forward) {
            for (InventoryItemTraceDetail entry : traceDetails) {
                if ("ORDER_ISSUED".equals(entry.getInventoryItemUsageTypeId()) && inventoryItemId.equals(entry.getInventoryItemId())) {
                    return entry;
                }
            }
        }

        // find trace detail record where toInventoryItemId equals to givent inventory item id.
        for (InventoryItemTraceDetail entry : traceDetails) {
            // handle ORDER_ISSUED case where no toInventoryItemId value
            if (forward && "ORDER_ISSUED".equals(entry.getInventoryItemUsageTypeId()) && inventoryItemId.equals(entry.getInventoryItemId())) {
                return entry;
            }
            String toInventoryItemId = entry.getToInventoryItemId();
            if (UtilValidate.isEmpty(toInventoryItemId)) {
                continue;
            }
            if (toInventoryItemId.equals(inventoryItemId)) {
                return entry;
            }
        }

        return null;
    }

    /** {@inheritDoc} */
    public List<InventoryItemTraceDetail> findTraceEventAdjustments(InventoryItemTraceDetail traceDetail, boolean desc) throws RepositoryException {
        String inventoryItemId = "ORDER_ISSUED".equals(traceDetail.getInventoryItemUsageTypeId()) ? traceDetail.getInventoryItemId() : traceDetail.getToInventoryItemId();
        List<EntityExpr> conditions = Arrays.asList(
                new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemTraceId.getName(), EntityOperator.EQUALS, traceDetail.getInventoryItemTraceId()),
                new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemUsageTypeId.getName(), EntityOperator.EQUALS, "VARIANCE"),
                new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemId.getName(), EntityOperator.EQUALS, inventoryItemId)
        );
        return findList(InventoryItemTraceDetail.class, conditions, Arrays.asList(String.format("inventoryItemTraceSeqId %1$s", desc ? "DESC" : "ASC")));
    }

    /* (non-Javadoc)
     * @see org.opentaps.domain.inventory.InventoryRepositoryInterface#collectTraceEventsBackward(org.opentaps.domain.base.entities.InventoryItemTraceDetail)
     */
    public List<InventoryItemTraceDetail> collectTraceEventsBackward(InventoryItemTraceDetail traceDetail) throws RepositoryException {
        List<InventoryItemTraceDetail> ret = FastList.newInstance();
        ret.add(traceDetail);
        List<InventoryItemTraceDetail> variances = findTraceEventAdjustments(traceDetail, true);
        if (UtilValidate.isNotEmpty(variances)) {
            ret.addAll(variances);
        }

        List<EntityExpr> conditions;

        if ("RECEIPT".equals(traceDetail.getInventoryItemUsageTypeId())) {
            return ret;
        }

        // MANUF_RAW_MAT may has more than one parent and neighbor, we have to collect all of them
        if ("MANUF_RAW_MAT".equals(traceDetail.getInventoryItemUsageTypeId())) {
            // collect neighbors
            List<EntityExpr> neighborConditions = FastList.newInstance();
            neighborConditions.add(new EntityExpr("inventoryItemUsageTypeId", EntityOperator.EQUALS, "MANUF_RAW_MAT"));
            neighborConditions.add(new EntityExpr("toInventoryItemId", EntityOperator.EQUALS, traceDetail.getToInventoryItemId()));
            if (neighborConditions.size() > 0) {
                List<InventoryItemTraceDetail> mfctRecords = findList(InventoryItemTraceDetail.class, neighborConditions);
                ret.clear();
                ret.addAll(mfctRecords);
            }

            // collect parents
            conditions = Arrays.asList(
                    new EntityExpr(InventoryItemTraceDetail.Fields.toInventoryItemId.getName(), EntityOperator.EQUALS, traceDetail.getToInventoryItemId()),
                    new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemUsageTypeId.getName(), EntityOperator.NOT_EQUAL, "VARIANCE")
            );
            List<InventoryItemTraceDetail> rawMaterials = findList(InventoryItemTraceDetail.class, conditions);
            List<String> rawMaterialIds = FastList.newInstance();
            for (InventoryItemTraceDetail material : rawMaterials) {
                rawMaterialIds.add(material.getInventoryItemId());
            }
            conditions = Arrays.asList(
                    new EntityExpr(InventoryItemTraceDetail.Fields.toInventoryItemId.getName(), EntityOperator.IN, rawMaterialIds),
                    new EntityExpr(InventoryItemTraceDetail.Fields.toInventoryItemId.getName(), EntityOperator.NOT_EQUAL, null),
                    new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemUsageTypeId.getName(), EntityOperator.NOT_EQUAL, "VARIANCE")
            );
        } else {
            conditions = Arrays.asList(
                    new EntityExpr(InventoryItemTraceDetail.Fields.toInventoryItemId.getName(), EntityOperator.EQUALS, traceDetail.getInventoryItemId()),
                    new EntityExpr(InventoryItemTraceDetail.Fields.toInventoryItemId.getName(), EntityOperator.NOT_EQUAL, null),
                    new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemUsageTypeId.getName(), EntityOperator.NOT_EQUAL, "VARIANCE")
            );
        }

        // get usage log recursively
        List<InventoryItemTraceDetail> childEvents = findList(InventoryItemTraceDetail.class, conditions);
        for (InventoryItemTraceDetail current : childEvents) {
            ret.addAll(collectTraceEventsBackward(current));
        }

        return ret;
    }

    /* (non-Javadoc)
     * @see org.opentaps.domain.inventory.InventoryRepositoryInterface#collectTraceEventsForward(org.opentaps.domain.base.entities.InventoryItemTraceDetail)
     */
    public List<InventoryItemTraceDetail> collectTraceEventsForward(InventoryItemTraceDetail traceDetail) throws RepositoryException {
        List<InventoryItemTraceDetail> ret = FastList.newInstance();
        ret.add(traceDetail);
        List<InventoryItemTraceDetail> variances = findTraceEventAdjustments(traceDetail, false);
        if (UtilValidate.isNotEmpty(variances)) {
            ret.addAll(variances);
        }

        List<EntityExpr> conditions;

        // ORDER_ISSUED always is final step in forward direction
        String usageTypeId = traceDetail.getInventoryItemUsageTypeId();
        if ("ORDER_ISSUED".equals(usageTypeId) || "ORDER_RESERVED".equals(usageTypeId)) {
            return ret;
        }

        conditions = Arrays.asList(
                new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemId.getName(), EntityOperator.EQUALS, traceDetail.getToInventoryItemId()),
                new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemTraceId.getName(), EntityOperator.EQUALS, traceDetail.getInventoryItemTraceId()),
                new EntityExpr(InventoryItemTraceDetail.Fields.inventoryItemUsageTypeId.getName(), EntityOperator.NOT_EQUAL, "VARIANCE")
        );

        // get usage log recursively
        List<InventoryItemTraceDetail> childEvents = findList(InventoryItemTraceDetail.class, conditions);
        for (InventoryItemTraceDetail current : childEvents) {
            ret.addAll(collectTraceEventsForward(current));
        }

        return ret;
    }

    /**
     * Finds the last recorded <code>InventoryItemValueHistory</code> from the database.
     * @param inventoryItem an <code>InventoryItem</code>
     * @return the <code>InventoryItemValueHistory</code> found
     * @throws RepositoryException if an error occurs
     */
    @SuppressWarnings("unchecked")
    public InventoryItemValueHistory getLastInventoryItemValueHistoryByInventoryItem(
            InventoryItem inventoryItem) throws RepositoryException {
        List<String> orderBy = FastList.newInstance();
        orderBy.add("dateTime DESC");
        orderBy.add("inventoryItemValueHistId DESC");
        EntityFindOptions findOpt = new EntityFindOptions();
        findOpt.setMaxRows(1);
        List cond = UtilMisc.toList(new EntityExpr("inventoryItemId", EntityOperator.EQUALS, inventoryItem.getInventoryItemId()),
                                    new EntityExpr("unitCost", EntityOperator.NOT_EQUAL, null),
                                    new EntityExpr("dateTime", EntityOperator.LESS_THAN, inventoryItem.getTimestamp("lastUpdatedStamp")));
        List<InventoryItemValueHistory> inventoryItemValueHistories = findList(InventoryItemValueHistory.class, new EntityConditionList(cond, EntityOperator.AND), orderBy);
        if (UtilValidate.isNotEmpty(inventoryItemValueHistories)) {
            return inventoryItemValueHistories.get(0);
        }
        return null;
    }

    /** {@inheritDoc} */
    public InventoryTransfer getInventoryTransferById(String inventoryTransferId) throws RepositoryException, EntityNotFoundException {
        return findOneNotNull(InventoryTransfer.class, map(InventoryTransfer.Fields.inventoryTransferId, inventoryTransferId));
    }

}
