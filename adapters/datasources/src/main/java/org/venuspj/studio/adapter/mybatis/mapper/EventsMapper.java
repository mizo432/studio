package org.venuspj.studio.adapter.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.venuspj.studio.adapter.mybatis.model.Events;
import org.venuspj.studio.adapter.mybatis.model.EventsExample;

import java.util.List;

@Mapper
public interface EventsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events
     *
     * @mbg.generated
     */
    @Delete({
            "delete from events",
            "where event_id = #{eventId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer eventId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events
     *
     * @mbg.generated
     */
    @Insert({
            "insert into events (event_id, event_name_prefix, ",
            "event_name, event_name_postfix, ",
            "event_open_datetime, event_start_datetime, ",
            "event_end_datetime, created_at, ",
            "created_by, event_description)",
            "values (#{eventId,jdbcType=INTEGER}, #{eventNamePrefix,jdbcType=VARCHAR}, ",
            "#{eventName,jdbcType=VARCHAR}, #{eventNamePostfix,jdbcType=VARCHAR}, ",
            "#{eventOpenDatetime,jdbcType=TIMESTAMP}, #{eventStartDatetime,jdbcType=TIMESTAMP}, ",
            "#{eventEndDatetime,jdbcType=TIMESTAMP}, #{createdAt,jdbcType=TIMESTAMP}, ",
            "#{createdBy,jdbcType=VARCHAR}, #{eventDescription,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "eventId", before = true, resultType = Integer.class)
    int insert(Events record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events
     *
     * @mbg.generated
     */
    int insertSelective(Events record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events
     *
     * @mbg.generated
     */
    List<Events> selectByExampleWithBLOBs(EventsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events
     *
     * @mbg.generated
     */
    List<Events> selectByExample(EventsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events
     *
     * @mbg.generated
     */
    @Select({
            "select",
            "event_id, event_name_prefix, event_name, event_name_postfix, event_open_datetime, ",
            "event_start_datetime, event_end_datetime, created_at, created_by, event_description",
            "from events",
            "where event_id = #{eventId,jdbcType=INTEGER}"
    })
    @ResultMap("org.venuspj.studio.adapter.mybatis.mapper.EventsMapper.ResultMapWithBLOBs")
    Events selectByPrimaryKey(Integer eventId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Events record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events
     *
     * @mbg.generated
     */
    @Update({
            "update events",
            "set event_name_prefix = #{eventNamePrefix,jdbcType=VARCHAR},",
            "event_name = #{eventName,jdbcType=VARCHAR},",
            "event_name_postfix = #{eventNamePostfix,jdbcType=VARCHAR},",
            "event_open_datetime = #{eventOpenDatetime,jdbcType=TIMESTAMP},",
            "event_start_datetime = #{eventStartDatetime,jdbcType=TIMESTAMP},",
            "event_end_datetime = #{eventEndDatetime,jdbcType=TIMESTAMP},",
            "created_at = #{createdAt,jdbcType=TIMESTAMP},",
            "created_by = #{createdBy,jdbcType=VARCHAR},",
            "event_description = #{eventDescription,jdbcType=LONGVARCHAR}",
            "where event_id = #{eventId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Events record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events
     *
     * @mbg.generated
     */
    @Update({
            "update events",
            "set event_name_prefix = #{eventNamePrefix,jdbcType=VARCHAR},",
            "event_name = #{eventName,jdbcType=VARCHAR},",
            "event_name_postfix = #{eventNamePostfix,jdbcType=VARCHAR},",
            "event_open_datetime = #{eventOpenDatetime,jdbcType=TIMESTAMP},",
            "event_start_datetime = #{eventStartDatetime,jdbcType=TIMESTAMP},",
            "event_end_datetime = #{eventEndDatetime,jdbcType=TIMESTAMP},",
            "created_at = #{createdAt,jdbcType=TIMESTAMP},",
            "created_by = #{createdBy,jdbcType=VARCHAR}",
            "where event_id = #{eventId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Events record);
}