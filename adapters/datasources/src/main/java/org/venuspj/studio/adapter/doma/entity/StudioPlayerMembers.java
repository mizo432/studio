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
@Table(name = "studio_player_members")
public class StudioPlayerMembers {

    /** スタジオプレイヤーID */
    @Id
    @Column(name = "studio_player_member_id")
    String studioPlayerMemberId;

    /** プレイヤーメンバー名称 */
    @Column(name = "studio_player_member_name")
    String studioPlayerMemberName;

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
     * Returns the studioPlayerMemberName.
     * 
     * @return the studioPlayerMemberName
     */
    public String getStudioPlayerMemberName() {
        return studioPlayerMemberName;
    }

    /** 
     * Sets the studioPlayerMemberName.
     * 
     * @param studioPlayerMemberName the studioPlayerMemberName
     */
    public void setStudioPlayerMemberName(String studioPlayerMemberName) {
        this.studioPlayerMemberName = studioPlayerMemberName;
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