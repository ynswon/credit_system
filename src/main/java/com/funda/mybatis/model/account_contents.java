package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="account_content")
public class account_contents {

    @XmlElement
    private Integer idx;

    @XmlElement
    private Date datetime;

    @XmlElement
    private Integer bankaccount;

    @XmlElement
    private String name;

    @XmlElement
    private Integer deposit;

    @XmlElement
    private Integer withdrawal;

    @XmlElement
    private String correspondent;

    @XmlElement
    private String summary;

    @XmlElement
    private Integer balance;

    @XmlElement
    private Integer userIdx;

    @XmlElement
    private Integer storeIdx;

    @XmlElement
    private Integer vaIdx;

    @XmlElement
    private Integer commission;

    @XmlElement
    private Integer transStatus;

    @XmlElement
    private Integer step;

    @XmlElement
    private Integer escapeDuplication;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(Integer bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(Integer withdrawal) {
        this.withdrawal = withdrawal;
    }

    public String getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent == null ? null : correspondent.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public Integer getStoreIdx() {
        return storeIdx;
    }

    public void setStoreIdx(Integer storeIdx) {
        this.storeIdx = storeIdx;
    }

    public Integer getVaIdx() {
        return vaIdx;
    }

    public void setVaIdx(Integer vaIdx) {
        this.vaIdx = vaIdx;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public Integer getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Integer transStatus) {
        this.transStatus = transStatus;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getEscapeDuplication() {
        return escapeDuplication;
    }

    public void setEscapeDuplication(Integer escapeDuplication) {
        this.escapeDuplication = escapeDuplication;
    }
}