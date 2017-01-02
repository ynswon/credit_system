package com.funda.mybatis.dao;

import com.funda.mybatis.model.application_data_series;
import com.funda.mybatis.model.application_data_seriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface application_data_seriesMapper {
    int countByExample(application_data_seriesExample example);

    int deleteByExample(application_data_seriesExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(application_data_series record);

    int insertSelective(application_data_series record);

    List<application_data_series> selectByExample(application_data_seriesExample example);

    application_data_series selectByPrimaryKey(Integer idx);

    List<application_data_series> selectByCount(Integer ref_idx);

    int updateByExampleSelective(@Param("record") application_data_series record, @Param("example") application_data_seriesExample example);

    int updateByExample(@Param("record") application_data_series record, @Param("example") application_data_seriesExample example);

    int updateByPrimaryKeySelective(application_data_series record);

    int updateByPrimaryKey(application_data_series record);
}