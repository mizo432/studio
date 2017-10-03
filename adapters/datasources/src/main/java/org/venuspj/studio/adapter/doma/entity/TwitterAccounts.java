package org.venuspj.studio.adapter.doma.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity
@Table(name = "twitter_accounts")
public class TwitterAccounts {

    /** ツイッターアカウントID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "twitter_accounts_id")
    Integer twitterAccountsId;

    /** ツイッターID */
    @Column(name = "twitter_id")
    String twitterId;

    /** データ作成日時 */
    @Column(name = "created_at")
    LocalDateTime createdAt;

    /** データ作成者ID */
    @Column(name = "created_by")
    String createdBy;

    /** 
     * Returns the twitterAccountsId.
     * 
     * @return the twitterAccountsId
     */
    public Integer getTwitterAccountsId() {
        return twitterAccountsId;
    }

    /** 
     * Sets the twitterAccountsId.
     * 
     * @param twitterAccountsId the twitterAccountsId
     */
    public void setTwitterAccountsId(Integer twitterAccountsId) {
        this.twitterAccountsId = twitterAccountsId;
    }

    /** 
     * Returns the twitterId.
     * 
     * @return the twitterId
     */
    public String getTwitterId() {
        return twitterId;
    }

    /** 
     * Sets the twitterId.
     * 
     * @param twitterId the twitterId
     */
    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
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