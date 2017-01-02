package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="application_data")
public class application_data {

    @XmlElement
    private Integer idx;

    @XmlElement
    private Integer refIdx;

    @XmlElement
    private String typePrefix;

    @XmlElement
    private String type;

    @XmlElement
    private Integer typeIdx;

    @XmlElement
    private String value;

    @XmlElement
    private Integer seriesCount;

    @XmlElement
    private Date date;

    @XmlElement
    private String memo;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getRefIdx() {
        return refIdx;
    }

    public void setRefIdx(Integer refIdx) {
        this.refIdx = refIdx;
    }

    public String getTypePrefix() {
        return typePrefix;
    }

    public void setTypePrefix(String typePrefix) {
        this.typePrefix = typePrefix == null ? null : typePrefix.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getTypeIdx() {
        return typeIdx;
    }

    public void setTypeIdx(Integer typeIdx) {
        this.typeIdx = typeIdx;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getSeriesCount() {
        return seriesCount;
    }

    public void setSeriesCount(Integer seriesCount) {
        this.seriesCount = seriesCount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}