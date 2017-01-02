package com.funda.mybatis.dao;

import com.funda.mybatis.model.contact;
import com.funda.mybatis.model.contactExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface contactMapper {
    int countByExample(contactExample example);

    int deleteByExample(contactExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(contact record);

    int insertSelective(contact record);

    List<contact> selectByExampleWithBLOBs(contactExample example);

    List<contact> selectByExample(contactExample example);

    contact selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") contact record, @Param("example") contactExample example);

    int updateByExampleWithBLOBs(@Param("record") contact record, @Param("example") contactExample example);

    int updateByExample(@Param("record") contact record, @Param("example") contactExample example);

    int updateByPrimaryKeySelective(contact record);

    int updateByPrimaryKeyWithBLOBs(contact record);

    int updateByPrimaryKey(contact record);
}