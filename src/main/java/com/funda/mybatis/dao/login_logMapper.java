package com.funda.mybatis.dao;

import com.funda.mybatis.model.login_log;
import com.funda.mybatis.model.login_logExample;
import com.funda.mybatis.model.login_logWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface login_logMapper {
    int countByExample(login_logExample example);

    int deleteByExample(login_logExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(login_logWithBLOBs record);

    int insertSelective(login_logWithBLOBs record);

    List<login_logWithBLOBs> selectByExampleWithBLOBs(login_logExample example);

    List<login_log> selectByExample(login_logExample example);

    login_logWithBLOBs selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") login_logWithBLOBs record, @Param("example") login_logExample example);

    int updateByExampleWithBLOBs(@Param("record") login_logWithBLOBs record, @Param("example") login_logExample example);

    int updateByExample(@Param("record") login_log record, @Param("example") login_logExample example);

    int updateByPrimaryKeySelective(login_logWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(login_logWithBLOBs record);

    int updateByPrimaryKey(login_log record);
}