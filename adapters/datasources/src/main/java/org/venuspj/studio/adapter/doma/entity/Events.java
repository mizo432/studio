package org.venuspj.studio.adapter.doma.entity;

import org.seasar.doma.*;

import java.time.LocalDateTime;

/**
 * 
 */
@Entity
@Table(name = "events")
public class Events {

    /** イベントID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    Integer eventId;

    /** イベント名称接頭 */
    @Column(name = "event_name_prefix")
    String eventNamePrefix;

    /** イベント名称 */
    @Column(name = "event_name")
    String eventName;

    /** イベント名称接尾 */
    @Column(name = "event_name_postfix")
    String eventNamePostfix;

    /** イベント詳細 */
    @Column(name = "event_description")
    String eventDescription;

    /** イベント開場日時 */
    @Column(name = "event_open_datetime")
    LocalDateTime eventOpenDatetime;

    /** イベント開始日時 */
    @Column(name = "event_start_datetime")
    LocalDateTime eventStartDatetime;

    /** イベント終了日時 */
    @Column(name = "event_end_datetime")
    LocalDateTime eventEndDatetime;

    /** データ作成日時 */
    @Column(name = "created_at")
    LocalDateTime createdAt;

    /** データ作成者ID */
    @Column(name = "created_by")
    String createdBy;

    /** 
     * Returns the eventId.
     * 
     * @return the eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    /** 
     * Sets the eventId.
     * 
     * @param eventId the eventId
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /** 
     * Returns the eventNamePrefix.
     * 
     * @return the eventNamePrefix
     */
    public String getEventNamePrefix() {
        return eventNamePrefix;
    }

    /** 
     * Sets the eventNamePrefix.
     * 
     * @param eventNamePrefix the eventNamePrefix
     */
    public void setEventNamePrefix(String eventNamePrefix) {
        this.eventNamePrefix = eventNamePrefix;
    }

    /** 
     * Returns the eventName.
     * 
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /** 
     * Sets the eventName.
     * 
     * @param eventName the eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /** 
     * Returns the eventNamePostfix.
     * 
     * @return the eventNamePostfix
     */
    public String getEventNamePostfix() {
        return eventNamePostfix;
    }

    /** 
     * Sets the eventNamePostfix.
     * 
     * @param eventNamePostfix the eventNamePostfix
     */
    public void setEventNamePostfix(String eventNamePostfix) {
        this.eventNamePostfix = eventNamePostfix;
    }

    /** 
     * Returns the eventDescription.
     * 
     * @return the eventDescription
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /** 
     * Sets the eventDescription.
     * 
     * @param eventDescription the eventDescription
     */
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    /** 
     * Returns the eventOpenDatetime.
     * 
     * @return the eventOpenDatetime
     */
    public LocalDateTime getEventOpenDatetime() {
        return eventOpenDatetime;
    }

    /** 
     * Sets the eventOpenDatetime.
     * 
     * @param eventOpenDatetime the eventOpenDatetime
     */
    public void setEventOpenDatetime(LocalDateTime eventOpenDatetime) {
        this.eventOpenDatetime = eventOpenDatetime;
    }

    /** 
     * Returns the eventStartDatetime.
     * 
     * @return the eventStartDatetime
     */
    public LocalDateTime getEventStartDatetime() {
        return eventStartDatetime;
    }

    /** 
     * Sets the eventStartDatetime.
     * 
     * @param eventStartDatetime the eventStartDatetime
     */
    public void setEventStartDatetime(LocalDateTime eventStartDatetime) {
        this.eventStartDatetime = eventStartDatetime;
    }

    /** 
     * Returns the eventEndDatetime.
     * 
     * @return the eventEndDatetime
     */
    public LocalDateTime getEventEndDatetime() {
        return eventEndDatetime;
    }

    /** 
     * Sets the eventEndDatetime.
     * 
     * @param eventEndDatetime the eventEndDatetime
     */
    public void setEventEndDatetime(LocalDateTime eventEndDatetime) {
        this.eventEndDatetime = eventEndDatetime;
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