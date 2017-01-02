package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="bank_account")
public class bank_account {

    @XmlElement
    private Integer idx;

    @XmlElement
    private String accountHolder;
    @XmlElement
    private String bank;
    @XmlElement
    private Integer bankCode;
    @XmlElement
    private String accountWoHyphen;
    @XmlElement
    private String account;
    @XmlElement
    private Boolean isVirtual;
    @XmlElement
    private String address;
    @XmlElement
    private String regNum;
    @XmlElement
    private String comment;
    @XmlElement
    private Integer validationFlag;
    @XmlElement
    private String tossName;
    @XmlElement
    private Date lastUpdate;
    @XmlElement
    private String tossMetadata;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder == null ? null : accountHolder.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public Integer getBankCode() {
        return bankCode;
    }

    public void setBankCode(Integer bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccountWoHyphen() {
        return accountWoHyphen;
    }

    public void setAccountWoHyphen(String accountWoHyphen) {
        this.accountWoHyphen = accountWoHyphen == null ? null : accountWoHyphen.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Boolean getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum == null ? null : regNum.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getValidationFlag() {
        return validationFlag;
    }

    public void setValidationFlag(Integer validationFlag) {
        this.validationFlag = validationFlag;
    }

    public String getTossName() {
        return tossName;
    }

    public void setTossName(String tossName) {
        this.tossName = tossName == null ? null : tossName.trim();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getTossMetadata() {
        return tossMetadata;
    }

    public void setTossMetadata(String tossMetadata) {
        this.tossMetadata = tossMetadata == null ? null : tossMetadata.trim();
    }
}