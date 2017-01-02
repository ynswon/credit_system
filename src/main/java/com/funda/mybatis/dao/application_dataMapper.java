package com.funda.mybatis.dao;

import com.funda.mybatis.model.application_data;
import com.funda.mybatis.model.application_dataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface application_dataMapper {
    int countByExample(application_dataExample example);

    int deleteByExample(application_dataExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(application_data record);

    int insertSelective(application_data record);

    List<application_data> selectByExampleWithBLOBs(application_dataExample example);

    List<application_data> selectByExample(application_dataExample example);

    application_data selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") application_data record, @Param("example") application_dataExample example);

    //int updateByExampleWithBLOBs(@Param("record") application_data record, @Param("example") application_dataExample example);

    int updateByExample(@Param("record") application_data record, @Param("example") application_dataExample example);

    int updateByPrimaryKeySelective(application_data record);

 //   int updateByPrimaryKeyWithBLOBs(application_data record);

    int updateByPrimaryKey(application_data record);
}