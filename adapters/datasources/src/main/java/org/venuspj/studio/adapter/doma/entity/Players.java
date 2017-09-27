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
@Table(name = "players")
public class Players {

    /** プレイヤーID */
    @Id
    @Column(name = "player_id")
    String playerId;

    /** プレイヤー名称 */
    @Column(name = "player_name")
    String playerName;

    /** データ作成日時 */
    @Column(name = "created_at")
    LocalDateTime createdAt;

    /** データ作成者ID */
    @Column(name = "created_by")
    String createdBy;

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
     * Returns the playerName.
     * 
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /** 
     * Sets the playerName.
     * 
     * @param playerName the playerName
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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