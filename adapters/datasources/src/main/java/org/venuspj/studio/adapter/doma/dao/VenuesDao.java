package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.Venues;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface VenuesDao {

    /**
     * @param venueId
     * @return the Venues entity
     */
    @Select
    Venues selectById(Integer venueId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Venues entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Venues entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Venues entity);
}