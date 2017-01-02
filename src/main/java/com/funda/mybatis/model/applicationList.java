package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="applications")
public class applicationList extends application {

    @XmlElement(name = "application")
    private List<application> persons = null;

    public List<application> getApplication() {
        return persons;
    }

    public void setApplication(List<application> persons) {
        this.persons = persons;
    }

}