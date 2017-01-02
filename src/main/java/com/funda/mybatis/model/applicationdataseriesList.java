package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="applicationDataSeriess")
public class applicationdataseriesList extends application_data_series {

    @XmlElement(name = "applicationDataSeries")
    private List<application_data_series> persons = null;

    public List<application_data_series> getApplicationDataSeries() {
        return persons;
    }

    public void setApplicationDataSeries(List<application_data_series> persons) {
        this.persons = persons;
    }

}