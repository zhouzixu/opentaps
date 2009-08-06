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
package org.opentaps.warehouse.domain.manufacturing;

import java.math.BigDecimal;
import java.util.Map;

import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.GenericDelegator;
import org.opentaps.domain.manufacturing.ProductionRun;
import org.opentaps.domain.manufacturing.ManufacturingRepositoryInterface;
import org.opentaps.foundation.entity.EntityNotFoundException;
import org.opentaps.foundation.infrastructure.Infrastructure;
import org.opentaps.foundation.infrastructure.User;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.ofbiz.Repository;
import org.ofbiz.service.ServiceUtil;
import org.ofbiz.service.GenericServiceException;


/** {@inheritDoc} */
public class ManufacturingRepository extends Repository implements ManufacturingRepositoryInterface {

    /**
     * Default constructor.
     */
    public ManufacturingRepository() {
        super();
    }

    /**
     * Use this for Repositories which will only access the database via the delegator.
     * @param delegator the delegator
     */
    public ManufacturingRepository(GenericDelegator delegator) {
        super(delegator);
    }

    /**
     * Use this for domain Repositories.
     * @param infrastructure the domain infrastructure
     * @param user the domain user
     * @throws RepositoryException if an error occurs
     */
    public ManufacturingRepository(Infrastructure infrastructure, User user) throws RepositoryException {
        super(infrastructure, user);
    }

    /** {@inheritDoc} */
    public ProductionRun getProductionRun(String workEffortId) throws RepositoryException, EntityNotFoundException {
        ProductionRun productionRun = findOneNotNull(ProductionRun.class, map(ProductionRun.Fields.workEffortId, workEffortId), "Production Run [" + workEffortId + "] not found.");
        // TODO: should this accept Production run tasks as well ?
        if (!"PROD_ORDER_HEADER".equals(productionRun.getWorkEffortTypeId())) {
            throw new EntityNotFoundException(ProductionRun.class, "Production Run [" + workEffortId + "] not found (a Work effort that is not a Production Run but of type " + productionRun.getWorkEffortTypeId() + " was found for the given ID).");
        }
        return productionRun;
    }

    /** {@inheritDoc} */
    @SuppressWarnings("unchecked")
    public BigDecimal getProductionRunCost(ProductionRun productionRun) throws RepositoryException {
        try {
            Map results = getDispatcher().runSync("getProductionRunCost", UtilMisc.toMap(
                    "workEffortId", productionRun.getWorkEffortId(),
                    "userLogin", getUser().getOfbizUserLogin())
            );
            if (ServiceUtil.isError(results)) {
                throw new RepositoryException(ServiceUtil.getErrorMessage(results));
            }
            return (BigDecimal) results.get("totalCost");
        } catch (GenericServiceException e) {
            throw new RepositoryException(e);
        }
    }

}
