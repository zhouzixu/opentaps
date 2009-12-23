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
 * Refund a gift card.
 * Auto generated base service entity refundGiftCard.
 *
 * Engine: java
 * Location: org.ofbiz.accounting.thirdparty.valuelink.ValueLinkServices
 * Invoke: refund
 * Defined in: applications/accounting/servicedef/services_valuelink.xml
 */
public class RefundGiftCardService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "refundGiftCard";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        amount("amount"),
        cardNumber("cardNumber"),
        currency("currency"),
        locale("locale"),
        orderId("orderId"),
        partyId("partyId"),
        paymentConfig("paymentConfig"),
        pin("pin"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        amount("amount"),
        authCode("authCode"),
        cardClass("cardClass"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        expireDate("expireDate"),
        locale("locale"),
        previousAmount("previousAmount"),
        processResult("processResult"),
        referenceNum("referenceNum"),
        responseCode("responseCode"),
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
     * Creates a new <code>RefundGiftCardService</code> instance.
     */
    public RefundGiftCardService() {
        super();
    }

    /**
     * Creates a new <code>RefundGiftCardService</code> instance.
     * @param user an <code>User</code> value
     */
    public RefundGiftCardService(User user) {
        super(user);
    }

    private BigDecimal inAmount;
    private String inCardNumber;
    private String inCurrency;
    private Locale inLocale;
    private String inOrderId;
    private String inPartyId;
    private String inPaymentConfig;
    private String inPin;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private BigDecimal outAmount;
    private String outAuthCode;
    private String outCardClass;
    private String outErrorMessage;
    private List outErrorMessageList;
    private String outExpireDate;
    private Locale outLocale;
    private BigDecimal outPreviousAmount;
    private Boolean outProcessResult;
    private String outReferenceNum;
    private String outResponseCode;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAmount() {
        return this.inAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCardNumber() {
        return this.inCardNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCurrency() {
        return this.inCurrency;
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
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPaymentConfig() {
        return this.inPaymentConfig;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPin() {
        return this.inPin;
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
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutAmount() {
        return this.outAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAuthCode() {
        return this.outAuthCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutCardClass() {
        return this.outCardClass;
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
     * @return <code>String</code>
     */
    public String getOutExpireDate() {
        return this.outExpireDate;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutPreviousAmount() {
        return this.outPreviousAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Boolean</code>
     */
    public Boolean getOutProcessResult() {
        return this.outProcessResult;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutReferenceNum() {
        return this.outReferenceNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutResponseCode() {
        return this.outResponseCode;
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
     * This parameter is required.
     * @param inAmount the inAmount to set
    */
    public void setInAmount(BigDecimal inAmount) {
        this.inParameters.add("amount");
        this.inAmount = inAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCardNumber the inCardNumber to set
    */
    public void setInCardNumber(String inCardNumber) {
        this.inParameters.add("cardNumber");
        this.inCardNumber = inCardNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCurrency the inCurrency to set
    */
    public void setInCurrency(String inCurrency) {
        this.inParameters.add("currency");
        this.inCurrency = inCurrency;
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
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPaymentConfig the inPaymentConfig to set
    */
    public void setInPaymentConfig(String inPaymentConfig) {
        this.inParameters.add("paymentConfig");
        this.inPaymentConfig = inPaymentConfig;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPin the inPin to set
    */
    public void setInPin(String inPin) {
        this.inParameters.add("pin");
        this.inPin = inPin;
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
     * This parameter is required.
     * @param outAmount the outAmount to set
    */
    public void setOutAmount(BigDecimal outAmount) {
        this.outParameters.add("amount");
        this.outAmount = outAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAuthCode the outAuthCode to set
    */
    public void setOutAuthCode(String outAuthCode) {
        this.outParameters.add("authCode");
        this.outAuthCode = outAuthCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCardClass the outCardClass to set
    */
    public void setOutCardClass(String outCardClass) {
        this.outParameters.add("cardClass");
        this.outCardClass = outCardClass;
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
     * @param outExpireDate the outExpireDate to set
    */
    public void setOutExpireDate(String outExpireDate) {
        this.outParameters.add("expireDate");
        this.outExpireDate = outExpireDate;
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
     * @param outPreviousAmount the outPreviousAmount to set
    */
    public void setOutPreviousAmount(BigDecimal outPreviousAmount) {
        this.outParameters.add("previousAmount");
        this.outPreviousAmount = outPreviousAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outProcessResult the outProcessResult to set
    */
    public void setOutProcessResult(Boolean outProcessResult) {
        this.outParameters.add("processResult");
        this.outProcessResult = outProcessResult;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outReferenceNum the outReferenceNum to set
    */
    public void setOutReferenceNum(String outReferenceNum) {
        this.outParameters.add("referenceNum");
        this.outReferenceNum = outReferenceNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outResponseCode the outResponseCode to set
    */
    public void setOutResponseCode(String outResponseCode) {
        this.outParameters.add("responseCode");
        this.outResponseCode = outResponseCode;
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
        if (inParameters.contains("amount")) mapValue.put("amount", getInAmount());
        if (inParameters.contains("cardNumber")) mapValue.put("cardNumber", getInCardNumber());
        if (inParameters.contains("currency")) mapValue.put("currency", getInCurrency());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("paymentConfig")) mapValue.put("paymentConfig", getInPaymentConfig());
        if (inParameters.contains("pin")) mapValue.put("pin", getInPin());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("amount")) mapValue.put("amount", getOutAmount());
        if (outParameters.contains("authCode")) mapValue.put("authCode", getOutAuthCode());
        if (outParameters.contains("cardClass")) mapValue.put("cardClass", getOutCardClass());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("expireDate")) mapValue.put("expireDate", getOutExpireDate());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("previousAmount")) mapValue.put("previousAmount", getOutPreviousAmount());
        if (outParameters.contains("processResult")) mapValue.put("processResult", getOutProcessResult());
        if (outParameters.contains("referenceNum")) mapValue.put("referenceNum", getOutReferenceNum());
        if (outParameters.contains("responseCode")) mapValue.put("responseCode", getOutResponseCode());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("amount")) setInAmount((BigDecimal) mapValue.get("amount"));
        if (mapValue.containsKey("cardNumber")) setInCardNumber((String) mapValue.get("cardNumber"));
        if (mapValue.containsKey("currency")) setInCurrency((String) mapValue.get("currency"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("paymentConfig")) setInPaymentConfig((String) mapValue.get("paymentConfig"));
        if (mapValue.containsKey("pin")) setInPin((String) mapValue.get("pin"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("amount")) setOutAmount((BigDecimal) mapValue.get("amount"));
        if (mapValue.containsKey("authCode")) setOutAuthCode((String) mapValue.get("authCode"));
        if (mapValue.containsKey("cardClass")) setOutCardClass((String) mapValue.get("cardClass"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("expireDate")) setOutExpireDate((String) mapValue.get("expireDate"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("previousAmount")) setOutPreviousAmount((BigDecimal) mapValue.get("previousAmount"));
        if (mapValue.containsKey("processResult")) setOutProcessResult((Boolean) mapValue.get("processResult"));
        if (mapValue.containsKey("referenceNum")) setOutReferenceNum((String) mapValue.get("referenceNum"));
        if (mapValue.containsKey("responseCode")) setOutResponseCode((String) mapValue.get("responseCode"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>RefundGiftCardService</code> from the input values of the given <code>RefundGiftCardService</code>.
     * @param input a <code>RefundGiftCardService</code>
     */
    public static RefundGiftCardService fromInput(RefundGiftCardService input) {
        RefundGiftCardService service = new RefundGiftCardService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>RefundGiftCardService</code> from the output values of the given <code>RefundGiftCardService</code>.
     * @param output a <code>RefundGiftCardService</code>
     */
    public static RefundGiftCardService fromOutput(RefundGiftCardService output) {
        RefundGiftCardService service = new RefundGiftCardService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>RefundGiftCardService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static RefundGiftCardService fromInput(Map<String, Object> mapValue) {
        RefundGiftCardService service = new RefundGiftCardService();
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
     * Construct a <code>RefundGiftCardService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static RefundGiftCardService fromOutput(Map<String, Object> mapValue) {
        RefundGiftCardService service = new RefundGiftCardService();
        service.putAllOutput(mapValue);
        return service;
    }
}
