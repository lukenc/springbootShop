package com.aotubuy.Dao;

import com.aotubuy.Model.TActivityType;
import java.util.List;

public interface TActivityTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_type
     *
     * @mbggenerated
     */
    int insert(TActivityType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_type
     *
     * @mbggenerated
     */
    TActivityType selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_type
     *
     * @mbggenerated
     */
    List<TActivityType> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TActivityType record);
}