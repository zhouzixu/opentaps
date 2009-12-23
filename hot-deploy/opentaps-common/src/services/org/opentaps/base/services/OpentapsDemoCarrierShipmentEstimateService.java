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
 * Gets the estimate for the demo carrier.  The rate is 1 USD per pound for ground, 2 USD for express..
 * Auto generated base service entity opentaps.demoCarrierShipmentEstimate.
 *
 * Engine: java
 * Location: org.opentaps.common.shipment.DemoCarrierServices
 * Invoke: demoCarrierShipmentEstimate
 * Defined in: hot-deploy/opentaps-common/servicedef/services_shipping.xml
 */
public class OpentapsDemoCarrierShipmentEstimateService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "opentaps.demoCarrierShipmentEstimate";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        carrierPartyId("carrierPartyId"),
        carrierRoleTypeId("carrierRoleTypeId"),
        initialEstimateAmt("initialEstimateAmt"),
        locale("locale"),
        partyId("partyId"),
        productStoreId("productStoreId"),
        productStoreShipMethId("productStoreShipMethId"),
        serviceConfigProps("serviceConfigProps"),
        shipmentMethodTypeId("shipmentMethodTypeId"),
        shippableItemInfo("shippableItemInfo"),
        shippableQuantity("shippableQuantity"),
        shippableTotal("shippableTotal"),
        shippableWeight("shippableWeight"),
        shippingContactMechId("shippingContactMechId"),
        shippingCountryCode("shippingCountryCode"),
        shippingOriginContactMechId("shippingOriginContactMechId"),
        shippingPostalCode("shippingPostalCode"),
        timeZone("timeZone"),
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
        shippingEstimateAmount("shippingEstimateAmount"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>OpentapsDemoCarrierShipmentEstimateService</code> instance.
     */
    public OpentapsDemoCarrierShipmentEstimateService() {
        super();
    }


    private String inCarrierPartyId;
    private String inCarrierRoleTypeId;
    private BigDecimal inInitialEstimateAmt;
    private Locale inLocale;
    private String inPartyId;
    private String inProductStoreId;
    private String inProductStoreShipMethId;
    private String inServiceConfigProps;
    private String inShipmentMethodTypeId;
    private List inShippableItemInfo;
    private BigDecimal inShippableQuantity;
    private BigDecimal inShippableTotal;
    private BigDecimal inShippableWeight;
    private String inShippingContactMechId;
    private String inShippingCountryCode;
    private String inShippingOriginContactMechId;
    private String inShippingPostalCode;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private BigDecimal outShippingEstimateAmount;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCarrierPartyId() {
        return this.inCarrierPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCarrierRoleTypeId() {
        return this.inCarrierRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInInitialEstimateAmt() {
        return this.inInitialEstimateAmt;
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
    public String getInProductStoreShipMethId() {
        return this.inProductStoreShipMethId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInServiceConfigProps() {
        return this.inServiceConfigProps;
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
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getInShippableItemInfo() {
        return this.inShippableItemInfo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInShippableQuantity() {
        return this.inShippableQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInShippableTotal() {
        return this.inShippableTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInShippableWeight() {
        return this.inShippableWeight;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShippingContactMechId() {
        return this.inShippingContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShippingCountryCode() {
        return this.inShippingCountryCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShippingOriginContactMechId() {
        return this.inShippingOriginContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShippingPostalCode() {
        return this.inShippingPostalCode;
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
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutShippingEstimateAmount() {
        return this.outShippingEstimateAmount;
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
     * This parameter is required.
     * @param inCarrierPartyId the inCarrierPartyId to set
    */
    public void setInCarrierPartyId(String inCarrierPartyId) {
        this.inParameters.add("carrierPartyId");
        this.inCarrierPartyId = inCarrierPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCarrierRoleTypeId the inCarrierRoleTypeId to set
    */
    public void setInCarrierRoleTypeId(String inCarrierRoleTypeId) {
        this.inParameters.add("carrierRoleTypeId");
        this.inCarrierRoleTypeId = inCarrierRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInitialEstimateAmt the inInitialEstimateAmt to set
    */
    public void setInInitialEstimateAmt(BigDecimal inInitialEstimateAmt) {
        this.inParameters.add("initialEstimateAmt");
        this.inInitialEstimateAmt = inInitialEstimateAmt;
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
     * @param inProductStoreShipMethId the inProductStoreShipMethId to set
    */
    public void setInProductStoreShipMethId(String inProductStoreShipMethId) {
        this.inParameters.add("productStoreShipMethId");
        this.inProductStoreShipMethId = inProductStoreShipMethId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inServiceConfigProps the inServiceConfigProps to set
    */
    public void setInServiceConfigProps(String inServiceConfigProps) {
        this.inParameters.add("serviceConfigProps");
        this.inServiceConfigProps = inServiceConfigProps;
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
     * This parameter is required.
     * @param inShippableItemInfo the inShippableItemInfo to set
    */
    public void setInShippableItemInfo(List inShippableItemInfo) {
        this.inParameters.add("shippableItemInfo");
        this.inShippableItemInfo = inShippableItemInfo;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShippableQuantity the inShippableQuantity to set
    */
    public void setInShippableQuantity(BigDecimal inShippableQuantity) {
        this.inParameters.add("shippableQuantity");
        this.inShippableQuantity = inShippableQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShippableTotal the inShippableTotal to set
    */
    public void setInShippableTotal(BigDecimal inShippableTotal) {
        this.inParameters.add("shippableTotal");
        this.inShippableTotal = inShippableTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShippableWeight the inShippableWeight to set
    */
    public void setInShippableWeight(BigDecimal inShippableWeight) {
        this.inParameters.add("shippableWeight");
        this.inShippableWeight = inShippableWeight;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShippingContactMechId the inShippingContactMechId to set
    */
    public void setInShippingContactMechId(String inShippingContactMechId) {
        this.inParameters.add("shippingContactMechId");
        this.inShippingContactMechId = inShippingContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShippingCountryCode the inShippingCountryCode to set
    */
    public void setInShippingCountryCode(String inShippingCountryCode) {
        this.inParameters.add("shippingCountryCode");
        this.inShippingCountryCode = inShippingCountryCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShippingOriginContactMechId the inShippingOriginContactMechId to set
    */
    public void setInShippingOriginContactMechId(String inShippingOriginContactMechId) {
        this.inParameters.add("shippingOriginContactMechId");
        this.inShippingOriginContactMechId = inShippingOriginContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShippingPostalCode the inShippingPostalCode to set
    */
    public void setInShippingPostalCode(String inShippingPostalCode) {
        this.inParameters.add("shippingPostalCode");
        this.inShippingPostalCode = inShippingPostalCode;
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
     * This parameter is required.
     * @param outShippingEstimateAmount the outShippingEstimateAmount to set
    */
    public void setOutShippingEstimateAmount(BigDecimal outShippingEstimateAmount) {
        this.outParameters.add("shippingEstimateAmount");
        this.outShippingEstimateAmount = outShippingEstimateAmount;
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
        if (inParameters.contains("carrierPartyId")) mapValue.put("carrierPartyId", getInCarrierPartyId());
        if (inParameters.contains("carrierRoleTypeId")) mapValue.put("carrierRoleTypeId", getInCarrierRoleTypeId());
        if (inParameters.contains("initialEstimateAmt")) mapValue.put("initialEstimateAmt", getInInitialEstimateAmt());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("productStoreShipMethId")) mapValue.put("productStoreShipMethId", getInProductStoreShipMethId());
        if (inParameters.contains("serviceConfigProps")) mapValue.put("serviceConfigProps", getInServiceConfigProps());
        if (inParameters.contains("shipmentMethodTypeId")) mapValue.put("shipmentMethodTypeId", getInShipmentMethodTypeId());
        if (inParameters.contains("shippableItemInfo")) mapValue.put("shippableItemInfo", getInShippableItemInfo());
        if (inParameters.contains("shippableQuantity")) mapValue.put("shippableQuantity", getInShippableQuantity());
        if (inParameters.contains("shippableTotal")) mapValue.put("shippableTotal", getInShippableTotal());
        if (inParameters.contains("shippableWeight")) mapValue.put("shippableWeight", getInShippableWeight());
        if (inParameters.contains("shippingContactMechId")) mapValue.put("shippingContactMechId", getInShippingContactMechId());
        if (inParameters.contains("shippingCountryCode")) mapValue.put("shippingCountryCode", getInShippingCountryCode());
        if (inParameters.contains("shippingOriginContactMechId")) mapValue.put("shippingOriginContactMechId", getInShippingOriginContactMechId());
        if (inParameters.contains("shippingPostalCode")) mapValue.put("shippingPostalCode", getInShippingPostalCode());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
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
        if (outParameters.contains("shippingEstimateAmount")) mapValue.put("shippingEstimateAmount", getOutShippingEstimateAmount());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("carrierPartyId")) setInCarrierPartyId((String) mapValue.get("carrierPartyId"));
        if (mapValue.containsKey("carrierRoleTypeId")) setInCarrierRoleTypeId((String) mapValue.get("carrierRoleTypeId"));
        if (mapValue.containsKey("initialEstimateAmt")) setInInitialEstimateAmt((BigDecimal) mapValue.get("initialEstimateAmt"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("productStoreShipMethId")) setInProductStoreShipMethId((String) mapValue.get("productStoreShipMethId"));
        if (mapValue.containsKey("serviceConfigProps")) setInServiceConfigProps((String) mapValue.get("serviceConfigProps"));
        if (mapValue.containsKey("shipmentMethodTypeId")) setInShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        if (mapValue.containsKey("shippableItemInfo")) setInShippableItemInfo((List) mapValue.get("shippableItemInfo"));
        if (mapValue.containsKey("shippableQuantity")) setInShippableQuantity((BigDecimal) mapValue.get("shippableQuantity"));
        if (mapValue.containsKey("shippableTotal")) setInShippableTotal((BigDecimal) mapValue.get("shippableTotal"));
        if (mapValue.containsKey("shippableWeight")) setInShippableWeight((BigDecimal) mapValue.get("shippableWeight"));
        if (mapValue.containsKey("shippingContactMechId")) setInShippingContactMechId((String) mapValue.get("shippingContactMechId"));
        if (mapValue.containsKey("shippingCountryCode")) setInShippingCountryCode((String) mapValue.get("shippingCountryCode"));
        if (mapValue.containsKey("shippingOriginContactMechId")) setInShippingOriginContactMechId((String) mapValue.get("shippingOriginContactMechId"));
        if (mapValue.containsKey("shippingPostalCode")) setInShippingPostalCode((String) mapValue.get("shippingPostalCode"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("shippingEstimateAmount")) setOutShippingEstimateAmount((BigDecimal) mapValue.get("shippingEstimateAmount"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>OpentapsDemoCarrierShipmentEstimateService</code> from the input values of the given <code>OpentapsDemoCarrierShipmentEstimateService</code>.
     * @param input a <code>OpentapsDemoCarrierShipmentEstimateService</code>
     */
    public static OpentapsDemoCarrierShipmentEstimateService fromInput(OpentapsDemoCarrierShipmentEstimateService input) {
        OpentapsDemoCarrierShipmentEstimateService service = new OpentapsDemoCarrierShipmentEstimateService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>OpentapsDemoCarrierShipmentEstimateService</code> from the output values of the given <code>OpentapsDemoCarrierShipmentEstimateService</code>.
     * @param output a <code>OpentapsDemoCarrierShipmentEstimateService</code>
     */
    public static OpentapsDemoCarrierShipmentEstimateService fromOutput(OpentapsDemoCarrierShipmentEstimateService output) {
        OpentapsDemoCarrierShipmentEstimateService service = new OpentapsDemoCarrierShipmentEstimateService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>OpentapsDemoCarrierShipmentEstimateService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static OpentapsDemoCarrierShipmentEstimateService fromInput(Map<String, Object> mapValue) {
        OpentapsDemoCarrierShipmentEstimateService service = new OpentapsDemoCarrierShipmentEstimateService();
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
     * Construct a <code>OpentapsDemoCarrierShipmentEstimateService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static OpentapsDemoCarrierShipmentEstimateService fromOutput(Map<String, Object> mapValue) {
        OpentapsDemoCarrierShipmentEstimateService service = new OpentapsDemoCarrierShipmentEstimateService();
        service.putAllOutput(mapValue);
        return service;
    }
}
