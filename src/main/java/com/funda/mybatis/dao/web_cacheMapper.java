package com.funda.mybatis.dao;

import com.funda.mybatis.model.web_cache;
import com.funda.mybatis.model.web_cacheExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface web_cacheMapper {
    int countByExample(web_cacheExample example);

    int deleteByExample(web_cacheExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(web_cache record);

    int insertSelective(web_cache record);

    List<web_cache> selectByExample(web_cacheExample example);

    web_cache selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") web_cache record, @Param("example") web_cacheExample example);

    int updateByExample(@Param("record") web_cache record, @Param("example") web_cacheExample example);

    int updateByPrimaryKeySelective(web_cache record);

    int updateByPrimaryKey(web_cache record);
}