package org.venuspj.studio.adapter.doma.dao;

import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.venuspj.studio.adapter.doma.entity.TwitterAccounts;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface TwitterAccountsDao {

    /**
     * @param twitterAccountsId
     * @return the TwitterAccounts entity
     */
    @Select
    TwitterAccounts selectById(Integer twitterAccountsId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TwitterAccounts entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TwitterAccounts entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TwitterAccounts entity);
}