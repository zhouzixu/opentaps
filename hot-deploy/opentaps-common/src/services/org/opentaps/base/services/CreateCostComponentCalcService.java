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
 * Create a CostComponentCalc.
 * Auto generated base service entity createCostComponentCalc.
 *
 * Engine: simple
 * Location: component://accounting/script/org/ofbiz/accounting/cost/CostServices.xml
 * Invoke: createCostComponentCalc
 * Defined in: applications/accounting/servicedef/services_cost.xml
 */
public class CreateCostComponentCalcService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createCostComponentCalc";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        costCustomMethodId("costCustomMethodId"),
        costGlAccountTypeId("costGlAccountTypeId"),
        currencyUomId("currencyUomId"),
        description("description"),
        fixedCost("fixedCost"),
        locale("locale"),
        offsettingGlAccountTypeId("offsettingGlAccountTypeId"),
        perMilliSecond("perMilliSecond"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        variableCost("variableCost");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        costComponentCalcId("costComponentCalcId"),
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
     * Creates a new <code>CreateCostComponentCalcService</code> instance.
     */
    public CreateCostComponentCalcService() {
        super();
    }

    /**
     * Creates a new <code>CreateCostComponentCalcService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateCostComponentCalcService(User user) {
        super(user);
    }

    private String inCostCustomMethodId;
    private String inCostGlAccountTypeId;
    private String inCurrencyUomId;
    private String inDescription;
    private BigDecimal inFixedCost;
    private Locale inLocale;
    private String inOffsettingGlAccountTypeId;
    private Long inPerMilliSecond;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private BigDecimal inVariableCost;
    private String outCostComponentCalcId;
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
    public String getInCostCustomMethodId() {
        return this.inCostCustomMethodId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCostGlAccountTypeId() {
        return this.inCostGlAccountTypeId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInFixedCost() {
        return this.inFixedCost;
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
    public String getInOffsettingGlAccountTypeId() {
        return this.inOffsettingGlAccountTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInPerMilliSecond() {
        return this.inPerMilliSecond;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInVariableCost() {
        return this.inVariableCost;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutCostComponentCalcId() {
        return this.outCostComponentCalcId;
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
     * @param inCostCustomMethodId the inCostCustomMethodId to set
    */
    public void setInCostCustomMethodId(String inCostCustomMethodId) {
        this.inParameters.add("costCustomMethodId");
        this.inCostCustomMethodId = inCostCustomMethodId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCostGlAccountTypeId the inCostGlAccountTypeId to set
    */
    public void setInCostGlAccountTypeId(String inCostGlAccountTypeId) {
        this.inParameters.add("costGlAccountTypeId");
        this.inCostGlAccountTypeId = inCostGlAccountTypeId;
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
     * @param inFixedCost the inFixedCost to set
    */
    public void setInFixedCost(BigDecimal inFixedCost) {
        this.inParameters.add("fixedCost");
        this.inFixedCost = inFixedCost;
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
     * @param inOffsettingGlAccountTypeId the inOffsettingGlAccountTypeId to set
    */
    public void setInOffsettingGlAccountTypeId(String inOffsettingGlAccountTypeId) {
        this.inParameters.add("offsettingGlAccountTypeId");
        this.inOffsettingGlAccountTypeId = inOffsettingGlAccountTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPerMilliSecond the inPerMilliSecond to set
    */
    public void setInPerMilliSecond(Long inPerMilliSecond) {
        this.inParameters.add("perMilliSecond");
        this.inPerMilliSecond = inPerMilliSecond;
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
     * @param inVariableCost the inVariableCost to set
    */
    public void setInVariableCost(BigDecimal inVariableCost) {
        this.inParameters.add("variableCost");
        this.inVariableCost = inVariableCost;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCostComponentCalcId the outCostComponentCalcId to set
    */
    public void setOutCostComponentCalcId(String outCostComponentCalcId) {
        this.outParameters.add("costComponentCalcId");
        this.outCostComponentCalcId = outCostComponentCalcId;
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
        if (inParameters.contains("costCustomMethodId")) mapValue.put("costCustomMethodId", getInCostCustomMethodId());
        if (inParameters.contains("costGlAccountTypeId")) mapValue.put("costGlAccountTypeId", getInCostGlAccountTypeId());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("fixedCost")) mapValue.put("fixedCost", getInFixedCost());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("offsettingGlAccountTypeId")) mapValue.put("offsettingGlAccountTypeId", getInOffsettingGlAccountTypeId());
        if (inParameters.contains("perMilliSecond")) mapValue.put("perMilliSecond", getInPerMilliSecond());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("variableCost")) mapValue.put("variableCost", getInVariableCost());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("costComponentCalcId")) mapValue.put("costComponentCalcId", getOutCostComponentCalcId());
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
        if (mapValue.containsKey("costCustomMethodId")) setInCostCustomMethodId((String) mapValue.get("costCustomMethodId"));
        if (mapValue.containsKey("costGlAccountTypeId")) setInCostGlAccountTypeId((String) mapValue.get("costGlAccountTypeId"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("fixedCost")) setInFixedCost((BigDecimal) mapValue.get("fixedCost"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("offsettingGlAccountTypeId")) setInOffsettingGlAccountTypeId((String) mapValue.get("offsettingGlAccountTypeId"));
        if (mapValue.containsKey("perMilliSecond")) setInPerMilliSecond((Long) mapValue.get("perMilliSecond"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("variableCost")) setInVariableCost((BigDecimal) mapValue.get("variableCost"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("costComponentCalcId")) setOutCostComponentCalcId((String) mapValue.get("costComponentCalcId"));
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
     * Construct a <code>CreateCostComponentCalcService</code> from the input values of the given <code>CreateCostComponentCalcService</code>.
     * @param input a <code>CreateCostComponentCalcService</code>
     */
    public static CreateCostComponentCalcService fromInput(CreateCostComponentCalcService input) {
        CreateCostComponentCalcService service = new CreateCostComponentCalcService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateCostComponentCalcService</code> from the output values of the given <code>CreateCostComponentCalcService</code>.
     * @param output a <code>CreateCostComponentCalcService</code>
     */
    public static CreateCostComponentCalcService fromOutput(CreateCostComponentCalcService output) {
        CreateCostComponentCalcService service = new CreateCostComponentCalcService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateCostComponentCalcService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateCostComponentCalcService fromInput(Map<String, Object> mapValue) {
        CreateCostComponentCalcService service = new CreateCostComponentCalcService();
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
     * Construct a <code>CreateCostComponentCalcService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateCostComponentCalcService fromOutput(Map<String, Object> mapValue) {
        CreateCostComponentCalcService service = new CreateCostComponentCalcService();
        service.putAllOutput(mapValue);
        return service;
    }
}
