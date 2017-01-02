package com.funda.mybatis.dao;

import com.funda.mybatis.model.user_login_log;
import com.funda.mybatis.model.user_login_logExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface user_login_logMapper {
    int countByExample(user_login_logExample example);

    int deleteByExample(user_login_logExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(user_login_log record);

    int insertSelective(user_login_log record);

    List<user_login_log> selectByExample(user_login_logExample example);

    user_login_log selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") user_login_log record, @Param("example") user_login_logExample example);

    int updateByExample(@Param("record") user_login_log record, @Param("example") user_login_logExample example);

    int updateByPrimaryKeySelective(user_login_log record);

    int updateByPrimaryKey(user_login_log record);
}