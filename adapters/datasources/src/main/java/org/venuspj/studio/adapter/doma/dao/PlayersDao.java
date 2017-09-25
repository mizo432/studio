package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.Players;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface PlayersDao {

    /**
     * @param playerId
     * @return the Players entity
     */
    @Select
    Players selectById(String playerId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Players entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Players entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Players entity);
}