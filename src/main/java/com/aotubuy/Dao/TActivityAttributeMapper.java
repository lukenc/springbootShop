package com.aotubuy.Dao;

import com.aotubuy.Model.TActivityAttribute;
import java.util.List;

public interface TActivityAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_attribute
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_attribute
     *
     * @mbggenerated
     */
    int insert(TActivityAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_attribute
     *
     * @mbggenerated
     */
    TActivityAttribute selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_attribute
     *
     * @mbggenerated
     */
    List<TActivityAttribute> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_attribute
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TActivityAttribute record);
}