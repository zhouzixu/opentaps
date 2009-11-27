package org.opentaps.domain.base.entities;

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
 * Auto generated base entity NoteData.
 */
@javax.persistence.Entity
@Table(name="NOTE_DATA")
public class NoteData extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("noteId", "NOTE_ID");
        fields.put("noteName", "NOTE_NAME");
        fields.put("noteInfo", "NOTE_INFO");
        fields.put("noteDateTime", "NOTE_DATE_TIME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
        fields.put("noteParty", "NOTE_PARTY");
fieldMapColumns.put("NoteData", fields);
}
  public static enum Fields implements EntityFieldInterface<NoteData> {
    noteId("noteId"),
    noteName("noteName"),
    noteInfo("noteInfo"),
    noteDateTime("noteDateTime"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp"),
    noteParty("noteParty");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="NoteData_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="NoteData_GEN")
   @Id
   @Column(name="NOTE_ID")
   private String noteId;
   @Column(name="NOTE_NAME")
   private String noteName;
   @Column(name="NOTE_INFO")
   private String noteInfo;
   @Column(name="NOTE_DATE_TIME")
   private Timestamp noteDateTime;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @Column(name="NOTE_PARTY")
   private String noteParty;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="NOTE_PARTY", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party relatedNoteParty = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="noteData", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="NOTE_ID")
   
   private List<CustRequestItemNote> custRequestItemNotes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="noteData", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="NOTE_ID")
   
   private List<CustRequestNote> custRequestNotes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="noteData", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="NOTE_ID")
   
   private List<MarketingCampaignNote> marketingCampaignNotes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="noteData", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="NOTE_ID")
   
   private List<OrderHeaderNote> orderHeaderNotes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="noteData", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="NOTE_ID")
   
   private List<PartyNote> partyNotes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="noteData", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="NOTE_ID")
   
   private List<QuoteNote> quoteNotes = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="NOTE_ID")
   
   private List<WorkEffort> workEfforts = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="noteData", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="NOTE_ID")
   
   private List<WorkEffortNote> workEffortNotes = null;

  /**
   * Default constructor.
   */
  public NoteData() {
      super();
      this.baseEntityName = "NoteData";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("noteId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("noteId");this.allFieldsNames.add("noteName");this.allFieldsNames.add("noteInfo");this.allFieldsNames.add("noteDateTime");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");this.allFieldsNames.add("noteParty");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public NoteData(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param noteId the noteId to set
     */
    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
    /**
     * Auto generated value setter.
     * @param noteName the noteName to set
     */
    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }
    /**
     * Auto generated value setter.
     * @param noteInfo the noteInfo to set
     */
    public void setNoteInfo(String noteInfo) {
        this.noteInfo = noteInfo;
    }
    /**
     * Auto generated value setter.
     * @param noteDateTime the noteDateTime to set
     */
    public void setNoteDateTime(Timestamp noteDateTime) {
        this.noteDateTime = noteDateTime;
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
     * Auto generated value setter.
     * @param noteParty the noteParty to set
     */
    public void setNoteParty(String noteParty) {
        this.noteParty = noteParty;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteId() {
        return this.noteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteName() {
        return this.noteName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteInfo() {
        return this.noteInfo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getNoteDateTime() {
        return this.noteDateTime;
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
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteParty() {
        return this.noteParty;
    }

    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>NoteParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getRelatedNoteParty() throws RepositoryException {
        if (this.relatedNoteParty == null) {
            this.relatedNoteParty = getRelatedOne(Party.class, "NoteParty");
        }
        return this.relatedNoteParty;
    }
    /**
     * Auto generated method that gets the related <code>CustRequestItemNote</code> by the relation named <code>CustRequestItemNote</code>.
     * @return the list of <code>CustRequestItemNote</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CustRequestItemNote> getCustRequestItemNotes() throws RepositoryException {
        if (this.custRequestItemNotes == null) {
            this.custRequestItemNotes = getRelated(CustRequestItemNote.class, "CustRequestItemNote");
        }
        return this.custRequestItemNotes;
    }
    /**
     * Auto generated method that gets the related <code>CustRequestNote</code> by the relation named <code>CustRequestNote</code>.
     * @return the list of <code>CustRequestNote</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CustRequestNote> getCustRequestNotes() throws RepositoryException {
        if (this.custRequestNotes == null) {
            this.custRequestNotes = getRelated(CustRequestNote.class, "CustRequestNote");
        }
        return this.custRequestNotes;
    }
    /**
     * Auto generated method that gets the related <code>MarketingCampaignNote</code> by the relation named <code>MarketingCampaignNote</code>.
     * @return the list of <code>MarketingCampaignNote</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MarketingCampaignNote> getMarketingCampaignNotes() throws RepositoryException {
        if (this.marketingCampaignNotes == null) {
            this.marketingCampaignNotes = getRelated(MarketingCampaignNote.class, "MarketingCampaignNote");
        }
        return this.marketingCampaignNotes;
    }
    /**
     * Auto generated method that gets the related <code>OrderHeaderNote</code> by the relation named <code>OrderHeaderNote</code>.
     * @return the list of <code>OrderHeaderNote</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderHeaderNote> getOrderHeaderNotes() throws RepositoryException {
        if (this.orderHeaderNotes == null) {
            this.orderHeaderNotes = getRelated(OrderHeaderNote.class, "OrderHeaderNote");
        }
        return this.orderHeaderNotes;
    }
    /**
     * Auto generated method that gets the related <code>PartyNote</code> by the relation named <code>PartyNote</code>.
     * @return the list of <code>PartyNote</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyNote> getPartyNotes() throws RepositoryException {
        if (this.partyNotes == null) {
            this.partyNotes = getRelated(PartyNote.class, "PartyNote");
        }
        return this.partyNotes;
    }
    /**
     * Auto generated method that gets the related <code>QuoteNote</code> by the relation named <code>QuoteNote</code>.
     * @return the list of <code>QuoteNote</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends QuoteNote> getQuoteNotes() throws RepositoryException {
        if (this.quoteNotes == null) {
            this.quoteNotes = getRelated(QuoteNote.class, "QuoteNote");
        }
        return this.quoteNotes;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the list of <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffort> getWorkEfforts() throws RepositoryException {
        if (this.workEfforts == null) {
            this.workEfforts = getRelated(WorkEffort.class, "WorkEffort");
        }
        return this.workEfforts;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortNote</code> by the relation named <code>WorkEffortNote</code>.
     * @return the list of <code>WorkEffortNote</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortNote> getWorkEffortNotes() throws RepositoryException {
        if (this.workEffortNotes == null) {
            this.workEffortNotes = getRelated(WorkEffortNote.class, "WorkEffortNote");
        }
        return this.workEffortNotes;
    }

    /**
     * Auto generated value setter.
     * @param relatedNoteParty the relatedNoteParty to set
    */
    public void setRelatedNoteParty(Party relatedNoteParty) {
        this.relatedNoteParty = relatedNoteParty;
    }
    /**
     * Auto generated value setter.
     * @param custRequestItemNotes the custRequestItemNotes to set
    */
    public void setCustRequestItemNotes(List<CustRequestItemNote> custRequestItemNotes) {
        this.custRequestItemNotes = custRequestItemNotes;
    }
    /**
     * Auto generated value setter.
     * @param custRequestNotes the custRequestNotes to set
    */
    public void setCustRequestNotes(List<CustRequestNote> custRequestNotes) {
        this.custRequestNotes = custRequestNotes;
    }
    /**
     * Auto generated value setter.
     * @param marketingCampaignNotes the marketingCampaignNotes to set
    */
    public void setMarketingCampaignNotes(List<MarketingCampaignNote> marketingCampaignNotes) {
        this.marketingCampaignNotes = marketingCampaignNotes;
    }
    /**
     * Auto generated value setter.
     * @param orderHeaderNotes the orderHeaderNotes to set
    */
    public void setOrderHeaderNotes(List<OrderHeaderNote> orderHeaderNotes) {
        this.orderHeaderNotes = orderHeaderNotes;
    }
    /**
     * Auto generated value setter.
     * @param partyNotes the partyNotes to set
    */
    public void setPartyNotes(List<PartyNote> partyNotes) {
        this.partyNotes = partyNotes;
    }
    /**
     * Auto generated value setter.
     * @param quoteNotes the quoteNotes to set
    */
    public void setQuoteNotes(List<QuoteNote> quoteNotes) {
        this.quoteNotes = quoteNotes;
    }
    /**
     * Auto generated value setter.
     * @param workEfforts the workEfforts to set
    */
    public void setWorkEfforts(List<WorkEffort> workEfforts) {
        this.workEfforts = workEfforts;
    }
    /**
     * Auto generated value setter.
     * @param workEffortNotes the workEffortNotes to set
    */
    public void setWorkEffortNotes(List<WorkEffortNote> workEffortNotes) {
        this.workEffortNotes = workEffortNotes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addCustRequestItemNote(CustRequestItemNote custRequestItemNote) {
        if (this.custRequestItemNotes == null) {
            this.custRequestItemNotes = new ArrayList<CustRequestItemNote>();
        }
        this.custRequestItemNotes.add(custRequestItemNote);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeCustRequestItemNote(CustRequestItemNote custRequestItemNote) {
        if (this.custRequestItemNotes == null) {
            return;
        }
        this.custRequestItemNotes.remove(custRequestItemNote);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearCustRequestItemNote() {
        if (this.custRequestItemNotes == null) {
            return;
        }
        this.custRequestItemNotes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addCustRequestNote(CustRequestNote custRequestNote) {
        if (this.custRequestNotes == null) {
            this.custRequestNotes = new ArrayList<CustRequestNote>();
        }
        this.custRequestNotes.add(custRequestNote);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeCustRequestNote(CustRequestNote custRequestNote) {
        if (this.custRequestNotes == null) {
            return;
        }
        this.custRequestNotes.remove(custRequestNote);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearCustRequestNote() {
        if (this.custRequestNotes == null) {
            return;
        }
        this.custRequestNotes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addMarketingCampaignNote(MarketingCampaignNote marketingCampaignNote) {
        if (this.marketingCampaignNotes == null) {
            this.marketingCampaignNotes = new ArrayList<MarketingCampaignNote>();
        }
        this.marketingCampaignNotes.add(marketingCampaignNote);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeMarketingCampaignNote(MarketingCampaignNote marketingCampaignNote) {
        if (this.marketingCampaignNotes == null) {
            return;
        }
        this.marketingCampaignNotes.remove(marketingCampaignNote);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearMarketingCampaignNote() {
        if (this.marketingCampaignNotes == null) {
            return;
        }
        this.marketingCampaignNotes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addOrderHeaderNote(OrderHeaderNote orderHeaderNote) {
        if (this.orderHeaderNotes == null) {
            this.orderHeaderNotes = new ArrayList<OrderHeaderNote>();
        }
        this.orderHeaderNotes.add(orderHeaderNote);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeOrderHeaderNote(OrderHeaderNote orderHeaderNote) {
        if (this.orderHeaderNotes == null) {
            return;
        }
        this.orderHeaderNotes.remove(orderHeaderNote);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearOrderHeaderNote() {
        if (this.orderHeaderNotes == null) {
            return;
        }
        this.orderHeaderNotes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addPartyNote(PartyNote partyNote) {
        if (this.partyNotes == null) {
            this.partyNotes = new ArrayList<PartyNote>();
        }
        this.partyNotes.add(partyNote);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePartyNote(PartyNote partyNote) {
        if (this.partyNotes == null) {
            return;
        }
        this.partyNotes.remove(partyNote);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPartyNote() {
        if (this.partyNotes == null) {
            return;
        }
        this.partyNotes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addQuoteNote(QuoteNote quoteNote) {
        if (this.quoteNotes == null) {
            this.quoteNotes = new ArrayList<QuoteNote>();
        }
        this.quoteNotes.add(quoteNote);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeQuoteNote(QuoteNote quoteNote) {
        if (this.quoteNotes == null) {
            return;
        }
        this.quoteNotes.remove(quoteNote);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearQuoteNote() {
        if (this.quoteNotes == null) {
            return;
        }
        this.quoteNotes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addWorkEffortNote(WorkEffortNote workEffortNote) {
        if (this.workEffortNotes == null) {
            this.workEffortNotes = new ArrayList<WorkEffortNote>();
        }
        this.workEffortNotes.add(workEffortNote);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWorkEffortNote(WorkEffortNote workEffortNote) {
        if (this.workEffortNotes == null) {
            return;
        }
        this.workEffortNotes.remove(workEffortNote);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWorkEffortNote() {
        if (this.workEffortNotes == null) {
            return;
        }
        this.workEffortNotes.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setNoteId((String) mapValue.get("noteId"));
        setNoteName((String) mapValue.get("noteName"));
        setNoteInfo((String) mapValue.get("noteInfo"));
        setNoteDateTime((Timestamp) mapValue.get("noteDateTime"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        setNoteParty((String) mapValue.get("noteParty"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("noteId", getNoteId());
        mapValue.put("noteName", getNoteName());
        mapValue.put("noteInfo", getNoteInfo());
        mapValue.put("noteDateTime", getNoteDateTime());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        mapValue.put("noteParty", getNoteParty());
        return mapValue;
    }


}