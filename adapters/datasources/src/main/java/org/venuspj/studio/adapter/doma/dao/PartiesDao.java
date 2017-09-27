package org.venuspj.studio.adapter.doma.dao;

import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.venuspj.studio.adapter.doma.entity.Parties;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface PartiesDao {

    /**
     * @param partyId
     * @return the Parties entity
     */
    @Select
    Parties selectById(Integer partyId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Parties entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Parties entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Parties entity);
}