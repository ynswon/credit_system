package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="users")
public class userList extends userWithBLOBs {

    @XmlElement(name = "user")
    private List<userWithBLOBs> persons = null;

    public List<userWithBLOBs> getUsers() {
        return persons;
    }

    public void setUsers(List<userWithBLOBs> persons) {
        this.persons = persons;
    }

}