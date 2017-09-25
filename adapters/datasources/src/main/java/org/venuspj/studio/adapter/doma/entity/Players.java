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
@Table(name = "players")
public class Players {

    /** プレイヤーID */
    @Id
    @Column(name = "player_id")
    String playerId;

    /** トピック名称 */
    @Column(name = "topic_name")
    String topicName;

    /** トピック日時 */
    @Column(name = "topic_record_date")
    LocalDateTime topicRecordDate;

    /** トピック公開日時 */
    @Column(name = "topic_publish_date")
    LocalDateTime topicPublishDate;

    /** トピック詳細 */
    @Column(name = "topic_description")
    String topicDescription;

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
     * Returns the topicName.
     * 
     * @return the topicName
     */
    public String getTopicName() {
        return topicName;
    }

    /** 
     * Sets the topicName.
     * 
     * @param topicName the topicName
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /** 
     * Returns the topicRecordDate.
     * 
     * @return the topicRecordDate
     */
    public LocalDateTime getTopicRecordDate() {
        return topicRecordDate;
    }

    /** 
     * Sets the topicRecordDate.
     * 
     * @param topicRecordDate the topicRecordDate
     */
    public void setTopicRecordDate(LocalDateTime topicRecordDate) {
        this.topicRecordDate = topicRecordDate;
    }

    /** 
     * Returns the topicPublishDate.
     * 
     * @return the topicPublishDate
     */
    public LocalDateTime getTopicPublishDate() {
        return topicPublishDate;
    }

    /** 
     * Sets the topicPublishDate.
     * 
     * @param topicPublishDate the topicPublishDate
     */
    public void setTopicPublishDate(LocalDateTime topicPublishDate) {
        this.topicPublishDate = topicPublishDate;
    }

    /** 
     * Returns the topicDescription.
     * 
     * @return the topicDescription
     */
    public String getTopicDescription() {
        return topicDescription;
    }

    /** 
     * Sets the topicDescription.
     * 
     * @param topicDescription the topicDescription
     */
    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
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