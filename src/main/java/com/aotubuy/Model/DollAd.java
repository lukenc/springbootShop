package com.aotubuy.Model;

import java.io.Serializable;

public class DollAd implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.ad_id
     *
     * @mbggenerated
     */
    private Integer adId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.pid
     *
     * @mbggenerated
     */
//    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.media_type
     *
     * @mbggenerated
     */
    private Byte mediaType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.ad_name
     *
     * @mbggenerated
     */
    private String adName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.ad_link
     *
     * @mbggenerated
     */
    private String adLink;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.start_time
     *
     * @mbggenerated
     */
    private Integer startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.end_time
     *
     * @mbggenerated
     */
    private Integer endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.link_man
     *
     * @mbggenerated
     */
    private String linkMan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.link_email
     *
     * @mbggenerated
     */
    private String linkEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.link_phone
     *
     * @mbggenerated
     */
    private String linkPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.click_count
     *
     * @mbggenerated
     */
    private Integer clickCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.enabled
     *
     * @mbggenerated
     */
    private Byte enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.orderby
     *
     * @mbggenerated
     */
    private Short orderby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.target
     *
     * @mbggenerated
     */
    private Boolean target;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.bgcolor
     *
     * @mbggenerated
     */
    private String bgcolor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doll_ad.ad_code
     *
     * @mbggenerated
     */
    private String adCode;


    private DollAdPosition adPosition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doll_ad
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.ad_id
     *
     * @return the value of doll_ad.ad_id
     *
     * @mbggenerated
     */
    public Integer getAdId() {
        return adId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.ad_id
     *
     * @param adId the value for doll_ad.ad_id
     *
     * @mbggenerated
     */
    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.pid
     *
     * @return the value of doll_ad.pid
     *
     * @mbggenerated
     */
//    public Integer getPid() {
//        return pid;
//    }
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method sets the value of the database column doll_ad.pid
//     *
//     * @param pid the value for doll_ad.pid
//     *
//     * @mbggenerated
//     */
//    public void setPid(Integer pid) {
//        this.pid = pid;
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.media_type
     *
     * @return the value of doll_ad.media_type
     *
     * @mbggenerated
     */
    public Byte getMediaType() {
        return mediaType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.media_type
     *
     * @param mediaType the value for doll_ad.media_type
     *
     * @mbggenerated
     */
    public void setMediaType(Byte mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.ad_name
     *
     * @return the value of doll_ad.ad_name
     *
     * @mbggenerated
     */
    public String getAdName() {
        return adName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.ad_name
     *
     * @param adName the value for doll_ad.ad_name
     *
     * @mbggenerated
     */
    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.ad_link
     *
     * @return the value of doll_ad.ad_link
     *
     * @mbggenerated
     */
    public String getAdLink() {
        return adLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.ad_link
     *
     * @param adLink the value for doll_ad.ad_link
     *
     * @mbggenerated
     */
    public void setAdLink(String adLink) {
        this.adLink = adLink == null ? null : adLink.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.start_time
     *
     * @return the value of doll_ad.start_time
     *
     * @mbggenerated
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.start_time
     *
     * @param startTime the value for doll_ad.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.end_time
     *
     * @return the value of doll_ad.end_time
     *
     * @mbggenerated
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.end_time
     *
     * @param endTime the value for doll_ad.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.link_man
     *
     * @return the value of doll_ad.link_man
     *
     * @mbggenerated
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.link_man
     *
     * @param linkMan the value for doll_ad.link_man
     *
     * @mbggenerated
     */
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.link_email
     *
     * @return the value of doll_ad.link_email
     *
     * @mbggenerated
     */
    public String getLinkEmail() {
        return linkEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.link_email
     *
     * @param linkEmail the value for doll_ad.link_email
     *
     * @mbggenerated
     */
    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail == null ? null : linkEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.link_phone
     *
     * @return the value of doll_ad.link_phone
     *
     * @mbggenerated
     */
    public String getLinkPhone() {
        return linkPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.link_phone
     *
     * @param linkPhone the value for doll_ad.link_phone
     *
     * @mbggenerated
     */
    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.click_count
     *
     * @return the value of doll_ad.click_count
     *
     * @mbggenerated
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.click_count
     *
     * @param clickCount the value for doll_ad.click_count
     *
     * @mbggenerated
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.enabled
     *
     * @return the value of doll_ad.enabled
     *
     * @mbggenerated
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.enabled
     *
     * @param enabled the value for doll_ad.enabled
     *
     * @mbggenerated
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.orderby
     *
     * @return the value of doll_ad.orderby
     *
     * @mbggenerated
     */
    public Short getOrderby() {
        return orderby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.orderby
     *
     * @param orderby the value for doll_ad.orderby
     *
     * @mbggenerated
     */
    public void setOrderby(Short orderby) {
        this.orderby = orderby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.target
     *
     * @return the value of doll_ad.target
     *
     * @mbggenerated
     */
    public Boolean getTarget() {
        return target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.target
     *
     * @param target the value for doll_ad.target
     *
     * @mbggenerated
     */
    public void setTarget(Boolean target) {
        this.target = target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.bgcolor
     *
     * @return the value of doll_ad.bgcolor
     *
     * @mbggenerated
     */
    public String getBgcolor() {
        return bgcolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.bgcolor
     *
     * @param bgcolor the value for doll_ad.bgcolor
     *
     * @mbggenerated
     */
    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor == null ? null : bgcolor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doll_ad.ad_code
     *
     * @return the value of doll_ad.ad_code
     *
     * @mbggenerated
     */
    public String getAdCode() {
        return adCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doll_ad.ad_code
     *
     * @param adCode the value for doll_ad.ad_code
     *
     * @mbggenerated
     */
    public void setAdCode(String adCode) {
        this.adCode = adCode == null ? null : adCode.trim();
    }



    public DollAdPosition getAdPosition() {
        return adPosition;
    }

    public void setAdPosition(DollAdPosition adPosition) {
        this.adPosition = adPosition;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doll_ad
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adId=").append(adId);
//        sb.append(", pid=").append(pid);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", adName=").append(adName);
        sb.append(", adLink=").append(adLink);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", linkMan=").append(linkMan);
        sb.append(", linkEmail=").append(linkEmail);
        sb.append(", linkPhone=").append(linkPhone);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", enabled=").append(enabled);
        sb.append(", orderby=").append(orderby);
        sb.append(", target=").append(target);
        sb.append(", bgcolor=").append(bgcolor);
        sb.append(", adCode=").append(adCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}