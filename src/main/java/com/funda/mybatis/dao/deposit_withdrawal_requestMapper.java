package com.funda.mybatis.dao;

import com.funda.mybatis.model.deposit_withdrawal_request;
import com.funda.mybatis.model.deposit_withdrawal_requestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface deposit_withdrawal_requestMapper {
    int countByExample(deposit_withdrawal_requestExample example);

    int deleteByExample(deposit_withdrawal_requestExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(deposit_withdrawal_request record);

    int insertSelective(deposit_withdrawal_request record);

    List<deposit_withdrawal_request> selectByExampleWithBLOBs(deposit_withdrawal_requestExample example);

    List<deposit_withdrawal_request> selectByExample(deposit_withdrawal_requestExample example);

    deposit_withdrawal_request selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") deposit_withdrawal_request record, @Param("example") deposit_withdrawal_requestExample example);

    int updateByExampleWithBLOBs(@Param("record") deposit_withdrawal_request record, @Param("example") deposit_withdrawal_requestExample example);

    int updateByExample(@Param("record") deposit_withdrawal_request record, @Param("example") deposit_withdrawal_requestExample example);

    int updateByPrimaryKeySelective(deposit_withdrawal_request record);

    int updateByPrimaryKeyWithBLOBs(deposit_withdrawal_request record);

    int updateByPrimaryKey(deposit_withdrawal_request record);
}