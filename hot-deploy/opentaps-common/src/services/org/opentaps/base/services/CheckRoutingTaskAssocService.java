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
 * Check if a new routingTaskAssoc is ok or not (same SeqId and Date).
 * Auto generated base service entity checkRoutingTaskAssoc.
 *
 * Engine: java
 * Location: org.ofbiz.manufacturing.techdata.TechDataServices
 * Invoke: checkRoutingTaskAssoc
 * Defined in: applications/manufacturing/servicedef/services_routing.xml
 */
public class CheckRoutingTaskAssocService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "checkRoutingTaskAssoc";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        create("create"),
        fromDate("fromDate"),
        locale("locale"),
        sequenceNum("sequenceNum"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        workEffortAssocTypeId("workEffortAssocTypeId"),
        workEffortIdFrom("workEffortIdFrom"),
        workEffortIdTo("workEffortIdTo");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        sequenceNumNotOk("sequenceNumNotOk"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>CheckRoutingTaskAssocService</code> instance.
     */
    public CheckRoutingTaskAssocService() {
        super();
    }

    /**
     * Creates a new <code>CheckRoutingTaskAssocService</code> instance.
     * @param user an <code>User</code> value
     */
    public CheckRoutingTaskAssocService(User user) {
        super(user);
    }

    private String inCreate;
    private Timestamp inFromDate;
    private Locale inLocale;
    private Long inSequenceNum;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWorkEffortAssocTypeId;
    private String inWorkEffortIdFrom;
    private String inWorkEffortIdTo;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSequenceNumNotOk;
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
    public String getInCreate() {
        return this.inCreate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
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
     * @return <code>Long</code>
     */
    public Long getInSequenceNum() {
        return this.inSequenceNum;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInWorkEffortAssocTypeId() {
        return this.inWorkEffortAssocTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInWorkEffortIdFrom() {
        return this.inWorkEffortIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInWorkEffortIdTo() {
        return this.inWorkEffortIdTo;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutSequenceNumNotOk() {
        return this.outSequenceNumNotOk;
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
     * @param inCreate the inCreate to set
    */
    public void setInCreate(String inCreate) {
        this.inParameters.add("create");
        this.inCreate = inCreate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
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
     * @param inSequenceNum the inSequenceNum to set
    */
    public void setInSequenceNum(Long inSequenceNum) {
        this.inParameters.add("sequenceNum");
        this.inSequenceNum = inSequenceNum;
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
     * This parameter is required.
     * @param inWorkEffortAssocTypeId the inWorkEffortAssocTypeId to set
    */
    public void setInWorkEffortAssocTypeId(String inWorkEffortAssocTypeId) {
        this.inParameters.add("workEffortAssocTypeId");
        this.inWorkEffortAssocTypeId = inWorkEffortAssocTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inWorkEffortIdFrom the inWorkEffortIdFrom to set
    */
    public void setInWorkEffortIdFrom(String inWorkEffortIdFrom) {
        this.inParameters.add("workEffortIdFrom");
        this.inWorkEffortIdFrom = inWorkEffortIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inWorkEffortIdTo the inWorkEffortIdTo to set
    */
    public void setInWorkEffortIdTo(String inWorkEffortIdTo) {
        this.inParameters.add("workEffortIdTo");
        this.inWorkEffortIdTo = inWorkEffortIdTo;
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
     * This parameter is required.
     * @param outSequenceNumNotOk the outSequenceNumNotOk to set
    */
    public void setOutSequenceNumNotOk(String outSequenceNumNotOk) {
        this.outParameters.add("sequenceNumNotOk");
        this.outSequenceNumNotOk = outSequenceNumNotOk;
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
        if (inParameters.contains("create")) mapValue.put("create", getInCreate());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("sequenceNum")) mapValue.put("sequenceNum", getInSequenceNum());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortAssocTypeId")) mapValue.put("workEffortAssocTypeId", getInWorkEffortAssocTypeId());
        if (inParameters.contains("workEffortIdFrom")) mapValue.put("workEffortIdFrom", getInWorkEffortIdFrom());
        if (inParameters.contains("workEffortIdTo")) mapValue.put("workEffortIdTo", getInWorkEffortIdTo());
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
        if (outParameters.contains("sequenceNumNotOk")) mapValue.put("sequenceNumNotOk", getOutSequenceNumNotOk());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("create")) setInCreate((String) mapValue.get("create"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("sequenceNum")) setInSequenceNum((Long) mapValue.get("sequenceNum"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortAssocTypeId")) setInWorkEffortAssocTypeId((String) mapValue.get("workEffortAssocTypeId"));
        if (mapValue.containsKey("workEffortIdFrom")) setInWorkEffortIdFrom((String) mapValue.get("workEffortIdFrom"));
        if (mapValue.containsKey("workEffortIdTo")) setInWorkEffortIdTo((String) mapValue.get("workEffortIdTo"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("sequenceNumNotOk")) setOutSequenceNumNotOk((String) mapValue.get("sequenceNumNotOk"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CheckRoutingTaskAssocService</code> from the input values of the given <code>CheckRoutingTaskAssocService</code>.
     * @param input a <code>CheckRoutingTaskAssocService</code>
     */
    public static CheckRoutingTaskAssocService fromInput(CheckRoutingTaskAssocService input) {
        CheckRoutingTaskAssocService service = new CheckRoutingTaskAssocService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CheckRoutingTaskAssocService</code> from the output values of the given <code>CheckRoutingTaskAssocService</code>.
     * @param output a <code>CheckRoutingTaskAssocService</code>
     */
    public static CheckRoutingTaskAssocService fromOutput(CheckRoutingTaskAssocService output) {
        CheckRoutingTaskAssocService service = new CheckRoutingTaskAssocService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CheckRoutingTaskAssocService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CheckRoutingTaskAssocService fromInput(Map<String, Object> mapValue) {
        CheckRoutingTaskAssocService service = new CheckRoutingTaskAssocService();
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
     * Construct a <code>CheckRoutingTaskAssocService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CheckRoutingTaskAssocService fromOutput(Map<String, Object> mapValue) {
        CheckRoutingTaskAssocService service = new CheckRoutingTaskAssocService();
        service.putAllOutput(mapValue);
        return service;
    }
}
