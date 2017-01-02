package com.funda.mybatis.dao;

import com.funda.mybatis.model.account_contents;
import com.funda.mybatis.model.account_contentsExample;
import com.funda.mybatis.model.account_contentsWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface account_contentsMapper {
    int countByExample(account_contentsExample example);

    int deleteByExample(account_contentsExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(account_contentsWithBLOBs record);

    int insertSelective(account_contentsWithBLOBs record);

    List<account_contentsWithBLOBs> selectByExampleWithBLOBs(account_contentsExample example);

    List<account_contents> selectByExample(account_contentsExample example);

    account_contentsWithBLOBs selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") account_contentsWithBLOBs record, @Param("example") account_contentsExample example);

    int updateByExampleWithBLOBs(@Param("record") account_contentsWithBLOBs record, @Param("example") account_contentsExample example);

    int updateByExample(@Param("record") account_contents record, @Param("example") account_contentsExample example);

    int updateByPrimaryKeySelective(account_contentsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(account_contentsWithBLOBs record);

    int updateByPrimaryKey(account_contents record);
}