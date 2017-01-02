package com.funda.mybatis.dao;

import com.funda.mybatis.model.calendar;
import com.funda.mybatis.model.calendarExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface calendarMapper {
    int countByExample(calendarExample example);

    int deleteByExample(calendarExample example);

    int deleteByPrimaryKey(Date date);

    int insert(calendar record);

    int insertSelective(calendar record);

    List<calendar> selectByExample(calendarExample example);

    calendar selectByPrimaryKey(Date date);

    int updateByExampleSelective(@Param("record") calendar record, @Param("example") calendarExample example);

    int updateByExample(@Param("record") calendar record, @Param("example") calendarExample example);

    int updateByPrimaryKeySelective(calendar record);

    int updateByPrimaryKey(calendar record);
}