package org.venuspj.studio.adapter.doma.dao;

import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.venuspj.studio.adapter.doma.entity.StudioXPlayers;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface StudioXPlayersDao {

    /**
     * @param studioId
     * @param playerId
     * @return the StudioXPlayers entity
     */
    @Select
    StudioXPlayers selectById(String studioId, String playerId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(StudioXPlayers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(StudioXPlayers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(StudioXPlayers entity);
}