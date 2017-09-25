package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.StudioPlayerXMembers;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface StudioPlayerXMembersDao {

    /**
     * @param studioPlayerId
     * @param studioPlayerMemberId
     * @return the StudioPlayerXMembers entity
     */
    @Select
    StudioPlayerXMembers selectById(String studioPlayerId, String studioPlayerMemberId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(StudioPlayerXMembers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(StudioPlayerXMembers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(StudioPlayerXMembers entity);
}