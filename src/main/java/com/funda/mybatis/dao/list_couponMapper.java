package com.funda.mybatis.dao;

import com.funda.mybatis.model.list_coupon;
import com.funda.mybatis.model.list_couponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface list_couponMapper {
    int countByExample(list_couponExample example);

    int deleteByExample(list_couponExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(list_coupon record);

    int insertSelective(list_coupon record);

    List<list_coupon> selectByExample(list_couponExample example);

    list_coupon selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") list_coupon record, @Param("example") list_couponExample example);

    int updateByExample(@Param("record") list_coupon record, @Param("example") list_couponExample example);

    int updateByPrimaryKeySelective(list_coupon record);

    int updateByPrimaryKey(list_coupon record);
}