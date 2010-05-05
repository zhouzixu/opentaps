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
 * Update an existing Invoice.
 * Auto generated base service entity updateInvoice.
 *
 * Engine: simple
 * Location: com/opensourcestrategies/financials/invoices/InvoiceServices.xml
 * Invoke: updateInvoice
 * Defined in: opentaps/financials/servicedef/services_invoice.xml
 */
public class UpdateInvoiceService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateInvoice";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        adjustedAmount("adjustedAmount"),
        appliedAmount("appliedAmount"),
        billingAccountId("billingAccountId"),
        contactMechId("contactMechId"),
        currencyUomId("currencyUomId"),
        description("description"),
        dueDate("dueDate"),
        interestCharged("interestCharged"),
        invoiceAdjustedTotal("invoiceAdjustedTotal"),
        invoiceDate("invoiceDate"),
        invoiceId("invoiceId"),
        invoiceMessage("invoiceMessage"),
        invoiceTotal("invoiceTotal"),
        invoiceTypeId("invoiceTypeId"),
        locale("locale"),
        openAmount("openAmount"),
        paidDate("paidDate"),
        partyId("partyId"),
        partyIdFrom("partyIdFrom"),
        pendingAppliedAmount("pendingAppliedAmount"),
        pendingOpenAmount("pendingOpenAmount"),
        processingStatusId("processingStatusId"),
        recurrenceInfoId("recurrenceInfoId"),
        referenceNumber("referenceNumber"),
        roleTypeId("roleTypeId"),
        salesTaxTotal("salesTaxTotal"),
        statusId("statusId"),
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
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UpdateInvoiceService</code> instance.
     */
    public UpdateInvoiceService() {
        super();
    }


    private BigDecimal inAdjustedAmount;
    private BigDecimal inAppliedAmount;
    private String inBillingAccountId;
    private String inContactMechId;
    private String inCurrencyUomId;
    private String inDescription;
    private Timestamp inDueDate;
    private BigDecimal inInterestCharged;
    private BigDecimal inInvoiceAdjustedTotal;
    private Timestamp inInvoiceDate;
    private String inInvoiceId;
    private String inInvoiceMessage;
    private BigDecimal inInvoiceTotal;
    private String inInvoiceTypeId;
    private Locale inLocale;
    private BigDecimal inOpenAmount;
    private Timestamp inPaidDate;
    private String inPartyId;
    private String inPartyIdFrom;
    private BigDecimal inPendingAppliedAmount;
    private BigDecimal inPendingOpenAmount;
    private String inProcessingStatusId;
    private String inRecurrenceInfoId;
    private String inReferenceNumber;
    private String inRoleTypeId;
    private BigDecimal inSalesTaxTotal;
    private String inStatusId;
    private TimeZone inTimeZone;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAdjustedAmount() {
        return this.inAdjustedAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAppliedAmount() {
        return this.inAppliedAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBillingAccountId() {
        return this.inBillingAccountId;
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
    public String getInCurrencyUomId() {
        return this.inCurrencyUomId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getInDueDate() {
        return this.inDueDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInInterestCharged() {
        return this.inInterestCharged;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInInvoiceAdjustedTotal() {
        return this.inInvoiceAdjustedTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInInvoiceDate() {
        return this.inInvoiceDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInInvoiceId() {
        return this.inInvoiceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceMessage() {
        return this.inInvoiceMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInInvoiceTotal() {
        return this.inInvoiceTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceTypeId() {
        return this.inInvoiceTypeId;
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
    public BigDecimal getInOpenAmount() {
        return this.inOpenAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInPaidDate() {
        return this.inPaidDate;
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
    public String getInPartyIdFrom() {
        return this.inPartyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPendingAppliedAmount() {
        return this.inPendingAppliedAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPendingOpenAmount() {
        return this.inPendingOpenAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProcessingStatusId() {
        return this.inProcessingStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRecurrenceInfoId() {
        return this.inRecurrenceInfoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReferenceNumber() {
        return this.inReferenceNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeId() {
        return this.inRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInSalesTaxTotal() {
        return this.inSalesTaxTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInStatusId() {
        return this.inStatusId;
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
     * @param inAdjustedAmount the inAdjustedAmount to set
    */
    public void setInAdjustedAmount(BigDecimal inAdjustedAmount) {
        this.inParameters.add("adjustedAmount");
        this.inAdjustedAmount = inAdjustedAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAppliedAmount the inAppliedAmount to set
    */
    public void setInAppliedAmount(BigDecimal inAppliedAmount) {
        this.inParameters.add("appliedAmount");
        this.inAppliedAmount = inAppliedAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBillingAccountId the inBillingAccountId to set
    */
    public void setInBillingAccountId(String inBillingAccountId) {
        this.inParameters.add("billingAccountId");
        this.inBillingAccountId = inBillingAccountId;
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
     * @param inCurrencyUomId the inCurrencyUomId to set
    */
    public void setInCurrencyUomId(String inCurrencyUomId) {
        this.inParameters.add("currencyUomId");
        this.inCurrencyUomId = inCurrencyUomId;
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
     * @param inDueDate the inDueDate to set
    */
    public void setInDueDate(Timestamp inDueDate) {
        this.inParameters.add("dueDate");
        this.inDueDate = inDueDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInterestCharged the inInterestCharged to set
    */
    public void setInInterestCharged(BigDecimal inInterestCharged) {
        this.inParameters.add("interestCharged");
        this.inInterestCharged = inInterestCharged;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceAdjustedTotal the inInvoiceAdjustedTotal to set
    */
    public void setInInvoiceAdjustedTotal(BigDecimal inInvoiceAdjustedTotal) {
        this.inParameters.add("invoiceAdjustedTotal");
        this.inInvoiceAdjustedTotal = inInvoiceAdjustedTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceDate the inInvoiceDate to set
    */
    public void setInInvoiceDate(Timestamp inInvoiceDate) {
        this.inParameters.add("invoiceDate");
        this.inInvoiceDate = inInvoiceDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inInvoiceId the inInvoiceId to set
    */
    public void setInInvoiceId(String inInvoiceId) {
        this.inParameters.add("invoiceId");
        this.inInvoiceId = inInvoiceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceMessage the inInvoiceMessage to set
    */
    public void setInInvoiceMessage(String inInvoiceMessage) {
        this.inParameters.add("invoiceMessage");
        this.inInvoiceMessage = inInvoiceMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceTotal the inInvoiceTotal to set
    */
    public void setInInvoiceTotal(BigDecimal inInvoiceTotal) {
        this.inParameters.add("invoiceTotal");
        this.inInvoiceTotal = inInvoiceTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceTypeId the inInvoiceTypeId to set
    */
    public void setInInvoiceTypeId(String inInvoiceTypeId) {
        this.inParameters.add("invoiceTypeId");
        this.inInvoiceTypeId = inInvoiceTypeId;
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
     * @param inOpenAmount the inOpenAmount to set
    */
    public void setInOpenAmount(BigDecimal inOpenAmount) {
        this.inParameters.add("openAmount");
        this.inOpenAmount = inOpenAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaidDate the inPaidDate to set
    */
    public void setInPaidDate(Timestamp inPaidDate) {
        this.inParameters.add("paidDate");
        this.inPaidDate = inPaidDate;
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
     * @param inPartyIdFrom the inPartyIdFrom to set
    */
    public void setInPartyIdFrom(String inPartyIdFrom) {
        this.inParameters.add("partyIdFrom");
        this.inPartyIdFrom = inPartyIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPendingAppliedAmount the inPendingAppliedAmount to set
    */
    public void setInPendingAppliedAmount(BigDecimal inPendingAppliedAmount) {
        this.inParameters.add("pendingAppliedAmount");
        this.inPendingAppliedAmount = inPendingAppliedAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPendingOpenAmount the inPendingOpenAmount to set
    */
    public void setInPendingOpenAmount(BigDecimal inPendingOpenAmount) {
        this.inParameters.add("pendingOpenAmount");
        this.inPendingOpenAmount = inPendingOpenAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProcessingStatusId the inProcessingStatusId to set
    */
    public void setInProcessingStatusId(String inProcessingStatusId) {
        this.inParameters.add("processingStatusId");
        this.inProcessingStatusId = inProcessingStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRecurrenceInfoId the inRecurrenceInfoId to set
    */
    public void setInRecurrenceInfoId(String inRecurrenceInfoId) {
        this.inParameters.add("recurrenceInfoId");
        this.inRecurrenceInfoId = inRecurrenceInfoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReferenceNumber the inReferenceNumber to set
    */
    public void setInReferenceNumber(String inReferenceNumber) {
        this.inParameters.add("referenceNumber");
        this.inReferenceNumber = inReferenceNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeId the inRoleTypeId to set
    */
    public void setInRoleTypeId(String inRoleTypeId) {
        this.inParameters.add("roleTypeId");
        this.inRoleTypeId = inRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSalesTaxTotal the inSalesTaxTotal to set
    */
    public void setInSalesTaxTotal(BigDecimal inSalesTaxTotal) {
        this.inParameters.add("salesTaxTotal");
        this.inSalesTaxTotal = inSalesTaxTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inStatusId the inStatusId to set
    */
    public void setInStatusId(String inStatusId) {
        this.inParameters.add("statusId");
        this.inStatusId = inStatusId;
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
        if (inParameters.contains("adjustedAmount")) mapValue.put("adjustedAmount", getInAdjustedAmount());
        if (inParameters.contains("appliedAmount")) mapValue.put("appliedAmount", getInAppliedAmount());
        if (inParameters.contains("billingAccountId")) mapValue.put("billingAccountId", getInBillingAccountId());
        if (inParameters.contains("contactMechId")) mapValue.put("contactMechId", getInContactMechId());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("dueDate")) mapValue.put("dueDate", getInDueDate());
        if (inParameters.contains("interestCharged")) mapValue.put("interestCharged", getInInterestCharged());
        if (inParameters.contains("invoiceAdjustedTotal")) mapValue.put("invoiceAdjustedTotal", getInInvoiceAdjustedTotal());
        if (inParameters.contains("invoiceDate")) mapValue.put("invoiceDate", getInInvoiceDate());
        if (inParameters.contains("invoiceId")) mapValue.put("invoiceId", getInInvoiceId());
        if (inParameters.contains("invoiceMessage")) mapValue.put("invoiceMessage", getInInvoiceMessage());
        if (inParameters.contains("invoiceTotal")) mapValue.put("invoiceTotal", getInInvoiceTotal());
        if (inParameters.contains("invoiceTypeId")) mapValue.put("invoiceTypeId", getInInvoiceTypeId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("openAmount")) mapValue.put("openAmount", getInOpenAmount());
        if (inParameters.contains("paidDate")) mapValue.put("paidDate", getInPaidDate());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("partyIdFrom")) mapValue.put("partyIdFrom", getInPartyIdFrom());
        if (inParameters.contains("pendingAppliedAmount")) mapValue.put("pendingAppliedAmount", getInPendingAppliedAmount());
        if (inParameters.contains("pendingOpenAmount")) mapValue.put("pendingOpenAmount", getInPendingOpenAmount());
        if (inParameters.contains("processingStatusId")) mapValue.put("processingStatusId", getInProcessingStatusId());
        if (inParameters.contains("recurrenceInfoId")) mapValue.put("recurrenceInfoId", getInRecurrenceInfoId());
        if (inParameters.contains("referenceNumber")) mapValue.put("referenceNumber", getInReferenceNumber());
        if (inParameters.contains("roleTypeId")) mapValue.put("roleTypeId", getInRoleTypeId());
        if (inParameters.contains("salesTaxTotal")) mapValue.put("salesTaxTotal", getInSalesTaxTotal());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
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
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("adjustedAmount")) setInAdjustedAmount((BigDecimal) mapValue.get("adjustedAmount"));
        if (mapValue.containsKey("appliedAmount")) setInAppliedAmount((BigDecimal) mapValue.get("appliedAmount"));
        if (mapValue.containsKey("billingAccountId")) setInBillingAccountId((String) mapValue.get("billingAccountId"));
        if (mapValue.containsKey("contactMechId")) setInContactMechId((String) mapValue.get("contactMechId"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("dueDate")) setInDueDate((Timestamp) mapValue.get("dueDate"));
        if (mapValue.containsKey("interestCharged")) setInInterestCharged((BigDecimal) mapValue.get("interestCharged"));
        if (mapValue.containsKey("invoiceAdjustedTotal")) setInInvoiceAdjustedTotal((BigDecimal) mapValue.get("invoiceAdjustedTotal"));
        if (mapValue.containsKey("invoiceDate")) setInInvoiceDate((Timestamp) mapValue.get("invoiceDate"));
        if (mapValue.containsKey("invoiceId")) setInInvoiceId((String) mapValue.get("invoiceId"));
        if (mapValue.containsKey("invoiceMessage")) setInInvoiceMessage((String) mapValue.get("invoiceMessage"));
        if (mapValue.containsKey("invoiceTotal")) setInInvoiceTotal((BigDecimal) mapValue.get("invoiceTotal"));
        if (mapValue.containsKey("invoiceTypeId")) setInInvoiceTypeId((String) mapValue.get("invoiceTypeId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("openAmount")) setInOpenAmount((BigDecimal) mapValue.get("openAmount"));
        if (mapValue.containsKey("paidDate")) setInPaidDate((Timestamp) mapValue.get("paidDate"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("partyIdFrom")) setInPartyIdFrom((String) mapValue.get("partyIdFrom"));
        if (mapValue.containsKey("pendingAppliedAmount")) setInPendingAppliedAmount((BigDecimal) mapValue.get("pendingAppliedAmount"));
        if (mapValue.containsKey("pendingOpenAmount")) setInPendingOpenAmount((BigDecimal) mapValue.get("pendingOpenAmount"));
        if (mapValue.containsKey("processingStatusId")) setInProcessingStatusId((String) mapValue.get("processingStatusId"));
        if (mapValue.containsKey("recurrenceInfoId")) setInRecurrenceInfoId((String) mapValue.get("recurrenceInfoId"));
        if (mapValue.containsKey("referenceNumber")) setInReferenceNumber((String) mapValue.get("referenceNumber"));
        if (mapValue.containsKey("roleTypeId")) setInRoleTypeId((String) mapValue.get("roleTypeId"));
        if (mapValue.containsKey("salesTaxTotal")) setInSalesTaxTotal((BigDecimal) mapValue.get("salesTaxTotal"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
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
     * Construct a <code>UpdateInvoiceService</code> from the input values of the given <code>UpdateInvoiceService</code>.
     * @param input a <code>UpdateInvoiceService</code>
     */
    public static UpdateInvoiceService fromInput(UpdateInvoiceService input) {
        UpdateInvoiceService service = new UpdateInvoiceService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateInvoiceService</code> from the output values of the given <code>UpdateInvoiceService</code>.
     * @param output a <code>UpdateInvoiceService</code>
     */
    public static UpdateInvoiceService fromOutput(UpdateInvoiceService output) {
        UpdateInvoiceService service = new UpdateInvoiceService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateInvoiceService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateInvoiceService fromInput(Map<String, Object> mapValue) {
        UpdateInvoiceService service = new UpdateInvoiceService();
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
     * Construct a <code>UpdateInvoiceService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateInvoiceService fromOutput(Map<String, Object> mapValue) {
        UpdateInvoiceService service = new UpdateInvoiceService();
        service.putAllOutput(mapValue);
        return service;
    }
}
