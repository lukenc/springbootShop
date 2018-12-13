package com.aotubuy.Model;

import java.io.Serializable;

public class DollGoodsCategory implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.id
     *
     * @mbggenerated
     */
    private Short id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.mobile_name
     *
     * @mbggenerated
     */
    private String mobileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.parent_id
     *
     * @mbggenerated
     */
    private Short parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.parent_id_path
     *
     * @mbggenerated
     */
    private String parentIdPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.level
     *
     * @mbggenerated
     */
    private Byte level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.sort_order
     *
     * @mbggenerated
     */
    private Boolean sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.is_show
     *
     * @mbggenerated
     */
    private Boolean isShow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.image
     *
     * @mbggenerated
     */
    private String image;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.is_hot
     *
     * @mbggenerated
     */
    private Boolean isHot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.cat_group
     *
     * @mbggenerated
     */
    private Boolean catGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.commission_rate
     *
     * @mbggenerated
     */
    private Boolean commissionRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.desc
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.tall
     *
     * @mbggenerated
     */
    private String tall;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.breast
     *
     * @mbggenerated
     */
    private String breast;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_goods_category.clothes
     *
     * @mbggenerated
     */
    private String clothes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doll_goods_category
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.id
     *
     * @return the value of doll_goods_category.id
     *
     * @mbggenerated
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.id
     *
     * @param id the value for doll_goods_category.id
     *
     * @mbggenerated
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.name
     *
     * @return the value of doll_goods_category.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.name
     *
     * @param name the value for doll_goods_category.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.mobile_name
     *
     * @return the value of doll_goods_category.mobile_name
     *
     * @mbggenerated
     */
    public String getMobileName() {
        return mobileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.mobile_name
     *
     * @param mobileName the value for doll_goods_category.mobile_name
     *
     * @mbggenerated
     */
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName == null ? null : mobileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.parent_id
     *
     * @return the value of doll_goods_category.parent_id
     *
     * @mbggenerated
     */
    public Short getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.parent_id
     *
     * @param parentId the value for doll_goods_category.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.parent_id_path
     *
     * @return the value of doll_goods_category.parent_id_path
     *
     * @mbggenerated
     */
    public String getParentIdPath() {
        return parentIdPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.parent_id_path
     *
     * @param parentIdPath the value for doll_goods_category.parent_id_path
     *
     * @mbggenerated
     */
    public void setParentIdPath(String parentIdPath) {
        this.parentIdPath = parentIdPath == null ? null : parentIdPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.level
     *
     * @return the value of doll_goods_category.level
     *
     * @mbggenerated
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.level
     *
     * @param level the value for doll_goods_category.level
     *
     * @mbggenerated
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.sort_order
     *
     * @return the value of doll_goods_category.sort_order
     *
     * @mbggenerated
     */
    public Boolean getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.sort_order
     *
     * @param sortOrder the value for doll_goods_category.sort_order
     *
     * @mbggenerated
     */
    public void setSortOrder(Boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.is_show
     *
     * @return the value of doll_goods_category.is_show
     *
     * @mbggenerated
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.is_show
     *
     * @param isShow the value for doll_goods_category.is_show
     *
     * @mbggenerated
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.image
     *
     * @return the value of doll_goods_category.image
     *
     * @mbggenerated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.image
     *
     * @param image the value for doll_goods_category.image
     *
     * @mbggenerated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.is_hot
     *
     * @return the value of doll_goods_category.is_hot
     *
     * @mbggenerated
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.is_hot
     *
     * @param isHot the value for doll_goods_category.is_hot
     *
     * @mbggenerated
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.cat_group
     *
     * @return the value of doll_goods_category.cat_group
     *
     * @mbggenerated
     */
    public Boolean getCatGroup() {
        return catGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.cat_group
     *
     * @param catGroup the value for doll_goods_category.cat_group
     *
     * @mbggenerated
     */
    public void setCatGroup(Boolean catGroup) {
        this.catGroup = catGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.commission_rate
     *
     * @return the value of doll_goods_category.commission_rate
     *
     * @mbggenerated
     */
    public Boolean getCommissionRate() {
        return commissionRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.commission_rate
     *
     * @param commissionRate the value for doll_goods_category.commission_rate
     *
     * @mbggenerated
     */
    public void setCommissionRate(Boolean commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.desc
     *
     * @return the value of doll_goods_category.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.desc
     *
     * @param desc the value for doll_goods_category.desc
     *
     * @mbggenerated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.tall
     *
     * @return the value of doll_goods_category.tall
     *
     * @mbggenerated
     */
    public String getTall() {
        return tall;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.tall
     *
     * @param tall the value for doll_goods_category.tall
     *
     * @mbggenerated
     */
    public void setTall(String tall) {
        this.tall = tall == null ? null : tall.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.breast
     *
     * @return the value of doll_goods_category.breast
     *
     * @mbggenerated
     */
    public String getBreast() {
        return breast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.breast
     *
     * @param breast the value for doll_goods_category.breast
     *
     * @mbggenerated
     */
    public void setBreast(String breast) {
        this.breast = breast == null ? null : breast.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_goods_category.clothes
     *
     * @return the value of doll_goods_category.clothes
     *
     * @mbggenerated
     */
    public String getClothes() {
        return clothes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_goods_category.clothes
     *
     * @param clothes the value for doll_goods_category.clothes
     *
     * @mbggenerated
     */
    public void setClothes(String clothes) {
        this.clothes = clothes == null ? null : clothes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_goods_category
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", mobileName=").append(mobileName);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentIdPath=").append(parentIdPath);
        sb.append(", level=").append(level);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", isShow=").append(isShow);
        sb.append(", image=").append(image);
        sb.append(", isHot=").append(isHot);
        sb.append(", catGroup=").append(catGroup);
        sb.append(", commissionRate=").append(commissionRate);
        sb.append(", desc=").append(desc);
        sb.append(", tall=").append(tall);
        sb.append(", breast=").append(breast);
        sb.append(", clothes=").append(clothes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}