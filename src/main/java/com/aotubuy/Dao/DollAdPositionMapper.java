package com.aotubuy.Dao;

import com.aotubuy.Model.DollAdPosition;
import java.util.List;

public interface DollAdPositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_ad_position
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_ad_position
     *
     * @mbggenerated
     */
    int insert(DollAdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_ad_position
     *
     * @mbggenerated
     */
    DollAdPosition selectByPrimaryKey(Integer positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_ad_position
     *
     * @mbggenerated
     */
    List<DollAdPosition> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_ad_position
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DollAdPosition record);
}