package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.Studios;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface StudiosDao {

    /**
     * @param studioId
     * @return the Studios entity
     */
    @Select
    Studios selectById(String studioId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Studios entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Studios entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Studios entity);
}