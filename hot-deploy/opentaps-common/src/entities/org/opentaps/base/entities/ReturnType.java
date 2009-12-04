package org.opentaps.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ReturnType.
 */
@javax.persistence.Entity
@Table(name="RETURN_TYPE")
public class ReturnType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("returnTypeId", "RETURN_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("sequenceId", "SEQUENCE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ReturnType", fields);
}
  public static enum Fields implements EntityFieldInterface<ReturnType> {
    returnTypeId("returnTypeId"),
    description("description"),
    sequenceId("sequenceId"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="ReturnType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ReturnType_GEN")
   @Id
   @Column(name="RETURN_TYPE_ID")
   private String returnTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="SEQUENCE_ID")
   private String sequenceId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_TYPE_ID")
   
   private List<ReturnAdjustment> returnAdjustments = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_TYPE_ID")
   
   private List<ReturnItem> returnItems = null;

  /**
   * Default constructor.
   */
  public ReturnType() {
      super();
      this.baseEntityName = "ReturnType";
      this.isView = false;
      this.resourceName = "OrderEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("returnTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("returnTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("sequenceId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ReturnType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param returnTypeId the returnTypeId to set
     */
    public void setReturnTypeId(String returnTypeId) {
        this.returnTypeId = returnTypeId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param sequenceId the sequenceId to set
     */
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnTypeId() {
        return this.returnTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSequenceId() {
        return this.sequenceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>ReturnAdjustment</code> by the relation named <code>ReturnAdjustment</code>.
     * @return the list of <code>ReturnAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnAdjustment> getReturnAdjustments() throws RepositoryException {
        if (this.returnAdjustments == null) {
            this.returnAdjustments = getRelated(ReturnAdjustment.class, "ReturnAdjustment");
        }
        return this.returnAdjustments;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItem</code> by the relation named <code>ReturnItem</code>.
     * @return the list of <code>ReturnItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItem> getReturnItems() throws RepositoryException {
        if (this.returnItems == null) {
            this.returnItems = getRelated(ReturnItem.class, "ReturnItem");
        }
        return this.returnItems;
    }

    /**
     * Auto generated value setter.
     * @param returnAdjustments the returnAdjustments to set
    */
    public void setReturnAdjustments(List<ReturnAdjustment> returnAdjustments) {
        this.returnAdjustments = returnAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param returnItems the returnItems to set
    */
    public void setReturnItems(List<ReturnItem> returnItems) {
        this.returnItems = returnItems;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setReturnTypeId((String) mapValue.get("returnTypeId"));
        setDescription((String) mapValue.get("description"));
        setSequenceId((String) mapValue.get("sequenceId"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("returnTypeId", getReturnTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("sequenceId", getSequenceId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}