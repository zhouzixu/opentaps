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
 * Creates or updates Subscription record.
 * Auto generated base service entity processExtendSubscription.
 *
 * Engine: java
 * Location: org.ofbiz.product.subscription.SubscriptionServices
 * Invoke: processExtendSubscription
 * Defined in: applications/product/servicedef/services_subscription.xml
 */
public class ProcessExtendSubscriptionService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "processExtendSubscription";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        alwaysCreateNewRecord("alwaysCreateNewRecord"),
        automaticExtend("automaticExtend"),
        canclAutmExtTime("canclAutmExtTime"),
        canclAutmExtTimeUomId("canclAutmExtTimeUomId"),
        inventoryItemId("inventoryItemId"),
        locale("locale"),
        orderId("orderId"),
        orderItemSeqId("orderItemSeqId"),
        partyId("partyId"),
        productId("productId"),
        subscriptionResourceId("subscriptionResourceId"),
        timeZone("timeZone"),
        useRoleTypeId("useRoleTypeId"),
        useTime("useTime"),
        useTimeUomId("useTimeUomId"),
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
        subscriptionId("subscriptionId"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>ProcessExtendSubscriptionService</code> instance.
     */
    public ProcessExtendSubscriptionService() {
        super();
    }

    /**
     * Creates a new <code>ProcessExtendSubscriptionService</code> instance.
     * @param user an <code>User</code> value
     */
    public ProcessExtendSubscriptionService(User user) {
        super(user);
    }

    private String inAlwaysCreateNewRecord;
    private String inAutomaticExtend;
    private Integer inCanclAutmExtTime;
    private String inCanclAutmExtTimeUomId;
    private String inInventoryItemId;
    private Locale inLocale;
    private String inOrderId;
    private String inOrderItemSeqId;
    private String inPartyId;
    private String inProductId;
    private String inSubscriptionResourceId;
    private TimeZone inTimeZone;
    private String inUseRoleTypeId;
    private Integer inUseTime;
    private String inUseTimeUomId;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSubscriptionId;
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
    public String getInAlwaysCreateNewRecord() {
        return this.inAlwaysCreateNewRecord;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAutomaticExtend() {
        return this.inAutomaticExtend;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Integer</code>
     */
    public Integer getInCanclAutmExtTime() {
        return this.inCanclAutmExtTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCanclAutmExtTimeUomId() {
        return this.inCanclAutmExtTimeUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInventoryItemId() {
        return this.inInventoryItemId;
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
    public String getInOrderId() {
        return this.inOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOrderItemSeqId() {
        return this.inOrderItemSeqId;
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
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductId() {
        return this.inProductId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInSubscriptionResourceId() {
        return this.inSubscriptionResourceId;
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
    public String getInUseRoleTypeId() {
        return this.inUseRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Integer</code>
     */
    public Integer getInUseTime() {
        return this.inUseTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInUseTimeUomId() {
        return this.inUseTimeUomId;
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
     * @return <code>String</code>
     */
    public String getOutSubscriptionId() {
        return this.outSubscriptionId;
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
     * @param inAlwaysCreateNewRecord the inAlwaysCreateNewRecord to set
    */
    public void setInAlwaysCreateNewRecord(String inAlwaysCreateNewRecord) {
        this.inParameters.add("alwaysCreateNewRecord");
        this.inAlwaysCreateNewRecord = inAlwaysCreateNewRecord;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAutomaticExtend the inAutomaticExtend to set
    */
    public void setInAutomaticExtend(String inAutomaticExtend) {
        this.inParameters.add("automaticExtend");
        this.inAutomaticExtend = inAutomaticExtend;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCanclAutmExtTime the inCanclAutmExtTime to set
    */
    public void setInCanclAutmExtTime(Integer inCanclAutmExtTime) {
        this.inParameters.add("canclAutmExtTime");
        this.inCanclAutmExtTime = inCanclAutmExtTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCanclAutmExtTimeUomId the inCanclAutmExtTimeUomId to set
    */
    public void setInCanclAutmExtTimeUomId(String inCanclAutmExtTimeUomId) {
        this.inParameters.add("canclAutmExtTimeUomId");
        this.inCanclAutmExtTimeUomId = inCanclAutmExtTimeUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInventoryItemId the inInventoryItemId to set
    */
    public void setInInventoryItemId(String inInventoryItemId) {
        this.inParameters.add("inventoryItemId");
        this.inInventoryItemId = inInventoryItemId;
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
     * @param inOrderId the inOrderId to set
    */
    public void setInOrderId(String inOrderId) {
        this.inParameters.add("orderId");
        this.inOrderId = inOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderItemSeqId the inOrderItemSeqId to set
    */
    public void setInOrderItemSeqId(String inOrderItemSeqId) {
        this.inParameters.add("orderItemSeqId");
        this.inOrderItemSeqId = inOrderItemSeqId;
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
     * This parameter is optional.
     * @param inProductId the inProductId to set
    */
    public void setInProductId(String inProductId) {
        this.inParameters.add("productId");
        this.inProductId = inProductId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inSubscriptionResourceId the inSubscriptionResourceId to set
    */
    public void setInSubscriptionResourceId(String inSubscriptionResourceId) {
        this.inParameters.add("subscriptionResourceId");
        this.inSubscriptionResourceId = inSubscriptionResourceId;
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
     * @param inUseRoleTypeId the inUseRoleTypeId to set
    */
    public void setInUseRoleTypeId(String inUseRoleTypeId) {
        this.inParameters.add("useRoleTypeId");
        this.inUseRoleTypeId = inUseRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inUseTime the inUseTime to set
    */
    public void setInUseTime(Integer inUseTime) {
        this.inParameters.add("useTime");
        this.inUseTime = inUseTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inUseTimeUomId the inUseTimeUomId to set
    */
    public void setInUseTimeUomId(String inUseTimeUomId) {
        this.inParameters.add("useTimeUomId");
        this.inUseTimeUomId = inUseTimeUomId;
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
     * @param outSubscriptionId the outSubscriptionId to set
    */
    public void setOutSubscriptionId(String outSubscriptionId) {
        this.outParameters.add("subscriptionId");
        this.outSubscriptionId = outSubscriptionId;
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
        if (inParameters.contains("alwaysCreateNewRecord")) mapValue.put("alwaysCreateNewRecord", getInAlwaysCreateNewRecord());
        if (inParameters.contains("automaticExtend")) mapValue.put("automaticExtend", getInAutomaticExtend());
        if (inParameters.contains("canclAutmExtTime")) mapValue.put("canclAutmExtTime", getInCanclAutmExtTime());
        if (inParameters.contains("canclAutmExtTimeUomId")) mapValue.put("canclAutmExtTimeUomId", getInCanclAutmExtTimeUomId());
        if (inParameters.contains("inventoryItemId")) mapValue.put("inventoryItemId", getInInventoryItemId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("orderItemSeqId")) mapValue.put("orderItemSeqId", getInOrderItemSeqId());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("subscriptionResourceId")) mapValue.put("subscriptionResourceId", getInSubscriptionResourceId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("useRoleTypeId")) mapValue.put("useRoleTypeId", getInUseRoleTypeId());
        if (inParameters.contains("useTime")) mapValue.put("useTime", getInUseTime());
        if (inParameters.contains("useTimeUomId")) mapValue.put("useTimeUomId", getInUseTimeUomId());
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
        if (outParameters.contains("subscriptionId")) mapValue.put("subscriptionId", getOutSubscriptionId());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("alwaysCreateNewRecord")) setInAlwaysCreateNewRecord((String) mapValue.get("alwaysCreateNewRecord"));
        if (mapValue.containsKey("automaticExtend")) setInAutomaticExtend((String) mapValue.get("automaticExtend"));
        if (mapValue.containsKey("canclAutmExtTime")) setInCanclAutmExtTime((Integer) mapValue.get("canclAutmExtTime"));
        if (mapValue.containsKey("canclAutmExtTimeUomId")) setInCanclAutmExtTimeUomId((String) mapValue.get("canclAutmExtTimeUomId"));
        if (mapValue.containsKey("inventoryItemId")) setInInventoryItemId((String) mapValue.get("inventoryItemId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("orderItemSeqId")) setInOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("subscriptionResourceId")) setInSubscriptionResourceId((String) mapValue.get("subscriptionResourceId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("useRoleTypeId")) setInUseRoleTypeId((String) mapValue.get("useRoleTypeId"));
        if (mapValue.containsKey("useTime")) setInUseTime((Integer) mapValue.get("useTime"));
        if (mapValue.containsKey("useTimeUomId")) setInUseTimeUomId((String) mapValue.get("useTimeUomId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("subscriptionId")) setOutSubscriptionId((String) mapValue.get("subscriptionId"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>ProcessExtendSubscriptionService</code> from the input values of the given <code>ProcessExtendSubscriptionService</code>.
     * @param input a <code>ProcessExtendSubscriptionService</code>
     */
    public static ProcessExtendSubscriptionService fromInput(ProcessExtendSubscriptionService input) {
        ProcessExtendSubscriptionService service = new ProcessExtendSubscriptionService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>ProcessExtendSubscriptionService</code> from the output values of the given <code>ProcessExtendSubscriptionService</code>.
     * @param output a <code>ProcessExtendSubscriptionService</code>
     */
    public static ProcessExtendSubscriptionService fromOutput(ProcessExtendSubscriptionService output) {
        ProcessExtendSubscriptionService service = new ProcessExtendSubscriptionService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>ProcessExtendSubscriptionService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static ProcessExtendSubscriptionService fromInput(Map<String, Object> mapValue) {
        ProcessExtendSubscriptionService service = new ProcessExtendSubscriptionService();
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
     * Construct a <code>ProcessExtendSubscriptionService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static ProcessExtendSubscriptionService fromOutput(Map<String, Object> mapValue) {
        ProcessExtendSubscriptionService service = new ProcessExtendSubscriptionService();
        service.putAllOutput(mapValue);
        return service;
    }
}
