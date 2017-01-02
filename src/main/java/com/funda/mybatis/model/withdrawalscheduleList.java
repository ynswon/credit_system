package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="withdrawalschedules")
public class withdrawalscheduleList extends withdrawal_schedule {

    @XmlElement(name = "withdrawalschedule")
    private List<withdrawal_schedule> persons = null;

    public List<withdrawal_schedule> getwithdrawal_schedule() {
        return persons;
    }

    public void setwithdrawal_schedule(List<withdrawal_schedule> persons) {
        this.persons = persons;
    }

}