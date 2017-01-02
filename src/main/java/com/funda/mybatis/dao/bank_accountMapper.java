package com.funda.mybatis.dao;

import com.funda.mybatis.model.bank_account;
import com.funda.mybatis.model.bank_accountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bank_accountMapper {
    int countByExample(bank_accountExample example);

    int deleteByExample(bank_accountExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(bank_account record);

    int insertSelective(bank_account record);

    List<bank_account> selectByExampleWithBLOBs(bank_accountExample example);

    List<bank_account> selectByExample(bank_accountExample example);

    bank_account selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") bank_account record, @Param("example") bank_accountExample example);

    int updateByExampleWithBLOBs(@Param("record") bank_account record, @Param("example") bank_accountExample example);

    int updateByExample(@Param("record") bank_account record, @Param("example") bank_accountExample example);

    int updateByPrimaryKeySelective(bank_account record);

    int updateByPrimaryKeyWithBLOBs(bank_account record);

    int updateByPrimaryKey(bank_account record);
}