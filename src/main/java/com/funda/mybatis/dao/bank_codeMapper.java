package com.funda.mybatis.dao;

import com.funda.mybatis.model.bank_code;
import com.funda.mybatis.model.bank_codeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bank_codeMapper {
    int countByExample(bank_codeExample example);

    int deleteByExample(bank_codeExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(bank_code record);

    int insertSelective(bank_code record);

    List<bank_code> selectByExampleWithBLOBs(bank_codeExample example);

    List<bank_code> selectByExample(bank_codeExample example);

    bank_code selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") bank_code record, @Param("example") bank_codeExample example);

    int updateByExampleWithBLOBs(@Param("record") bank_code record, @Param("example") bank_codeExample example);

    int updateByExample(@Param("record") bank_code record, @Param("example") bank_codeExample example);

    int updateByPrimaryKeySelective(bank_code record);

    int updateByPrimaryKeyWithBLOBs(bank_code record);

    int updateByPrimaryKey(bank_code record);
}