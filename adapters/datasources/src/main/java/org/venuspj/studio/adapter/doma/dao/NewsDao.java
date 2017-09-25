package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.News;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface NewsDao {

    /**
     * @param topicId
     * @return the News entity
     */
    @Select
    News selectById(Integer topicId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(News entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(News entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(News entity);
}