package com.aotubuy.Dao;

import com.aotubuy.Model.DollGoodsCategory;
import java.util.List;

public interface DollGoodsCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_goods_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_goods_category
     *
     * @mbggenerated
     */
    int insert(DollGoodsCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_goods_category
     *
     * @mbggenerated
     */
    DollGoodsCategory selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_goods_category
     *
     * @mbggenerated
     */
    List<DollGoodsCategory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_goods_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DollGoodsCategory record);
}