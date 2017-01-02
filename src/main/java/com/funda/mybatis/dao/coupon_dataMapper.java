package com.funda.mybatis.dao;

import com.funda.mybatis.model.coupon_data;
import com.funda.mybatis.model.coupon_dataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface coupon_dataMapper {
    int countByExample(coupon_dataExample example);

    int deleteByExample(coupon_dataExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(coupon_data record);

    int insertSelective(coupon_data record);

    List<coupon_data> selectByExampleWithBLOBs(coupon_dataExample example);

    List<coupon_data> selectByExample(coupon_dataExample example);

    coupon_data selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") coupon_data record, @Param("example") coupon_dataExample example);

    int updateByExampleWithBLOBs(@Param("record") coupon_data record, @Param("example") coupon_dataExample example);

    int updateByExample(@Param("record") coupon_data record, @Param("example") coupon_dataExample example);

    int updateByPrimaryKeySelective(coupon_data record);

    int updateByPrimaryKeyWithBLOBs(coupon_data record);

    int updateByPrimaryKey(coupon_data record);
}