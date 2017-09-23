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
@Table(name = "studio")
public class Studio {

    /**  */
    @Id
    @Column(name = "studio_code")
    String studioCode;

    /** スタジオ名 */
    @Column(name = "studio_name")
    String studioName;

    /**  */
    @Column(name = "created_at")
    LocalDateTime createdAt;

    /** 
     * Returns the studioCode.
     * 
     * @return the studioCode
     */
    public String getStudioCode() {
        return studioCode;
    }

    /** 
     * Sets the studioCode.
     * 
     * @param studioCode the studioCode
     */
    public void setStudioCode(String studioCode) {
        this.studioCode = studioCode;
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
}