package org.venuspj.studio.adapter.doma.dao;

import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.venuspj.studio.adapter.doma.entity.Places;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface PlacesDao {

    /**
     * @param placeId
     * @return the Places entity
     */
    @Select
    Places selectById(Integer placeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Places entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Places entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Places entity);
}