package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="bank_account_funda")
public class bank_account_funda {

    @XmlElement
    private Integer idx;
    @XmlElement
    private String accountHolder;
    @XmlElement
    private Integer bank;
    @XmlElement
    private String accountWoHyphen;
    @XmlElement
    private String account;
    @XmlElement
    private String isVirtual;
    @XmlElement
    private Integer userIdx;

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

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
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

    public String getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual == null ? null : isVirtual.trim();
    }

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }
}