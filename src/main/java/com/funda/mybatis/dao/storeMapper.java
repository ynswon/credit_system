package com.funda.mybatis.dao;

import com.funda.mybatis.model.store;
import com.funda.mybatis.model.storeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface storeMapper {
    int countByExample(storeExample example);

    int deleteByExample(storeExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(store record);

    int insertSelective(store record);

    List<store> selectByExampleWithBLOBs(storeExample example);

    List<store> selectByExample(storeExample example);

    store selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") store record, @Param("example") storeExample example);

    int updateByExampleWithBLOBs(@Param("record") store record, @Param("example") storeExample example);

    int updateByExample(@Param("record") store record, @Param("example") storeExample example);

    int updateByPrimaryKeySelective(store record);

    int updateByPrimaryKeyWithBLOBs(store record);

    int updateByPrimaryKey(store record);
}