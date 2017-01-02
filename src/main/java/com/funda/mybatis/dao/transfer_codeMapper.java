package com.funda.mybatis.dao;

import com.funda.mybatis.model.transfer_code;
import com.funda.mybatis.model.transfer_codeExample;
import com.funda.mybatis.model.transfer_codeWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface transfer_codeMapper {
    int countByExample(transfer_codeExample example);

    int deleteByExample(transfer_codeExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(transfer_codeWithBLOBs record);

    int insertSelective(transfer_codeWithBLOBs record);

    List<transfer_codeWithBLOBs> selectByExampleWithBLOBs(transfer_codeExample example);

    List<transfer_code> selectByExample(transfer_codeExample example);

    transfer_codeWithBLOBs selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") transfer_codeWithBLOBs record, @Param("example") transfer_codeExample example);

    int updateByExampleWithBLOBs(@Param("record") transfer_codeWithBLOBs record, @Param("example") transfer_codeExample example);

    int updateByExample(@Param("record") transfer_code record, @Param("example") transfer_codeExample example);

    int updateByPrimaryKeySelective(transfer_codeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(transfer_codeWithBLOBs record);

    int updateByPrimaryKey(transfer_code record);
}