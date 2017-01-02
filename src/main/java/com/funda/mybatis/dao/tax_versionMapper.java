package com.funda.mybatis.dao;

import com.funda.mybatis.model.tax_version;
import com.funda.mybatis.model.tax_versionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface tax_versionMapper {
    int countByExample(tax_versionExample example);

    int deleteByExample(tax_versionExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(tax_version record);

    int insertSelective(tax_version record);

    List<tax_version> selectByExample(tax_versionExample example);

    tax_version selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") tax_version record, @Param("example") tax_versionExample example);

    int updateByExample(@Param("record") tax_version record, @Param("example") tax_versionExample example);

    int updateByPrimaryKeySelective(tax_version record);

    int updateByPrimaryKey(tax_version record);
}