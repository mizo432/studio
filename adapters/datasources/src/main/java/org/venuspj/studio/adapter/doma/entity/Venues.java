package org.venuspj.studio.adapter.doma.entity;

import org.seasar.doma.*;

import java.time.LocalDateTime;

/**
 *
 */
@Entity
@Table(name = "venues")
public class Venues {

    /**
     * 会場ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venue_id")
    Integer venueId;

    /**
     * 会場名称接頭
     */
    @Column(name = "venue_name_prefix")
    String venueNamePrefix;

    /**
     * 会場名称
     */
    @Column(name = "venue_name")
    String venueName;

    /**
     * 会場名称接尾
     */
    @Column(name = "venue_name_postfix")
    String venueNamePostfix;

    /**
     * 会場詳細
     */
    @Column(name = "venue_description")
    String venueDescription;

    /**
     * 会場住所
     */
    @Column(name = "venue_address")
    String venueAddress;

    /**
     * 会場緯度
     */
    @Column(name = "venue_latitude")
    String venueLatitude;

    /**
     * 会場経度
     */
    @Column(name = "venue_longitude")
    String venueLongitude;

    /**
     * 会場電話番号
     */
    @Column(name = "venue_tel_no")
    String venueTelNo;

    /**
     * 会場twitter
     */
    @Column(name = "venue_twitter")
    String venueTwitter;

    /**
     * 会場メール
     */
    @Column(name = "venue_email")
    String venueEmail;

    /**
     * 会場URL
     */
    @Column(name = "venue_url")
    String venueUrl;

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
     * Returns the venueId.
     *
     * @return the venueId
     */
    public Integer getVenueId() {
        return venueId;
    }

    /**
     * Sets the venueId.
     *
     * @param venueId the venueId
     */
    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    /**
     * Returns the venueNamePrefix.
     *
     * @return the venueNamePrefix
     */
    public String getVenueNamePrefix() {
        return venueNamePrefix;
    }

    /**
     * Sets the venueNamePrefix.
     *
     * @param venueNamePrefix the venueNamePrefix
     */
    public void setVenueNamePrefix(String venueNamePrefix) {
        this.venueNamePrefix = venueNamePrefix;
    }

    /**
     * Returns the venueName.
     *
     * @return the venueName
     */
    public String getVenueName() {
        return venueName;
    }

    /**
     * Sets the venueName.
     *
     * @param venueName the venueName
     */
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    /**
     * Returns the venueNamePostfix.
     *
     * @return the venueNamePostfix
     */
    public String getVenueNamePostfix() {
        return venueNamePostfix;
    }

    /**
     * Sets the venueNamePostfix.
     *
     * @param venueNamePostfix the venueNamePostfix
     */
    public void setVenueNamePostfix(String venueNamePostfix) {
        this.venueNamePostfix = venueNamePostfix;
    }

    /**
     * Returns the venueDescription.
     *
     * @return the venueDescription
     */
    public String getVenueDescription() {
        return venueDescription;
    }

    /**
     * Sets the venueDescription.
     *
     * @param venueDescription the venueDescription
     */
    public void setVenueDescription(String venueDescription) {
        this.venueDescription = venueDescription;
    }

    /**
     * Returns the venueAddress.
     *
     * @return the venueAddress
     */
    public String getVenueAddress() {
        return venueAddress;
    }

    /**
     * Sets the venueAddress.
     *
     * @param venueAddress the venueAddress
     */
    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    /**
     * Returns the venueLatitude.
     *
     * @return the venueLatitude
     */
    public String getVenueLatitude() {
        return venueLatitude;
    }

    /**
     * Sets the venueLatitude.
     *
     * @param venueLatitude the venueLatitude
     */
    public void setVenueLatitude(String venueLatitude) {
        this.venueLatitude = venueLatitude;
    }

    /**
     * Returns the venueLongitude.
     *
     * @return the venueLongitude
     */
    public String getVenueLongitude() {
        return venueLongitude;
    }

    /**
     * Sets the venueLongitude.
     *
     * @param venueLongitude the venueLongitude
     */
    public void setVenueLongitude(String venueLongitude) {
        this.venueLongitude = venueLongitude;
    }

    /**
     * Returns the venueTelNo.
     *
     * @return the venueTelNo
     */
    public String getVenueTelNo() {
        return venueTelNo;
    }

    /**
     * Sets the venueTelNo.
     *
     * @param venueTelNo the venueTelNo
     */
    public void setVenueTelNo(String venueTelNo) {
        this.venueTelNo = venueTelNo;
    }

    /**
     * Returns the venueTwitter.
     *
     * @return the venueTwitter
     */
    public String getVenueTwitter() {
        return venueTwitter;
    }

    /**
     * Sets the venueTwitter.
     *
     * @param venueTwitter the venueTwitter
     */
    public void setVenueTwitter(String venueTwitter) {
        this.venueTwitter = venueTwitter;
    }

    /**
     * Returns the venueEmail.
     *
     * @return the venueEmail
     */
    public String getVenueEmail() {
        return venueEmail;
    }

    /**
     * Sets the venueEmail.
     *
     * @param venueEmail the venueEmail
     */
    public void setVenueEmail(String venueEmail) {
        this.venueEmail = venueEmail;
    }

    /**
     * Returns the venueUrl.
     *
     * @return the venueUrl
     */
    public String getVenueUrl() {
        return venueUrl;
    }

    /**
     * Sets the venueUrl.
     *
     * @param venueUrl the venueUrl
     */
    public void setVenueUrl(String venueUrl) {
        this.venueUrl = venueUrl;
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