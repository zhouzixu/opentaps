package org.opentaps.domain.base.services;

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

import org.opentaps.foundation.infrastructure.InfrastructureException;
import org.opentaps.foundation.service.ServiceWrapperWithAuth;

import java.nio.ByteBuffer;
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
 * .
 * Auto generated base service entity addAdditionalViewForProduct.
 *
 * Engine: java
 * Location: org.ofbiz.product.product.ProductServices
 * Invoke: addAdditionalViewForProduct
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/product/servicedef/services.xml
 */
public class AddAdditionalViewForProductService extends ServiceWrapperWithAuth {

    /** The service name as used by the service engine. */
    public static final String NAME = "addAdditionalViewForProduct";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        uploadedFileContentType("_uploadedFile_contentType"),
        uploadedFileFileName("_uploadedFile_fileName"),
        contentId("contentId"),
        fromDate("fromDate"),
        locale("locale"),
        productContentTypeId("productContentTypeId"),
        productId("productId"),
        purchaseFromDate("purchaseFromDate"),
        purchaseThruDate("purchaseThruDate"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        uploadedFile("uploadedFile"),
        useCountLimit("useCountLimit"),
        useRoleTypeId("useRoleTypeId"),
        useTime("useTime"),
        useTimeUomId("useTimeUomId"),
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
     * Creates a new <code>AddAdditionalViewForProductService</code> instance.
     */
    public AddAdditionalViewForProductService() {
        super();
    }

    /**
     * Creates a new <code>AddAdditionalViewForProductService</code> instance.
     * @param user an <code>User</code> value
     */
    public AddAdditionalViewForProductService(User user) {
        super(user);
    }

    private String inUploadedFileContentType;
    private String inUploadedFileFileName;
    private String inContentId;
    private Timestamp inFromDate;
    private Locale inLocale;
    private String inProductContentTypeId;
    private String inProductId;
    private Timestamp inPurchaseFromDate;
    private Timestamp inPurchaseThruDate;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private ByteBuffer inUploadedFile;
    private Long inUseCountLimit;
    private String inUseRoleTypeId;
    private Long inUseTime;
    private String inUseTimeUomId;
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
    public String getInUploadedFileContentType() {
        return this.inUploadedFileContentType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUploadedFileFileName() {
        return this.inUploadedFileFileName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContentId() {
        return this.inContentId;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductContentTypeId() {
        return this.inProductContentTypeId;
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
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInPurchaseFromDate() {
        return this.inPurchaseFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInPurchaseThruDate() {
        return this.inPurchaseThruDate;
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
     * @return <code>ByteBuffer</code>
     */
    public ByteBuffer getInUploadedFile() {
        return this.inUploadedFile;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInUseCountLimit() {
        return this.inUseCountLimit;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUseRoleTypeId() {
        return this.inUseRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInUseTime() {
        return this.inUseTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUseTimeUomId() {
        return this.inUseTimeUomId;
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
     * @param inUploadedFileContentType the inUploadedFileContentType to set
    */
    public void setInUploadedFileContentType(String inUploadedFileContentType) {
        this.inParameters.add("_uploadedFile_contentType");
        this.inUploadedFileContentType = inUploadedFileContentType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUploadedFileFileName the inUploadedFileFileName to set
    */
    public void setInUploadedFileFileName(String inUploadedFileFileName) {
        this.inParameters.add("_uploadedFile_fileName");
        this.inUploadedFileFileName = inUploadedFileFileName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentId the inContentId to set
    */
    public void setInContentId(String inContentId) {
        this.inParameters.add("contentId");
        this.inContentId = inContentId;
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
     * This parameter is required.
     * @param inProductContentTypeId the inProductContentTypeId to set
    */
    public void setInProductContentTypeId(String inProductContentTypeId) {
        this.inParameters.add("productContentTypeId");
        this.inProductContentTypeId = inProductContentTypeId;
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
     * This parameter is optional.
     * @param inPurchaseFromDate the inPurchaseFromDate to set
    */
    public void setInPurchaseFromDate(Timestamp inPurchaseFromDate) {
        this.inParameters.add("purchaseFromDate");
        this.inPurchaseFromDate = inPurchaseFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPurchaseThruDate the inPurchaseThruDate to set
    */
    public void setInPurchaseThruDate(Timestamp inPurchaseThruDate) {
        this.inParameters.add("purchaseThruDate");
        this.inPurchaseThruDate = inPurchaseThruDate;
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
     * @param inUploadedFile the inUploadedFile to set
    */
    public void setInUploadedFile(ByteBuffer inUploadedFile) {
        this.inParameters.add("uploadedFile");
        this.inUploadedFile = inUploadedFile;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseCountLimit the inUseCountLimit to set
    */
    public void setInUseCountLimit(Long inUseCountLimit) {
        this.inParameters.add("useCountLimit");
        this.inUseCountLimit = inUseCountLimit;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseRoleTypeId the inUseRoleTypeId to set
    */
    public void setInUseRoleTypeId(String inUseRoleTypeId) {
        this.inParameters.add("useRoleTypeId");
        this.inUseRoleTypeId = inUseRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseTime the inUseTime to set
    */
    public void setInUseTime(Long inUseTime) {
        this.inParameters.add("useTime");
        this.inUseTime = inUseTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseTimeUomId the inUseTimeUomId to set
    */
    public void setInUseTimeUomId(String inUseTimeUomId) {
        this.inParameters.add("useTimeUomId");
        this.inUseTimeUomId = inUseTimeUomId;
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
        if (inParameters.contains("_uploadedFile_contentType")) mapValue.put("_uploadedFile_contentType", getInUploadedFileContentType());
        if (inParameters.contains("_uploadedFile_fileName")) mapValue.put("_uploadedFile_fileName", getInUploadedFileFileName());
        if (inParameters.contains("contentId")) mapValue.put("contentId", getInContentId());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("productContentTypeId")) mapValue.put("productContentTypeId", getInProductContentTypeId());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("purchaseFromDate")) mapValue.put("purchaseFromDate", getInPurchaseFromDate());
        if (inParameters.contains("purchaseThruDate")) mapValue.put("purchaseThruDate", getInPurchaseThruDate());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("uploadedFile")) mapValue.put("uploadedFile", getInUploadedFile());
        if (inParameters.contains("useCountLimit")) mapValue.put("useCountLimit", getInUseCountLimit());
        if (inParameters.contains("useRoleTypeId")) mapValue.put("useRoleTypeId", getInUseRoleTypeId());
        if (inParameters.contains("useTime")) mapValue.put("useTime", getInUseTime());
        if (inParameters.contains("useTimeUomId")) mapValue.put("useTimeUomId", getInUseTimeUomId());
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
        if (mapValue.containsKey("_uploadedFile_contentType")) setInUploadedFileContentType((String) mapValue.get("_uploadedFile_contentType"));
        if (mapValue.containsKey("_uploadedFile_fileName")) setInUploadedFileFileName((String) mapValue.get("_uploadedFile_fileName"));
        if (mapValue.containsKey("contentId")) setInContentId((String) mapValue.get("contentId"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("productContentTypeId")) setInProductContentTypeId((String) mapValue.get("productContentTypeId"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("purchaseFromDate")) setInPurchaseFromDate((Timestamp) mapValue.get("purchaseFromDate"));
        if (mapValue.containsKey("purchaseThruDate")) setInPurchaseThruDate((Timestamp) mapValue.get("purchaseThruDate"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("uploadedFile")) setInUploadedFile((ByteBuffer) mapValue.get("uploadedFile"));
        if (mapValue.containsKey("useCountLimit")) setInUseCountLimit((Long) mapValue.get("useCountLimit"));
        if (mapValue.containsKey("useRoleTypeId")) setInUseRoleTypeId((String) mapValue.get("useRoleTypeId"));
        if (mapValue.containsKey("useTime")) setInUseTime((Long) mapValue.get("useTime"));
        if (mapValue.containsKey("useTimeUomId")) setInUseTimeUomId((String) mapValue.get("useTimeUomId"));
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
     * Construct a <code>AddAdditionalViewForProductService</code> from the input values of the given <code>AddAdditionalViewForProductService</code>.
     * @param input a <code>AddAdditionalViewForProductService</code>
     */
    public static AddAdditionalViewForProductService fromInput(AddAdditionalViewForProductService input) {
        AddAdditionalViewForProductService service = new AddAdditionalViewForProductService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>AddAdditionalViewForProductService</code> from the output values of the given <code>AddAdditionalViewForProductService</code>.
     * @param output a <code>AddAdditionalViewForProductService</code>
     */
    public static AddAdditionalViewForProductService fromOutput(AddAdditionalViewForProductService output) {
        AddAdditionalViewForProductService service = new AddAdditionalViewForProductService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>AddAdditionalViewForProductService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static AddAdditionalViewForProductService fromInput(Map<String, Object> mapValue) {
        AddAdditionalViewForProductService service = new AddAdditionalViewForProductService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            try {
                service.setUser(new User(userGv, userGv.getDelegator()));
            } catch (InfrastructureException e) {
                // this may happen if the user login is null
            }
        }
        return service;
    }

    /**
     * Construct a <code>AddAdditionalViewForProductService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static AddAdditionalViewForProductService fromOutput(Map<String, Object> mapValue) {
        AddAdditionalViewForProductService service = new AddAdditionalViewForProductService();
        service.putAllOutput(mapValue);
        return service;
    }
}