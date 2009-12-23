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
 * Create an Agreement.
 * Auto generated base service entity createAgreement.
 *
 * Engine: simple
 * Location: component://accounting/script/org/ofbiz/accounting/agreement/AgreementServices.xml
 * Invoke: createAgreement
 * Defined in: applications/accounting/servicedef/services_agreement.xml
 */
public class CreateAgreementService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createAgreement";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        agreementDate("agreementDate"),
        agreementTypeId("agreementTypeId"),
        defaultCurrencyUomId("defaultCurrencyUomId"),
        description("description"),
        fromDate("fromDate"),
        fromPartyClassGroupId("fromPartyClassGroupId"),
        locale("locale"),
        partyIdFrom("partyIdFrom"),
        partyIdTo("partyIdTo"),
        productId("productId"),
        roleTypeIdFrom("roleTypeIdFrom"),
        roleTypeIdTo("roleTypeIdTo"),
        statusId("statusId"),
        textData("textData"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        toPartyClassGroupId("toPartyClassGroupId"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        agreementId("agreementId"),
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
     * Creates a new <code>CreateAgreementService</code> instance.
     */
    public CreateAgreementService() {
        super();
    }

    /**
     * Creates a new <code>CreateAgreementService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateAgreementService(User user) {
        super(user);
    }

    private Timestamp inAgreementDate;
    private String inAgreementTypeId;
    private String inDefaultCurrencyUomId;
    private String inDescription;
    private Timestamp inFromDate;
    private String inFromPartyClassGroupId;
    private Locale inLocale;
    private String inPartyIdFrom;
    private String inPartyIdTo;
    private String inProductId;
    private String inRoleTypeIdFrom;
    private String inRoleTypeIdTo;
    private String inStatusId;
    private String inTextData;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private String inToPartyClassGroupId;
    private GenericValue inUserLogin;
    private String outAgreementId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getInAgreementDate() {
        return this.inAgreementDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAgreementTypeId() {
        return this.inAgreementTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDefaultCurrencyUomId() {
        return this.inDefaultCurrencyUomId;
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
    public Timestamp getInFromDate() {
        return this.inFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFromPartyClassGroupId() {
        return this.inFromPartyClassGroupId;
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
    public String getInPartyIdFrom() {
        return this.inPartyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPartyIdTo() {
        return this.inPartyIdTo;
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
    public String getInRoleTypeIdFrom() {
        return this.inRoleTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeIdTo() {
        return this.inRoleTypeIdTo;
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
     * @return <code>String</code>
     */
    public String getInTextData() {
        return this.inTextData;
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
    public String getInToPartyClassGroupId() {
        return this.inToPartyClassGroupId;
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
    public String getOutAgreementId() {
        return this.outAgreementId;
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
     * @param inAgreementDate the inAgreementDate to set
    */
    public void setInAgreementDate(Timestamp inAgreementDate) {
        this.inParameters.add("agreementDate");
        this.inAgreementDate = inAgreementDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAgreementTypeId the inAgreementTypeId to set
    */
    public void setInAgreementTypeId(String inAgreementTypeId) {
        this.inParameters.add("agreementTypeId");
        this.inAgreementTypeId = inAgreementTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDefaultCurrencyUomId the inDefaultCurrencyUomId to set
    */
    public void setInDefaultCurrencyUomId(String inDefaultCurrencyUomId) {
        this.inParameters.add("defaultCurrencyUomId");
        this.inDefaultCurrencyUomId = inDefaultCurrencyUomId;
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
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromPartyClassGroupId the inFromPartyClassGroupId to set
    */
    public void setInFromPartyClassGroupId(String inFromPartyClassGroupId) {
        this.inParameters.add("fromPartyClassGroupId");
        this.inFromPartyClassGroupId = inFromPartyClassGroupId;
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
     * @param inPartyIdFrom the inPartyIdFrom to set
    */
    public void setInPartyIdFrom(String inPartyIdFrom) {
        this.inParameters.add("partyIdFrom");
        this.inPartyIdFrom = inPartyIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyIdTo the inPartyIdTo to set
    */
    public void setInPartyIdTo(String inPartyIdTo) {
        this.inParameters.add("partyIdTo");
        this.inPartyIdTo = inPartyIdTo;
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
     * @param inRoleTypeIdFrom the inRoleTypeIdFrom to set
    */
    public void setInRoleTypeIdFrom(String inRoleTypeIdFrom) {
        this.inParameters.add("roleTypeIdFrom");
        this.inRoleTypeIdFrom = inRoleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeIdTo the inRoleTypeIdTo to set
    */
    public void setInRoleTypeIdTo(String inRoleTypeIdTo) {
        this.inParameters.add("roleTypeIdTo");
        this.inRoleTypeIdTo = inRoleTypeIdTo;
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
     * @param inTextData the inTextData to set
    */
    public void setInTextData(String inTextData) {
        this.inParameters.add("textData");
        this.inTextData = inTextData;
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
     * @param inToPartyClassGroupId the inToPartyClassGroupId to set
    */
    public void setInToPartyClassGroupId(String inToPartyClassGroupId) {
        this.inParameters.add("toPartyClassGroupId");
        this.inToPartyClassGroupId = inToPartyClassGroupId;
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
     * @param outAgreementId the outAgreementId to set
    */
    public void setOutAgreementId(String outAgreementId) {
        this.outParameters.add("agreementId");
        this.outAgreementId = outAgreementId;
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
        if (inParameters.contains("agreementDate")) mapValue.put("agreementDate", getInAgreementDate());
        if (inParameters.contains("agreementTypeId")) mapValue.put("agreementTypeId", getInAgreementTypeId());
        if (inParameters.contains("defaultCurrencyUomId")) mapValue.put("defaultCurrencyUomId", getInDefaultCurrencyUomId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("fromPartyClassGroupId")) mapValue.put("fromPartyClassGroupId", getInFromPartyClassGroupId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyIdFrom")) mapValue.put("partyIdFrom", getInPartyIdFrom());
        if (inParameters.contains("partyIdTo")) mapValue.put("partyIdTo", getInPartyIdTo());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("roleTypeIdFrom")) mapValue.put("roleTypeIdFrom", getInRoleTypeIdFrom());
        if (inParameters.contains("roleTypeIdTo")) mapValue.put("roleTypeIdTo", getInRoleTypeIdTo());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("textData")) mapValue.put("textData", getInTextData());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("toPartyClassGroupId")) mapValue.put("toPartyClassGroupId", getInToPartyClassGroupId());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("agreementId")) mapValue.put("agreementId", getOutAgreementId());
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
        if (mapValue.containsKey("agreementDate")) setInAgreementDate((Timestamp) mapValue.get("agreementDate"));
        if (mapValue.containsKey("agreementTypeId")) setInAgreementTypeId((String) mapValue.get("agreementTypeId"));
        if (mapValue.containsKey("defaultCurrencyUomId")) setInDefaultCurrencyUomId((String) mapValue.get("defaultCurrencyUomId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("fromPartyClassGroupId")) setInFromPartyClassGroupId((String) mapValue.get("fromPartyClassGroupId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyIdFrom")) setInPartyIdFrom((String) mapValue.get("partyIdFrom"));
        if (mapValue.containsKey("partyIdTo")) setInPartyIdTo((String) mapValue.get("partyIdTo"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("roleTypeIdFrom")) setInRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        if (mapValue.containsKey("roleTypeIdTo")) setInRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("textData")) setInTextData((String) mapValue.get("textData"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("toPartyClassGroupId")) setInToPartyClassGroupId((String) mapValue.get("toPartyClassGroupId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("agreementId")) setOutAgreementId((String) mapValue.get("agreementId"));
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
     * Construct a <code>CreateAgreementService</code> from the input values of the given <code>CreateAgreementService</code>.
     * @param input a <code>CreateAgreementService</code>
     */
    public static CreateAgreementService fromInput(CreateAgreementService input) {
        CreateAgreementService service = new CreateAgreementService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateAgreementService</code> from the output values of the given <code>CreateAgreementService</code>.
     * @param output a <code>CreateAgreementService</code>
     */
    public static CreateAgreementService fromOutput(CreateAgreementService output) {
        CreateAgreementService service = new CreateAgreementService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateAgreementService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateAgreementService fromInput(Map<String, Object> mapValue) {
        CreateAgreementService service = new CreateAgreementService();
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
     * Construct a <code>CreateAgreementService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateAgreementService fromOutput(Map<String, Object> mapValue) {
        CreateAgreementService service = new CreateAgreementService();
        service.putAllOutput(mapValue);
        return service;
    }
}
