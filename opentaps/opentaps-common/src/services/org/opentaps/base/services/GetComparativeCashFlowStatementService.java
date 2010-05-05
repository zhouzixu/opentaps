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
 * Generates cash flow statement for two sets of dates and glFiscalTypeIds and determines the difference between the two. The balances are in BigDecimal.
            The output includes the result of getCashFlowStatementForDates for the two sets of fromDates and thruDates.
        .
 * Auto generated base service entity getComparativeCashFlowStatement.
 *
 * Engine: java
 * Location: com.opensourcestrategies.financials.financials.FinancialServices
 * Invoke: getComparativeCashFlowStatement
 * Defined in: opentaps/financials/servicedef/services_financials.xml
 */
public class GetComparativeCashFlowStatementService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getComparativeCashFlowStatement";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.FALSE;

    /** The enumeration of input parameters. */
    public static enum In {
        fromDate1("fromDate1"),
        fromDate2("fromDate2"),
        glFiscalTypeId1("glFiscalTypeId1"),
        glFiscalTypeId2("glFiscalTypeId2"),
        locale("locale"),
        organizationPartyId("organizationPartyId"),
        tag1("tag1"),
        tag10("tag10"),
        tag2("tag2"),
        tag3("tag3"),
        tag4("tag4"),
        tag5("tag5"),
        tag6("tag6"),
        tag7("tag7"),
        tag8("tag8"),
        tag9("tag9"),
        thruDate1("thruDate1"),
        thruDate2("thruDate2"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        beginningCashAccountBalances("beginningCashAccountBalances"),
        endingCashAccountBalances("endingCashAccountBalances"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        financingCashFlowAccountBalances("financingCashFlowAccountBalances"),
        investingCashFlowAccountBalances("investingCashFlowAccountBalances"),
        locale("locale"),
        operatingCashFlowAccountBalances("operatingCashFlowAccountBalances"),
        responseMessage("responseMessage"),
        set1CashFlowStatement("set1CashFlowStatement"),
        set2CashFlowStatement("set2CashFlowStatement"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>GetComparativeCashFlowStatementService</code> instance.
     */
    public GetComparativeCashFlowStatementService() {
        super();
    }

    /**
     * Creates a new <code>GetComparativeCashFlowStatementService</code> instance.
     * @param user an <code>User</code> value
     */
    public GetComparativeCashFlowStatementService(User user) {
        super(user);
    }

    private Timestamp inFromDate1;
    private Timestamp inFromDate2;
    private String inGlFiscalTypeId1;
    private String inGlFiscalTypeId2;
    private Locale inLocale;
    private String inOrganizationPartyId;
    private String inTag1;
    private String inTag10;
    private String inTag2;
    private String inTag3;
    private String inTag4;
    private String inTag5;
    private String inTag6;
    private String inTag7;
    private String inTag8;
    private String inTag9;
    private Timestamp inThruDate1;
    private Timestamp inThruDate2;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private Map outBeginningCashAccountBalances;
    private Map outEndingCashAccountBalances;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Map outFinancingCashFlowAccountBalances;
    private Map outInvestingCashFlowAccountBalances;
    private Locale outLocale;
    private Map outOperatingCashFlowAccountBalances;
    private String outResponseMessage;
    private Map outSet1CashFlowStatement;
    private Map outSet2CashFlowStatement;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate1() {
        return this.inFromDate1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate2() {
        return this.inFromDate2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlFiscalTypeId1() {
        return this.inGlFiscalTypeId1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlFiscalTypeId2() {
        return this.inGlFiscalTypeId2;
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
     * @return <code>String</code>
     */
    public String getInTag1() {
        return this.inTag1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag10() {
        return this.inTag10;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag2() {
        return this.inTag2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag3() {
        return this.inTag3;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag4() {
        return this.inTag4;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag5() {
        return this.inTag5;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag6() {
        return this.inTag6;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag7() {
        return this.inTag7;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag8() {
        return this.inTag8;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag9() {
        return this.inTag9;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInThruDate1() {
        return this.inThruDate1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInThruDate2() {
        return this.inThruDate2;
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
     * @return <code>Map</code>
     */
    public Map getOutBeginningCashAccountBalances() {
        return this.outBeginningCashAccountBalances;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getOutEndingCashAccountBalances() {
        return this.outEndingCashAccountBalances;
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
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getOutFinancingCashFlowAccountBalances() {
        return this.outFinancingCashFlowAccountBalances;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getOutInvestingCashFlowAccountBalances() {
        return this.outInvestingCashFlowAccountBalances;
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
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getOutOperatingCashFlowAccountBalances() {
        return this.outOperatingCashFlowAccountBalances;
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
     * @return <code>Map</code>
     */
    public Map getOutSet1CashFlowStatement() {
        return this.outSet1CashFlowStatement;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getOutSet2CashFlowStatement() {
        return this.outSet2CashFlowStatement;
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
     * @param inFromDate1 the inFromDate1 to set
    */
    public void setInFromDate1(Timestamp inFromDate1) {
        this.inParameters.add("fromDate1");
        this.inFromDate1 = inFromDate1;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFromDate2 the inFromDate2 to set
    */
    public void setInFromDate2(Timestamp inFromDate2) {
        this.inParameters.add("fromDate2");
        this.inFromDate2 = inFromDate2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlFiscalTypeId1 the inGlFiscalTypeId1 to set
    */
    public void setInGlFiscalTypeId1(String inGlFiscalTypeId1) {
        this.inParameters.add("glFiscalTypeId1");
        this.inGlFiscalTypeId1 = inGlFiscalTypeId1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlFiscalTypeId2 the inGlFiscalTypeId2 to set
    */
    public void setInGlFiscalTypeId2(String inGlFiscalTypeId2) {
        this.inParameters.add("glFiscalTypeId2");
        this.inGlFiscalTypeId2 = inGlFiscalTypeId2;
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
     * @param inTag1 the inTag1 to set
    */
    public void setInTag1(String inTag1) {
        this.inParameters.add("tag1");
        this.inTag1 = inTag1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag10 the inTag10 to set
    */
    public void setInTag10(String inTag10) {
        this.inParameters.add("tag10");
        this.inTag10 = inTag10;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag2 the inTag2 to set
    */
    public void setInTag2(String inTag2) {
        this.inParameters.add("tag2");
        this.inTag2 = inTag2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag3 the inTag3 to set
    */
    public void setInTag3(String inTag3) {
        this.inParameters.add("tag3");
        this.inTag3 = inTag3;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag4 the inTag4 to set
    */
    public void setInTag4(String inTag4) {
        this.inParameters.add("tag4");
        this.inTag4 = inTag4;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag5 the inTag5 to set
    */
    public void setInTag5(String inTag5) {
        this.inParameters.add("tag5");
        this.inTag5 = inTag5;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag6 the inTag6 to set
    */
    public void setInTag6(String inTag6) {
        this.inParameters.add("tag6");
        this.inTag6 = inTag6;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag7 the inTag7 to set
    */
    public void setInTag7(String inTag7) {
        this.inParameters.add("tag7");
        this.inTag7 = inTag7;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag8 the inTag8 to set
    */
    public void setInTag8(String inTag8) {
        this.inParameters.add("tag8");
        this.inTag8 = inTag8;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag9 the inTag9 to set
    */
    public void setInTag9(String inTag9) {
        this.inParameters.add("tag9");
        this.inTag9 = inTag9;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inThruDate1 the inThruDate1 to set
    */
    public void setInThruDate1(Timestamp inThruDate1) {
        this.inParameters.add("thruDate1");
        this.inThruDate1 = inThruDate1;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inThruDate2 the inThruDate2 to set
    */
    public void setInThruDate2(Timestamp inThruDate2) {
        this.inParameters.add("thruDate2");
        this.inThruDate2 = inThruDate2;
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
     * @param outBeginningCashAccountBalances the outBeginningCashAccountBalances to set
    */
    public void setOutBeginningCashAccountBalances(Map outBeginningCashAccountBalances) {
        this.outParameters.add("beginningCashAccountBalances");
        this.outBeginningCashAccountBalances = outBeginningCashAccountBalances;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outEndingCashAccountBalances the outEndingCashAccountBalances to set
    */
    public void setOutEndingCashAccountBalances(Map outEndingCashAccountBalances) {
        this.outParameters.add("endingCashAccountBalances");
        this.outEndingCashAccountBalances = outEndingCashAccountBalances;
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
     * This parameter is required.
     * @param outFinancingCashFlowAccountBalances the outFinancingCashFlowAccountBalances to set
    */
    public void setOutFinancingCashFlowAccountBalances(Map outFinancingCashFlowAccountBalances) {
        this.outParameters.add("financingCashFlowAccountBalances");
        this.outFinancingCashFlowAccountBalances = outFinancingCashFlowAccountBalances;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outInvestingCashFlowAccountBalances the outInvestingCashFlowAccountBalances to set
    */
    public void setOutInvestingCashFlowAccountBalances(Map outInvestingCashFlowAccountBalances) {
        this.outParameters.add("investingCashFlowAccountBalances");
        this.outInvestingCashFlowAccountBalances = outInvestingCashFlowAccountBalances;
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
     * This parameter is required.
     * @param outOperatingCashFlowAccountBalances the outOperatingCashFlowAccountBalances to set
    */
    public void setOutOperatingCashFlowAccountBalances(Map outOperatingCashFlowAccountBalances) {
        this.outParameters.add("operatingCashFlowAccountBalances");
        this.outOperatingCashFlowAccountBalances = outOperatingCashFlowAccountBalances;
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
     * @param outSet1CashFlowStatement the outSet1CashFlowStatement to set
    */
    public void setOutSet1CashFlowStatement(Map outSet1CashFlowStatement) {
        this.outParameters.add("set1CashFlowStatement");
        this.outSet1CashFlowStatement = outSet1CashFlowStatement;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outSet2CashFlowStatement the outSet2CashFlowStatement to set
    */
    public void setOutSet2CashFlowStatement(Map outSet2CashFlowStatement) {
        this.outParameters.add("set2CashFlowStatement");
        this.outSet2CashFlowStatement = outSet2CashFlowStatement;
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
        if (inParameters.contains("fromDate1")) mapValue.put("fromDate1", getInFromDate1());
        if (inParameters.contains("fromDate2")) mapValue.put("fromDate2", getInFromDate2());
        if (inParameters.contains("glFiscalTypeId1")) mapValue.put("glFiscalTypeId1", getInGlFiscalTypeId1());
        if (inParameters.contains("glFiscalTypeId2")) mapValue.put("glFiscalTypeId2", getInGlFiscalTypeId2());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("organizationPartyId")) mapValue.put("organizationPartyId", getInOrganizationPartyId());
        if (inParameters.contains("tag1")) mapValue.put("tag1", getInTag1());
        if (inParameters.contains("tag10")) mapValue.put("tag10", getInTag10());
        if (inParameters.contains("tag2")) mapValue.put("tag2", getInTag2());
        if (inParameters.contains("tag3")) mapValue.put("tag3", getInTag3());
        if (inParameters.contains("tag4")) mapValue.put("tag4", getInTag4());
        if (inParameters.contains("tag5")) mapValue.put("tag5", getInTag5());
        if (inParameters.contains("tag6")) mapValue.put("tag6", getInTag6());
        if (inParameters.contains("tag7")) mapValue.put("tag7", getInTag7());
        if (inParameters.contains("tag8")) mapValue.put("tag8", getInTag8());
        if (inParameters.contains("tag9")) mapValue.put("tag9", getInTag9());
        if (inParameters.contains("thruDate1")) mapValue.put("thruDate1", getInThruDate1());
        if (inParameters.contains("thruDate2")) mapValue.put("thruDate2", getInThruDate2());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("beginningCashAccountBalances")) mapValue.put("beginningCashAccountBalances", getOutBeginningCashAccountBalances());
        if (outParameters.contains("endingCashAccountBalances")) mapValue.put("endingCashAccountBalances", getOutEndingCashAccountBalances());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("financingCashFlowAccountBalances")) mapValue.put("financingCashFlowAccountBalances", getOutFinancingCashFlowAccountBalances());
        if (outParameters.contains("investingCashFlowAccountBalances")) mapValue.put("investingCashFlowAccountBalances", getOutInvestingCashFlowAccountBalances());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("operatingCashFlowAccountBalances")) mapValue.put("operatingCashFlowAccountBalances", getOutOperatingCashFlowAccountBalances());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("set1CashFlowStatement")) mapValue.put("set1CashFlowStatement", getOutSet1CashFlowStatement());
        if (outParameters.contains("set2CashFlowStatement")) mapValue.put("set2CashFlowStatement", getOutSet2CashFlowStatement());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("fromDate1")) setInFromDate1((Timestamp) mapValue.get("fromDate1"));
        if (mapValue.containsKey("fromDate2")) setInFromDate2((Timestamp) mapValue.get("fromDate2"));
        if (mapValue.containsKey("glFiscalTypeId1")) setInGlFiscalTypeId1((String) mapValue.get("glFiscalTypeId1"));
        if (mapValue.containsKey("glFiscalTypeId2")) setInGlFiscalTypeId2((String) mapValue.get("glFiscalTypeId2"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("organizationPartyId")) setInOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        if (mapValue.containsKey("tag1")) setInTag1((String) mapValue.get("tag1"));
        if (mapValue.containsKey("tag10")) setInTag10((String) mapValue.get("tag10"));
        if (mapValue.containsKey("tag2")) setInTag2((String) mapValue.get("tag2"));
        if (mapValue.containsKey("tag3")) setInTag3((String) mapValue.get("tag3"));
        if (mapValue.containsKey("tag4")) setInTag4((String) mapValue.get("tag4"));
        if (mapValue.containsKey("tag5")) setInTag5((String) mapValue.get("tag5"));
        if (mapValue.containsKey("tag6")) setInTag6((String) mapValue.get("tag6"));
        if (mapValue.containsKey("tag7")) setInTag7((String) mapValue.get("tag7"));
        if (mapValue.containsKey("tag8")) setInTag8((String) mapValue.get("tag8"));
        if (mapValue.containsKey("tag9")) setInTag9((String) mapValue.get("tag9"));
        if (mapValue.containsKey("thruDate1")) setInThruDate1((Timestamp) mapValue.get("thruDate1"));
        if (mapValue.containsKey("thruDate2")) setInThruDate2((Timestamp) mapValue.get("thruDate2"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("beginningCashAccountBalances")) setOutBeginningCashAccountBalances((Map) mapValue.get("beginningCashAccountBalances"));
        if (mapValue.containsKey("endingCashAccountBalances")) setOutEndingCashAccountBalances((Map) mapValue.get("endingCashAccountBalances"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("financingCashFlowAccountBalances")) setOutFinancingCashFlowAccountBalances((Map) mapValue.get("financingCashFlowAccountBalances"));
        if (mapValue.containsKey("investingCashFlowAccountBalances")) setOutInvestingCashFlowAccountBalances((Map) mapValue.get("investingCashFlowAccountBalances"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("operatingCashFlowAccountBalances")) setOutOperatingCashFlowAccountBalances((Map) mapValue.get("operatingCashFlowAccountBalances"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("set1CashFlowStatement")) setOutSet1CashFlowStatement((Map) mapValue.get("set1CashFlowStatement"));
        if (mapValue.containsKey("set2CashFlowStatement")) setOutSet2CashFlowStatement((Map) mapValue.get("set2CashFlowStatement"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>GetComparativeCashFlowStatementService</code> from the input values of the given <code>GetComparativeCashFlowStatementService</code>.
     * @param input a <code>GetComparativeCashFlowStatementService</code>
     */
    public static GetComparativeCashFlowStatementService fromInput(GetComparativeCashFlowStatementService input) {
        GetComparativeCashFlowStatementService service = new GetComparativeCashFlowStatementService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>GetComparativeCashFlowStatementService</code> from the output values of the given <code>GetComparativeCashFlowStatementService</code>.
     * @param output a <code>GetComparativeCashFlowStatementService</code>
     */
    public static GetComparativeCashFlowStatementService fromOutput(GetComparativeCashFlowStatementService output) {
        GetComparativeCashFlowStatementService service = new GetComparativeCashFlowStatementService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetComparativeCashFlowStatementService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetComparativeCashFlowStatementService fromInput(Map<String, Object> mapValue) {
        GetComparativeCashFlowStatementService service = new GetComparativeCashFlowStatementService();
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
     * Construct a <code>GetComparativeCashFlowStatementService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetComparativeCashFlowStatementService fromOutput(Map<String, Object> mapValue) {
        GetComparativeCashFlowStatementService service = new GetComparativeCashFlowStatementService();
        service.putAllOutput(mapValue);
        return service;
    }
}
