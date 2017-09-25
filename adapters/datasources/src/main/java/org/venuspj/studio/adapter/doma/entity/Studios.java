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
@Table(name = "studios")
public class Studios {

    /**
     * スタジオID
     */
    @Id
    @Column(name = "studio_id")
    String studioId;

    /**
     * スタジオ名称接頭
     */
    @Column(name = "studio_name_prefix")
    String studioNamePrefix;

    /**
     * スタジオ名称
     */
    @Column(name = "studio_name")
    String studioName;

    /**
     * スタジオ名称接尾
     */
    @Column(name = "studio_name_postfix")
    String studioNamePostfix;

    /**
     * スタジオ短詳細
     */
    @Column(name = "studio_short_description")
    String studioShortDescription;

    /**
     * スタジオ詳細
     */
    @Column(name = "studio_description")
    String studioDescription;

    /**
     * スタジオtwitter
     */
    @Column(name = "studio_twitter")
    String studioTwitter;

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
     * Returns the studioName.
     *
     * @return the studioName
     */
    public String getStudioName() {
        return studioName;
    }

    /**
     * Sets the studioName.
     *
     * @param studioName the studioName
     */
    public void setStudioName(String studioName) {
        this.studioName = studioName;
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
     * Returns the studioShortDescription.
     *
     * @return the studioShortDescription
     */
    public String getStudioShortDescription() {
        return studioShortDescription;
    }

    /**
     * Sets the studioShortDescription.
     *
     * @param studioShortDescription the studioShortDescription
     */
    public void setStudioShortDescription(String studioShortDescription) {
        this.studioShortDescription = studioShortDescription;
    }

    /**
     * Returns the studioDescription.
     *
     * @return the studioDescription
     */
    public String getStudioDescription() {
        return studioDescription;
    }

    /**
     * Sets the studioDescription.
     *
     * @param studioDescription the studioDescription
     */
    public void setStudioDescription(String studioDescription) {
        this.studioDescription = studioDescription;
    }

    /**
     * Returns the studioTwitter.
     *
     * @return the studioTwitter
     */
    public String getStudioTwitter() {
        return studioTwitter;
    }

    /**
     * Sets the studioTwitter.
     *
     * @param studioTwitter the studioTwitter
     */
    public void setStudioTwitter(String studioTwitter) {
        this.studioTwitter = studioTwitter;
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