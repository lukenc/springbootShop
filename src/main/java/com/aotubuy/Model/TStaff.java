package com.aotubuy.Model;

import java.io.Serializable;
import java.util.Date;

public class TStaff implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.admin_name
     *
     * @mbggenerated
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.passwd
     *
     * @mbggenerated
     */
    private String passwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.mobile_number
     *
     * @mbggenerated
     */
    private String mobileNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.img
     *
     * @mbggenerated
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.position
     *
     * @mbggenerated
     */
    private String position;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.belong_id
     *
     * @mbggenerated
     */
    private String belongId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.is_disable
     *
     * @mbggenerated
     */
    private Integer isDisable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.is_sacrifice
     *
     * @mbggenerated
     */
    private Integer isSacrifice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.belong_company
     *
     * @mbggenerated
     */
    private Integer belongCompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.company_short_name
     *
     * @mbggenerated
     */
    private String companyShortName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.email_password
     *
     * @mbggenerated
     */
    private String emailPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_staff.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_staff
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.id
     *
     * @return the value of t_staff.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.id
     *
     * @param id the value for t_staff.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.admin_name
     *
     * @return the value of t_staff.admin_name
     *
     * @mbggenerated
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.admin_name
     *
     * @param adminName the value for t_staff.admin_name
     *
     * @mbggenerated
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.passwd
     *
     * @return the value of t_staff.passwd
     *
     * @mbggenerated
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.passwd
     *
     * @param passwd the value for t_staff.passwd
     *
     * @mbggenerated
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.name
     *
     * @return the value of t_staff.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.name
     *
     * @param name the value for t_staff.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.mobile_number
     *
     * @return the value of t_staff.mobile_number
     *
     * @mbggenerated
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.mobile_number
     *
     * @param mobileNumber the value for t_staff.mobile_number
     *
     * @mbggenerated
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.email
     *
     * @return the value of t_staff.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.email
     *
     * @param email the value for t_staff.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.img
     *
     * @return the value of t_staff.img
     *
     * @mbggenerated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.img
     *
     * @param img the value for t_staff.img
     *
     * @mbggenerated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.create_time
     *
     * @return the value of t_staff.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.create_time
     *
     * @param createTime the value for t_staff.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.position
     *
     * @return the value of t_staff.position
     *
     * @mbggenerated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.position
     *
     * @param position the value for t_staff.position
     *
     * @mbggenerated
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.belong_id
     *
     * @return the value of t_staff.belong_id
     *
     * @mbggenerated
     */
    public String getBelongId() {
        return belongId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.belong_id
     *
     * @param belongId the value for t_staff.belong_id
     *
     * @mbggenerated
     */
    public void setBelongId(String belongId) {
        this.belongId = belongId == null ? null : belongId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.is_disable
     *
     * @return the value of t_staff.is_disable
     *
     * @mbggenerated
     */
    public Integer getIsDisable() {
        return isDisable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.is_disable
     *
     * @param isDisable the value for t_staff.is_disable
     *
     * @mbggenerated
     */
    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.is_sacrifice
     *
     * @return the value of t_staff.is_sacrifice
     *
     * @mbggenerated
     */
    public Integer getIsSacrifice() {
        return isSacrifice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.is_sacrifice
     *
     * @param isSacrifice the value for t_staff.is_sacrifice
     *
     * @mbggenerated
     */
    public void setIsSacrifice(Integer isSacrifice) {
        this.isSacrifice = isSacrifice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.belong_company
     *
     * @return the value of t_staff.belong_company
     *
     * @mbggenerated
     */
    public Integer getBelongCompany() {
        return belongCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.belong_company
     *
     * @param belongCompany the value for t_staff.belong_company
     *
     * @mbggenerated
     */
    public void setBelongCompany(Integer belongCompany) {
        this.belongCompany = belongCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.company_short_name
     *
     * @return the value of t_staff.company_short_name
     *
     * @mbggenerated
     */
    public String getCompanyShortName() {
        return companyShortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.company_short_name
     *
     * @param companyShortName the value for t_staff.company_short_name
     *
     * @mbggenerated
     */
    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName == null ? null : companyShortName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.email_password
     *
     * @return the value of t_staff.email_password
     *
     * @mbggenerated
     */
    public String getEmailPassword() {
        return emailPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.email_password
     *
     * @param emailPassword the value for t_staff.email_password
     *
     * @mbggenerated
     */
    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword == null ? null : emailPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.username
     *
     * @return the value of t_staff.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.username
     *
     * @param username the value for t_staff.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_staff.password
     *
     * @return the value of t_staff.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_staff.password
     *
     * @param password the value for t_staff.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_staff
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
        sb.append(", adminName=").append(adminName);
        sb.append(", passwd=").append(passwd);
        sb.append(", name=").append(name);
        sb.append(", mobileNumber=").append(mobileNumber);
        sb.append(", email=").append(email);
        sb.append(", img=").append(img);
        sb.append(", createTime=").append(createTime);
        sb.append(", position=").append(position);
        sb.append(", belongId=").append(belongId);
        sb.append(", isDisable=").append(isDisable);
        sb.append(", isSacrifice=").append(isSacrifice);
        sb.append(", belongCompany=").append(belongCompany);
        sb.append(", companyShortName=").append(companyShortName);
        sb.append(", emailPassword=").append(emailPassword);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}