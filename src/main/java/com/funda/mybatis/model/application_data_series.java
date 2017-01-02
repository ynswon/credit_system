package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="application_data_series")
public class application_data_series {

    @XmlElement
    private Integer idx;
    @XmlElement
    private Integer refIdx;
    @XmlElement
    private String segIdx;
    @XmlElement
    private String seriesIdx;
    @XmlElement
    private String value;
    @XmlElement
    private Date date;
    @XmlElement
    private String segName;
    @XmlElement
    private String seriesName;
    @XmlElement
    private String detailIdx;


    public Integer getSegCount() {
        return segCount;
    }

    public void setSegCount(Integer segCount) {
        this.segCount = segCount;
    }

    @XmlElement
    private Integer segCount;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @XmlElement
    private Integer count;


    public String getSeriesDetailIdx() {
        return seriesDetailIdx;
    }

    public void setSeriesDetailIdx(String seriesDetailIdx) {
        this.seriesDetailIdx = seriesDetailIdx;
    }

    @XmlElement
    private String seriesDetailIdx;

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

    public String getSegIdx() {
        return segIdx;
    }

    public void setSegIdx(String segIdx) {
        this.segIdx = segIdx == null ? null : segIdx.trim();
    }

    public String getSeriesIdx() {
        return seriesIdx;
    }

    public void setSeriesIdx(String seriesIdx) {
        this.seriesIdx = seriesIdx == null ? null : seriesIdx.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSegName() {
        return segName;
    }

    public void setSegName(String segName) {
        this.segName = segName == null ? null : segName.trim();
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName == null ? null : seriesName.trim();
    }

    public String getDetailIdx() {
        return detailIdx;
    }

    public void setDetailIdx(String detailIdx) {
        this.detailIdx = detailIdx == null ? null : detailIdx.trim();
    }
}