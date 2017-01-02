package com.funda.mybatis.dao;

import com.funda.mybatis.model.auto_token;
import com.funda.mybatis.model.auto_tokenExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface auto_tokenMapper {
    int countByExample(auto_tokenExample example);

    int deleteByExample(auto_tokenExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(auto_token record);

    int insertSelective(auto_token record);

    List<auto_token> selectByExample(auto_tokenExample example);

    auto_token selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") auto_token record, @Param("example") auto_tokenExample example);

    int updateByExample(@Param("record") auto_token record, @Param("example") auto_tokenExample example);

    int updateByPrimaryKeySelective(auto_token record);

    int updateByPrimaryKey(auto_token record);
}