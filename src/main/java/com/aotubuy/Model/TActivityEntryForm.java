package com.aotubuy.Model;

import java.io.Serializable;
import java.util.Date;

public class TActivityEntryForm implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.activity_period_id
     *
     * @mbggenerated
     */
    private String activityPeriodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.sex
     *
     * @mbggenerated
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.certificate_id
     *
     * @mbggenerated
     */
    private String certificateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.passport_id
     *
     * @mbggenerated
     */
    private String passportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.laissez_passer_id
     *
     * @mbggenerated
     */
    private String laissezPasserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.certificate_validity
     *
     * @mbggenerated
     */
    private String certificateValidity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.passport_validity
     *
     * @mbggenerated
     */
    private String passportValidity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.laissez_passer_validity
     *
     * @mbggenerated
     */
    private String laissezPasserValidity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.phone_num
     *
     * @mbggenerated
     */
    private String phoneNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.tall
     *
     * @mbggenerated
     */
    private Short tall;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.weight
     *
     * @mbggenerated
     */
    private Short weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.school
     *
     * @mbggenerated
     */
    private String school;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.food
     *
     * @mbggenerated
     */
    private String food;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.grade
     *
     * @mbggenerated
     */
    private String grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.postcode
     *
     * @mbggenerated
     */
    private String postcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.emergency_contact_person
     *
     * @mbggenerated
     */
    private String emergencyContactPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.emergency_contact_person_phone
     *
     * @mbggenerated
     */
    private String emergencyContactPersonPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.emergency_contact_person_relation
     *
     * @mbggenerated
     */
    private String emergencyContactPersonRelation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.purpose
     *
     * @mbggenerated
     */
    private String purpose;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.hobby
     *
     * @mbggenerated
     */
    private String hobby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_entry_form.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_activity_entry_form
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.id
     *
     * @return the value of t_activity_entry_form.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.id
     *
     * @param id the value for t_activity_entry_form.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.activity_period_id
     *
     * @return the value of t_activity_entry_form.activity_period_id
     *
     * @mbggenerated
     */
    public String getActivityPeriodId() {
        return activityPeriodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.activity_period_id
     *
     * @param activityPeriodId the value for t_activity_entry_form.activity_period_id
     *
     * @mbggenerated
     */
    public void setActivityPeriodId(String activityPeriodId) {
        this.activityPeriodId = activityPeriodId == null ? null : activityPeriodId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.user_id
     *
     * @return the value of t_activity_entry_form.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.user_id
     *
     * @param userId the value for t_activity_entry_form.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.name
     *
     * @return the value of t_activity_entry_form.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.name
     *
     * @param name the value for t_activity_entry_form.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.sex
     *
     * @return the value of t_activity_entry_form.sex
     *
     * @mbggenerated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.sex
     *
     * @param sex the value for t_activity_entry_form.sex
     *
     * @mbggenerated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.certificate_id
     *
     * @return the value of t_activity_entry_form.certificate_id
     *
     * @mbggenerated
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.certificate_id
     *
     * @param certificateId the value for t_activity_entry_form.certificate_id
     *
     * @mbggenerated
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId == null ? null : certificateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.passport_id
     *
     * @return the value of t_activity_entry_form.passport_id
     *
     * @mbggenerated
     */
    public String getPassportId() {
        return passportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.passport_id
     *
     * @param passportId the value for t_activity_entry_form.passport_id
     *
     * @mbggenerated
     */
    public void setPassportId(String passportId) {
        this.passportId = passportId == null ? null : passportId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.laissez_passer_id
     *
     * @return the value of t_activity_entry_form.laissez_passer_id
     *
     * @mbggenerated
     */
    public String getLaissezPasserId() {
        return laissezPasserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.laissez_passer_id
     *
     * @param laissezPasserId the value for t_activity_entry_form.laissez_passer_id
     *
     * @mbggenerated
     */
    public void setLaissezPasserId(String laissezPasserId) {
        this.laissezPasserId = laissezPasserId == null ? null : laissezPasserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.certificate_validity
     *
     * @return the value of t_activity_entry_form.certificate_validity
     *
     * @mbggenerated
     */
    public String getCertificateValidity() {
        return certificateValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.certificate_validity
     *
     * @param certificateValidity the value for t_activity_entry_form.certificate_validity
     *
     * @mbggenerated
     */
    public void setCertificateValidity(String certificateValidity) {
        this.certificateValidity = certificateValidity == null ? null : certificateValidity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.passport_validity
     *
     * @return the value of t_activity_entry_form.passport_validity
     *
     * @mbggenerated
     */
    public String getPassportValidity() {
        return passportValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.passport_validity
     *
     * @param passportValidity the value for t_activity_entry_form.passport_validity
     *
     * @mbggenerated
     */
    public void setPassportValidity(String passportValidity) {
        this.passportValidity = passportValidity == null ? null : passportValidity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.laissez_passer_validity
     *
     * @return the value of t_activity_entry_form.laissez_passer_validity
     *
     * @mbggenerated
     */
    public String getLaissezPasserValidity() {
        return laissezPasserValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.laissez_passer_validity
     *
     * @param laissezPasserValidity the value for t_activity_entry_form.laissez_passer_validity
     *
     * @mbggenerated
     */
    public void setLaissezPasserValidity(String laissezPasserValidity) {
        this.laissezPasserValidity = laissezPasserValidity == null ? null : laissezPasserValidity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.phone_num
     *
     * @return the value of t_activity_entry_form.phone_num
     *
     * @mbggenerated
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.phone_num
     *
     * @param phoneNum the value for t_activity_entry_form.phone_num
     *
     * @mbggenerated
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.email
     *
     * @return the value of t_activity_entry_form.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.email
     *
     * @param email the value for t_activity_entry_form.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.tall
     *
     * @return the value of t_activity_entry_form.tall
     *
     * @mbggenerated
     */
    public Short getTall() {
        return tall;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.tall
     *
     * @param tall the value for t_activity_entry_form.tall
     *
     * @mbggenerated
     */
    public void setTall(Short tall) {
        this.tall = tall;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.weight
     *
     * @return the value of t_activity_entry_form.weight
     *
     * @mbggenerated
     */
    public Short getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.weight
     *
     * @param weight the value for t_activity_entry_form.weight
     *
     * @mbggenerated
     */
    public void setWeight(Short weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.school
     *
     * @return the value of t_activity_entry_form.school
     *
     * @mbggenerated
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.school
     *
     * @param school the value for t_activity_entry_form.school
     *
     * @mbggenerated
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.food
     *
     * @return the value of t_activity_entry_form.food
     *
     * @mbggenerated
     */
    public String getFood() {
        return food;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.food
     *
     * @param food the value for t_activity_entry_form.food
     *
     * @mbggenerated
     */
    public void setFood(String food) {
        this.food = food == null ? null : food.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.grade
     *
     * @return the value of t_activity_entry_form.grade
     *
     * @mbggenerated
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.grade
     *
     * @param grade the value for t_activity_entry_form.grade
     *
     * @mbggenerated
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.address
     *
     * @return the value of t_activity_entry_form.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.address
     *
     * @param address the value for t_activity_entry_form.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.postcode
     *
     * @return the value of t_activity_entry_form.postcode
     *
     * @mbggenerated
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.postcode
     *
     * @param postcode the value for t_activity_entry_form.postcode
     *
     * @mbggenerated
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.emergency_contact_person
     *
     * @return the value of t_activity_entry_form.emergency_contact_person
     *
     * @mbggenerated
     */
    public String getEmergencyContactPerson() {
        return emergencyContactPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.emergency_contact_person
     *
     * @param emergencyContactPerson the value for t_activity_entry_form.emergency_contact_person
     *
     * @mbggenerated
     */
    public void setEmergencyContactPerson(String emergencyContactPerson) {
        this.emergencyContactPerson = emergencyContactPerson == null ? null : emergencyContactPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.emergency_contact_person_phone
     *
     * @return the value of t_activity_entry_form.emergency_contact_person_phone
     *
     * @mbggenerated
     */
    public String getEmergencyContactPersonPhone() {
        return emergencyContactPersonPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.emergency_contact_person_phone
     *
     * @param emergencyContactPersonPhone the value for t_activity_entry_form.emergency_contact_person_phone
     *
     * @mbggenerated
     */
    public void setEmergencyContactPersonPhone(String emergencyContactPersonPhone) {
        this.emergencyContactPersonPhone = emergencyContactPersonPhone == null ? null : emergencyContactPersonPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.emergency_contact_person_relation
     *
     * @return the value of t_activity_entry_form.emergency_contact_person_relation
     *
     * @mbggenerated
     */
    public String getEmergencyContactPersonRelation() {
        return emergencyContactPersonRelation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.emergency_contact_person_relation
     *
     * @param emergencyContactPersonRelation the value for t_activity_entry_form.emergency_contact_person_relation
     *
     * @mbggenerated
     */
    public void setEmergencyContactPersonRelation(String emergencyContactPersonRelation) {
        this.emergencyContactPersonRelation = emergencyContactPersonRelation == null ? null : emergencyContactPersonRelation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.city
     *
     * @return the value of t_activity_entry_form.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.city
     *
     * @param city the value for t_activity_entry_form.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.purpose
     *
     * @return the value of t_activity_entry_form.purpose
     *
     * @mbggenerated
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.purpose
     *
     * @param purpose the value for t_activity_entry_form.purpose
     *
     * @mbggenerated
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.hobby
     *
     * @return the value of t_activity_entry_form.hobby
     *
     * @mbggenerated
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.hobby
     *
     * @param hobby the value for t_activity_entry_form.hobby
     *
     * @mbggenerated
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.create_time
     *
     * @return the value of t_activity_entry_form.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.create_time
     *
     * @param createTime the value for t_activity_entry_form.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_entry_form.modify_time
     *
     * @return the value of t_activity_entry_form.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_entry_form.modify_time
     *
     * @param modifyTime the value for t_activity_entry_form.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_entry_form
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
        sb.append(", activityPeriodId=").append(activityPeriodId);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", certificateId=").append(certificateId);
        sb.append(", passportId=").append(passportId);
        sb.append(", laissezPasserId=").append(laissezPasserId);
        sb.append(", certificateValidity=").append(certificateValidity);
        sb.append(", passportValidity=").append(passportValidity);
        sb.append(", laissezPasserValidity=").append(laissezPasserValidity);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", email=").append(email);
        sb.append(", tall=").append(tall);
        sb.append(", weight=").append(weight);
        sb.append(", school=").append(school);
        sb.append(", food=").append(food);
        sb.append(", grade=").append(grade);
        sb.append(", address=").append(address);
        sb.append(", postcode=").append(postcode);
        sb.append(", emergencyContactPerson=").append(emergencyContactPerson);
        sb.append(", emergencyContactPersonPhone=").append(emergencyContactPersonPhone);
        sb.append(", emergencyContactPersonRelation=").append(emergencyContactPersonRelation);
        sb.append(", city=").append(city);
        sb.append(", purpose=").append(purpose);
        sb.append(", hobby=").append(hobby);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}