package com.funda.mybatis.dao;

import com.funda.mybatis.model.schedule_debtor;
import com.funda.mybatis.model.schedule_debtorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface schedule_debtorMapper {
    int countByExample(schedule_debtorExample example);

    int deleteByExample(schedule_debtorExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(schedule_debtor record);

    int insertSelective(schedule_debtor record);

    List<schedule_debtor> selectByExample(schedule_debtorExample example);

    schedule_debtor selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") schedule_debtor record, @Param("example") schedule_debtorExample example);

    int updateByExample(@Param("record") schedule_debtor record, @Param("example") schedule_debtorExample example);

    int updateByPrimaryKeySelective(schedule_debtor record);

    int updateByPrimaryKey(schedule_debtor record);
}