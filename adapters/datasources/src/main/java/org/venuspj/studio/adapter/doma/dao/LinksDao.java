package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.Links;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface LinksDao {

    /**
     * @param linkId
     * @return the Links entity
     */
    @Select
    Links selectById(Integer linkId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Links entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Links entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Links entity);
}