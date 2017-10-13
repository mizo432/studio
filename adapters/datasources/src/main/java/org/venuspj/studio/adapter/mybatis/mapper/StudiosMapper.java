package org.venuspj.studio.adapter.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.venuspj.studio.adapter.mybatis.model.Studios;

@Mapper
public interface StudiosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studios
     *
     * @mbg.generated
     */
    @Delete({
        "delete from studios",
        "where studio_id = #{studioId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String studioId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studios
     *
     * @mbg.generated
     */
    @Insert({
        "insert into studios (studio_id, studio_name_prefix, ",
        "studio_name, studio_name_postfix, ",
        "studio_twitter, created_at, ",
        "created_by, studio_short_description, ",
        "studio_description)",
        "values (#{studioId,jdbcType=VARCHAR}, #{studioNamePrefix,jdbcType=VARCHAR}, ",
        "#{studioName,jdbcType=VARCHAR}, #{studioNamePostfix,jdbcType=VARCHAR}, ",
        "#{studioTwitter,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{studioShortDescription,jdbcType=LONGVARCHAR}, ",
        "#{studioDescription,jdbcType=LONGVARCHAR})"
    })
    int insert(Studios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studios
     *
     * @mbg.generated
     */
    int insertSelective(Studios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studios
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "studio_id, studio_name_prefix, studio_name, studio_name_postfix, studio_twitter, ",
        "created_at, created_by, studio_short_description, studio_description",
        "from studios",
        "where studio_id = #{studioId,jdbcType=VARCHAR}"
    })
    @ResultMap("org.venuspj.studio.adapter.mybatis.mapper.StudiosMapper.ResultMapWithBLOBs")
    Studios selectByPrimaryKey(String studioId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studios
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Studios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studios
     *
     * @mbg.generated
     */
    @Update({
        "update studios",
        "set studio_name_prefix = #{studioNamePrefix,jdbcType=VARCHAR},",
          "studio_name = #{studioName,jdbcType=VARCHAR},",
          "studio_name_postfix = #{studioNamePostfix,jdbcType=VARCHAR},",
          "studio_twitter = #{studioTwitter,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "studio_short_description = #{studioShortDescription,jdbcType=LONGVARCHAR},",
          "studio_description = #{studioDescription,jdbcType=LONGVARCHAR}",
        "where studio_id = #{studioId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(Studios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studios
     *
     * @mbg.generated
     */
    @Update({
        "update studios",
        "set studio_name_prefix = #{studioNamePrefix,jdbcType=VARCHAR},",
          "studio_name = #{studioName,jdbcType=VARCHAR},",
          "studio_name_postfix = #{studioNamePostfix,jdbcType=VARCHAR},",
          "studio_twitter = #{studioTwitter,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "created_by = #{createdBy,jdbcType=VARCHAR}",
        "where studio_id = #{studioId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Studios record);
}