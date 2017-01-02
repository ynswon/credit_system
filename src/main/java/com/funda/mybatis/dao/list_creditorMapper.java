package com.funda.mybatis.dao;

import com.funda.mybatis.model.list_creditor;
import com.funda.mybatis.model.list_creditorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface list_creditorMapper {
    int countByExample(list_creditorExample example);

    int deleteByExample(list_creditorExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(list_creditor record);

    int insertSelective(list_creditor record);

    List<list_creditor> selectByExample(list_creditorExample example);

    list_creditor selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") list_creditor record, @Param("example") list_creditorExample example);

    int updateByExample(@Param("record") list_creditor record, @Param("example") list_creditorExample example);

    int updateByPrimaryKeySelective(list_creditor record);

    int updateByPrimaryKey(list_creditor record);
}