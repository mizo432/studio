package org.venuspj.studio.adapter.doma.dao;

import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.venuspj.studio.adapter.doma.entity.Organizations;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface OrganizationsDao {

    /**
     * @param partyId
     * @return the Organizations entity
     */
    @Select
    Organizations selectById(Integer partyId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Organizations entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Organizations entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Organizations entity);
}