package com.funda.mybatis.dao;

import com.funda.mybatis.model.funding_data;
import com.funda.mybatis.model.funding_dataExample;
import com.funda.mybatis.model.funding_dataWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface funding_dataMapper {
    int countByExample(funding_dataExample example);

    int deleteByExample(funding_dataExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(funding_dataWithBLOBs record);

    int insertSelective(funding_dataWithBLOBs record);

    List<funding_dataWithBLOBs> selectByExampleWithBLOBs(funding_dataExample example);

    List<funding_data> selectByExample(funding_dataExample example);

    funding_dataWithBLOBs selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") funding_dataWithBLOBs record, @Param("example") funding_dataExample example);

    int updateByExampleWithBLOBs(@Param("record") funding_dataWithBLOBs record, @Param("example") funding_dataExample example);

    int updateByExample(@Param("record") funding_data record, @Param("example") funding_dataExample example);

    int updateByPrimaryKeySelective(funding_dataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(funding_dataWithBLOBs record);

    int updateByPrimaryKey(funding_data record);
}