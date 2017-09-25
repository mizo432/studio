package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.StudioPlayers;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface StudioPlayersDao {

    /**
     * @param studioPlayerId
     * @return the StudioPlayers entity
     */
    @Select
    StudioPlayers selectById(String studioPlayerId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(StudioPlayers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(StudioPlayers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(StudioPlayers entity);
}