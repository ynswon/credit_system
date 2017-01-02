package com.funda.mybatis.dao;

import com.funda.mybatis.model.transfer_list;
import com.funda.mybatis.model.transfer_listExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface transfer_listMapper {
    int countByExample(transfer_listExample example);

    int deleteByExample(transfer_listExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(transfer_list record);

    int insertSelective(transfer_list record);

    List<transfer_list> selectByExampleWithBLOBs(transfer_listExample example);

    List<transfer_list> selectByExample(transfer_listExample example);

    transfer_list selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") transfer_list record, @Param("example") transfer_listExample example);

    int updateByExampleWithBLOBs(@Param("record") transfer_list record, @Param("example") transfer_listExample example);

    int updateByExample(@Param("record") transfer_list record, @Param("example") transfer_listExample example);

    int updateByPrimaryKeySelective(transfer_list record);

    int updateByPrimaryKeyWithBLOBs(transfer_list record);

    int updateByPrimaryKey(transfer_list record);
}