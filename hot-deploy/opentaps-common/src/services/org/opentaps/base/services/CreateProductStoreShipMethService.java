package org.opentaps.base.services;

/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.service.ServiceWrapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Create a Product Store Shipment Method.
 * Auto generated base service entity createProductStoreShipMeth.
 *
 * Engine: simple
 * Location: component://product/script/org/ofbiz/product/store/ProductStoreServices.xml
 * Invoke: createProductStoreShipMeth
 * Defined in: applications/product/servicedef/services_store.xml
 */
public class CreateProductStoreShipMethService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createProductStoreShipMeth";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        allowCompanyAddr("allowCompanyAddr"),
        allowUspsAddr("allowUspsAddr"),
        codSurcharge("codSurcharge"),
        companyPartyId("companyPartyId"),
        configProps("configProps"),
        excludeFeatureGroup("excludeFeatureGroup"),
        excludeGeoId("excludeGeoId"),
        includeFeatureGroup("includeFeatureGroup"),
        includeGeoId("includeGeoId"),
        includeNoChargeItems("includeNoChargeItems"),
        locale("locale"),
        maxSize("maxSize"),
        maxTotal("maxTotal"),
        maxWeight("maxWeight"),
        minSize("minSize"),
        minTotal("minTotal"),
        minWeight("minWeight"),
        minimumRate("minimumRate"),
        partyId("partyId"),
        productStoreId("productStoreId"),
        requireCompanyAddr("requireCompanyAddr"),
        requireUspsAddr("requireUspsAddr"),
        roleTypeId("roleTypeId"),
        sequenceNumber("sequenceNumber"),
        serviceName("serviceName"),
        shipmentMethodTypeId("shipmentMethodTypeId"),
        timeZone("timeZone"),
        userDescription("userDescription"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>CreateProductStoreShipMethService</code> instance.
     */
    public CreateProductStoreShipMethService() {
        super();
    }

    /**
     * Creates a new <code>CreateProductStoreShipMethService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateProductStoreShipMethService(User user) {
        super(user);
    }

    private String inAllowCompanyAddr;
    private String inAllowUspsAddr;
    private Double inCodSurcharge;
    private String inCompanyPartyId;
    private String inConfigProps;
    private String inExcludeFeatureGroup;
    private String inExcludeGeoId;
    private String inIncludeFeatureGroup;
    private String inIncludeGeoId;
    private String inIncludeNoChargeItems;
    private Locale inLocale;
    private BigDecimal inMaxSize;
    private BigDecimal inMaxTotal;
    private BigDecimal inMaxWeight;
    private BigDecimal inMinSize;
    private BigDecimal inMinTotal;
    private BigDecimal inMinWeight;
    private BigDecimal inMinimumRate;
    private String inPartyId;
    private String inProductStoreId;
    private String inRequireCompanyAddr;
    private String inRequireUspsAddr;
    private String inRoleTypeId;
    private Long inSequenceNumber;
    private String inServiceName;
    private String inShipmentMethodTypeId;
    private TimeZone inTimeZone;
    private String inUserDescription;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAllowCompanyAddr() {
        return this.inAllowCompanyAddr;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAllowUspsAddr() {
        return this.inAllowUspsAddr;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getInCodSurcharge() {
        return this.inCodSurcharge;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCompanyPartyId() {
        return this.inCompanyPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInConfigProps() {
        return this.inConfigProps;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInExcludeFeatureGroup() {
        return this.inExcludeFeatureGroup;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInExcludeGeoId() {
        return this.inExcludeGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIncludeFeatureGroup() {
        return this.inIncludeFeatureGroup;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIncludeGeoId() {
        return this.inIncludeGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIncludeNoChargeItems() {
        return this.inIncludeNoChargeItems;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMaxSize() {
        return this.inMaxSize;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMaxTotal() {
        return this.inMaxTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMaxWeight() {
        return this.inMaxWeight;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMinSize() {
        return this.inMinSize;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMinTotal() {
        return this.inMinTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMinWeight() {
        return this.inMinWeight;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMinimumRate() {
        return this.inMinimumRate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRequireCompanyAddr() {
        return this.inRequireCompanyAddr;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRequireUspsAddr() {
        return this.inRequireUspsAddr;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInRoleTypeId() {
        return this.inRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInSequenceNumber() {
        return this.inSequenceNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInServiceName() {
        return this.inServiceName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipmentMethodTypeId() {
        return this.inShipmentMethodTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUserDescription() {
        return this.inUserDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAllowCompanyAddr the inAllowCompanyAddr to set
    */
    public void setInAllowCompanyAddr(String inAllowCompanyAddr) {
        this.inParameters.add("allowCompanyAddr");
        this.inAllowCompanyAddr = inAllowCompanyAddr;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAllowUspsAddr the inAllowUspsAddr to set
    */
    public void setInAllowUspsAddr(String inAllowUspsAddr) {
        this.inParameters.add("allowUspsAddr");
        this.inAllowUspsAddr = inAllowUspsAddr;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCodSurcharge the inCodSurcharge to set
    */
    public void setInCodSurcharge(Double inCodSurcharge) {
        this.inParameters.add("codSurcharge");
        this.inCodSurcharge = inCodSurcharge;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCompanyPartyId the inCompanyPartyId to set
    */
    public void setInCompanyPartyId(String inCompanyPartyId) {
        this.inParameters.add("companyPartyId");
        this.inCompanyPartyId = inCompanyPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inConfigProps the inConfigProps to set
    */
    public void setInConfigProps(String inConfigProps) {
        this.inParameters.add("configProps");
        this.inConfigProps = inConfigProps;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inExcludeFeatureGroup the inExcludeFeatureGroup to set
    */
    public void setInExcludeFeatureGroup(String inExcludeFeatureGroup) {
        this.inParameters.add("excludeFeatureGroup");
        this.inExcludeFeatureGroup = inExcludeFeatureGroup;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inExcludeGeoId the inExcludeGeoId to set
    */
    public void setInExcludeGeoId(String inExcludeGeoId) {
        this.inParameters.add("excludeGeoId");
        this.inExcludeGeoId = inExcludeGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIncludeFeatureGroup the inIncludeFeatureGroup to set
    */
    public void setInIncludeFeatureGroup(String inIncludeFeatureGroup) {
        this.inParameters.add("includeFeatureGroup");
        this.inIncludeFeatureGroup = inIncludeFeatureGroup;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIncludeGeoId the inIncludeGeoId to set
    */
    public void setInIncludeGeoId(String inIncludeGeoId) {
        this.inParameters.add("includeGeoId");
        this.inIncludeGeoId = inIncludeGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIncludeNoChargeItems the inIncludeNoChargeItems to set
    */
    public void setInIncludeNoChargeItems(String inIncludeNoChargeItems) {
        this.inParameters.add("includeNoChargeItems");
        this.inIncludeNoChargeItems = inIncludeNoChargeItems;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMaxSize the inMaxSize to set
    */
    public void setInMaxSize(BigDecimal inMaxSize) {
        this.inParameters.add("maxSize");
        this.inMaxSize = inMaxSize;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMaxTotal the inMaxTotal to set
    */
    public void setInMaxTotal(BigDecimal inMaxTotal) {
        this.inParameters.add("maxTotal");
        this.inMaxTotal = inMaxTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMaxWeight the inMaxWeight to set
    */
    public void setInMaxWeight(BigDecimal inMaxWeight) {
        this.inParameters.add("maxWeight");
        this.inMaxWeight = inMaxWeight;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMinSize the inMinSize to set
    */
    public void setInMinSize(BigDecimal inMinSize) {
        this.inParameters.add("minSize");
        this.inMinSize = inMinSize;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMinTotal the inMinTotal to set
    */
    public void setInMinTotal(BigDecimal inMinTotal) {
        this.inParameters.add("minTotal");
        this.inMinTotal = inMinTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMinWeight the inMinWeight to set
    */
    public void setInMinWeight(BigDecimal inMinWeight) {
        this.inParameters.add("minWeight");
        this.inMinWeight = inMinWeight;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMinimumRate the inMinimumRate to set
    */
    public void setInMinimumRate(BigDecimal inMinimumRate) {
        this.inParameters.add("minimumRate");
        this.inMinimumRate = inMinimumRate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRequireCompanyAddr the inRequireCompanyAddr to set
    */
    public void setInRequireCompanyAddr(String inRequireCompanyAddr) {
        this.inParameters.add("requireCompanyAddr");
        this.inRequireCompanyAddr = inRequireCompanyAddr;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRequireUspsAddr the inRequireUspsAddr to set
    */
    public void setInRequireUspsAddr(String inRequireUspsAddr) {
        this.inParameters.add("requireUspsAddr");
        this.inRequireUspsAddr = inRequireUspsAddr;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inRoleTypeId the inRoleTypeId to set
    */
    public void setInRoleTypeId(String inRoleTypeId) {
        this.inParameters.add("roleTypeId");
        this.inRoleTypeId = inRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSequenceNumber the inSequenceNumber to set
    */
    public void setInSequenceNumber(Long inSequenceNumber) {
        this.inParameters.add("sequenceNumber");
        this.inSequenceNumber = inSequenceNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inServiceName the inServiceName to set
    */
    public void setInServiceName(String inServiceName) {
        this.inParameters.add("serviceName");
        this.inServiceName = inServiceName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipmentMethodTypeId the inShipmentMethodTypeId to set
    */
    public void setInShipmentMethodTypeId(String inShipmentMethodTypeId) {
        this.inParameters.add("shipmentMethodTypeId");
        this.inShipmentMethodTypeId = inShipmentMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserDescription the inUserDescription to set
    */
    public void setInUserDescription(String inUserDescription) {
        this.inParameters.add("userDescription");
        this.inUserDescription = inUserDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("allowCompanyAddr")) mapValue.put("allowCompanyAddr", getInAllowCompanyAddr());
        if (inParameters.contains("allowUspsAddr")) mapValue.put("allowUspsAddr", getInAllowUspsAddr());
        if (inParameters.contains("codSurcharge")) mapValue.put("codSurcharge", getInCodSurcharge());
        if (inParameters.contains("companyPartyId")) mapValue.put("companyPartyId", getInCompanyPartyId());
        if (inParameters.contains("configProps")) mapValue.put("configProps", getInConfigProps());
        if (inParameters.contains("excludeFeatureGroup")) mapValue.put("excludeFeatureGroup", getInExcludeFeatureGroup());
        if (inParameters.contains("excludeGeoId")) mapValue.put("excludeGeoId", getInExcludeGeoId());
        if (inParameters.contains("includeFeatureGroup")) mapValue.put("includeFeatureGroup", getInIncludeFeatureGroup());
        if (inParameters.contains("includeGeoId")) mapValue.put("includeGeoId", getInIncludeGeoId());
        if (inParameters.contains("includeNoChargeItems")) mapValue.put("includeNoChargeItems", getInIncludeNoChargeItems());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maxSize")) mapValue.put("maxSize", getInMaxSize());
        if (inParameters.contains("maxTotal")) mapValue.put("maxTotal", getInMaxTotal());
        if (inParameters.contains("maxWeight")) mapValue.put("maxWeight", getInMaxWeight());
        if (inParameters.contains("minSize")) mapValue.put("minSize", getInMinSize());
        if (inParameters.contains("minTotal")) mapValue.put("minTotal", getInMinTotal());
        if (inParameters.contains("minWeight")) mapValue.put("minWeight", getInMinWeight());
        if (inParameters.contains("minimumRate")) mapValue.put("minimumRate", getInMinimumRate());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("requireCompanyAddr")) mapValue.put("requireCompanyAddr", getInRequireCompanyAddr());
        if (inParameters.contains("requireUspsAddr")) mapValue.put("requireUspsAddr", getInRequireUspsAddr());
        if (inParameters.contains("roleTypeId")) mapValue.put("roleTypeId", getInRoleTypeId());
        if (inParameters.contains("sequenceNumber")) mapValue.put("sequenceNumber", getInSequenceNumber());
        if (inParameters.contains("serviceName")) mapValue.put("serviceName", getInServiceName());
        if (inParameters.contains("shipmentMethodTypeId")) mapValue.put("shipmentMethodTypeId", getInShipmentMethodTypeId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userDescription")) mapValue.put("userDescription", getInUserDescription());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("allowCompanyAddr")) setInAllowCompanyAddr((String) mapValue.get("allowCompanyAddr"));
        if (mapValue.containsKey("allowUspsAddr")) setInAllowUspsAddr((String) mapValue.get("allowUspsAddr"));
        if (mapValue.containsKey("codSurcharge")) setInCodSurcharge((Double) mapValue.get("codSurcharge"));
        if (mapValue.containsKey("companyPartyId")) setInCompanyPartyId((String) mapValue.get("companyPartyId"));
        if (mapValue.containsKey("configProps")) setInConfigProps((String) mapValue.get("configProps"));
        if (mapValue.containsKey("excludeFeatureGroup")) setInExcludeFeatureGroup((String) mapValue.get("excludeFeatureGroup"));
        if (mapValue.containsKey("excludeGeoId")) setInExcludeGeoId((String) mapValue.get("excludeGeoId"));
        if (mapValue.containsKey("includeFeatureGroup")) setInIncludeFeatureGroup((String) mapValue.get("includeFeatureGroup"));
        if (mapValue.containsKey("includeGeoId")) setInIncludeGeoId((String) mapValue.get("includeGeoId"));
        if (mapValue.containsKey("includeNoChargeItems")) setInIncludeNoChargeItems((String) mapValue.get("includeNoChargeItems"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maxSize")) setInMaxSize((BigDecimal) mapValue.get("maxSize"));
        if (mapValue.containsKey("maxTotal")) setInMaxTotal((BigDecimal) mapValue.get("maxTotal"));
        if (mapValue.containsKey("maxWeight")) setInMaxWeight((BigDecimal) mapValue.get("maxWeight"));
        if (mapValue.containsKey("minSize")) setInMinSize((BigDecimal) mapValue.get("minSize"));
        if (mapValue.containsKey("minTotal")) setInMinTotal((BigDecimal) mapValue.get("minTotal"));
        if (mapValue.containsKey("minWeight")) setInMinWeight((BigDecimal) mapValue.get("minWeight"));
        if (mapValue.containsKey("minimumRate")) setInMinimumRate((BigDecimal) mapValue.get("minimumRate"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("requireCompanyAddr")) setInRequireCompanyAddr((String) mapValue.get("requireCompanyAddr"));
        if (mapValue.containsKey("requireUspsAddr")) setInRequireUspsAddr((String) mapValue.get("requireUspsAddr"));
        if (mapValue.containsKey("roleTypeId")) setInRoleTypeId((String) mapValue.get("roleTypeId"));
        if (mapValue.containsKey("sequenceNumber")) setInSequenceNumber((Long) mapValue.get("sequenceNumber"));
        if (mapValue.containsKey("serviceName")) setInServiceName((String) mapValue.get("serviceName"));
        if (mapValue.containsKey("shipmentMethodTypeId")) setInShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userDescription")) setInUserDescription((String) mapValue.get("userDescription"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateProductStoreShipMethService</code> from the input values of the given <code>CreateProductStoreShipMethService</code>.
     * @param input a <code>CreateProductStoreShipMethService</code>
     */
    public static CreateProductStoreShipMethService fromInput(CreateProductStoreShipMethService input) {
        CreateProductStoreShipMethService service = new CreateProductStoreShipMethService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateProductStoreShipMethService</code> from the output values of the given <code>CreateProductStoreShipMethService</code>.
     * @param output a <code>CreateProductStoreShipMethService</code>
     */
    public static CreateProductStoreShipMethService fromOutput(CreateProductStoreShipMethService output) {
        CreateProductStoreShipMethService service = new CreateProductStoreShipMethService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateProductStoreShipMethService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateProductStoreShipMethService fromInput(Map<String, Object> mapValue) {
        CreateProductStoreShipMethService service = new CreateProductStoreShipMethService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                service.setUser(new User(userGv, userGv.getDelegator()));
            }
        }
        return service;
    }

    /**
     * Construct a <code>CreateProductStoreShipMethService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateProductStoreShipMethService fromOutput(Map<String, Object> mapValue) {
        CreateProductStoreShipMethService service = new CreateProductStoreShipMethService();
        service.putAllOutput(mapValue);
        return service;
    }
}
