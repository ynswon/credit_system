package com.funda.mybatis.dao;

import com.funda.mybatis.model.list_creditor_log;
import com.funda.mybatis.model.list_creditor_logExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface list_creditor_logMapper {
    int countByExample(list_creditor_logExample example);

    int deleteByExample(list_creditor_logExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(list_creditor_log record);

    int insertSelective(list_creditor_log record);

    List<list_creditor_log> selectByExampleWithBLOBs(list_creditor_logExample example);

    List<list_creditor_log> selectByExample(list_creditor_logExample example);

    list_creditor_log selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") list_creditor_log record, @Param("example") list_creditor_logExample example);

    int updateByExampleWithBLOBs(@Param("record") list_creditor_log record, @Param("example") list_creditor_logExample example);

    int updateByExample(@Param("record") list_creditor_log record, @Param("example") list_creditor_logExample example);

    int updateByPrimaryKeySelective(list_creditor_log record);

    int updateByPrimaryKeyWithBLOBs(list_creditor_log record);

    int updateByPrimaryKey(list_creditor_log record);
}