package org.venuspj.studio.adapter.doma.entity;

import org.seasar.doma.*;

import java.time.LocalDateTime;

/**
 * 
 */
@Entity
@Table(name = "event")
public class Event {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    Integer eventId;

    /** イベント名 */
    @Column(name = "event_name")
    String eventName;

    /** 開始日時 */
    @Column(name = "start_date_time")
    LocalDateTime startDateTime;

    /**  */
    @Column(name = "end_date_time")
    LocalDateTime endDateTime;

    /**  */
    @Column(name = "open_date_time")
    LocalDateTime openDateTime;

    /**  */
    @Column(name = "description")
    String description;

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
     * Returns the startDateTime.
     * 
     * @return the startDateTime
     */
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    /** 
     * Sets the startDateTime.
     * 
     * @param startDateTime the startDateTime
     */
    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    /** 
     * Returns the endDateTime.
     * 
     * @return the endDateTime
     */
    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Sets the endDateTime.
     * 
     * @param endDateTime the endDateTime
     */
    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Returns the openDateTime.
     * 
     * @return the openDateTime
     */
    public LocalDateTime getOpenDateTime() {
        return openDateTime;
    }

    /** 
     * Sets the openDateTime.
     * 
     * @param openDateTime the openDateTime
     */
    public void setOpenDateTime(LocalDateTime openDateTime) {
        this.openDateTime = openDateTime;
    }

    /** 
     * Returns the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Sets the description.
     * 
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}