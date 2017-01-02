package com.funda.mybatis.dao;

import com.funda.mybatis.model.user;
import com.funda.mybatis.model.userExample;
import com.funda.mybatis.model.userWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userMapper {
    int countByExample(userExample example);

    int deleteByExample(userExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(userWithBLOBs record);

    int insertSelective(userWithBLOBs record);

    List<userWithBLOBs> selectByExampleWithBLOBs(userExample example);

    List<user> selectByExample(userExample example);

    userWithBLOBs selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") userWithBLOBs record, @Param("example") userExample example);

    int updateByExampleWithBLOBs(@Param("record") userWithBLOBs record, @Param("example") userExample example);

    int updateByExample(@Param("record") user record, @Param("example") userExample example);

    int updateByPrimaryKeySelective(userWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(userWithBLOBs record);

    int updateByPrimaryKey(user record);
}