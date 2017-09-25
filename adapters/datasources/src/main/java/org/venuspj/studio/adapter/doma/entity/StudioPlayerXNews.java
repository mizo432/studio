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
@Table(name = "studio_player_x_news")
public class StudioPlayerXNews {

    /**
     * プレイヤーID
     */
    @Id
    @Column(name = "studio_player_id")
    String studioPlayerId;

    /**
     * トピックID
     */
    @Id
    @Column(name = "topic_id")
    Integer topicId;

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
     * Returns the topicId.
     *
     * @return the topicId
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * Sets the topicId.
     *
     * @param topicId the topicId
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
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