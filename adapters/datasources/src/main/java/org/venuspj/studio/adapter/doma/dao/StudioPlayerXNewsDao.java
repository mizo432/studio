package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.StudioPlayerXNews;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface StudioPlayerXNewsDao {

    /**
     * @param studioPlayerId
     * @param topicId
     * @return the StudioPlayerXNews entity
     */
    @Select
    StudioPlayerXNews selectById(String studioPlayerId, Integer topicId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(StudioPlayerXNews entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(StudioPlayerXNews entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(StudioPlayerXNews entity);
}