package com.aotubuy.Dao;

import com.aotubuy.Model.TCouponProduct;
import java.util.List;

public interface TCouponProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_product
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_product
     *
     * @mbggenerated
     */
    int insert(TCouponProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_product
     *
     * @mbggenerated
     */
    TCouponProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_product
     *
     * @mbggenerated
     */
    List<TCouponProduct> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_product
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TCouponProduct record);
}