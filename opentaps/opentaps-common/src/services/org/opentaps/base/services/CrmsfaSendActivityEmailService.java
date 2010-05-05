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
 * Send an email to someone in the system. Creats a completed Task (WorkEffort) and an associated, completed CommunicationEvent. 
            To send a saved email, pass in the communicationEventId and the workEffortId of the saved data.
            No security at the moment..
 * Auto generated base service entity crmsfa.sendActivityEmail.
 *
 * Engine: java
 * Location: com.opensourcestrategies.crmsfa.activities.ActivitiesServices
 * Invoke: sendActivityEmail
 * Defined in: opentaps/crmsfa/servicedef/services_activities.xml
 */
public class CrmsfaSendActivityEmailService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "crmsfa.sendActivityEmail";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        bccEmail("bccEmail"),
        ccEmail("ccEmail"),
        communicationEventId("communicationEventId"),
        contactMechIdFrom("contactMechIdFrom"),
        contactMechIdTo("contactMechIdTo"),
        content("content"),
        contentMimeTypeId("contentMimeTypeId"),
        custRequestId("custRequestId"),
        datetimeStarted("datetimeStarted"),
        internalPartyId("internalPartyId"),
        locale("locale"),
        multiPartMap("multiPartMap"),
        note("note"),
        orderId("orderId"),
        origCommEventId("origCommEventId"),
        salesOpportunityId("salesOpportunityId"),
        subject("subject"),
        timeZone("timeZone"),
        toEmail("toEmail"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
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
     * Creates a new <code>CrmsfaSendActivityEmailService</code> instance.
     */
    public CrmsfaSendActivityEmailService() {
        super();
    }


    private String inBccEmail;
    private String inCcEmail;
    private String inCommunicationEventId;
    private String inContactMechIdFrom;
    private String inContactMechIdTo;
    private String inContent;
    private String inContentMimeTypeId;
    private String inCustRequestId;
    private Timestamp inDatetimeStarted;
    private String inInternalPartyId;
    private Locale inLocale;
    private Map inMultiPartMap;
    private String inNote;
    private String inOrderId;
    private String inOrigCommEventId;
    private String inSalesOpportunityId;
    private String inSubject;
    private TimeZone inTimeZone;
    private String inToEmail;
    private GenericValue inUserLogin;
    private String inWorkEffortId;
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
    public String getInBccEmail() {
        return this.inBccEmail;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCcEmail() {
        return this.inCcEmail;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCommunicationEventId() {
        return this.inCommunicationEventId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInContactMechIdFrom() {
        return this.inContactMechIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactMechIdTo() {
        return this.inContactMechIdTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInContent() {
        return this.inContent;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInContentMimeTypeId() {
        return this.inContentMimeTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustRequestId() {
        return this.inCustRequestId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInDatetimeStarted() {
        return this.inDatetimeStarted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInternalPartyId() {
        return this.inInternalPartyId;
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
     * @return <code>Map</code>
     */
    public Map getInMultiPartMap() {
        return this.inMultiPartMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInNote() {
        return this.inNote;
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
    public String getInOrigCommEventId() {
        return this.inOrigCommEventId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSalesOpportunityId() {
        return this.inSalesOpportunityId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInSubject() {
        return this.inSubject;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInToEmail() {
        return this.inToEmail;
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
    public String getInWorkEffortId() {
        return this.inWorkEffortId;
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
     * @param inBccEmail the inBccEmail to set
    */
    public void setInBccEmail(String inBccEmail) {
        this.inParameters.add("bccEmail");
        this.inBccEmail = inBccEmail;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCcEmail the inCcEmail to set
    */
    public void setInCcEmail(String inCcEmail) {
        this.inParameters.add("ccEmail");
        this.inCcEmail = inCcEmail;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCommunicationEventId the inCommunicationEventId to set
    */
    public void setInCommunicationEventId(String inCommunicationEventId) {
        this.inParameters.add("communicationEventId");
        this.inCommunicationEventId = inCommunicationEventId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inContactMechIdFrom the inContactMechIdFrom to set
    */
    public void setInContactMechIdFrom(String inContactMechIdFrom) {
        this.inParameters.add("contactMechIdFrom");
        this.inContactMechIdFrom = inContactMechIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactMechIdTo the inContactMechIdTo to set
    */
    public void setInContactMechIdTo(String inContactMechIdTo) {
        this.inParameters.add("contactMechIdTo");
        this.inContactMechIdTo = inContactMechIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inContent the inContent to set
    */
    public void setInContent(String inContent) {
        this.inParameters.add("content");
        this.inContent = inContent;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inContentMimeTypeId the inContentMimeTypeId to set
    */
    public void setInContentMimeTypeId(String inContentMimeTypeId) {
        this.inParameters.add("contentMimeTypeId");
        this.inContentMimeTypeId = inContentMimeTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestId the inCustRequestId to set
    */
    public void setInCustRequestId(String inCustRequestId) {
        this.inParameters.add("custRequestId");
        this.inCustRequestId = inCustRequestId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDatetimeStarted the inDatetimeStarted to set
    */
    public void setInDatetimeStarted(Timestamp inDatetimeStarted) {
        this.inParameters.add("datetimeStarted");
        this.inDatetimeStarted = inDatetimeStarted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInternalPartyId the inInternalPartyId to set
    */
    public void setInInternalPartyId(String inInternalPartyId) {
        this.inParameters.add("internalPartyId");
        this.inInternalPartyId = inInternalPartyId;
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
     * @param inMultiPartMap the inMultiPartMap to set
    */
    public void setInMultiPartMap(Map inMultiPartMap) {
        this.inParameters.add("multiPartMap");
        this.inMultiPartMap = inMultiPartMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNote the inNote to set
    */
    public void setInNote(String inNote) {
        this.inParameters.add("note");
        this.inNote = inNote;
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
     * @param inOrigCommEventId the inOrigCommEventId to set
    */
    public void setInOrigCommEventId(String inOrigCommEventId) {
        this.inParameters.add("origCommEventId");
        this.inOrigCommEventId = inOrigCommEventId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSalesOpportunityId the inSalesOpportunityId to set
    */
    public void setInSalesOpportunityId(String inSalesOpportunityId) {
        this.inParameters.add("salesOpportunityId");
        this.inSalesOpportunityId = inSalesOpportunityId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inSubject the inSubject to set
    */
    public void setInSubject(String inSubject) {
        this.inParameters.add("subject");
        this.inSubject = inSubject;
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
     * This parameter is required.
     * @param inToEmail the inToEmail to set
    */
    public void setInToEmail(String inToEmail) {
        this.inParameters.add("toEmail");
        this.inToEmail = inToEmail;
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
     * @param inWorkEffortId the inWorkEffortId to set
    */
    public void setInWorkEffortId(String inWorkEffortId) {
        this.inParameters.add("workEffortId");
        this.inWorkEffortId = inWorkEffortId;
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
        if (inParameters.contains("bccEmail")) mapValue.put("bccEmail", getInBccEmail());
        if (inParameters.contains("ccEmail")) mapValue.put("ccEmail", getInCcEmail());
        if (inParameters.contains("communicationEventId")) mapValue.put("communicationEventId", getInCommunicationEventId());
        if (inParameters.contains("contactMechIdFrom")) mapValue.put("contactMechIdFrom", getInContactMechIdFrom());
        if (inParameters.contains("contactMechIdTo")) mapValue.put("contactMechIdTo", getInContactMechIdTo());
        if (inParameters.contains("content")) mapValue.put("content", getInContent());
        if (inParameters.contains("contentMimeTypeId")) mapValue.put("contentMimeTypeId", getInContentMimeTypeId());
        if (inParameters.contains("custRequestId")) mapValue.put("custRequestId", getInCustRequestId());
        if (inParameters.contains("datetimeStarted")) mapValue.put("datetimeStarted", getInDatetimeStarted());
        if (inParameters.contains("internalPartyId")) mapValue.put("internalPartyId", getInInternalPartyId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("multiPartMap")) mapValue.put("multiPartMap", getInMultiPartMap());
        if (inParameters.contains("note")) mapValue.put("note", getInNote());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("origCommEventId")) mapValue.put("origCommEventId", getInOrigCommEventId());
        if (inParameters.contains("salesOpportunityId")) mapValue.put("salesOpportunityId", getInSalesOpportunityId());
        if (inParameters.contains("subject")) mapValue.put("subject", getInSubject());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("toEmail")) mapValue.put("toEmail", getInToEmail());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
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
        if (mapValue.containsKey("bccEmail")) setInBccEmail((String) mapValue.get("bccEmail"));
        if (mapValue.containsKey("ccEmail")) setInCcEmail((String) mapValue.get("ccEmail"));
        if (mapValue.containsKey("communicationEventId")) setInCommunicationEventId((String) mapValue.get("communicationEventId"));
        if (mapValue.containsKey("contactMechIdFrom")) setInContactMechIdFrom((String) mapValue.get("contactMechIdFrom"));
        if (mapValue.containsKey("contactMechIdTo")) setInContactMechIdTo((String) mapValue.get("contactMechIdTo"));
        if (mapValue.containsKey("content")) setInContent((String) mapValue.get("content"));
        if (mapValue.containsKey("contentMimeTypeId")) setInContentMimeTypeId((String) mapValue.get("contentMimeTypeId"));
        if (mapValue.containsKey("custRequestId")) setInCustRequestId((String) mapValue.get("custRequestId"));
        if (mapValue.containsKey("datetimeStarted")) setInDatetimeStarted((Timestamp) mapValue.get("datetimeStarted"));
        if (mapValue.containsKey("internalPartyId")) setInInternalPartyId((String) mapValue.get("internalPartyId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("multiPartMap")) setInMultiPartMap((Map) mapValue.get("multiPartMap"));
        if (mapValue.containsKey("note")) setInNote((String) mapValue.get("note"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("origCommEventId")) setInOrigCommEventId((String) mapValue.get("origCommEventId"));
        if (mapValue.containsKey("salesOpportunityId")) setInSalesOpportunityId((String) mapValue.get("salesOpportunityId"));
        if (mapValue.containsKey("subject")) setInSubject((String) mapValue.get("subject"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("toEmail")) setInToEmail((String) mapValue.get("toEmail"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
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
     * Construct a <code>CrmsfaSendActivityEmailService</code> from the input values of the given <code>CrmsfaSendActivityEmailService</code>.
     * @param input a <code>CrmsfaSendActivityEmailService</code>
     */
    public static CrmsfaSendActivityEmailService fromInput(CrmsfaSendActivityEmailService input) {
        CrmsfaSendActivityEmailService service = new CrmsfaSendActivityEmailService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CrmsfaSendActivityEmailService</code> from the output values of the given <code>CrmsfaSendActivityEmailService</code>.
     * @param output a <code>CrmsfaSendActivityEmailService</code>
     */
    public static CrmsfaSendActivityEmailService fromOutput(CrmsfaSendActivityEmailService output) {
        CrmsfaSendActivityEmailService service = new CrmsfaSendActivityEmailService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CrmsfaSendActivityEmailService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CrmsfaSendActivityEmailService fromInput(Map<String, Object> mapValue) {
        CrmsfaSendActivityEmailService service = new CrmsfaSendActivityEmailService();
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
     * Construct a <code>CrmsfaSendActivityEmailService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CrmsfaSendActivityEmailService fromOutput(Map<String, Object> mapValue) {
        CrmsfaSendActivityEmailService service = new CrmsfaSendActivityEmailService();
        service.putAllOutput(mapValue);
        return service;
    }
}
