package com.aotubuy.Dao;

import com.aotubuy.Model.TCouponList;
import java.util.List;

public interface TCouponListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_list
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_list
     *
     * @mbggenerated
     */
    int insert(TCouponList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_list
     *
     * @mbggenerated
     */
    TCouponList selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_list
     *
     * @mbggenerated
     */
    List<TCouponList> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_list
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TCouponList record);
}