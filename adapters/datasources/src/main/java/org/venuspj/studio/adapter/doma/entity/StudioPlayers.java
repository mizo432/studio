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
@Table(name = "studio_players")
public class StudioPlayers {

    /** スタジオプレイヤーID */
    @Id
    @Column(name = "studio_player_id")
    String studioPlayerId;

    /** プレイヤーID */
    @Column(name = "player_id")
    String playerId;

    /** プレイヤー名称接頭 */
    @Column(name = "studio_name_prefix")
    String studioNamePrefix;

    /** プレイヤー名称接尾 */
    @Column(name = "studio_name_postfix")
    String studioNamePostfix;

    /** プレイヤーページパス */
    @Column(name = "studio_player_path")
    String studioPlayerPath;

    /** プレイヤー名称接尾 */
    @Column(name = "studio_player_name_postfix")
    String studioPlayerNamePostfix;

    /** プレイヤー短詳細 */
    @Column(name = "studio_player_short_description")
    String studioPlayerShortDescription;

    /** プレイヤー詳細 */
    @Column(name = "studio_player_description")
    String studioPlayerDescription;

    /** 表示順 */
    @Column(name = "display_order_number")
    Integer displayOrderNumber;

    /** データ作成日時 */
    @Column(name = "created_at")
    LocalDateTime createdAt;

    /** データ作成者ID */
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
     * Returns the studioNamePrefix.
     * 
     * @return the studioNamePrefix
     */
    public String getStudioNamePrefix() {
        return studioNamePrefix;
    }

    /** 
     * Sets the studioNamePrefix.
     * 
     * @param studioNamePrefix the studioNamePrefix
     */
    public void setStudioNamePrefix(String studioNamePrefix) {
        this.studioNamePrefix = studioNamePrefix;
    }

    /** 
     * Returns the studioNamePostfix.
     * 
     * @return the studioNamePostfix
     */
    public String getStudioNamePostfix() {
        return studioNamePostfix;
    }

    /** 
     * Sets the studioNamePostfix.
     * 
     * @param studioNamePostfix the studioNamePostfix
     */
    public void setStudioNamePostfix(String studioNamePostfix) {
        this.studioNamePostfix = studioNamePostfix;
    }

    /** 
     * Returns the studioPlayerPath.
     * 
     * @return the studioPlayerPath
     */
    public String getStudioPlayerPath() {
        return studioPlayerPath;
    }

    /** 
     * Sets the studioPlayerPath.
     * 
     * @param studioPlayerPath the studioPlayerPath
     */
    public void setStudioPlayerPath(String studioPlayerPath) {
        this.studioPlayerPath = studioPlayerPath;
    }

    /** 
     * Returns the studioPlayerNamePostfix.
     * 
     * @return the studioPlayerNamePostfix
     */
    public String getStudioPlayerNamePostfix() {
        return studioPlayerNamePostfix;
    }

    /** 
     * Sets the studioPlayerNamePostfix.
     * 
     * @param studioPlayerNamePostfix the studioPlayerNamePostfix
     */
    public void setStudioPlayerNamePostfix(String studioPlayerNamePostfix) {
        this.studioPlayerNamePostfix = studioPlayerNamePostfix;
    }

    /** 
     * Returns the studioPlayerShortDescription.
     * 
     * @return the studioPlayerShortDescription
     */
    public String getStudioPlayerShortDescription() {
        return studioPlayerShortDescription;
    }

    /** 
     * Sets the studioPlayerShortDescription.
     * 
     * @param studioPlayerShortDescription the studioPlayerShortDescription
     */
    public void setStudioPlayerShortDescription(String studioPlayerShortDescription) {
        this.studioPlayerShortDescription = studioPlayerShortDescription;
    }

    /** 
     * Returns the studioPlayerDescription.
     * 
     * @return the studioPlayerDescription
     */
    public String getStudioPlayerDescription() {
        return studioPlayerDescription;
    }

    /** 
     * Sets the studioPlayerDescription.
     * 
     * @param studioPlayerDescription the studioPlayerDescription
     */
    public void setStudioPlayerDescription(String studioPlayerDescription) {
        this.studioPlayerDescription = studioPlayerDescription;
    }

    /** 
     * Returns the displayOrderNumber.
     * 
     * @return the displayOrderNumber
     */
    public Integer getDisplayOrderNumber() {
        return displayOrderNumber;
    }

    /** 
     * Sets the displayOrderNumber.
     * 
     * @param displayOrderNumber the displayOrderNumber
     */
    public void setDisplayOrderNumber(Integer displayOrderNumber) {
        this.displayOrderNumber = displayOrderNumber;
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