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
 * Export products to eBay.
 * Auto generated base service entity exportToEbay.
 *
 * Engine: java
 * Location: org.ofbiz.ebay.ProductsExportToEbay
 * Invoke: exportToEbay
 * Defined in: specialpurpose/ebay/servicedef/services.xml
 */
public class ExportToEbayService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "exportToEbay";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        country("country"),
        ebayCategory("ebayCategory"),
        listingDuration("listingDuration"),
        locale("locale"),
        location("location"),
        payPalEmail("payPalEmail"),
        paymentAmEx("paymentAmEx"),
        paymentCCAccepted("paymentCCAccepted"),
        paymentCOD("paymentCOD"),
        paymentCODPrePayDelivery("paymentCODPrePayDelivery"),
        paymentCashInPerson("paymentCashInPerson"),
        paymentCashOnPickup("paymentCashOnPickup"),
        paymentDiscover("paymentDiscover"),
        paymentMOCC("paymentMOCC"),
        paymentMoneyXferAccepted("paymentMoneyXferAccepted"),
        paymentPayPal("paymentPayPal"),
        paymentPersonalCheck("paymentPersonalCheck"),
        paymentVisaMC("paymentVisaMC"),
        quantity("quantity"),
        selectResult("selectResult"),
        startPrice("startPrice"),
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
     * Creates a new <code>ExportToEbayService</code> instance.
     */
    public ExportToEbayService() {
        super();
    }

    /**
     * Creates a new <code>ExportToEbayService</code> instance.
     * @param user an <code>User</code> value
     */
    public ExportToEbayService(User user) {
        super(user);
    }

    private String inCountry;
    private String inEbayCategory;
    private String inListingDuration;
    private Locale inLocale;
    private String inLocation;
    private String inPayPalEmail;
    private String inPaymentAmEx;
    private String inPaymentCCAccepted;
    private String inPaymentCOD;
    private String inPaymentCODPrePayDelivery;
    private String inPaymentCashInPerson;
    private String inPaymentCashOnPickup;
    private String inPaymentDiscover;
    private String inPaymentMOCC;
    private String inPaymentMoneyXferAccepted;
    private String inPaymentPayPal;
    private String inPaymentPersonalCheck;
    private String inPaymentVisaMC;
    private String inQuantity;
    private List inSelectResult;
    private String inStartPrice;
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
    public String getInCountry() {
        return this.inCountry;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInEbayCategory() {
        return this.inEbayCategory;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInListingDuration() {
        return this.inListingDuration;
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
    public String getInLocation() {
        return this.inLocation;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPayPalEmail() {
        return this.inPayPalEmail;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentAmEx() {
        return this.inPaymentAmEx;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentCCAccepted() {
        return this.inPaymentCCAccepted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentCOD() {
        return this.inPaymentCOD;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentCODPrePayDelivery() {
        return this.inPaymentCODPrePayDelivery;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentCashInPerson() {
        return this.inPaymentCashInPerson;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentCashOnPickup() {
        return this.inPaymentCashOnPickup;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentDiscover() {
        return this.inPaymentDiscover;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentMOCC() {
        return this.inPaymentMOCC;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentMoneyXferAccepted() {
        return this.inPaymentMoneyXferAccepted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentPayPal() {
        return this.inPaymentPayPal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentPersonalCheck() {
        return this.inPaymentPersonalCheck;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentVisaMC() {
        return this.inPaymentVisaMC;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInQuantity() {
        return this.inQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getInSelectResult() {
        return this.inSelectResult;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInStartPrice() {
        return this.inStartPrice;
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
     * @param inCountry the inCountry to set
    */
    public void setInCountry(String inCountry) {
        this.inParameters.add("country");
        this.inCountry = inCountry;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inEbayCategory the inEbayCategory to set
    */
    public void setInEbayCategory(String inEbayCategory) {
        this.inParameters.add("ebayCategory");
        this.inEbayCategory = inEbayCategory;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inListingDuration the inListingDuration to set
    */
    public void setInListingDuration(String inListingDuration) {
        this.inParameters.add("listingDuration");
        this.inListingDuration = inListingDuration;
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
     * @param inLocation the inLocation to set
    */
    public void setInLocation(String inLocation) {
        this.inParameters.add("location");
        this.inLocation = inLocation;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPayPalEmail the inPayPalEmail to set
    */
    public void setInPayPalEmail(String inPayPalEmail) {
        this.inParameters.add("payPalEmail");
        this.inPayPalEmail = inPayPalEmail;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentAmEx the inPaymentAmEx to set
    */
    public void setInPaymentAmEx(String inPaymentAmEx) {
        this.inParameters.add("paymentAmEx");
        this.inPaymentAmEx = inPaymentAmEx;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentCCAccepted the inPaymentCCAccepted to set
    */
    public void setInPaymentCCAccepted(String inPaymentCCAccepted) {
        this.inParameters.add("paymentCCAccepted");
        this.inPaymentCCAccepted = inPaymentCCAccepted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentCOD the inPaymentCOD to set
    */
    public void setInPaymentCOD(String inPaymentCOD) {
        this.inParameters.add("paymentCOD");
        this.inPaymentCOD = inPaymentCOD;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentCODPrePayDelivery the inPaymentCODPrePayDelivery to set
    */
    public void setInPaymentCODPrePayDelivery(String inPaymentCODPrePayDelivery) {
        this.inParameters.add("paymentCODPrePayDelivery");
        this.inPaymentCODPrePayDelivery = inPaymentCODPrePayDelivery;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentCashInPerson the inPaymentCashInPerson to set
    */
    public void setInPaymentCashInPerson(String inPaymentCashInPerson) {
        this.inParameters.add("paymentCashInPerson");
        this.inPaymentCashInPerson = inPaymentCashInPerson;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentCashOnPickup the inPaymentCashOnPickup to set
    */
    public void setInPaymentCashOnPickup(String inPaymentCashOnPickup) {
        this.inParameters.add("paymentCashOnPickup");
        this.inPaymentCashOnPickup = inPaymentCashOnPickup;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentDiscover the inPaymentDiscover to set
    */
    public void setInPaymentDiscover(String inPaymentDiscover) {
        this.inParameters.add("paymentDiscover");
        this.inPaymentDiscover = inPaymentDiscover;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentMOCC the inPaymentMOCC to set
    */
    public void setInPaymentMOCC(String inPaymentMOCC) {
        this.inParameters.add("paymentMOCC");
        this.inPaymentMOCC = inPaymentMOCC;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentMoneyXferAccepted the inPaymentMoneyXferAccepted to set
    */
    public void setInPaymentMoneyXferAccepted(String inPaymentMoneyXferAccepted) {
        this.inParameters.add("paymentMoneyXferAccepted");
        this.inPaymentMoneyXferAccepted = inPaymentMoneyXferAccepted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentPayPal the inPaymentPayPal to set
    */
    public void setInPaymentPayPal(String inPaymentPayPal) {
        this.inParameters.add("paymentPayPal");
        this.inPaymentPayPal = inPaymentPayPal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentPersonalCheck the inPaymentPersonalCheck to set
    */
    public void setInPaymentPersonalCheck(String inPaymentPersonalCheck) {
        this.inParameters.add("paymentPersonalCheck");
        this.inPaymentPersonalCheck = inPaymentPersonalCheck;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentVisaMC the inPaymentVisaMC to set
    */
    public void setInPaymentVisaMC(String inPaymentVisaMC) {
        this.inParameters.add("paymentVisaMC");
        this.inPaymentVisaMC = inPaymentVisaMC;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inQuantity the inQuantity to set
    */
    public void setInQuantity(String inQuantity) {
        this.inParameters.add("quantity");
        this.inQuantity = inQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inSelectResult the inSelectResult to set
    */
    public void setInSelectResult(List inSelectResult) {
        this.inParameters.add("selectResult");
        this.inSelectResult = inSelectResult;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inStartPrice the inStartPrice to set
    */
    public void setInStartPrice(String inStartPrice) {
        this.inParameters.add("startPrice");
        this.inStartPrice = inStartPrice;
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
        if (inParameters.contains("country")) mapValue.put("country", getInCountry());
        if (inParameters.contains("ebayCategory")) mapValue.put("ebayCategory", getInEbayCategory());
        if (inParameters.contains("listingDuration")) mapValue.put("listingDuration", getInListingDuration());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("location")) mapValue.put("location", getInLocation());
        if (inParameters.contains("payPalEmail")) mapValue.put("payPalEmail", getInPayPalEmail());
        if (inParameters.contains("paymentAmEx")) mapValue.put("paymentAmEx", getInPaymentAmEx());
        if (inParameters.contains("paymentCCAccepted")) mapValue.put("paymentCCAccepted", getInPaymentCCAccepted());
        if (inParameters.contains("paymentCOD")) mapValue.put("paymentCOD", getInPaymentCOD());
        if (inParameters.contains("paymentCODPrePayDelivery")) mapValue.put("paymentCODPrePayDelivery", getInPaymentCODPrePayDelivery());
        if (inParameters.contains("paymentCashInPerson")) mapValue.put("paymentCashInPerson", getInPaymentCashInPerson());
        if (inParameters.contains("paymentCashOnPickup")) mapValue.put("paymentCashOnPickup", getInPaymentCashOnPickup());
        if (inParameters.contains("paymentDiscover")) mapValue.put("paymentDiscover", getInPaymentDiscover());
        if (inParameters.contains("paymentMOCC")) mapValue.put("paymentMOCC", getInPaymentMOCC());
        if (inParameters.contains("paymentMoneyXferAccepted")) mapValue.put("paymentMoneyXferAccepted", getInPaymentMoneyXferAccepted());
        if (inParameters.contains("paymentPayPal")) mapValue.put("paymentPayPal", getInPaymentPayPal());
        if (inParameters.contains("paymentPersonalCheck")) mapValue.put("paymentPersonalCheck", getInPaymentPersonalCheck());
        if (inParameters.contains("paymentVisaMC")) mapValue.put("paymentVisaMC", getInPaymentVisaMC());
        if (inParameters.contains("quantity")) mapValue.put("quantity", getInQuantity());
        if (inParameters.contains("selectResult")) mapValue.put("selectResult", getInSelectResult());
        if (inParameters.contains("startPrice")) mapValue.put("startPrice", getInStartPrice());
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
        if (mapValue.containsKey("country")) setInCountry((String) mapValue.get("country"));
        if (mapValue.containsKey("ebayCategory")) setInEbayCategory((String) mapValue.get("ebayCategory"));
        if (mapValue.containsKey("listingDuration")) setInListingDuration((String) mapValue.get("listingDuration"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("location")) setInLocation((String) mapValue.get("location"));
        if (mapValue.containsKey("payPalEmail")) setInPayPalEmail((String) mapValue.get("payPalEmail"));
        if (mapValue.containsKey("paymentAmEx")) setInPaymentAmEx((String) mapValue.get("paymentAmEx"));
        if (mapValue.containsKey("paymentCCAccepted")) setInPaymentCCAccepted((String) mapValue.get("paymentCCAccepted"));
        if (mapValue.containsKey("paymentCOD")) setInPaymentCOD((String) mapValue.get("paymentCOD"));
        if (mapValue.containsKey("paymentCODPrePayDelivery")) setInPaymentCODPrePayDelivery((String) mapValue.get("paymentCODPrePayDelivery"));
        if (mapValue.containsKey("paymentCashInPerson")) setInPaymentCashInPerson((String) mapValue.get("paymentCashInPerson"));
        if (mapValue.containsKey("paymentCashOnPickup")) setInPaymentCashOnPickup((String) mapValue.get("paymentCashOnPickup"));
        if (mapValue.containsKey("paymentDiscover")) setInPaymentDiscover((String) mapValue.get("paymentDiscover"));
        if (mapValue.containsKey("paymentMOCC")) setInPaymentMOCC((String) mapValue.get("paymentMOCC"));
        if (mapValue.containsKey("paymentMoneyXferAccepted")) setInPaymentMoneyXferAccepted((String) mapValue.get("paymentMoneyXferAccepted"));
        if (mapValue.containsKey("paymentPayPal")) setInPaymentPayPal((String) mapValue.get("paymentPayPal"));
        if (mapValue.containsKey("paymentPersonalCheck")) setInPaymentPersonalCheck((String) mapValue.get("paymentPersonalCheck"));
        if (mapValue.containsKey("paymentVisaMC")) setInPaymentVisaMC((String) mapValue.get("paymentVisaMC"));
        if (mapValue.containsKey("quantity")) setInQuantity((String) mapValue.get("quantity"));
        if (mapValue.containsKey("selectResult")) setInSelectResult((List) mapValue.get("selectResult"));
        if (mapValue.containsKey("startPrice")) setInStartPrice((String) mapValue.get("startPrice"));
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
     * Construct a <code>ExportToEbayService</code> from the input values of the given <code>ExportToEbayService</code>.
     * @param input a <code>ExportToEbayService</code>
     */
    public static ExportToEbayService fromInput(ExportToEbayService input) {
        ExportToEbayService service = new ExportToEbayService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>ExportToEbayService</code> from the output values of the given <code>ExportToEbayService</code>.
     * @param output a <code>ExportToEbayService</code>
     */
    public static ExportToEbayService fromOutput(ExportToEbayService output) {
        ExportToEbayService service = new ExportToEbayService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>ExportToEbayService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static ExportToEbayService fromInput(Map<String, Object> mapValue) {
        ExportToEbayService service = new ExportToEbayService();
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
     * Construct a <code>ExportToEbayService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static ExportToEbayService fromOutput(Map<String, Object> mapValue) {
        ExportToEbayService service = new ExportToEbayService();
        service.putAllOutput(mapValue);
        return service;
    }
}
