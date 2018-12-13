package com.aotubuy.Model;

import java.io.Serializable;
import java.util.Date;

public class TUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_type
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.mobile_number
     *
     * @mbggenerated
     */
    private String mobileNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.passwd
     *
     * @mbggenerated
     */
    private String passwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.wx_name
     *
     * @mbggenerated
     */
    private String wxName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.img
     *
     * @mbggenerated
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.reg_channel_code
     *
     * @mbggenerated
     */
    private Integer regChannelCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.reg_channel
     *
     * @mbggenerated
     */
    private String regChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.prompt_code
     *
     * @mbggenerated
     */
    private String promptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.referrer_id
     *
     * @mbggenerated
     */
    private String referrerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.wx_img
     *
     * @mbggenerated
     */
    private String wxImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.wx_open_id
     *
     * @mbggenerated
     */
    private String wxOpenId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.qr_code_img
     *
     * @mbggenerated
     */
    private String qrCodeImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.name
     *
     * @return the value of t_user.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.name
     *
     * @param name the value for t_user.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_type
     *
     * @return the value of t_user.user_type
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_type
     *
     * @param userType the value for t_user.user_type
     *
     * @mbggenerated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.mobile_number
     *
     * @return the value of t_user.mobile_number
     *
     * @mbggenerated
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.mobile_number
     *
     * @param mobileNumber the value for t_user.mobile_number
     *
     * @mbggenerated
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.passwd
     *
     * @return the value of t_user.passwd
     *
     * @mbggenerated
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.passwd
     *
     * @param passwd the value for t_user.passwd
     *
     * @mbggenerated
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.wx_name
     *
     * @return the value of t_user.wx_name
     *
     * @mbggenerated
     */
    public String getWxName() {
        return wxName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.wx_name
     *
     * @param wxName the value for t_user.wx_name
     *
     * @mbggenerated
     */
    public void setWxName(String wxName) {
        this.wxName = wxName == null ? null : wxName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.img
     *
     * @return the value of t_user.img
     *
     * @mbggenerated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.img
     *
     * @param img the value for t_user.img
     *
     * @mbggenerated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.reg_channel_code
     *
     * @return the value of t_user.reg_channel_code
     *
     * @mbggenerated
     */
    public Integer getRegChannelCode() {
        return regChannelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.reg_channel_code
     *
     * @param regChannelCode the value for t_user.reg_channel_code
     *
     * @mbggenerated
     */
    public void setRegChannelCode(Integer regChannelCode) {
        this.regChannelCode = regChannelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.reg_channel
     *
     * @return the value of t_user.reg_channel
     *
     * @mbggenerated
     */
    public String getRegChannel() {
        return regChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.reg_channel
     *
     * @param regChannel the value for t_user.reg_channel
     *
     * @mbggenerated
     */
    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel == null ? null : regChannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.prompt_code
     *
     * @return the value of t_user.prompt_code
     *
     * @mbggenerated
     */
    public String getPromptCode() {
        return promptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.prompt_code
     *
     * @param promptCode the value for t_user.prompt_code
     *
     * @mbggenerated
     */
    public void setPromptCode(String promptCode) {
        this.promptCode = promptCode == null ? null : promptCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.referrer_id
     *
     * @return the value of t_user.referrer_id
     *
     * @mbggenerated
     */
    public String getReferrerId() {
        return referrerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.referrer_id
     *
     * @param referrerId the value for t_user.referrer_id
     *
     * @mbggenerated
     */
    public void setReferrerId(String referrerId) {
        this.referrerId = referrerId == null ? null : referrerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.create_time
     *
     * @return the value of t_user.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.create_time
     *
     * @param createTime the value for t_user.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.wx_img
     *
     * @return the value of t_user.wx_img
     *
     * @mbggenerated
     */
    public String getWxImg() {
        return wxImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.wx_img
     *
     * @param wxImg the value for t_user.wx_img
     *
     * @mbggenerated
     */
    public void setWxImg(String wxImg) {
        this.wxImg = wxImg == null ? null : wxImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.wx_open_id
     *
     * @return the value of t_user.wx_open_id
     *
     * @mbggenerated
     */
    public String getWxOpenId() {
        return wxOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.wx_open_id
     *
     * @param wxOpenId the value for t_user.wx_open_id
     *
     * @mbggenerated
     */
    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId == null ? null : wxOpenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.qr_code_img
     *
     * @return the value of t_user.qr_code_img
     *
     * @mbggenerated
     */
    public String getQrCodeImg() {
        return qrCodeImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.qr_code_img
     *
     * @param qrCodeImg the value for t_user.qr_code_img
     *
     * @mbggenerated
     */
    public void setQrCodeImg(String qrCodeImg) {
        this.qrCodeImg = qrCodeImg == null ? null : qrCodeImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
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
        sb.append(", userType=").append(userType);
        sb.append(", mobileNumber=").append(mobileNumber);
        sb.append(", passwd=").append(passwd);
        sb.append(", wxName=").append(wxName);
        sb.append(", img=").append(img);
        sb.append(", email=").append(email);
        sb.append(", regChannelCode=").append(regChannelCode);
        sb.append(", regChannel=").append(regChannel);
        sb.append(", promptCode=").append(promptCode);
        sb.append(", referrerId=").append(referrerId);
        sb.append(", createTime=").append(createTime);
        sb.append(", wxImg=").append(wxImg);
        sb.append(", wxOpenId=").append(wxOpenId);
        sb.append(", qrCodeImg=").append(qrCodeImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}