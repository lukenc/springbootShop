package com.aotubuy.Dao;

import com.aotubuy.Model.DollCart;
import java.util.List;

public interface DollCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_cart
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_cart
     *
     * @mbggenerated
     */
    int insert(DollCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_cart
     *
     * @mbggenerated
     */
    DollCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_cart
     *
     * @mbggenerated
     */
    List<DollCart> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_cart
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DollCart record);
}