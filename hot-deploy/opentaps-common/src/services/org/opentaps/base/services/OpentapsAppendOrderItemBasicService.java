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
 * Add an item to an existing order without re-calculating the rest of the order.
 * Auto generated base service entity opentaps.appendOrderItemBasic.
 *
 * Engine: java
 * Location: org.opentaps.common.order.OrderServices
 * Invoke: appendOrderItemBasic
 * Defined in: hot-deploy/opentaps-common/servicedef/services_orders.xml
 */
public class OpentapsAppendOrderItemBasicService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "opentaps.appendOrderItemBasic";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        amount("amount"),
        comments("comments"),
        correspondingPoId("correspondingPoId"),
        isSalePrice("isSalePrice"),
        listPrice("listPrice"),
        locale("locale"),
        orderId("orderId"),
        prodCatalogId("prodCatalogId"),
        productId("productId"),
        quantity("quantity"),
        shipGroupSeqId("shipGroupSeqId"),
        surveyResponseId("surveyResponseId"),
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
        timeZone("timeZone"),
        unitPrice("unitPrice"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        orderId("orderId"),
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
     * Creates a new <code>OpentapsAppendOrderItemBasicService</code> instance.
     */
    public OpentapsAppendOrderItemBasicService() {
        super();
    }

    /**
     * Creates a new <code>OpentapsAppendOrderItemBasicService</code> instance.
     * @param user an <code>User</code> value
     */
    public OpentapsAppendOrderItemBasicService(User user) {
        super(user);
    }

    private BigDecimal inAmount;
    private String inComments;
    private String inCorrespondingPoId;
    private Boolean inIsSalePrice;
    private BigDecimal inListPrice;
    private Locale inLocale;
    private String inOrderId;
    private String inProdCatalogId;
    private String inProductId;
    private BigDecimal inQuantity;
    private String inShipGroupSeqId;
    private String inSurveyResponseId;
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
    private TimeZone inTimeZone;
    private BigDecimal inUnitPrice;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outOrderId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAmount() {
        return this.inAmount;
    }
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
     * @return <code>String</code>
     */
    public String getInCorrespondingPoId() {
        return this.inCorrespondingPoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getInIsSalePrice() {
        return this.inIsSalePrice;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInListPrice() {
        return this.inListPrice;
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
    public String getInOrderId() {
        return this.inOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProdCatalogId() {
        return this.inProdCatalogId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductId() {
        return this.inProductId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInQuantity() {
        return this.inQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipGroupSeqId() {
        return this.inShipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSurveyResponseId() {
        return this.inSurveyResponseId;
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
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInUnitPrice() {
        return this.inUnitPrice;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutOrderId() {
        return this.outOrderId;
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
     * @param inAmount the inAmount to set
    */
    public void setInAmount(BigDecimal inAmount) {
        this.inParameters.add("amount");
        this.inAmount = inAmount;
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
     * @param inCorrespondingPoId the inCorrespondingPoId to set
    */
    public void setInCorrespondingPoId(String inCorrespondingPoId) {
        this.inParameters.add("correspondingPoId");
        this.inCorrespondingPoId = inCorrespondingPoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsSalePrice the inIsSalePrice to set
    */
    public void setInIsSalePrice(Boolean inIsSalePrice) {
        this.inParameters.add("isSalePrice");
        this.inIsSalePrice = inIsSalePrice;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inListPrice the inListPrice to set
    */
    public void setInListPrice(BigDecimal inListPrice) {
        this.inParameters.add("listPrice");
        this.inListPrice = inListPrice;
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
     * @param inOrderId the inOrderId to set
    */
    public void setInOrderId(String inOrderId) {
        this.inParameters.add("orderId");
        this.inOrderId = inOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProdCatalogId the inProdCatalogId to set
    */
    public void setInProdCatalogId(String inProdCatalogId) {
        this.inParameters.add("prodCatalogId");
        this.inProdCatalogId = inProdCatalogId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductId the inProductId to set
    */
    public void setInProductId(String inProductId) {
        this.inParameters.add("productId");
        this.inProductId = inProductId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inQuantity the inQuantity to set
    */
    public void setInQuantity(BigDecimal inQuantity) {
        this.inParameters.add("quantity");
        this.inQuantity = inQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipGroupSeqId the inShipGroupSeqId to set
    */
    public void setInShipGroupSeqId(String inShipGroupSeqId) {
        this.inParameters.add("shipGroupSeqId");
        this.inShipGroupSeqId = inShipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSurveyResponseId the inSurveyResponseId to set
    */
    public void setInSurveyResponseId(String inSurveyResponseId) {
        this.inParameters.add("surveyResponseId");
        this.inSurveyResponseId = inSurveyResponseId;
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
     * @param inUnitPrice the inUnitPrice to set
    */
    public void setInUnitPrice(BigDecimal inUnitPrice) {
        this.inParameters.add("unitPrice");
        this.inUnitPrice = inUnitPrice;
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
     * This parameter is required.
     * @param outOrderId the outOrderId to set
    */
    public void setOutOrderId(String outOrderId) {
        this.outParameters.add("orderId");
        this.outOrderId = outOrderId;
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
        if (inParameters.contains("amount")) mapValue.put("amount", getInAmount());
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("correspondingPoId")) mapValue.put("correspondingPoId", getInCorrespondingPoId());
        if (inParameters.contains("isSalePrice")) mapValue.put("isSalePrice", getInIsSalePrice());
        if (inParameters.contains("listPrice")) mapValue.put("listPrice", getInListPrice());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("prodCatalogId")) mapValue.put("prodCatalogId", getInProdCatalogId());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("quantity")) mapValue.put("quantity", getInQuantity());
        if (inParameters.contains("shipGroupSeqId")) mapValue.put("shipGroupSeqId", getInShipGroupSeqId());
        if (inParameters.contains("surveyResponseId")) mapValue.put("surveyResponseId", getInSurveyResponseId());
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
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("unitPrice")) mapValue.put("unitPrice", getInUnitPrice());
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
        if (outParameters.contains("orderId")) mapValue.put("orderId", getOutOrderId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("amount")) setInAmount((BigDecimal) mapValue.get("amount"));
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("correspondingPoId")) setInCorrespondingPoId((String) mapValue.get("correspondingPoId"));
        if (mapValue.containsKey("isSalePrice")) setInIsSalePrice((Boolean) mapValue.get("isSalePrice"));
        if (mapValue.containsKey("listPrice")) setInListPrice((BigDecimal) mapValue.get("listPrice"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("prodCatalogId")) setInProdCatalogId((String) mapValue.get("prodCatalogId"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("quantity")) setInQuantity((BigDecimal) mapValue.get("quantity"));
        if (mapValue.containsKey("shipGroupSeqId")) setInShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        if (mapValue.containsKey("surveyResponseId")) setInSurveyResponseId((String) mapValue.get("surveyResponseId"));
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
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("unitPrice")) setInUnitPrice((BigDecimal) mapValue.get("unitPrice"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setOutOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>OpentapsAppendOrderItemBasicService</code> from the input values of the given <code>OpentapsAppendOrderItemBasicService</code>.
     * @param input a <code>OpentapsAppendOrderItemBasicService</code>
     */
    public static OpentapsAppendOrderItemBasicService fromInput(OpentapsAppendOrderItemBasicService input) {
        OpentapsAppendOrderItemBasicService service = new OpentapsAppendOrderItemBasicService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>OpentapsAppendOrderItemBasicService</code> from the output values of the given <code>OpentapsAppendOrderItemBasicService</code>.
     * @param output a <code>OpentapsAppendOrderItemBasicService</code>
     */
    public static OpentapsAppendOrderItemBasicService fromOutput(OpentapsAppendOrderItemBasicService output) {
        OpentapsAppendOrderItemBasicService service = new OpentapsAppendOrderItemBasicService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>OpentapsAppendOrderItemBasicService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static OpentapsAppendOrderItemBasicService fromInput(Map<String, Object> mapValue) {
        OpentapsAppendOrderItemBasicService service = new OpentapsAppendOrderItemBasicService();
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
     * Construct a <code>OpentapsAppendOrderItemBasicService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static OpentapsAppendOrderItemBasicService fromOutput(Map<String, Object> mapValue) {
        OpentapsAppendOrderItemBasicService service = new OpentapsAppendOrderItemBasicService();
        service.putAllOutput(mapValue);
        return service;
    }
}
