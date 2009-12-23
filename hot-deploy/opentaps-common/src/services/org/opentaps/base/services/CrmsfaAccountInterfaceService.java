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
 * .
 * Auto generated base service entity crmsfa.accountInterface.
 *
 * Engine: interface
 * Location: 
 * Invoke: 
 * Defined in: hot-deploy/crmsfa/servicedef/services_accounts.xml
 */
public class CrmsfaAccountInterfaceService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "crmsfa.accountInterface";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        accountName("accountName"),
        annualRevenue("annualRevenue"),
        currencyUomId("currencyUomId"),
        description("description"),
        groupNameLocal("groupNameLocal"),
        importantNote("importantNote"),
        industryEnumId("industryEnumId"),
        locale("locale"),
        numberEmployees("numberEmployees"),
        officeSiteName("officeSiteName"),
        ownershipEnumId("ownershipEnumId"),
        parentPartyId("parentPartyId"),
        sicCode("sicCode"),
        tickerSymbol("tickerSymbol"),
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
     * Creates a new <code>CrmsfaAccountInterfaceService</code> instance.
     */
    public CrmsfaAccountInterfaceService() {
        super();
    }


    private String inAccountName;
    private Double inAnnualRevenue;
    private String inCurrencyUomId;
    private String inDescription;
    private String inGroupNameLocal;
    private String inImportantNote;
    private String inIndustryEnumId;
    private Locale inLocale;
    private Long inNumberEmployees;
    private String inOfficeSiteName;
    private String inOwnershipEnumId;
    private String inParentPartyId;
    private String inSicCode;
    private String inTickerSymbol;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInAccountName() {
        return this.inAccountName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getInAnnualRevenue() {
        return this.inAnnualRevenue;
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
     * @return <code>String</code>
     */
    public String getInGroupNameLocal() {
        return this.inGroupNameLocal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInImportantNote() {
        return this.inImportantNote;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIndustryEnumId() {
        return this.inIndustryEnumId;
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
     * @return <code>Long</code>
     */
    public Long getInNumberEmployees() {
        return this.inNumberEmployees;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOfficeSiteName() {
        return this.inOfficeSiteName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOwnershipEnumId() {
        return this.inOwnershipEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInParentPartyId() {
        return this.inParentPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSicCode() {
        return this.inSicCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTickerSymbol() {
        return this.inTickerSymbol;
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
     * This parameter is required.
     * @param inAccountName the inAccountName to set
    */
    public void setInAccountName(String inAccountName) {
        this.inParameters.add("accountName");
        this.inAccountName = inAccountName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAnnualRevenue the inAnnualRevenue to set
    */
    public void setInAnnualRevenue(Double inAnnualRevenue) {
        this.inParameters.add("annualRevenue");
        this.inAnnualRevenue = inAnnualRevenue;
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
     * @param inGroupNameLocal the inGroupNameLocal to set
    */
    public void setInGroupNameLocal(String inGroupNameLocal) {
        this.inParameters.add("groupNameLocal");
        this.inGroupNameLocal = inGroupNameLocal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inImportantNote the inImportantNote to set
    */
    public void setInImportantNote(String inImportantNote) {
        this.inParameters.add("importantNote");
        this.inImportantNote = inImportantNote;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIndustryEnumId the inIndustryEnumId to set
    */
    public void setInIndustryEnumId(String inIndustryEnumId) {
        this.inParameters.add("industryEnumId");
        this.inIndustryEnumId = inIndustryEnumId;
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
     * @param inNumberEmployees the inNumberEmployees to set
    */
    public void setInNumberEmployees(Long inNumberEmployees) {
        this.inParameters.add("numberEmployees");
        this.inNumberEmployees = inNumberEmployees;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOfficeSiteName the inOfficeSiteName to set
    */
    public void setInOfficeSiteName(String inOfficeSiteName) {
        this.inParameters.add("officeSiteName");
        this.inOfficeSiteName = inOfficeSiteName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOwnershipEnumId the inOwnershipEnumId to set
    */
    public void setInOwnershipEnumId(String inOwnershipEnumId) {
        this.inParameters.add("ownershipEnumId");
        this.inOwnershipEnumId = inOwnershipEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inParentPartyId the inParentPartyId to set
    */
    public void setInParentPartyId(String inParentPartyId) {
        this.inParameters.add("parentPartyId");
        this.inParentPartyId = inParentPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSicCode the inSicCode to set
    */
    public void setInSicCode(String inSicCode) {
        this.inParameters.add("sicCode");
        this.inSicCode = inSicCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTickerSymbol the inTickerSymbol to set
    */
    public void setInTickerSymbol(String inTickerSymbol) {
        this.inParameters.add("tickerSymbol");
        this.inTickerSymbol = inTickerSymbol;
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
        if (inParameters.contains("accountName")) mapValue.put("accountName", getInAccountName());
        if (inParameters.contains("annualRevenue")) mapValue.put("annualRevenue", getInAnnualRevenue());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("groupNameLocal")) mapValue.put("groupNameLocal", getInGroupNameLocal());
        if (inParameters.contains("importantNote")) mapValue.put("importantNote", getInImportantNote());
        if (inParameters.contains("industryEnumId")) mapValue.put("industryEnumId", getInIndustryEnumId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("numberEmployees")) mapValue.put("numberEmployees", getInNumberEmployees());
        if (inParameters.contains("officeSiteName")) mapValue.put("officeSiteName", getInOfficeSiteName());
        if (inParameters.contains("ownershipEnumId")) mapValue.put("ownershipEnumId", getInOwnershipEnumId());
        if (inParameters.contains("parentPartyId")) mapValue.put("parentPartyId", getInParentPartyId());
        if (inParameters.contains("sicCode")) mapValue.put("sicCode", getInSicCode());
        if (inParameters.contains("tickerSymbol")) mapValue.put("tickerSymbol", getInTickerSymbol());
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
        if (mapValue.containsKey("accountName")) setInAccountName((String) mapValue.get("accountName"));
        if (mapValue.containsKey("annualRevenue")) setInAnnualRevenue((Double) mapValue.get("annualRevenue"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("groupNameLocal")) setInGroupNameLocal((String) mapValue.get("groupNameLocal"));
        if (mapValue.containsKey("importantNote")) setInImportantNote((String) mapValue.get("importantNote"));
        if (mapValue.containsKey("industryEnumId")) setInIndustryEnumId((String) mapValue.get("industryEnumId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("numberEmployees")) setInNumberEmployees((Long) mapValue.get("numberEmployees"));
        if (mapValue.containsKey("officeSiteName")) setInOfficeSiteName((String) mapValue.get("officeSiteName"));
        if (mapValue.containsKey("ownershipEnumId")) setInOwnershipEnumId((String) mapValue.get("ownershipEnumId"));
        if (mapValue.containsKey("parentPartyId")) setInParentPartyId((String) mapValue.get("parentPartyId"));
        if (mapValue.containsKey("sicCode")) setInSicCode((String) mapValue.get("sicCode"));
        if (mapValue.containsKey("tickerSymbol")) setInTickerSymbol((String) mapValue.get("tickerSymbol"));
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
     * Construct a <code>CrmsfaAccountInterfaceService</code> from the input values of the given <code>CrmsfaAccountInterfaceService</code>.
     * @param input a <code>CrmsfaAccountInterfaceService</code>
     */
    public static CrmsfaAccountInterfaceService fromInput(CrmsfaAccountInterfaceService input) {
        CrmsfaAccountInterfaceService service = new CrmsfaAccountInterfaceService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CrmsfaAccountInterfaceService</code> from the output values of the given <code>CrmsfaAccountInterfaceService</code>.
     * @param output a <code>CrmsfaAccountInterfaceService</code>
     */
    public static CrmsfaAccountInterfaceService fromOutput(CrmsfaAccountInterfaceService output) {
        CrmsfaAccountInterfaceService service = new CrmsfaAccountInterfaceService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CrmsfaAccountInterfaceService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CrmsfaAccountInterfaceService fromInput(Map<String, Object> mapValue) {
        CrmsfaAccountInterfaceService service = new CrmsfaAccountInterfaceService();
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
     * Construct a <code>CrmsfaAccountInterfaceService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CrmsfaAccountInterfaceService fromOutput(Map<String, Object> mapValue) {
        CrmsfaAccountInterfaceService service = new CrmsfaAccountInterfaceService();
        service.putAllOutput(mapValue);
        return service;
    }
}
