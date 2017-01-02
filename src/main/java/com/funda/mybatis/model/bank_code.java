package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="bank_code")
public class bank_code {

    @XmlElement
    private Integer idx;
    @XmlElement
    private String name;
    @XmlElement
    private String tossCode;
    @XmlElement
    private String settlebankCode;
    @XmlElement
    private Integer settlebankIssuable;
    @XmlElement
    private String memo;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTossCode() {
        return tossCode;
    }

    public void setTossCode(String tossCode) {
        this.tossCode = tossCode == null ? null : tossCode.trim();
    }

    public String getSettlebankCode() {
        return settlebankCode;
    }

    public void setSettlebankCode(String settlebankCode) {
        this.settlebankCode = settlebankCode == null ? null : settlebankCode.trim();
    }

    public Integer getSettlebankIssuable() {
        return settlebankIssuable;
    }

    public void setSettlebankIssuable(Integer settlebankIssuable) {
        this.settlebankIssuable = settlebankIssuable;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}