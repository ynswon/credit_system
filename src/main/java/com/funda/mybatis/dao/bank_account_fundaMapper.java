package com.funda.mybatis.dao;

import com.funda.mybatis.model.bank_account_funda;
import com.funda.mybatis.model.bank_account_fundaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bank_account_fundaMapper {
    int countByExample(bank_account_fundaExample example);

    int deleteByExample(bank_account_fundaExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(bank_account_funda record);

    int insertSelective(bank_account_funda record);

    List<bank_account_funda> selectByExample(bank_account_fundaExample example);

    bank_account_funda selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") bank_account_funda record, @Param("example") bank_account_fundaExample example);

    int updateByExample(@Param("record") bank_account_funda record, @Param("example") bank_account_fundaExample example);

    int updateByPrimaryKeySelective(bank_account_funda record);

    int updateByPrimaryKey(bank_account_funda record);
}