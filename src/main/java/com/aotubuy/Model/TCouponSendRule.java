package com.aotubuy.Model;

import java.io.Serializable;
import java.util.Date;

public class TCouponSendRule implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_send_rule.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_send_rule.object_class
     *
     * @mbggenerated
     */
    private String objectClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_send_rule.object_property
     *
     * @mbggenerated
     */
    private String objectProperty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_send_rule.operator
     *
     * @mbggenerated
     */
    private String operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_send_rule.condition
     *
     * @mbggenerated
     */
    private String condition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_send_rule.coupon_id
     *
     * @mbggenerated
     */
    private String couponId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_send_rule.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_send_rule.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_send_rule.promotion_id
     *
     * @mbggenerated
     */
    private String promotionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_coupon_send_rule
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_send_rule.id
     *
     * @return the value of t_coupon_send_rule.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_send_rule.id
     *
     * @param id the value for t_coupon_send_rule.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_send_rule.object_class
     *
     * @return the value of t_coupon_send_rule.object_class
     *
     * @mbggenerated
     */
    public String getObjectClass() {
        return objectClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_send_rule.object_class
     *
     * @param objectClass the value for t_coupon_send_rule.object_class
     *
     * @mbggenerated
     */
    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass == null ? null : objectClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_send_rule.object_property
     *
     * @return the value of t_coupon_send_rule.object_property
     *
     * @mbggenerated
     */
    public String getObjectProperty() {
        return objectProperty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_send_rule.object_property
     *
     * @param objectProperty the value for t_coupon_send_rule.object_property
     *
     * @mbggenerated
     */
    public void setObjectProperty(String objectProperty) {
        this.objectProperty = objectProperty == null ? null : objectProperty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_send_rule.operator
     *
     * @return the value of t_coupon_send_rule.operator
     *
     * @mbggenerated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_send_rule.operator
     *
     * @param operator the value for t_coupon_send_rule.operator
     *
     * @mbggenerated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_send_rule.condition
     *
     * @return the value of t_coupon_send_rule.condition
     *
     * @mbggenerated
     */
    public String getCondition() {
        return condition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_send_rule.condition
     *
     * @param condition the value for t_coupon_send_rule.condition
     *
     * @mbggenerated
     */
    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_send_rule.coupon_id
     *
     * @return the value of t_coupon_send_rule.coupon_id
     *
     * @mbggenerated
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_send_rule.coupon_id
     *
     * @param couponId the value for t_coupon_send_rule.coupon_id
     *
     * @mbggenerated
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_send_rule.creator
     *
     * @return the value of t_coupon_send_rule.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_send_rule.creator
     *
     * @param creator the value for t_coupon_send_rule.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_send_rule.create_time
     *
     * @return the value of t_coupon_send_rule.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_send_rule.create_time
     *
     * @param createTime the value for t_coupon_send_rule.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_send_rule.promotion_id
     *
     * @return the value of t_coupon_send_rule.promotion_id
     *
     * @mbggenerated
     */
    public String getPromotionId() {
        return promotionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_send_rule.promotion_id
     *
     * @param promotionId the value for t_coupon_send_rule.promotion_id
     *
     * @mbggenerated
     */
    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId == null ? null : promotionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_send_rule
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
        sb.append(", objectClass=").append(objectClass);
        sb.append(", objectProperty=").append(objectProperty);
        sb.append(", operator=").append(operator);
        sb.append(", condition=").append(condition);
        sb.append(", couponId=").append(couponId);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", promotionId=").append(promotionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}