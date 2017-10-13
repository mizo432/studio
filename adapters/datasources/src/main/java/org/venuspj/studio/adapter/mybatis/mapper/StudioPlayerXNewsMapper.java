package org.venuspj.studio.adapter.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.venuspj.studio.adapter.mybatis.model.StudioPlayerXNews;

@Mapper
public interface StudioPlayerXNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio_player_x_news
     *
     * @mbg.generated
     */
    @Delete({
        "delete from studio_player_x_news",
        "where studio_player_id = #{studioPlayerId,jdbcType=VARCHAR}",
          "and topic_id = #{topicId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("studioPlayerId") String studioPlayerId, @Param("topicId") Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio_player_x_news
     *
     * @mbg.generated
     */
    @Insert({
        "insert into studio_player_x_news (studio_player_id, topic_id, ",
        "created_at, created_by)",
        "values (#{studioPlayerId,jdbcType=VARCHAR}, #{topicId,jdbcType=INTEGER}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{createdBy,jdbcType=VARCHAR})"
    })
    int insert(StudioPlayerXNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio_player_x_news
     *
     * @mbg.generated
     */
    int insertSelective(StudioPlayerXNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio_player_x_news
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "studio_player_id, topic_id, created_at, created_by",
        "from studio_player_x_news",
        "where studio_player_id = #{studioPlayerId,jdbcType=VARCHAR}",
          "and topic_id = #{topicId,jdbcType=INTEGER}"
    })
    @ResultMap("org.venuspj.studio.adapter.mybatis.mapper.StudioPlayerXNewsMapper.BaseResultMap")
    StudioPlayerXNews selectByPrimaryKey(@Param("studioPlayerId") String studioPlayerId, @Param("topicId") Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio_player_x_news
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(StudioPlayerXNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studio_player_x_news
     *
     * @mbg.generated
     */
    @Update({
        "update studio_player_x_news",
        "set created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "created_by = #{createdBy,jdbcType=VARCHAR}",
        "where studio_player_id = #{studioPlayerId,jdbcType=VARCHAR}",
          "and topic_id = #{topicId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StudioPlayerXNews record);
}