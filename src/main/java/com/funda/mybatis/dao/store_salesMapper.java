package com.funda.mybatis.dao;

import com.funda.mybatis.model.store_sales;
import com.funda.mybatis.model.store_salesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface store_salesMapper {
    int countByExample(store_salesExample example);

    int deleteByExample(store_salesExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(store_sales record);

    int insertSelective(store_sales record);

    List<store_sales> selectByExampleWithBLOBs(store_salesExample example);

    List<store_sales> selectByExample(store_salesExample example);

    store_sales selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") store_sales record, @Param("example") store_salesExample example);

    int updateByExampleWithBLOBs(@Param("record") store_sales record, @Param("example") store_salesExample example);

    int updateByExample(@Param("record") store_sales record, @Param("example") store_salesExample example);

    int updateByPrimaryKeySelective(store_sales record);

    int updateByPrimaryKeyWithBLOBs(store_sales record);

    int updateByPrimaryKey(store_sales record);
}