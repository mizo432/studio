package org.venuspj.studio.adapter.doma.dao;

import org.seasar.doma.*;
import org.venuspj.studio.adapter.doma.ComponentAndAutowiredDomaConfig;
import org.venuspj.studio.adapter.doma.entity.StudioPlayerMembers;

/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface StudioPlayerMembersDao {

    /**
     * @param studioPlayerMemberId
     * @return the StudioPlayerMembers entity
     */
    @Select
    StudioPlayerMembers selectById(String studioPlayerMemberId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(StudioPlayerMembers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(StudioPlayerMembers entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(StudioPlayerMembers entity);
}