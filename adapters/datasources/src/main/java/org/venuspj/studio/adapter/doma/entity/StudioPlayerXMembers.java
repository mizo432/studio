package org.venuspj.studio.adapter.doma.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.time.LocalDateTime;

/**
 *
 */
@Entity
@Table(name = "studio_player_x_members")
public class StudioPlayerXMembers {

    /**
     * プレイヤーID
     */
    @Id
    @Column(name = "studio_player_id")
    String studioPlayerId;

    /**
     * スタジオプレイヤーID
     */
    @Id
    @Column(name = "studio_player_member_id")
    String studioPlayerMemberId;

    /**
     * データ作成日時
     */
    @Column(name = "created_at")
    LocalDateTime createdAt;

    /**
     * データ作成者ID
     */
    @Column(name = "created_by")
    String createdBy;

    /**
     * Returns the studioPlayerId.
     *
     * @return the studioPlayerId
     */
    public String getStudioPlayerId() {
        return studioPlayerId;
    }

    /**
     * Sets the studioPlayerId.
     *
     * @param studioPlayerId the studioPlayerId
     */
    public void setStudioPlayerId(String studioPlayerId) {
        this.studioPlayerId = studioPlayerId;
    }

    /**
     * Returns the studioPlayerMemberId.
     *
     * @return the studioPlayerMemberId
     */
    public String getStudioPlayerMemberId() {
        return studioPlayerMemberId;
    }

    /**
     * Sets the studioPlayerMemberId.
     *
     * @param studioPlayerMemberId the studioPlayerMemberId
     */
    public void setStudioPlayerMemberId(String studioPlayerMemberId) {
        this.studioPlayerMemberId = studioPlayerMemberId;
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