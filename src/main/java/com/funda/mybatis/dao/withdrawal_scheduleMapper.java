package com.funda.mybatis.dao;

import com.funda.mybatis.model.withdrawal_schedule;
import com.funda.mybatis.model.withdrawal_scheduleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface withdrawal_scheduleMapper {
    int countByExample(withdrawal_scheduleExample example);

    int deleteByExample(withdrawal_scheduleExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(withdrawal_schedule record);

    int insertSelective(withdrawal_schedule record);

    List<withdrawal_schedule> selectByExample(withdrawal_scheduleExample example);

    withdrawal_schedule selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") withdrawal_schedule record, @Param("example") withdrawal_scheduleExample example);

    int updateByExample(@Param("record") withdrawal_schedule record, @Param("example") withdrawal_scheduleExample example);

    int updateByPrimaryKeySelective(withdrawal_schedule record);

    int updateByPrimaryKey(withdrawal_schedule record);
}