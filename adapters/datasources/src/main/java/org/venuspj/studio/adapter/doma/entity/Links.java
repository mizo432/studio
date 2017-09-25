package org.venuspj.studio.adapter.doma.entity;

import org.seasar.doma.*;

import java.time.LocalDateTime;

/**
 *
 */
@Entity
@Table(name = "links")
public class Links {

    /**
     * リンクID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    Integer linkId;

    /**
     * リンク名称
     */
    @Column(name = "link_name")
    String linkName;

    /**
     * リンクURI
     */
    @Column(name = "link_uri")
    String linkUri;

    /**
     * リンク種類
     */
    @Column(name = "link_kind")
    String linkKind;

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
     * Returns the linkId.
     *
     * @return the linkId
     */
    public Integer getLinkId() {
        return linkId;
    }

    /**
     * Sets the linkId.
     *
     * @param linkId the linkId
     */
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    /**
     * Returns the linkName.
     *
     * @return the linkName
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * Sets the linkName.
     *
     * @param linkName the linkName
     */
    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * Returns the linkUri.
     *
     * @return the linkUri
     */
    public String getLinkUri() {
        return linkUri;
    }

    /**
     * Sets the linkUri.
     *
     * @param linkUri the linkUri
     */
    public void setLinkUri(String linkUri) {
        this.linkUri = linkUri;
    }

    /**
     * Returns the linkKind.
     *
     * @return the linkKind
     */
    public String getLinkKind() {
        return linkKind;
    }

    /**
     * Sets the linkKind.
     *
     * @param linkKind the linkKind
     */
    public void setLinkKind(String linkKind) {
        this.linkKind = linkKind;
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