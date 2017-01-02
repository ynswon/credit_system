package com.funda.mybatis.dao;

import com.funda.mybatis.model.user_auth;
import com.funda.mybatis.model.user_authExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface user_authMapper {
    int countByExample(user_authExample example);

    int deleteByExample(user_authExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(user_auth record);

    int insertSelective(user_auth record);

    List<user_auth> selectByExampleWithBLOBs(user_authExample example);

    List<user_auth> selectByExample(user_authExample example);

    user_auth selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") user_auth record, @Param("example") user_authExample example);

    int updateByExampleWithBLOBs(@Param("record") user_auth record, @Param("example") user_authExample example);

    int updateByExample(@Param("record") user_auth record, @Param("example") user_authExample example);

    int updateByPrimaryKeySelective(user_auth record);

    int updateByPrimaryKeyWithBLOBs(user_auth record);

    int updateByPrimaryKey(user_auth record);
}