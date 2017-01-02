package com.funda.mybatis.dao;

import com.funda.mybatis.model.deposit_withdrawal_request_log;
import com.funda.mybatis.model.deposit_withdrawal_request_logExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface deposit_withdrawal_request_logMapper {
    int countByExample(deposit_withdrawal_request_logExample example);

    int deleteByExample(deposit_withdrawal_request_logExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(deposit_withdrawal_request_log record);

    int insertSelective(deposit_withdrawal_request_log record);

    List<deposit_withdrawal_request_log> selectByExampleWithBLOBs(deposit_withdrawal_request_logExample example);

    List<deposit_withdrawal_request_log> selectByExample(deposit_withdrawal_request_logExample example);

    deposit_withdrawal_request_log selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") deposit_withdrawal_request_log record, @Param("example") deposit_withdrawal_request_logExample example);

    int updateByExampleWithBLOBs(@Param("record") deposit_withdrawal_request_log record, @Param("example") deposit_withdrawal_request_logExample example);

    int updateByExample(@Param("record") deposit_withdrawal_request_log record, @Param("example") deposit_withdrawal_request_logExample example);

    int updateByPrimaryKeySelective(deposit_withdrawal_request_log record);

    int updateByPrimaryKeyWithBLOBs(deposit_withdrawal_request_log record);

    int updateByPrimaryKey(deposit_withdrawal_request_log record);
}