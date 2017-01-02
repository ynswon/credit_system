package com.funda.mybatis.dao;

import com.funda.mybatis.model.schedule_creditor;
import com.funda.mybatis.model.schedule_creditorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface schedule_creditorMapper {
    int countByExample(schedule_creditorExample example);

    int deleteByExample(schedule_creditorExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(schedule_creditor record);

    int insertSelective(schedule_creditor record);

    List<schedule_creditor> selectByExample(schedule_creditorExample example);

    schedule_creditor selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") schedule_creditor record, @Param("example") schedule_creditorExample example);

    int updateByExample(@Param("record") schedule_creditor record, @Param("example") schedule_creditorExample example);

    int updateByPrimaryKeySelective(schedule_creditor record);

    int updateByPrimaryKey(schedule_creditor record);
}