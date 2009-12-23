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
 * 
            Create a Relationship between two Parties;
            if partyIdFrom is not specified the partyId of the current userLogin will be used;
            if roleTypeIds are not specified they will default to "_NA_".
            If a partyIdFrom is passed in, it will be used if the userLogin has PARTYMGR_REL_CREATE permission.
        .
 * Auto generated base service entity createPartyRelationship.
 *
 * Engine: simple
 * Location: component://party/script/org/ofbiz/party/party/PartyServices.xml
 * Invoke: createPartyRelationship
 * Defined in: applications/party/servicedef/services.xml
 */
public class CreatePartyRelationshipService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createPartyRelationship";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        comments("comments"),
        fromDate("fromDate"),
        locale("locale"),
        partyIdFrom("partyIdFrom"),
        partyIdTo("partyIdTo"),
        partyRelationshipTypeId("partyRelationshipTypeId"),
        permissionsEnumId("permissionsEnumId"),
        positionTitle("positionTitle"),
        priorityTypeId("priorityTypeId"),
        relationshipName("relationshipName"),
        roleTypeIdFrom("roleTypeIdFrom"),
        roleTypeIdTo("roleTypeIdTo"),
        securityGroupId("securityGroupId"),
        statusId("statusId"),
        thruDate("thruDate"),
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
     * Creates a new <code>CreatePartyRelationshipService</code> instance.
     */
    public CreatePartyRelationshipService() {
        super();
    }

    /**
     * Creates a new <code>CreatePartyRelationshipService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreatePartyRelationshipService(User user) {
        super(user);
    }

    private String inComments;
    private Timestamp inFromDate;
    private Locale inLocale;
    private String inPartyIdFrom;
    private String inPartyIdTo;
    private String inPartyRelationshipTypeId;
    private String inPermissionsEnumId;
    private String inPositionTitle;
    private String inPriorityTypeId;
    private String inRelationshipName;
    private String inRoleTypeIdFrom;
    private String inRoleTypeIdTo;
    private String inSecurityGroupId;
    private String inStatusId;
    private Timestamp inThruDate;
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
     * @return <code>String</code>
     */
    public String getInComments() {
        return this.inComments;
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
     * This parameter is required.
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
    public String getInPartyRelationshipTypeId() {
        return this.inPartyRelationshipTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPermissionsEnumId() {
        return this.inPermissionsEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPositionTitle() {
        return this.inPositionTitle;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPriorityTypeId() {
        return this.inPriorityTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRelationshipName() {
        return this.inRelationshipName;
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
    public String getInSecurityGroupId() {
        return this.inSecurityGroupId;
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
     * @param inComments the inComments to set
    */
    public void setInComments(String inComments) {
        this.inParameters.add("comments");
        this.inComments = inComments;
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
     * This parameter is required.
     * @param inPartyIdTo the inPartyIdTo to set
    */
    public void setInPartyIdTo(String inPartyIdTo) {
        this.inParameters.add("partyIdTo");
        this.inPartyIdTo = inPartyIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyRelationshipTypeId the inPartyRelationshipTypeId to set
    */
    public void setInPartyRelationshipTypeId(String inPartyRelationshipTypeId) {
        this.inParameters.add("partyRelationshipTypeId");
        this.inPartyRelationshipTypeId = inPartyRelationshipTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPermissionsEnumId the inPermissionsEnumId to set
    */
    public void setInPermissionsEnumId(String inPermissionsEnumId) {
        this.inParameters.add("permissionsEnumId");
        this.inPermissionsEnumId = inPermissionsEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPositionTitle the inPositionTitle to set
    */
    public void setInPositionTitle(String inPositionTitle) {
        this.inParameters.add("positionTitle");
        this.inPositionTitle = inPositionTitle;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPriorityTypeId the inPriorityTypeId to set
    */
    public void setInPriorityTypeId(String inPriorityTypeId) {
        this.inParameters.add("priorityTypeId");
        this.inPriorityTypeId = inPriorityTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRelationshipName the inRelationshipName to set
    */
    public void setInRelationshipName(String inRelationshipName) {
        this.inParameters.add("relationshipName");
        this.inRelationshipName = inRelationshipName;
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
     * @param inSecurityGroupId the inSecurityGroupId to set
    */
    public void setInSecurityGroupId(String inSecurityGroupId) {
        this.inParameters.add("securityGroupId");
        this.inSecurityGroupId = inSecurityGroupId;
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
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyIdFrom")) mapValue.put("partyIdFrom", getInPartyIdFrom());
        if (inParameters.contains("partyIdTo")) mapValue.put("partyIdTo", getInPartyIdTo());
        if (inParameters.contains("partyRelationshipTypeId")) mapValue.put("partyRelationshipTypeId", getInPartyRelationshipTypeId());
        if (inParameters.contains("permissionsEnumId")) mapValue.put("permissionsEnumId", getInPermissionsEnumId());
        if (inParameters.contains("positionTitle")) mapValue.put("positionTitle", getInPositionTitle());
        if (inParameters.contains("priorityTypeId")) mapValue.put("priorityTypeId", getInPriorityTypeId());
        if (inParameters.contains("relationshipName")) mapValue.put("relationshipName", getInRelationshipName());
        if (inParameters.contains("roleTypeIdFrom")) mapValue.put("roleTypeIdFrom", getInRoleTypeIdFrom());
        if (inParameters.contains("roleTypeIdTo")) mapValue.put("roleTypeIdTo", getInRoleTypeIdTo());
        if (inParameters.contains("securityGroupId")) mapValue.put("securityGroupId", getInSecurityGroupId());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
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
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyIdFrom")) setInPartyIdFrom((String) mapValue.get("partyIdFrom"));
        if (mapValue.containsKey("partyIdTo")) setInPartyIdTo((String) mapValue.get("partyIdTo"));
        if (mapValue.containsKey("partyRelationshipTypeId")) setInPartyRelationshipTypeId((String) mapValue.get("partyRelationshipTypeId"));
        if (mapValue.containsKey("permissionsEnumId")) setInPermissionsEnumId((String) mapValue.get("permissionsEnumId"));
        if (mapValue.containsKey("positionTitle")) setInPositionTitle((String) mapValue.get("positionTitle"));
        if (mapValue.containsKey("priorityTypeId")) setInPriorityTypeId((String) mapValue.get("priorityTypeId"));
        if (mapValue.containsKey("relationshipName")) setInRelationshipName((String) mapValue.get("relationshipName"));
        if (mapValue.containsKey("roleTypeIdFrom")) setInRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        if (mapValue.containsKey("roleTypeIdTo")) setInRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        if (mapValue.containsKey("securityGroupId")) setInSecurityGroupId((String) mapValue.get("securityGroupId"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
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
     * Construct a <code>CreatePartyRelationshipService</code> from the input values of the given <code>CreatePartyRelationshipService</code>.
     * @param input a <code>CreatePartyRelationshipService</code>
     */
    public static CreatePartyRelationshipService fromInput(CreatePartyRelationshipService input) {
        CreatePartyRelationshipService service = new CreatePartyRelationshipService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreatePartyRelationshipService</code> from the output values of the given <code>CreatePartyRelationshipService</code>.
     * @param output a <code>CreatePartyRelationshipService</code>
     */
    public static CreatePartyRelationshipService fromOutput(CreatePartyRelationshipService output) {
        CreatePartyRelationshipService service = new CreatePartyRelationshipService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreatePartyRelationshipService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreatePartyRelationshipService fromInput(Map<String, Object> mapValue) {
        CreatePartyRelationshipService service = new CreatePartyRelationshipService();
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
     * Construct a <code>CreatePartyRelationshipService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreatePartyRelationshipService fromOutput(Map<String, Object> mapValue) {
        CreatePartyRelationshipService service = new CreatePartyRelationshipService();
        service.putAllOutput(mapValue);
        return service;
    }
}
