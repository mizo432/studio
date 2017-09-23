package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.Event;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface EventDao {

    /**
     * @param eventId
     * @return the Event entity
     */
    @Select
    Event selectById(Integer eventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Event entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Event entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Event entity);
}