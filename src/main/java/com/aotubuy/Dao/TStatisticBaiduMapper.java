package com.aotubuy.Dao;

import com.aotubuy.Model.TStatisticBaidu;
import java.util.List;

public interface TStatisticBaiduMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_baidu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_baidu
     *
     * @mbggenerated
     */
    int insert(TStatisticBaidu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_baidu
     *
     * @mbggenerated
     */
    TStatisticBaidu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_baidu
     *
     * @mbggenerated
     */
    List<TStatisticBaidu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_baidu
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TStatisticBaidu record);
}