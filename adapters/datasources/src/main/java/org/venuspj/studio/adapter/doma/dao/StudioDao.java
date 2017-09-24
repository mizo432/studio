package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.Studio;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface StudioDao {

    /**
     * @param studioCode
     * @return the Studio entity
     */
    @Select
    Studio selectById(String studioCode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Studio entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Studio entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Studio entity);
}