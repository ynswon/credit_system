package com.funda.mybatis.sdao;

import com.funda.kcb.KCBClient;
import com.funda.kcb.KCBPerson;
import com.funda.mybatis.model.application;
import com.funda.mybatis.model.applicationExample;
import com.funda.mybatis.model.applicationWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KCBMapper {
    void save(KCBPerson kcbPerson);

}