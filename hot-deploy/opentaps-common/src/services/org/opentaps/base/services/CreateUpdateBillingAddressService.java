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
 * Creates new billing address and update existing address.
 * Auto generated base service entity createUpdateBillingAddress.
 *
 * Engine: simple
 * Location: component://order/script/org/ofbiz/order/order/OrderServices.xml
 * Invoke: createUpdateBillingAddress
 * Defined in: applications/order/servicedef/services.xml
 */
public class CreateUpdateBillingAddressService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createUpdateBillingAddress";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        billToAddress1("billToAddress1"),
        billToAddress2("billToAddress2"),
        billToAttnName("billToAttnName"),
        billToCity("billToCity"),
        billToContactMechId("billToContactMechId"),
        billToCountryGeoId("billToCountryGeoId"),
        billToName("billToName"),
        billToPostalCode("billToPostalCode"),
        billToStateProvinceGeoId("billToStateProvinceGeoId"),
        keepAddressBook("keepAddressBook"),
        locale("locale"),
        partyId("partyId"),
        productStoreId("productStoreId"),
        setDefaultBilling("setDefaultBilling"),
        shipToContactMechId("shipToContactMechId"),
        timeZone("timeZone"),
        useShippingAddressForBilling("useShippingAddressForBilling"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        contactMechId("contactMechId"),
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
     * Creates a new <code>CreateUpdateBillingAddressService</code> instance.
     */
    public CreateUpdateBillingAddressService() {
        super();
    }

    /**
     * Creates a new <code>CreateUpdateBillingAddressService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateUpdateBillingAddressService(User user) {
        super(user);
    }

    private String inBillToAddress1;
    private String inBillToAddress2;
    private String inBillToAttnName;
    private String inBillToCity;
    private String inBillToContactMechId;
    private String inBillToCountryGeoId;
    private String inBillToName;
    private String inBillToPostalCode;
    private String inBillToStateProvinceGeoId;
    private String inKeepAddressBook;
    private Locale inLocale;
    private String inPartyId;
    private String inProductStoreId;
    private String inSetDefaultBilling;
    private String inShipToContactMechId;
    private TimeZone inTimeZone;
    private String inUseShippingAddressForBilling;
    private GenericValue inUserLogin;
    private String outContactMechId;
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
    public String getInBillToAddress1() {
        return this.inBillToAddress1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBillToAddress2() {
        return this.inBillToAddress2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBillToAttnName() {
        return this.inBillToAttnName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInBillToCity() {
        return this.inBillToCity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBillToContactMechId() {
        return this.inBillToContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInBillToCountryGeoId() {
        return this.inBillToCountryGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBillToName() {
        return this.inBillToName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInBillToPostalCode() {
        return this.inBillToPostalCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInBillToStateProvinceGeoId() {
        return this.inBillToStateProvinceGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInKeepAddressBook() {
        return this.inKeepAddressBook;
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
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSetDefaultBilling() {
        return this.inSetDefaultBilling;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipToContactMechId() {
        return this.inShipToContactMechId;
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
    public String getInUseShippingAddressForBilling() {
        return this.inUseShippingAddressForBilling;
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
    public String getOutContactMechId() {
        return this.outContactMechId;
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
     * @param inBillToAddress1 the inBillToAddress1 to set
    */
    public void setInBillToAddress1(String inBillToAddress1) {
        this.inParameters.add("billToAddress1");
        this.inBillToAddress1 = inBillToAddress1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBillToAddress2 the inBillToAddress2 to set
    */
    public void setInBillToAddress2(String inBillToAddress2) {
        this.inParameters.add("billToAddress2");
        this.inBillToAddress2 = inBillToAddress2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBillToAttnName the inBillToAttnName to set
    */
    public void setInBillToAttnName(String inBillToAttnName) {
        this.inParameters.add("billToAttnName");
        this.inBillToAttnName = inBillToAttnName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inBillToCity the inBillToCity to set
    */
    public void setInBillToCity(String inBillToCity) {
        this.inParameters.add("billToCity");
        this.inBillToCity = inBillToCity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBillToContactMechId the inBillToContactMechId to set
    */
    public void setInBillToContactMechId(String inBillToContactMechId) {
        this.inParameters.add("billToContactMechId");
        this.inBillToContactMechId = inBillToContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inBillToCountryGeoId the inBillToCountryGeoId to set
    */
    public void setInBillToCountryGeoId(String inBillToCountryGeoId) {
        this.inParameters.add("billToCountryGeoId");
        this.inBillToCountryGeoId = inBillToCountryGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBillToName the inBillToName to set
    */
    public void setInBillToName(String inBillToName) {
        this.inParameters.add("billToName");
        this.inBillToName = inBillToName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inBillToPostalCode the inBillToPostalCode to set
    */
    public void setInBillToPostalCode(String inBillToPostalCode) {
        this.inParameters.add("billToPostalCode");
        this.inBillToPostalCode = inBillToPostalCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inBillToStateProvinceGeoId the inBillToStateProvinceGeoId to set
    */
    public void setInBillToStateProvinceGeoId(String inBillToStateProvinceGeoId) {
        this.inParameters.add("billToStateProvinceGeoId");
        this.inBillToStateProvinceGeoId = inBillToStateProvinceGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inKeepAddressBook the inKeepAddressBook to set
    */
    public void setInKeepAddressBook(String inKeepAddressBook) {
        this.inParameters.add("keepAddressBook");
        this.inKeepAddressBook = inKeepAddressBook;
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
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSetDefaultBilling the inSetDefaultBilling to set
    */
    public void setInSetDefaultBilling(String inSetDefaultBilling) {
        this.inParameters.add("setDefaultBilling");
        this.inSetDefaultBilling = inSetDefaultBilling;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipToContactMechId the inShipToContactMechId to set
    */
    public void setInShipToContactMechId(String inShipToContactMechId) {
        this.inParameters.add("shipToContactMechId");
        this.inShipToContactMechId = inShipToContactMechId;
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
     * @param inUseShippingAddressForBilling the inUseShippingAddressForBilling to set
    */
    public void setInUseShippingAddressForBilling(String inUseShippingAddressForBilling) {
        this.inParameters.add("useShippingAddressForBilling");
        this.inUseShippingAddressForBilling = inUseShippingAddressForBilling;
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
     * @param outContactMechId the outContactMechId to set
    */
    public void setOutContactMechId(String outContactMechId) {
        this.outParameters.add("contactMechId");
        this.outContactMechId = outContactMechId;
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
        if (inParameters.contains("billToAddress1")) mapValue.put("billToAddress1", getInBillToAddress1());
        if (inParameters.contains("billToAddress2")) mapValue.put("billToAddress2", getInBillToAddress2());
        if (inParameters.contains("billToAttnName")) mapValue.put("billToAttnName", getInBillToAttnName());
        if (inParameters.contains("billToCity")) mapValue.put("billToCity", getInBillToCity());
        if (inParameters.contains("billToContactMechId")) mapValue.put("billToContactMechId", getInBillToContactMechId());
        if (inParameters.contains("billToCountryGeoId")) mapValue.put("billToCountryGeoId", getInBillToCountryGeoId());
        if (inParameters.contains("billToName")) mapValue.put("billToName", getInBillToName());
        if (inParameters.contains("billToPostalCode")) mapValue.put("billToPostalCode", getInBillToPostalCode());
        if (inParameters.contains("billToStateProvinceGeoId")) mapValue.put("billToStateProvinceGeoId", getInBillToStateProvinceGeoId());
        if (inParameters.contains("keepAddressBook")) mapValue.put("keepAddressBook", getInKeepAddressBook());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("setDefaultBilling")) mapValue.put("setDefaultBilling", getInSetDefaultBilling());
        if (inParameters.contains("shipToContactMechId")) mapValue.put("shipToContactMechId", getInShipToContactMechId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("useShippingAddressForBilling")) mapValue.put("useShippingAddressForBilling", getInUseShippingAddressForBilling());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("contactMechId")) mapValue.put("contactMechId", getOutContactMechId());
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
        if (mapValue.containsKey("billToAddress1")) setInBillToAddress1((String) mapValue.get("billToAddress1"));
        if (mapValue.containsKey("billToAddress2")) setInBillToAddress2((String) mapValue.get("billToAddress2"));
        if (mapValue.containsKey("billToAttnName")) setInBillToAttnName((String) mapValue.get("billToAttnName"));
        if (mapValue.containsKey("billToCity")) setInBillToCity((String) mapValue.get("billToCity"));
        if (mapValue.containsKey("billToContactMechId")) setInBillToContactMechId((String) mapValue.get("billToContactMechId"));
        if (mapValue.containsKey("billToCountryGeoId")) setInBillToCountryGeoId((String) mapValue.get("billToCountryGeoId"));
        if (mapValue.containsKey("billToName")) setInBillToName((String) mapValue.get("billToName"));
        if (mapValue.containsKey("billToPostalCode")) setInBillToPostalCode((String) mapValue.get("billToPostalCode"));
        if (mapValue.containsKey("billToStateProvinceGeoId")) setInBillToStateProvinceGeoId((String) mapValue.get("billToStateProvinceGeoId"));
        if (mapValue.containsKey("keepAddressBook")) setInKeepAddressBook((String) mapValue.get("keepAddressBook"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("setDefaultBilling")) setInSetDefaultBilling((String) mapValue.get("setDefaultBilling"));
        if (mapValue.containsKey("shipToContactMechId")) setInShipToContactMechId((String) mapValue.get("shipToContactMechId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("useShippingAddressForBilling")) setInUseShippingAddressForBilling((String) mapValue.get("useShippingAddressForBilling"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("contactMechId")) setOutContactMechId((String) mapValue.get("contactMechId"));
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
     * Construct a <code>CreateUpdateBillingAddressService</code> from the input values of the given <code>CreateUpdateBillingAddressService</code>.
     * @param input a <code>CreateUpdateBillingAddressService</code>
     */
    public static CreateUpdateBillingAddressService fromInput(CreateUpdateBillingAddressService input) {
        CreateUpdateBillingAddressService service = new CreateUpdateBillingAddressService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateUpdateBillingAddressService</code> from the output values of the given <code>CreateUpdateBillingAddressService</code>.
     * @param output a <code>CreateUpdateBillingAddressService</code>
     */
    public static CreateUpdateBillingAddressService fromOutput(CreateUpdateBillingAddressService output) {
        CreateUpdateBillingAddressService service = new CreateUpdateBillingAddressService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateUpdateBillingAddressService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateUpdateBillingAddressService fromInput(Map<String, Object> mapValue) {
        CreateUpdateBillingAddressService service = new CreateUpdateBillingAddressService();
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
     * Construct a <code>CreateUpdateBillingAddressService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateUpdateBillingAddressService fromOutput(Map<String, Object> mapValue) {
        CreateUpdateBillingAddressService service = new CreateUpdateBillingAddressService();
        service.putAllOutput(mapValue);
        return service;
    }
}
