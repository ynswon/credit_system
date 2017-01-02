package com.funda.mybatis.dao;

import com.funda.mybatis.model.messaging_sms;
import com.funda.mybatis.model.messaging_smsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface messaging_smsMapper {
    int countByExample(messaging_smsExample example);

    int deleteByExample(messaging_smsExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(messaging_sms record);

    int insertSelective(messaging_sms record);

    List<messaging_sms> selectByExampleWithBLOBs(messaging_smsExample example);

    List<messaging_sms> selectByExample(messaging_smsExample example);

    messaging_sms selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") messaging_sms record, @Param("example") messaging_smsExample example);

    int updateByExampleWithBLOBs(@Param("record") messaging_sms record, @Param("example") messaging_smsExample example);

    int updateByExample(@Param("record") messaging_sms record, @Param("example") messaging_smsExample example);

    int updateByPrimaryKeySelective(messaging_sms record);

    int updateByPrimaryKeyWithBLOBs(messaging_sms record);

    int updateByPrimaryKey(messaging_sms record);
}