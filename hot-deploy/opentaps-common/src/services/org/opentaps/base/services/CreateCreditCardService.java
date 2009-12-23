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

import java.sql.Timestamp;
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
 * Create CreditCard.
 * Auto generated base service entity createCreditCard.
 *
 * Engine: java
 * Location: org.ofbiz.accounting.payment.PaymentMethodServices
 * Invoke: createCreditCard
 * Defined in: applications/accounting/servicedef/services_paymentmethod.xml
 */
public class CreateCreditCardService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createCreditCard";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        cardNumber("cardNumber"),
        cardType("cardType"),
        companyNameOnCard("companyNameOnCard"),
        consecutiveFailedAuths("consecutiveFailedAuths"),
        consecutiveFailedNsf("consecutiveFailedNsf"),
        contactMechId("contactMechId"),
        description("description"),
        expMonth("expMonth"),
        expYear("expYear"),
        expireDate("expireDate"),
        firstNameOnCard("firstNameOnCard"),
        fromDate("fromDate"),
        issueNumber("issueNumber"),
        lastFailedAuthDate("lastFailedAuthDate"),
        lastFailedNsfDate("lastFailedNsfDate"),
        lastNameOnCard("lastNameOnCard"),
        locale("locale"),
        middleNameOnCard("middleNameOnCard"),
        partyId("partyId"),
        paymentMethodId("paymentMethodId"),
        productStoreId("productStoreId"),
        suffixOnCard("suffixOnCard"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        titleOnCard("titleOnCard"),
        userLogin("userLogin"),
        validFromDate("validFromDate");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        paymentMethodId("paymentMethodId"),
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
     * Creates a new <code>CreateCreditCardService</code> instance.
     */
    public CreateCreditCardService() {
        super();
    }

    /**
     * Creates a new <code>CreateCreditCardService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateCreditCardService(User user) {
        super(user);
    }

    private String inCardNumber;
    private String inCardType;
    private String inCompanyNameOnCard;
    private Long inConsecutiveFailedAuths;
    private Long inConsecutiveFailedNsf;
    private String inContactMechId;
    private String inDescription;
    private String inExpMonth;
    private String inExpYear;
    private String inExpireDate;
    private String inFirstNameOnCard;
    private Timestamp inFromDate;
    private String inIssueNumber;
    private Timestamp inLastFailedAuthDate;
    private Timestamp inLastFailedNsfDate;
    private String inLastNameOnCard;
    private Locale inLocale;
    private String inMiddleNameOnCard;
    private String inPartyId;
    private String inPaymentMethodId;
    private String inProductStoreId;
    private String inSuffixOnCard;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private String inTitleOnCard;
    private GenericValue inUserLogin;
    private String inValidFromDate;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outPaymentMethodId;
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
    public String getInCardType() {
        return this.inCardType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCompanyNameOnCard() {
        return this.inCompanyNameOnCard;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInConsecutiveFailedAuths() {
        return this.inConsecutiveFailedAuths;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInConsecutiveFailedNsf() {
        return this.inConsecutiveFailedNsf;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactMechId() {
        return this.inContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInExpMonth() {
        return this.inExpMonth;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInExpYear() {
        return this.inExpYear;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInExpireDate() {
        return this.inExpireDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFirstNameOnCard() {
        return this.inFirstNameOnCard;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate() {
        return this.inFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIssueNumber() {
        return this.inIssueNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastFailedAuthDate() {
        return this.inLastFailedAuthDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastFailedNsfDate() {
        return this.inLastFailedNsfDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInLastNameOnCard() {
        return this.inLastNameOnCard;
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
    public String getInMiddleNameOnCard() {
        return this.inMiddleNameOnCard;
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
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentMethodId() {
        return this.inPaymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
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
    public String getInSuffixOnCard() {
        return this.inSuffixOnCard;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInThruDate() {
        return this.inThruDate;
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
    public String getInTitleOnCard() {
        return this.inTitleOnCard;
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
    public String getInValidFromDate() {
        return this.inValidFromDate;
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
    public String getOutPaymentMethodId() {
        return this.outPaymentMethodId;
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
     * @param inCardNumber the inCardNumber to set
    */
    public void setInCardNumber(String inCardNumber) {
        this.inParameters.add("cardNumber");
        this.inCardNumber = inCardNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCardType the inCardType to set
    */
    public void setInCardType(String inCardType) {
        this.inParameters.add("cardType");
        this.inCardType = inCardType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCompanyNameOnCard the inCompanyNameOnCard to set
    */
    public void setInCompanyNameOnCard(String inCompanyNameOnCard) {
        this.inParameters.add("companyNameOnCard");
        this.inCompanyNameOnCard = inCompanyNameOnCard;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inConsecutiveFailedAuths the inConsecutiveFailedAuths to set
    */
    public void setInConsecutiveFailedAuths(Long inConsecutiveFailedAuths) {
        this.inParameters.add("consecutiveFailedAuths");
        this.inConsecutiveFailedAuths = inConsecutiveFailedAuths;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inConsecutiveFailedNsf the inConsecutiveFailedNsf to set
    */
    public void setInConsecutiveFailedNsf(Long inConsecutiveFailedNsf) {
        this.inParameters.add("consecutiveFailedNsf");
        this.inConsecutiveFailedNsf = inConsecutiveFailedNsf;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactMechId the inContactMechId to set
    */
    public void setInContactMechId(String inContactMechId) {
        this.inParameters.add("contactMechId");
        this.inContactMechId = inContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inExpMonth the inExpMonth to set
    */
    public void setInExpMonth(String inExpMonth) {
        this.inParameters.add("expMonth");
        this.inExpMonth = inExpMonth;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inExpYear the inExpYear to set
    */
    public void setInExpYear(String inExpYear) {
        this.inParameters.add("expYear");
        this.inExpYear = inExpYear;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inExpireDate the inExpireDate to set
    */
    public void setInExpireDate(String inExpireDate) {
        this.inParameters.add("expireDate");
        this.inExpireDate = inExpireDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFirstNameOnCard the inFirstNameOnCard to set
    */
    public void setInFirstNameOnCard(String inFirstNameOnCard) {
        this.inParameters.add("firstNameOnCard");
        this.inFirstNameOnCard = inFirstNameOnCard;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIssueNumber the inIssueNumber to set
    */
    public void setInIssueNumber(String inIssueNumber) {
        this.inParameters.add("issueNumber");
        this.inIssueNumber = inIssueNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastFailedAuthDate the inLastFailedAuthDate to set
    */
    public void setInLastFailedAuthDate(Timestamp inLastFailedAuthDate) {
        this.inParameters.add("lastFailedAuthDate");
        this.inLastFailedAuthDate = inLastFailedAuthDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastFailedNsfDate the inLastFailedNsfDate to set
    */
    public void setInLastFailedNsfDate(Timestamp inLastFailedNsfDate) {
        this.inParameters.add("lastFailedNsfDate");
        this.inLastFailedNsfDate = inLastFailedNsfDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inLastNameOnCard the inLastNameOnCard to set
    */
    public void setInLastNameOnCard(String inLastNameOnCard) {
        this.inParameters.add("lastNameOnCard");
        this.inLastNameOnCard = inLastNameOnCard;
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
     * @param inMiddleNameOnCard the inMiddleNameOnCard to set
    */
    public void setInMiddleNameOnCard(String inMiddleNameOnCard) {
        this.inParameters.add("middleNameOnCard");
        this.inMiddleNameOnCard = inMiddleNameOnCard;
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
     * This parameter is optional.
     * @param inPaymentMethodId the inPaymentMethodId to set
    */
    public void setInPaymentMethodId(String inPaymentMethodId) {
        this.inParameters.add("paymentMethodId");
        this.inPaymentMethodId = inPaymentMethodId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSuffixOnCard the inSuffixOnCard to set
    */
    public void setInSuffixOnCard(String inSuffixOnCard) {
        this.inParameters.add("suffixOnCard");
        this.inSuffixOnCard = inSuffixOnCard;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThruDate the inThruDate to set
    */
    public void setInThruDate(Timestamp inThruDate) {
        this.inParameters.add("thruDate");
        this.inThruDate = inThruDate;
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
     * @param inTitleOnCard the inTitleOnCard to set
    */
    public void setInTitleOnCard(String inTitleOnCard) {
        this.inParameters.add("titleOnCard");
        this.inTitleOnCard = inTitleOnCard;
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
     * @param inValidFromDate the inValidFromDate to set
    */
    public void setInValidFromDate(String inValidFromDate) {
        this.inParameters.add("validFromDate");
        this.inValidFromDate = inValidFromDate;
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
     * @param outPaymentMethodId the outPaymentMethodId to set
    */
    public void setOutPaymentMethodId(String outPaymentMethodId) {
        this.outParameters.add("paymentMethodId");
        this.outPaymentMethodId = outPaymentMethodId;
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
        if (inParameters.contains("cardNumber")) mapValue.put("cardNumber", getInCardNumber());
        if (inParameters.contains("cardType")) mapValue.put("cardType", getInCardType());
        if (inParameters.contains("companyNameOnCard")) mapValue.put("companyNameOnCard", getInCompanyNameOnCard());
        if (inParameters.contains("consecutiveFailedAuths")) mapValue.put("consecutiveFailedAuths", getInConsecutiveFailedAuths());
        if (inParameters.contains("consecutiveFailedNsf")) mapValue.put("consecutiveFailedNsf", getInConsecutiveFailedNsf());
        if (inParameters.contains("contactMechId")) mapValue.put("contactMechId", getInContactMechId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("expMonth")) mapValue.put("expMonth", getInExpMonth());
        if (inParameters.contains("expYear")) mapValue.put("expYear", getInExpYear());
        if (inParameters.contains("expireDate")) mapValue.put("expireDate", getInExpireDate());
        if (inParameters.contains("firstNameOnCard")) mapValue.put("firstNameOnCard", getInFirstNameOnCard());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("issueNumber")) mapValue.put("issueNumber", getInIssueNumber());
        if (inParameters.contains("lastFailedAuthDate")) mapValue.put("lastFailedAuthDate", getInLastFailedAuthDate());
        if (inParameters.contains("lastFailedNsfDate")) mapValue.put("lastFailedNsfDate", getInLastFailedNsfDate());
        if (inParameters.contains("lastNameOnCard")) mapValue.put("lastNameOnCard", getInLastNameOnCard());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("middleNameOnCard")) mapValue.put("middleNameOnCard", getInMiddleNameOnCard());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("paymentMethodId")) mapValue.put("paymentMethodId", getInPaymentMethodId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("suffixOnCard")) mapValue.put("suffixOnCard", getInSuffixOnCard());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("titleOnCard")) mapValue.put("titleOnCard", getInTitleOnCard());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("validFromDate")) mapValue.put("validFromDate", getInValidFromDate());
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
        if (outParameters.contains("paymentMethodId")) mapValue.put("paymentMethodId", getOutPaymentMethodId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("cardNumber")) setInCardNumber((String) mapValue.get("cardNumber"));
        if (mapValue.containsKey("cardType")) setInCardType((String) mapValue.get("cardType"));
        if (mapValue.containsKey("companyNameOnCard")) setInCompanyNameOnCard((String) mapValue.get("companyNameOnCard"));
        if (mapValue.containsKey("consecutiveFailedAuths")) setInConsecutiveFailedAuths((Long) mapValue.get("consecutiveFailedAuths"));
        if (mapValue.containsKey("consecutiveFailedNsf")) setInConsecutiveFailedNsf((Long) mapValue.get("consecutiveFailedNsf"));
        if (mapValue.containsKey("contactMechId")) setInContactMechId((String) mapValue.get("contactMechId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("expMonth")) setInExpMonth((String) mapValue.get("expMonth"));
        if (mapValue.containsKey("expYear")) setInExpYear((String) mapValue.get("expYear"));
        if (mapValue.containsKey("expireDate")) setInExpireDate((String) mapValue.get("expireDate"));
        if (mapValue.containsKey("firstNameOnCard")) setInFirstNameOnCard((String) mapValue.get("firstNameOnCard"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("issueNumber")) setInIssueNumber((String) mapValue.get("issueNumber"));
        if (mapValue.containsKey("lastFailedAuthDate")) setInLastFailedAuthDate((Timestamp) mapValue.get("lastFailedAuthDate"));
        if (mapValue.containsKey("lastFailedNsfDate")) setInLastFailedNsfDate((Timestamp) mapValue.get("lastFailedNsfDate"));
        if (mapValue.containsKey("lastNameOnCard")) setInLastNameOnCard((String) mapValue.get("lastNameOnCard"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("middleNameOnCard")) setInMiddleNameOnCard((String) mapValue.get("middleNameOnCard"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("paymentMethodId")) setInPaymentMethodId((String) mapValue.get("paymentMethodId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("suffixOnCard")) setInSuffixOnCard((String) mapValue.get("suffixOnCard"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("titleOnCard")) setInTitleOnCard((String) mapValue.get("titleOnCard"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("validFromDate")) setInValidFromDate((String) mapValue.get("validFromDate"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("paymentMethodId")) setOutPaymentMethodId((String) mapValue.get("paymentMethodId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateCreditCardService</code> from the input values of the given <code>CreateCreditCardService</code>.
     * @param input a <code>CreateCreditCardService</code>
     */
    public static CreateCreditCardService fromInput(CreateCreditCardService input) {
        CreateCreditCardService service = new CreateCreditCardService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateCreditCardService</code> from the output values of the given <code>CreateCreditCardService</code>.
     * @param output a <code>CreateCreditCardService</code>
     */
    public static CreateCreditCardService fromOutput(CreateCreditCardService output) {
        CreateCreditCardService service = new CreateCreditCardService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateCreditCardService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateCreditCardService fromInput(Map<String, Object> mapValue) {
        CreateCreditCardService service = new CreateCreditCardService();
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
     * Construct a <code>CreateCreditCardService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateCreditCardService fromOutput(Map<String, Object> mapValue) {
        CreateCreditCardService service = new CreateCreditCardService();
        service.putAllOutput(mapValue);
        return service;
    }
}
