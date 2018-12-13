package com.aotubuy.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TActivityPeriod implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.type_id
     *
     * @mbggenerated
     */
    private String typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.start_time
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.pre_price
     *
     * @mbggenerated
     */
    private BigDecimal prePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.sign_up_start_time
     *
     * @mbggenerated
     */
    private Date signUpStartTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.sign_up_end_time
     *
     * @mbggenerated
     */
    private Date signUpEndTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.period_size
     *
     * @mbggenerated
     */
    private Integer periodSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.special_time
     *
     * @mbggenerated
     */
    private String specialTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.activity_plan
     *
     * @mbggenerated
     */
    private String activityPlan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.duration
     *
     * @mbggenerated
     */
    private String duration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.modifier
     *
     * @mbggenerated
     */
    private String modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.enable
     *
     * @mbggenerated
     */
    private Boolean enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_period.on_sale
     *
     * @mbggenerated
     */
    private Boolean onSale;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_activity_period
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.id
     *
     * @return the value of t_activity_period.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.id
     *
     * @param id the value for t_activity_period.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.type_id
     *
     * @return the value of t_activity_period.type_id
     *
     * @mbggenerated
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.type_id
     *
     * @param typeId the value for t_activity_period.type_id
     *
     * @mbggenerated
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.name
     *
     * @return the value of t_activity_period.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.name
     *
     * @param name the value for t_activity_period.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.start_time
     *
     * @return the value of t_activity_period.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.start_time
     *
     * @param startTime the value for t_activity_period.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.end_time
     *
     * @return the value of t_activity_period.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.end_time
     *
     * @param endTime the value for t_activity_period.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.price
     *
     * @return the value of t_activity_period.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.price
     *
     * @param price the value for t_activity_period.price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.pre_price
     *
     * @return the value of t_activity_period.pre_price
     *
     * @mbggenerated
     */
    public BigDecimal getPrePrice() {
        return prePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.pre_price
     *
     * @param prePrice the value for t_activity_period.pre_price
     *
     * @mbggenerated
     */
    public void setPrePrice(BigDecimal prePrice) {
        this.prePrice = prePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.sign_up_start_time
     *
     * @return the value of t_activity_period.sign_up_start_time
     *
     * @mbggenerated
     */
    public Date getSignUpStartTime() {
        return signUpStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.sign_up_start_time
     *
     * @param signUpStartTime the value for t_activity_period.sign_up_start_time
     *
     * @mbggenerated
     */
    public void setSignUpStartTime(Date signUpStartTime) {
        this.signUpStartTime = signUpStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.sign_up_end_time
     *
     * @return the value of t_activity_period.sign_up_end_time
     *
     * @mbggenerated
     */
    public Date getSignUpEndTime() {
        return signUpEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.sign_up_end_time
     *
     * @param signUpEndTime the value for t_activity_period.sign_up_end_time
     *
     * @mbggenerated
     */
    public void setSignUpEndTime(Date signUpEndTime) {
        this.signUpEndTime = signUpEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.period_size
     *
     * @return the value of t_activity_period.period_size
     *
     * @mbggenerated
     */
    public Integer getPeriodSize() {
        return periodSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.period_size
     *
     * @param periodSize the value for t_activity_period.period_size
     *
     * @mbggenerated
     */
    public void setPeriodSize(Integer periodSize) {
        this.periodSize = periodSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.special_time
     *
     * @return the value of t_activity_period.special_time
     *
     * @mbggenerated
     */
    public String getSpecialTime() {
        return specialTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.special_time
     *
     * @param specialTime the value for t_activity_period.special_time
     *
     * @mbggenerated
     */
    public void setSpecialTime(String specialTime) {
        this.specialTime = specialTime == null ? null : specialTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.activity_plan
     *
     * @return the value of t_activity_period.activity_plan
     *
     * @mbggenerated
     */
    public String getActivityPlan() {
        return activityPlan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.activity_plan
     *
     * @param activityPlan the value for t_activity_period.activity_plan
     *
     * @mbggenerated
     */
    public void setActivityPlan(String activityPlan) {
        this.activityPlan = activityPlan == null ? null : activityPlan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.duration
     *
     * @return the value of t_activity_period.duration
     *
     * @mbggenerated
     */
    public String getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.duration
     *
     * @param duration the value for t_activity_period.duration
     *
     * @mbggenerated
     */
    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.create_time
     *
     * @return the value of t_activity_period.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.create_time
     *
     * @param createTime the value for t_activity_period.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.modify_time
     *
     * @return the value of t_activity_period.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.modify_time
     *
     * @param modifyTime the value for t_activity_period.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.creator
     *
     * @return the value of t_activity_period.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.creator
     *
     * @param creator the value for t_activity_period.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.modifier
     *
     * @return the value of t_activity_period.modifier
     *
     * @mbggenerated
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.modifier
     *
     * @param modifier the value for t_activity_period.modifier
     *
     * @mbggenerated
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.enable
     *
     * @return the value of t_activity_period.enable
     *
     * @mbggenerated
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.enable
     *
     * @param enable the value for t_activity_period.enable
     *
     * @mbggenerated
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_period.on_sale
     *
     * @return the value of t_activity_period.on_sale
     *
     * @mbggenerated
     */
    public Boolean getOnSale() {
        return onSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_period.on_sale
     *
     * @param onSale the value for t_activity_period.on_sale
     *
     * @mbggenerated
     */
    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_period
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
        sb.append(", typeId=").append(typeId);
        sb.append(", name=").append(name);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", price=").append(price);
        sb.append(", prePrice=").append(prePrice);
        sb.append(", signUpStartTime=").append(signUpStartTime);
        sb.append(", signUpEndTime=").append(signUpEndTime);
        sb.append(", periodSize=").append(periodSize);
        sb.append(", specialTime=").append(specialTime);
        sb.append(", activityPlan=").append(activityPlan);
        sb.append(", duration=").append(duration);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", enable=").append(enable);
        sb.append(", onSale=").append(onSale);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}