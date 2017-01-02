package com.funda.mybatis.dao;

import com.funda.mybatis.model.stay_signed_in;
import com.funda.mybatis.model.stay_signed_inExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface stay_signed_inMapper {
    int countByExample(stay_signed_inExample example);

    int deleteByExample(stay_signed_inExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(stay_signed_in record);

    int insertSelective(stay_signed_in record);

    List<stay_signed_in> selectByExample(stay_signed_inExample example);

    stay_signed_in selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") stay_signed_in record, @Param("example") stay_signed_inExample example);

    int updateByExample(@Param("record") stay_signed_in record, @Param("example") stay_signed_inExample example);

    int updateByPrimaryKeySelective(stay_signed_in record);

    int updateByPrimaryKey(stay_signed_in record);
}