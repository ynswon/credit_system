package com.funda.mybatis.dao;

import com.funda.mybatis.model.balance_and_deposit;
import com.funda.mybatis.model.balance_and_depositExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface balance_and_depositMapper {
    int countByExample(balance_and_depositExample example);

    int deleteByExample(balance_and_depositExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(balance_and_deposit record);

    int insertSelective(balance_and_deposit record);

    List<balance_and_deposit> selectByExampleWithBLOBs(balance_and_depositExample example);

    List<balance_and_deposit> selectByExample(balance_and_depositExample example);

    balance_and_deposit selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") balance_and_deposit record, @Param("example") balance_and_depositExample example);

    int updateByExampleWithBLOBs(@Param("record") balance_and_deposit record, @Param("example") balance_and_depositExample example);

    int updateByExample(@Param("record") balance_and_deposit record, @Param("example") balance_and_depositExample example);

    int updateByPrimaryKeySelective(balance_and_deposit record);

    int updateByPrimaryKeyWithBLOBs(balance_and_deposit record);

    int updateByPrimaryKey(balance_and_deposit record);
}