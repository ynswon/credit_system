package com.funda.mybatis.dao;

import com.funda.mybatis.model.newsletter_phone;
import com.funda.mybatis.model.newsletter_phoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface newsletter_phoneMapper {
    int countByExample(newsletter_phoneExample example);

    int deleteByExample(newsletter_phoneExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(newsletter_phone record);

    int insertSelective(newsletter_phone record);

    List<newsletter_phone> selectByExample(newsletter_phoneExample example);

    newsletter_phone selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") newsletter_phone record, @Param("example") newsletter_phoneExample example);

    int updateByExample(@Param("record") newsletter_phone record, @Param("example") newsletter_phoneExample example);

    int updateByPrimaryKeySelective(newsletter_phone record);

    int updateByPrimaryKey(newsletter_phone record);
}