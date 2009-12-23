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
 * Update or remove a child entity based on value of "action".
 * Auto generated base service entity updateOrRemove.
 *
 * Engine: java
 * Location: org.ofbiz.content.ContentManagementServices
 * Invoke: updateOrRemove
 * Defined in: applications/content/servicedef/services.xml
 */
public class UpdateOrRemoveService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateOrRemove";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        action("action"),
        entityName("entityName"),
        fieldName0("fieldName0"),
        fieldName1("fieldName1"),
        fieldName2("fieldName2"),
        fieldName3("fieldName3"),
        fieldValue0("fieldValue0"),
        fieldValue1("fieldValue1"),
        fieldValue2("fieldValue2"),
        fieldValue3("fieldValue3"),
        locale("locale"),
        pkFieldCount("pkFieldCount"),
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
     * Creates a new <code>UpdateOrRemoveService</code> instance.
     */
    public UpdateOrRemoveService() {
        super();
    }

    /**
     * Creates a new <code>UpdateOrRemoveService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateOrRemoveService(User user) {
        super(user);
    }

    private String inAction;
    private String inEntityName;
    private String inFieldName0;
    private String inFieldName1;
    private String inFieldName2;
    private String inFieldName3;
    private String inFieldValue0;
    private String inFieldValue1;
    private String inFieldValue2;
    private String inFieldValue3;
    private Locale inLocale;
    private String inPkFieldCount;
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
    public String getInAction() {
        return this.inAction;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInEntityName() {
        return this.inEntityName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFieldName0() {
        return this.inFieldName0;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFieldName1() {
        return this.inFieldName1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFieldName2() {
        return this.inFieldName2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFieldName3() {
        return this.inFieldName3;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFieldValue0() {
        return this.inFieldValue0;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFieldValue1() {
        return this.inFieldValue1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFieldValue2() {
        return this.inFieldValue2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFieldValue3() {
        return this.inFieldValue3;
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
    public String getInPkFieldCount() {
        return this.inPkFieldCount;
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
     * @param inAction the inAction to set
    */
    public void setInAction(String inAction) {
        this.inParameters.add("action");
        this.inAction = inAction;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inEntityName the inEntityName to set
    */
    public void setInEntityName(String inEntityName) {
        this.inParameters.add("entityName");
        this.inEntityName = inEntityName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFieldName0 the inFieldName0 to set
    */
    public void setInFieldName0(String inFieldName0) {
        this.inParameters.add("fieldName0");
        this.inFieldName0 = inFieldName0;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFieldName1 the inFieldName1 to set
    */
    public void setInFieldName1(String inFieldName1) {
        this.inParameters.add("fieldName1");
        this.inFieldName1 = inFieldName1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFieldName2 the inFieldName2 to set
    */
    public void setInFieldName2(String inFieldName2) {
        this.inParameters.add("fieldName2");
        this.inFieldName2 = inFieldName2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFieldName3 the inFieldName3 to set
    */
    public void setInFieldName3(String inFieldName3) {
        this.inParameters.add("fieldName3");
        this.inFieldName3 = inFieldName3;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFieldValue0 the inFieldValue0 to set
    */
    public void setInFieldValue0(String inFieldValue0) {
        this.inParameters.add("fieldValue0");
        this.inFieldValue0 = inFieldValue0;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFieldValue1 the inFieldValue1 to set
    */
    public void setInFieldValue1(String inFieldValue1) {
        this.inParameters.add("fieldValue1");
        this.inFieldValue1 = inFieldValue1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFieldValue2 the inFieldValue2 to set
    */
    public void setInFieldValue2(String inFieldValue2) {
        this.inParameters.add("fieldValue2");
        this.inFieldValue2 = inFieldValue2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFieldValue3 the inFieldValue3 to set
    */
    public void setInFieldValue3(String inFieldValue3) {
        this.inParameters.add("fieldValue3");
        this.inFieldValue3 = inFieldValue3;
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
     * @param inPkFieldCount the inPkFieldCount to set
    */
    public void setInPkFieldCount(String inPkFieldCount) {
        this.inParameters.add("pkFieldCount");
        this.inPkFieldCount = inPkFieldCount;
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
        if (inParameters.contains("action")) mapValue.put("action", getInAction());
        if (inParameters.contains("entityName")) mapValue.put("entityName", getInEntityName());
        if (inParameters.contains("fieldName0")) mapValue.put("fieldName0", getInFieldName0());
        if (inParameters.contains("fieldName1")) mapValue.put("fieldName1", getInFieldName1());
        if (inParameters.contains("fieldName2")) mapValue.put("fieldName2", getInFieldName2());
        if (inParameters.contains("fieldName3")) mapValue.put("fieldName3", getInFieldName3());
        if (inParameters.contains("fieldValue0")) mapValue.put("fieldValue0", getInFieldValue0());
        if (inParameters.contains("fieldValue1")) mapValue.put("fieldValue1", getInFieldValue1());
        if (inParameters.contains("fieldValue2")) mapValue.put("fieldValue2", getInFieldValue2());
        if (inParameters.contains("fieldValue3")) mapValue.put("fieldValue3", getInFieldValue3());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("pkFieldCount")) mapValue.put("pkFieldCount", getInPkFieldCount());
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
        if (mapValue.containsKey("action")) setInAction((String) mapValue.get("action"));
        if (mapValue.containsKey("entityName")) setInEntityName((String) mapValue.get("entityName"));
        if (mapValue.containsKey("fieldName0")) setInFieldName0((String) mapValue.get("fieldName0"));
        if (mapValue.containsKey("fieldName1")) setInFieldName1((String) mapValue.get("fieldName1"));
        if (mapValue.containsKey("fieldName2")) setInFieldName2((String) mapValue.get("fieldName2"));
        if (mapValue.containsKey("fieldName3")) setInFieldName3((String) mapValue.get("fieldName3"));
        if (mapValue.containsKey("fieldValue0")) setInFieldValue0((String) mapValue.get("fieldValue0"));
        if (mapValue.containsKey("fieldValue1")) setInFieldValue1((String) mapValue.get("fieldValue1"));
        if (mapValue.containsKey("fieldValue2")) setInFieldValue2((String) mapValue.get("fieldValue2"));
        if (mapValue.containsKey("fieldValue3")) setInFieldValue3((String) mapValue.get("fieldValue3"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("pkFieldCount")) setInPkFieldCount((String) mapValue.get("pkFieldCount"));
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
     * Construct a <code>UpdateOrRemoveService</code> from the input values of the given <code>UpdateOrRemoveService</code>.
     * @param input a <code>UpdateOrRemoveService</code>
     */
    public static UpdateOrRemoveService fromInput(UpdateOrRemoveService input) {
        UpdateOrRemoveService service = new UpdateOrRemoveService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateOrRemoveService</code> from the output values of the given <code>UpdateOrRemoveService</code>.
     * @param output a <code>UpdateOrRemoveService</code>
     */
    public static UpdateOrRemoveService fromOutput(UpdateOrRemoveService output) {
        UpdateOrRemoveService service = new UpdateOrRemoveService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateOrRemoveService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateOrRemoveService fromInput(Map<String, Object> mapValue) {
        UpdateOrRemoveService service = new UpdateOrRemoveService();
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
     * Construct a <code>UpdateOrRemoveService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateOrRemoveService fromOutput(Map<String, Object> mapValue) {
        UpdateOrRemoveService service = new UpdateOrRemoveService();
        service.putAllOutput(mapValue);
        return service;
    }
}
