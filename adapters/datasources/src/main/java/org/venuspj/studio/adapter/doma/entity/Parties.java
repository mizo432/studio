package org.venuspj.studio.adapter.doma.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity
@Table(name = "parties")
public class Parties {

    /** パーティーID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "party_id")
    Integer partyId;

    /** データ作成日時 */
    @Column(name = "created_at")
    LocalDateTime createdAt;

    /** データ作成者ID */
    @Column(name = "created_by")
    String createdBy;

    /** 
     * Returns the partyId.
     * 
     * @return the partyId
     */
    public Integer getPartyId() {
        return partyId;
    }

    /** 
     * Sets the partyId.
     * 
     * @param partyId the partyId
     */
    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    /** 
     * Returns the createdAt.
     * 
     * @return the createdAt
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /** 
     * Sets the createdAt.
     * 
     * @param createdAt the createdAt
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /** 
     * Returns the createdBy.
     * 
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** 
     * Sets the createdBy.
     * 
     * @param createdBy the createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}