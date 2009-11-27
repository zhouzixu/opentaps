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

import java.io.Serializable;
import javax.persistence.*;

import java.lang.String;

@Embeddable
public class ProductPromoCondPk implements Serializable {
    @Column(name="PRODUCT_PROMO_ID")
    private String productPromoId;
    @Column(name="PRODUCT_PROMO_RULE_ID")
    private String productPromoRuleId;
    @Column(name="PRODUCT_PROMO_COND_SEQ_ID")
    private String productPromoCondSeqId;
    
    /**
     * Auto generated value setter.
     * @param productPromoId the productPromoId to set
     */
    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }
    /**
     * Auto generated value setter.
     * @param productPromoRuleId the productPromoRuleId to set
     */
    public void setProductPromoRuleId(String productPromoRuleId) {
        this.productPromoRuleId = productPromoRuleId;
    }
    /**
     * Auto generated value setter.
     * @param productPromoCondSeqId the productPromoCondSeqId to set
     */
    public void setProductPromoCondSeqId(String productPromoCondSeqId) {
        this.productPromoCondSeqId = productPromoCondSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getProductPromoId() {
        return this.productPromoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getProductPromoRuleId() {
        return this.productPromoRuleId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getProductPromoCondSeqId() {
        return this.productPromoCondSeqId;
    }
}