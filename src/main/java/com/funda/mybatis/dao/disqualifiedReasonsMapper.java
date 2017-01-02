package com.funda.mybatis.dao;

import com.funda.mybatis.model.disqualifiedReasons;
import com.funda.mybatis.model.disqualifiedReasonsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface disqualifiedReasonsMapper {
    int countByExample(disqualifiedReasonsExample example);

    int deleteByExample(disqualifiedReasonsExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(disqualifiedReasons record);

    int insertSelective(disqualifiedReasons record);

    List<disqualifiedReasons> selectByExample(disqualifiedReasonsExample example);

    disqualifiedReasons selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") disqualifiedReasons record, @Param("example") disqualifiedReasonsExample example);

    int updateByExample(@Param("record") disqualifiedReasons record, @Param("example") disqualifiedReasonsExample example);

    int updateByPrimaryKeySelective(disqualifiedReasons record);

    int updateByPrimaryKey(disqualifiedReasons record);
}