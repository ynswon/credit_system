package com.funda.mybatis.dao;

import com.funda.mybatis.model.credit_policy;
import com.funda.mybatis.model.credit_policyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface credit_policyMapper {
    int countByExample(credit_policyExample example);

    int deleteByExample(credit_policyExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(credit_policy record);

    int insertSelective(credit_policy record);

    List<credit_policy> selectByExample(credit_policyExample example);

    credit_policy selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") credit_policy record, @Param("example") credit_policyExample example);

    int updateByExample(@Param("record") credit_policy record, @Param("example") credit_policyExample example);

    int updateByPrimaryKeySelective(credit_policy record);

    int updateByPrimaryKey(credit_policy record);
}