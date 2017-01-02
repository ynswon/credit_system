package com.funda.mybatis.dao;

import com.funda.mybatis.model.earnings_and_expense;
import com.funda.mybatis.model.earnings_and_expenseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface earnings_and_expenseMapper {
    int countByExample(earnings_and_expenseExample example);

    int deleteByExample(earnings_and_expenseExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(earnings_and_expense record);

    int insertSelective(earnings_and_expense record);

    List<earnings_and_expense> selectByExample(earnings_and_expenseExample example);

    earnings_and_expense selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") earnings_and_expense record, @Param("example") earnings_and_expenseExample example);

    int updateByExample(@Param("record") earnings_and_expense record, @Param("example") earnings_and_expenseExample example);

    int updateByPrimaryKeySelective(earnings_and_expense record);

    int updateByPrimaryKey(earnings_and_expense record);
}