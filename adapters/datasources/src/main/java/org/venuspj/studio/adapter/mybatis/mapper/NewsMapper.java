package org.venuspj.studio.adapter.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.venuspj.studio.adapter.mybatis.model.News;

@Mapper
public interface NewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    @Delete({
        "delete from news",
        "where topic_id = #{topicId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    @Insert({
        "insert into news (topic_id, topic_name, ",
        "topic_record_date, topic_publish_date, ",
        "created_at, created_by, ",
        "topic_description)",
        "values (#{topicId,jdbcType=INTEGER}, #{topicName,jdbcType=VARCHAR}, ",
        "#{topicRecordDate,jdbcType=TIMESTAMP}, #{topicPublishDate,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{topicDescription,jdbcType=LONGVARCHAR})"
    })
    int insert(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    int insertSelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "topic_id, topic_name, topic_record_date, topic_publish_date, created_at, created_by, ",
        "topic_description",
        "from news",
        "where topic_id = #{topicId,jdbcType=INTEGER}"
    })
    @ResultMap("org.venuspj.studio.adapter.mybatis.mapper.NewsMapper.ResultMapWithBLOBs")
    News selectByPrimaryKey(Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    @Update({
        "update news",
        "set topic_name = #{topicName,jdbcType=VARCHAR},",
          "topic_record_date = #{topicRecordDate,jdbcType=TIMESTAMP},",
          "topic_publish_date = #{topicPublishDate,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "topic_description = #{topicDescription,jdbcType=LONGVARCHAR}",
        "where topic_id = #{topicId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    @Update({
        "update news",
        "set topic_name = #{topicName,jdbcType=VARCHAR},",
          "topic_record_date = #{topicRecordDate,jdbcType=TIMESTAMP},",
          "topic_publish_date = #{topicPublishDate,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "created_by = #{createdBy,jdbcType=VARCHAR}",
        "where topic_id = #{topicId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(News record);
}