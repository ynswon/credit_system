package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="applicationdatas")
public class applicationdataList extends application_data {

    @XmlElement(name = "applicationdata")
    private List<application_data> persons = null;

    public List<application_data> getApplicationDataList() {
        return persons;
    }

    public void setApplicationDataList(List<application_data> persons) {
        this.persons = persons;
    }

}