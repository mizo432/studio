package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.Events;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface EventsDao {

    /**
     * @param eventId
     * @return the Events entity
     */
    @Select
    Events selectById(Integer eventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Events entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Events entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Events entity);
}