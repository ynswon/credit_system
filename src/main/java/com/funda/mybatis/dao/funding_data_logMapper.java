package com.funda.mybatis.dao;

import com.funda.mybatis.model.funding_data_log;
import com.funda.mybatis.model.funding_data_logExample;
import com.funda.mybatis.model.funding_data_logWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface funding_data_logMapper {
    int countByExample(funding_data_logExample example);

    int deleteByExample(funding_data_logExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(funding_data_logWithBLOBs record);

    int insertSelective(funding_data_logWithBLOBs record);

    List<funding_data_logWithBLOBs> selectByExampleWithBLOBs(funding_data_logExample example);

    List<funding_data_log> selectByExample(funding_data_logExample example);

    funding_data_logWithBLOBs selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") funding_data_logWithBLOBs record, @Param("example") funding_data_logExample example);

    int updateByExampleWithBLOBs(@Param("record") funding_data_logWithBLOBs record, @Param("example") funding_data_logExample example);

    int updateByExample(@Param("record") funding_data_log record, @Param("example") funding_data_logExample example);

    int updateByPrimaryKeySelective(funding_data_logWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(funding_data_logWithBLOBs record);

    int updateByPrimaryKey(funding_data_log record);
}