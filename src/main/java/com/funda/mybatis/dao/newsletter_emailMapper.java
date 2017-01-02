package com.funda.mybatis.dao;

import com.funda.mybatis.model.newsletter_email;
import com.funda.mybatis.model.newsletter_emailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface newsletter_emailMapper {
    int countByExample(newsletter_emailExample example);

    int deleteByExample(newsletter_emailExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(newsletter_email record);

    int insertSelective(newsletter_email record);

    List<newsletter_email> selectByExample(newsletter_emailExample example);

    newsletter_email selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") newsletter_email record, @Param("example") newsletter_emailExample example);

    int updateByExample(@Param("record") newsletter_email record, @Param("example") newsletter_emailExample example);

    int updateByPrimaryKeySelective(newsletter_email record);

    int updateByPrimaryKey(newsletter_email record);
}