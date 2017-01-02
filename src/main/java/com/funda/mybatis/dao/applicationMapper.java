package com.funda.mybatis.dao;

import com.funda.mybatis.model.application;
import com.funda.mybatis.model.applicationExample;
import com.funda.mybatis.model.applicationWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface applicationMapper {
    int countByExample(applicationExample example);

    int maxByExample(applicationExample example);

    int deleteByExample(applicationExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(applicationWithBLOBs record);

    int insertSelective(applicationWithBLOBs record);

    List<applicationWithBLOBs> selectByExampleWithBLOBs(applicationExample example);

    List<application> selectByExample(applicationExample example);

    List<application> selectByGroup(applicationExample example);

    List<application> selectByLimit(applicationExample example);

    applicationWithBLOBs selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") applicationWithBLOBs record, @Param("example") applicationExample example);

    int updateByExampleWithBLOBs(@Param("record") applicationWithBLOBs record, @Param("example") applicationExample example);

    int updateByExample(@Param("record") application record, @Param("example") applicationExample example);

    int updateByPrimaryKeySelective(applicationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(applicationWithBLOBs record);

    int updateByPrimaryKey(application record);
}