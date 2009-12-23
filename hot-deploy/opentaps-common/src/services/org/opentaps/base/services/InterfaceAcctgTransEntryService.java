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
import java.sql.Date;
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
 * .
 * Auto generated base service entity interfaceAcctgTransEntry.
 *
 * Engine: interface
 * Location: 
 * Invoke: 
 * Defined in: applications/accounting/servicedef/services_ledger.xml
 */
public class InterfaceAcctgTransEntryService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "interfaceAcctgTransEntry";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        acctgTagEnumId1("acctgTagEnumId1"),
        acctgTagEnumId10("acctgTagEnumId10"),
        acctgTagEnumId2("acctgTagEnumId2"),
        acctgTagEnumId3("acctgTagEnumId3"),
        acctgTagEnumId4("acctgTagEnumId4"),
        acctgTagEnumId5("acctgTagEnumId5"),
        acctgTagEnumId6("acctgTagEnumId6"),
        acctgTagEnumId7("acctgTagEnumId7"),
        acctgTagEnumId8("acctgTagEnumId8"),
        acctgTagEnumId9("acctgTagEnumId9"),
        acctgTransEntryTypeId("acctgTransEntryTypeId"),
        amount("amount"),
        currencyUomId("currencyUomId"),
        debitCreditFlag("debitCreditFlag"),
        description("description"),
        dueDate("dueDate"),
        glAccountId("glAccountId"),
        glAccountTypeId("glAccountTypeId"),
        groupId("groupId"),
        isSummary("isSummary"),
        locale("locale"),
        organizationPartyId("organizationPartyId"),
        origAmount("origAmount"),
        origCurrencyUomId("origCurrencyUomId"),
        partyId("partyId"),
        productId("productId"),
        roleTypeId("roleTypeId"),
        settlementTermId("settlementTermId"),
        taxId("taxId"),
        theirPartyId("theirPartyId"),
        theirProductId("theirProductId"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        voucherRef("voucherRef");
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
     * Creates a new <code>InterfaceAcctgTransEntryService</code> instance.
     */
    public InterfaceAcctgTransEntryService() {
        super();
    }


    private String inAcctgTagEnumId1;
    private String inAcctgTagEnumId10;
    private String inAcctgTagEnumId2;
    private String inAcctgTagEnumId3;
    private String inAcctgTagEnumId4;
    private String inAcctgTagEnumId5;
    private String inAcctgTagEnumId6;
    private String inAcctgTagEnumId7;
    private String inAcctgTagEnumId8;
    private String inAcctgTagEnumId9;
    private String inAcctgTransEntryTypeId;
    private BigDecimal inAmount;
    private String inCurrencyUomId;
    private String inDebitCreditFlag;
    private String inDescription;
    private Date inDueDate;
    private String inGlAccountId;
    private String inGlAccountTypeId;
    private String inGroupId;
    private String inIsSummary;
    private Locale inLocale;
    private String inOrganizationPartyId;
    private BigDecimal inOrigAmount;
    private String inOrigCurrencyUomId;
    private String inPartyId;
    private String inProductId;
    private String inRoleTypeId;
    private String inSettlementTermId;
    private String inTaxId;
    private String inTheirPartyId;
    private String inTheirProductId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inVoucherRef;
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
    public String getInAcctgTagEnumId1() {
        return this.inAcctgTagEnumId1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId10() {
        return this.inAcctgTagEnumId10;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId2() {
        return this.inAcctgTagEnumId2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId3() {
        return this.inAcctgTagEnumId3;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId4() {
        return this.inAcctgTagEnumId4;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId5() {
        return this.inAcctgTagEnumId5;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId6() {
        return this.inAcctgTagEnumId6;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId7() {
        return this.inAcctgTagEnumId7;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId8() {
        return this.inAcctgTagEnumId8;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId9() {
        return this.inAcctgTagEnumId9;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTransEntryTypeId() {
        return this.inAcctgTransEntryTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAmount() {
        return this.inAmount;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInDebitCreditFlag() {
        return this.inDebitCreditFlag;
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
     * @return <code>Date</code>
     */
    public Date getInDueDate() {
        return this.inDueDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlAccountId() {
        return this.inGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlAccountTypeId() {
        return this.inGlAccountTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGroupId() {
        return this.inGroupId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsSummary() {
        return this.inIsSummary;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInOrganizationPartyId() {
        return this.inOrganizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInOrigAmount() {
        return this.inOrigAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOrigCurrencyUomId() {
        return this.inOrigCurrencyUomId;
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
    public String getInProductId() {
        return this.inProductId;
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
     * @return <code>String</code>
     */
    public String getInSettlementTermId() {
        return this.inSettlementTermId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxId() {
        return this.inTaxId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTheirPartyId() {
        return this.inTheirPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTheirProductId() {
        return this.inTheirProductId;
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
    public String getInVoucherRef() {
        return this.inVoucherRef;
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
     * @param inAcctgTagEnumId1 the inAcctgTagEnumId1 to set
    */
    public void setInAcctgTagEnumId1(String inAcctgTagEnumId1) {
        this.inParameters.add("acctgTagEnumId1");
        this.inAcctgTagEnumId1 = inAcctgTagEnumId1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId10 the inAcctgTagEnumId10 to set
    */
    public void setInAcctgTagEnumId10(String inAcctgTagEnumId10) {
        this.inParameters.add("acctgTagEnumId10");
        this.inAcctgTagEnumId10 = inAcctgTagEnumId10;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId2 the inAcctgTagEnumId2 to set
    */
    public void setInAcctgTagEnumId2(String inAcctgTagEnumId2) {
        this.inParameters.add("acctgTagEnumId2");
        this.inAcctgTagEnumId2 = inAcctgTagEnumId2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId3 the inAcctgTagEnumId3 to set
    */
    public void setInAcctgTagEnumId3(String inAcctgTagEnumId3) {
        this.inParameters.add("acctgTagEnumId3");
        this.inAcctgTagEnumId3 = inAcctgTagEnumId3;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId4 the inAcctgTagEnumId4 to set
    */
    public void setInAcctgTagEnumId4(String inAcctgTagEnumId4) {
        this.inParameters.add("acctgTagEnumId4");
        this.inAcctgTagEnumId4 = inAcctgTagEnumId4;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId5 the inAcctgTagEnumId5 to set
    */
    public void setInAcctgTagEnumId5(String inAcctgTagEnumId5) {
        this.inParameters.add("acctgTagEnumId5");
        this.inAcctgTagEnumId5 = inAcctgTagEnumId5;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId6 the inAcctgTagEnumId6 to set
    */
    public void setInAcctgTagEnumId6(String inAcctgTagEnumId6) {
        this.inParameters.add("acctgTagEnumId6");
        this.inAcctgTagEnumId6 = inAcctgTagEnumId6;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId7 the inAcctgTagEnumId7 to set
    */
    public void setInAcctgTagEnumId7(String inAcctgTagEnumId7) {
        this.inParameters.add("acctgTagEnumId7");
        this.inAcctgTagEnumId7 = inAcctgTagEnumId7;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId8 the inAcctgTagEnumId8 to set
    */
    public void setInAcctgTagEnumId8(String inAcctgTagEnumId8) {
        this.inParameters.add("acctgTagEnumId8");
        this.inAcctgTagEnumId8 = inAcctgTagEnumId8;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId9 the inAcctgTagEnumId9 to set
    */
    public void setInAcctgTagEnumId9(String inAcctgTagEnumId9) {
        this.inParameters.add("acctgTagEnumId9");
        this.inAcctgTagEnumId9 = inAcctgTagEnumId9;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTransEntryTypeId the inAcctgTransEntryTypeId to set
    */
    public void setInAcctgTransEntryTypeId(String inAcctgTransEntryTypeId) {
        this.inParameters.add("acctgTransEntryTypeId");
        this.inAcctgTransEntryTypeId = inAcctgTransEntryTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAmount the inAmount to set
    */
    public void setInAmount(BigDecimal inAmount) {
        this.inParameters.add("amount");
        this.inAmount = inAmount;
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
     * This parameter is required.
     * @param inDebitCreditFlag the inDebitCreditFlag to set
    */
    public void setInDebitCreditFlag(String inDebitCreditFlag) {
        this.inParameters.add("debitCreditFlag");
        this.inDebitCreditFlag = inDebitCreditFlag;
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
    public void setInDueDate(Date inDueDate) {
        this.inParameters.add("dueDate");
        this.inDueDate = inDueDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlAccountId the inGlAccountId to set
    */
    public void setInGlAccountId(String inGlAccountId) {
        this.inParameters.add("glAccountId");
        this.inGlAccountId = inGlAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlAccountTypeId the inGlAccountTypeId to set
    */
    public void setInGlAccountTypeId(String inGlAccountTypeId) {
        this.inParameters.add("glAccountTypeId");
        this.inGlAccountTypeId = inGlAccountTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupId the inGroupId to set
    */
    public void setInGroupId(String inGroupId) {
        this.inParameters.add("groupId");
        this.inGroupId = inGroupId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsSummary the inIsSummary to set
    */
    public void setInIsSummary(String inIsSummary) {
        this.inParameters.add("isSummary");
        this.inIsSummary = inIsSummary;
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
     * This parameter is required.
     * @param inOrganizationPartyId the inOrganizationPartyId to set
    */
    public void setInOrganizationPartyId(String inOrganizationPartyId) {
        this.inParameters.add("organizationPartyId");
        this.inOrganizationPartyId = inOrganizationPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrigAmount the inOrigAmount to set
    */
    public void setInOrigAmount(BigDecimal inOrigAmount) {
        this.inParameters.add("origAmount");
        this.inOrigAmount = inOrigAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrigCurrencyUomId the inOrigCurrencyUomId to set
    */
    public void setInOrigCurrencyUomId(String inOrigCurrencyUomId) {
        this.inParameters.add("origCurrencyUomId");
        this.inOrigCurrencyUomId = inOrigCurrencyUomId;
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
     * @param inProductId the inProductId to set
    */
    public void setInProductId(String inProductId) {
        this.inParameters.add("productId");
        this.inProductId = inProductId;
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
     * @param inSettlementTermId the inSettlementTermId to set
    */
    public void setInSettlementTermId(String inSettlementTermId) {
        this.inParameters.add("settlementTermId");
        this.inSettlementTermId = inSettlementTermId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxId the inTaxId to set
    */
    public void setInTaxId(String inTaxId) {
        this.inParameters.add("taxId");
        this.inTaxId = inTaxId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTheirPartyId the inTheirPartyId to set
    */
    public void setInTheirPartyId(String inTheirPartyId) {
        this.inParameters.add("theirPartyId");
        this.inTheirPartyId = inTheirPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTheirProductId the inTheirProductId to set
    */
    public void setInTheirProductId(String inTheirProductId) {
        this.inParameters.add("theirProductId");
        this.inTheirProductId = inTheirProductId;
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
     * @param inVoucherRef the inVoucherRef to set
    */
    public void setInVoucherRef(String inVoucherRef) {
        this.inParameters.add("voucherRef");
        this.inVoucherRef = inVoucherRef;
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
        if (inParameters.contains("acctgTagEnumId1")) mapValue.put("acctgTagEnumId1", getInAcctgTagEnumId1());
        if (inParameters.contains("acctgTagEnumId10")) mapValue.put("acctgTagEnumId10", getInAcctgTagEnumId10());
        if (inParameters.contains("acctgTagEnumId2")) mapValue.put("acctgTagEnumId2", getInAcctgTagEnumId2());
        if (inParameters.contains("acctgTagEnumId3")) mapValue.put("acctgTagEnumId3", getInAcctgTagEnumId3());
        if (inParameters.contains("acctgTagEnumId4")) mapValue.put("acctgTagEnumId4", getInAcctgTagEnumId4());
        if (inParameters.contains("acctgTagEnumId5")) mapValue.put("acctgTagEnumId5", getInAcctgTagEnumId5());
        if (inParameters.contains("acctgTagEnumId6")) mapValue.put("acctgTagEnumId6", getInAcctgTagEnumId6());
        if (inParameters.contains("acctgTagEnumId7")) mapValue.put("acctgTagEnumId7", getInAcctgTagEnumId7());
        if (inParameters.contains("acctgTagEnumId8")) mapValue.put("acctgTagEnumId8", getInAcctgTagEnumId8());
        if (inParameters.contains("acctgTagEnumId9")) mapValue.put("acctgTagEnumId9", getInAcctgTagEnumId9());
        if (inParameters.contains("acctgTransEntryTypeId")) mapValue.put("acctgTransEntryTypeId", getInAcctgTransEntryTypeId());
        if (inParameters.contains("amount")) mapValue.put("amount", getInAmount());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("debitCreditFlag")) mapValue.put("debitCreditFlag", getInDebitCreditFlag());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("dueDate")) mapValue.put("dueDate", getInDueDate());
        if (inParameters.contains("glAccountId")) mapValue.put("glAccountId", getInGlAccountId());
        if (inParameters.contains("glAccountTypeId")) mapValue.put("glAccountTypeId", getInGlAccountTypeId());
        if (inParameters.contains("groupId")) mapValue.put("groupId", getInGroupId());
        if (inParameters.contains("isSummary")) mapValue.put("isSummary", getInIsSummary());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("organizationPartyId")) mapValue.put("organizationPartyId", getInOrganizationPartyId());
        if (inParameters.contains("origAmount")) mapValue.put("origAmount", getInOrigAmount());
        if (inParameters.contains("origCurrencyUomId")) mapValue.put("origCurrencyUomId", getInOrigCurrencyUomId());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("roleTypeId")) mapValue.put("roleTypeId", getInRoleTypeId());
        if (inParameters.contains("settlementTermId")) mapValue.put("settlementTermId", getInSettlementTermId());
        if (inParameters.contains("taxId")) mapValue.put("taxId", getInTaxId());
        if (inParameters.contains("theirPartyId")) mapValue.put("theirPartyId", getInTheirPartyId());
        if (inParameters.contains("theirProductId")) mapValue.put("theirProductId", getInTheirProductId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("voucherRef")) mapValue.put("voucherRef", getInVoucherRef());
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
        if (mapValue.containsKey("acctgTagEnumId1")) setInAcctgTagEnumId1((String) mapValue.get("acctgTagEnumId1"));
        if (mapValue.containsKey("acctgTagEnumId10")) setInAcctgTagEnumId10((String) mapValue.get("acctgTagEnumId10"));
        if (mapValue.containsKey("acctgTagEnumId2")) setInAcctgTagEnumId2((String) mapValue.get("acctgTagEnumId2"));
        if (mapValue.containsKey("acctgTagEnumId3")) setInAcctgTagEnumId3((String) mapValue.get("acctgTagEnumId3"));
        if (mapValue.containsKey("acctgTagEnumId4")) setInAcctgTagEnumId4((String) mapValue.get("acctgTagEnumId4"));
        if (mapValue.containsKey("acctgTagEnumId5")) setInAcctgTagEnumId5((String) mapValue.get("acctgTagEnumId5"));
        if (mapValue.containsKey("acctgTagEnumId6")) setInAcctgTagEnumId6((String) mapValue.get("acctgTagEnumId6"));
        if (mapValue.containsKey("acctgTagEnumId7")) setInAcctgTagEnumId7((String) mapValue.get("acctgTagEnumId7"));
        if (mapValue.containsKey("acctgTagEnumId8")) setInAcctgTagEnumId8((String) mapValue.get("acctgTagEnumId8"));
        if (mapValue.containsKey("acctgTagEnumId9")) setInAcctgTagEnumId9((String) mapValue.get("acctgTagEnumId9"));
        if (mapValue.containsKey("acctgTransEntryTypeId")) setInAcctgTransEntryTypeId((String) mapValue.get("acctgTransEntryTypeId"));
        if (mapValue.containsKey("amount")) setInAmount((BigDecimal) mapValue.get("amount"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("debitCreditFlag")) setInDebitCreditFlag((String) mapValue.get("debitCreditFlag"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("dueDate")) setInDueDate((Date) mapValue.get("dueDate"));
        if (mapValue.containsKey("glAccountId")) setInGlAccountId((String) mapValue.get("glAccountId"));
        if (mapValue.containsKey("glAccountTypeId")) setInGlAccountTypeId((String) mapValue.get("glAccountTypeId"));
        if (mapValue.containsKey("groupId")) setInGroupId((String) mapValue.get("groupId"));
        if (mapValue.containsKey("isSummary")) setInIsSummary((String) mapValue.get("isSummary"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("organizationPartyId")) setInOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        if (mapValue.containsKey("origAmount")) setInOrigAmount((BigDecimal) mapValue.get("origAmount"));
        if (mapValue.containsKey("origCurrencyUomId")) setInOrigCurrencyUomId((String) mapValue.get("origCurrencyUomId"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("roleTypeId")) setInRoleTypeId((String) mapValue.get("roleTypeId"));
        if (mapValue.containsKey("settlementTermId")) setInSettlementTermId((String) mapValue.get("settlementTermId"));
        if (mapValue.containsKey("taxId")) setInTaxId((String) mapValue.get("taxId"));
        if (mapValue.containsKey("theirPartyId")) setInTheirPartyId((String) mapValue.get("theirPartyId"));
        if (mapValue.containsKey("theirProductId")) setInTheirProductId((String) mapValue.get("theirProductId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("voucherRef")) setInVoucherRef((String) mapValue.get("voucherRef"));
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
     * Construct a <code>InterfaceAcctgTransEntryService</code> from the input values of the given <code>InterfaceAcctgTransEntryService</code>.
     * @param input a <code>InterfaceAcctgTransEntryService</code>
     */
    public static InterfaceAcctgTransEntryService fromInput(InterfaceAcctgTransEntryService input) {
        InterfaceAcctgTransEntryService service = new InterfaceAcctgTransEntryService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>InterfaceAcctgTransEntryService</code> from the output values of the given <code>InterfaceAcctgTransEntryService</code>.
     * @param output a <code>InterfaceAcctgTransEntryService</code>
     */
    public static InterfaceAcctgTransEntryService fromOutput(InterfaceAcctgTransEntryService output) {
        InterfaceAcctgTransEntryService service = new InterfaceAcctgTransEntryService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>InterfaceAcctgTransEntryService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static InterfaceAcctgTransEntryService fromInput(Map<String, Object> mapValue) {
        InterfaceAcctgTransEntryService service = new InterfaceAcctgTransEntryService();
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
     * Construct a <code>InterfaceAcctgTransEntryService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static InterfaceAcctgTransEntryService fromOutput(Map<String, Object> mapValue) {
        InterfaceAcctgTransEntryService service = new InterfaceAcctgTransEntryService();
        service.putAllOutput(mapValue);
        return service;
    }
}
