package org.venuspj.studio.adapter.mybatis.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class StudioPlayerXMembers implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_player_x_members.studio_player_id
     *
     * @mbg.generated
     */
    private String studioPlayerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_player_x_members.studio_player_member_id
     *
     * @mbg.generated
     */
    private String studioPlayerMemberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_player_x_members.created_at
     *
     * @mbg.generated
     */
    private LocalDateTime createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_player_x_members.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table studio_player_x_members
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_player_x_members.studio_player_id
     *
     * @return the value of studio_player_x_members.studio_player_id
     *
     * @mbg.generated
     */
    public String getStudioPlayerId() {
        return studioPlayerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_player_x_members.studio_player_id
     *
     * @param studioPlayerId the value for studio_player_x_members.studio_player_id
     *
     * @mbg.generated
     */
    public void setStudioPlayerId(String studioPlayerId) {
        this.studioPlayerId = studioPlayerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_player_x_members.studio_player_member_id
     *
     * @return the value of studio_player_x_members.studio_player_member_id
     *
     * @mbg.generated
     */
    public String getStudioPlayerMemberId() {
        return studioPlayerMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_player_x_members.studio_player_member_id
     *
     * @param studioPlayerMemberId the value for studio_player_x_members.studio_player_member_id
     *
     * @mbg.generated
     */
    public void setStudioPlayerMemberId(String studioPlayerMemberId) {
        this.studioPlayerMemberId = studioPlayerMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_player_x_members.created_at
     *
     * @return the value of studio_player_x_members.created_at
     *
     * @mbg.generated
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_player_x_members.created_at
     *
     * @param createdAt the value for studio_player_x_members.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_player_x_members.created_by
     *
     * @return the value of studio_player_x_members.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_player_x_members.created_by
     *
     * @param createdBy the value for studio_player_x_members.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio_player_x_members
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studioPlayerId=").append(studioPlayerId);
        sb.append(", studioPlayerMemberId=").append(studioPlayerMemberId);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio_player_x_members
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StudioPlayerXMembers other = (StudioPlayerXMembers) that;
        return (this.getStudioPlayerId() == null ? other.getStudioPlayerId() == null : this.getStudioPlayerId().equals(other.getStudioPlayerId()))
            && (this.getStudioPlayerMemberId() == null ? other.getStudioPlayerMemberId() == null : this.getStudioPlayerMemberId().equals(other.getStudioPlayerMemberId()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio_player_x_members
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStudioPlayerId() == null) ? 0 : getStudioPlayerId().hashCode());
        result = prime * result + ((getStudioPlayerMemberId() == null) ? 0 : getStudioPlayerMemberId().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return result;
    }
}