package com.funda.mybatis.dao;

import com.funda.mybatis.model.refund_data_change_log;
import com.funda.mybatis.model.refund_data_change_logExample;
import com.funda.mybatis.model.refund_data_change_logWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface refund_data_change_logMapper {
    int countByExample(refund_data_change_logExample example);

    int deleteByExample(refund_data_change_logExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(refund_data_change_logWithBLOBs record);

    int insertSelective(refund_data_change_logWithBLOBs record);

    List<refund_data_change_logWithBLOBs> selectByExampleWithBLOBs(refund_data_change_logExample example);

    List<refund_data_change_log> selectByExample(refund_data_change_logExample example);

    refund_data_change_logWithBLOBs selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") refund_data_change_logWithBLOBs record, @Param("example") refund_data_change_logExample example);

    int updateByExampleWithBLOBs(@Param("record") refund_data_change_logWithBLOBs record, @Param("example") refund_data_change_logExample example);

    int updateByExample(@Param("record") refund_data_change_log record, @Param("example") refund_data_change_logExample example);

    int updateByPrimaryKeySelective(refund_data_change_logWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(refund_data_change_logWithBLOBs record);

    int updateByPrimaryKey(refund_data_change_log record);
}