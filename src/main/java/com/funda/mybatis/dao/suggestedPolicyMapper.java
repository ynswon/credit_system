package com.funda.mybatis.dao;

import com.funda.mybatis.model.suggestedPolicy;
import com.funda.mybatis.model.suggestedPolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface suggestedPolicyMapper {
    int countByExample(suggestedPolicyExample example);

    int deleteByExample(suggestedPolicyExample example);

  //  int deleteByPrimaryKey(Integer idx);

    int insert(suggestedPolicy record);

    int insertSelective(suggestedPolicy record);

    List<suggestedPolicy> selectByExample(suggestedPolicyExample example);

 //   suggestedPolicy selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") suggestedPolicy record, @Param("example") suggestedPolicyExample example);

    int updateByExample(@Param("record") suggestedPolicy record, @Param("example") suggestedPolicyExample example);

    //int updateByPrimaryKeySelective(suggestedPolicy record);

    //int updateByPrimaryKey(suggestedPolicy record);
}