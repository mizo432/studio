package org.venuspj.studio.adapter.doma.dao;

import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.venuspj.studio.adapter.doma.entity.People;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface PeopleDao {

    /**
     * @param partyId
     * @return the People entity
     */
    @Select
    People selectById(Integer partyId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(People entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(People entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(People entity);
}