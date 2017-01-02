package com.funda.mybatis.model;

import java.util.Date;

public class user {
    private Integer idx;

    private String userId;

    private String userPassword;

    private String userName;

    private String userGender;

    private String userEmail;

    private Integer userEmailAck;

    private String userPhone;

    private Integer userPhoneAck;

    private Date userBirthdate;

    private Integer userCategory;

    private String promotionSms;

    private String promotionEmail;

    private Date registerDate;

    private Date lastLoginDate;

    private Integer isAdmin;

    private Integer bankAccountIdx;

    private String smsValidationKey;

    private Date smsValidationExpire;

    private String emailValidationKey;

    private Date emailValidationExpire;

    private String regNum;

    private String address;

    private String vipCardNo;

    private String regNumOpen;

    private String addressOpen;

    private String withholding;

    private String agreeTerms;

    private String addressReward;

    private String phoneReward;

    private String nameReward;

    private Integer event;

    private String valid;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserEmailAck() {
        return userEmailAck;
    }

    public void setUserEmailAck(Integer userEmailAck) {
        this.userEmailAck = userEmailAck;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserPhoneAck() {
        return userPhoneAck;
    }

    public void setUserPhoneAck(Integer userPhoneAck) {
        this.userPhoneAck = userPhoneAck;
    }

    public Date getUserBirthdate() {
        return userBirthdate;
    }

    public void setUserBirthdate(Date userBirthdate) {
        this.userBirthdate = userBirthdate;
    }

    public Integer getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(Integer userCategory) {
        this.userCategory = userCategory;
    }

    public String getPromotionSms() {
        return promotionSms;
    }

    public void setPromotionSms(String promotionSms) {
        this.promotionSms = promotionSms == null ? null : promotionSms.trim();
    }

    public String getPromotionEmail() {
        return promotionEmail;
    }

    public void setPromotionEmail(String promotionEmail) {
        this.promotionEmail = promotionEmail == null ? null : promotionEmail.trim();
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getBankAccountIdx() {
        return bankAccountIdx;
    }

    public void setBankAccountIdx(Integer bankAccountIdx) {
        this.bankAccountIdx = bankAccountIdx;
    }

    public String getSmsValidationKey() {
        return smsValidationKey;
    }

    public void setSmsValidationKey(String smsValidationKey) {
        this.smsValidationKey = smsValidationKey == null ? null : smsValidationKey.trim();
    }

    public Date getSmsValidationExpire() {
        return smsValidationExpire;
    }

    public void setSmsValidationExpire(Date smsValidationExpire) {
        this.smsValidationExpire = smsValidationExpire;
    }

    public String getEmailValidationKey() {
        return emailValidationKey;
    }

    public void setEmailValidationKey(String emailValidationKey) {
        this.emailValidationKey = emailValidationKey == null ? null : emailValidationKey.trim();
    }

    public Date getEmailValidationExpire() {
        return emailValidationExpire;
    }

    public void setEmailValidationExpire(Date emailValidationExpire) {
        this.emailValidationExpire = emailValidationExpire;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum == null ? null : regNum.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getVipCardNo() {
        return vipCardNo;
    }

    public void setVipCardNo(String vipCardNo) {
        this.vipCardNo = vipCardNo == null ? null : vipCardNo.trim();
    }

    public String getRegNumOpen() {
        return regNumOpen;
    }

    public void setRegNumOpen(String regNumOpen) {
        this.regNumOpen = regNumOpen == null ? null : regNumOpen.trim();
    }

    public String getAddressOpen() {
        return addressOpen;
    }

    public void setAddressOpen(String addressOpen) {
        this.addressOpen = addressOpen == null ? null : addressOpen.trim();
    }

    public String getWithholding() {
        return withholding;
    }

    public void setWithholding(String withholding) {
        this.withholding = withholding == null ? null : withholding.trim();
    }

    public String getAgreeTerms() {
        return agreeTerms;
    }

    public void setAgreeTerms(String agreeTerms) {
        this.agreeTerms = agreeTerms == null ? null : agreeTerms.trim();
    }

    public String getAddressReward() {
        return addressReward;
    }

    public void setAddressReward(String addressReward) {
        this.addressReward = addressReward == null ? null : addressReward.trim();
    }

    public String getPhoneReward() {
        return phoneReward;
    }

    public void setPhoneReward(String phoneReward) {
        this.phoneReward = phoneReward == null ? null : phoneReward.trim();
    }

    public String getNameReward() {
        return nameReward;
    }

    public void setNameReward(String nameReward) {
        this.nameReward = nameReward == null ? null : nameReward.trim();
    }

    public Integer getEvent() {
        return event;
    }

    public void setEvent(Integer event) {
        this.event = event;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }
}