package org.venuspj.studio.adapter.doma.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity
@Table(name = "studio_x_players")
public class StudioXPlayers {

    /** スタジオID */
    @Id
    @Column(name = "studio_id")
    String studioId;

    /** プレイヤーID */
    @Id
    @Column(name = "player_id")
    String playerId;

    /** データ作成日時 */
    @Column(name = "created_at")
    LocalDateTime createdAt;

    /** データ作成者ID */
    @Column(name = "created_by")
    String createdBy;

    /** 
     * Returns the studioId.
     * 
     * @return the studioId
     */
    public String getStudioId() {
        return studioId;
    }

    /** 
     * Sets the studioId.
     * 
     * @param studioId the studioId
     */
    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /** 
     * Returns the playerId.
     * 
     * @return the playerId
     */
    public String getPlayerId() {
        return playerId;
    }

    /** 
     * Sets the playerId.
     * 
     * @param playerId the playerId
     */
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
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