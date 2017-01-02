package com.funda.mybatis.service;

import com.funda.mybatis.dao.credit_policyMapper;
import com.funda.mybatis.dao.suggestedPolicyMapper;
import com.funda.mybatis.model.credit_policy;
import com.funda.mybatis.model.credit_policyExample;
import com.funda.mybatis.model.suggestedPolicy;
import com.funda.mybatis.model.suggestedPolicyExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SuggestedPolicyDAOService implements suggestedPolicyMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<suggestedPolicy> selectByExample(suggestedPolicyExample content) {

        suggestedPolicyMapper account_content = sqlSession.getMapper(suggestedPolicyMapper.class);
		List<suggestedPolicy> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(suggestedPolicy record) {
        suggestedPolicyMapper bank_codeMapper = sqlSession.getMapper(suggestedPolicyMapper.class);
		return	bank_codeMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") suggestedPolicy record, @Param("example") suggestedPolicyExample example) {
		// TODO Auto-generated method stub
        suggestedPolicyMapper bank_codeMapper = sqlSession.getMapper(suggestedPolicyMapper.class);
		return bank_codeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(suggestedPolicyExample example)
	{
        suggestedPolicyMapper bank_codeMapper = sqlSession.getMapper(suggestedPolicyMapper.class);
		return	bank_codeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(suggestedPolicyExample example)
	{
        suggestedPolicyMapper bank_codeMapper = sqlSession.getMapper(suggestedPolicyMapper.class);
		return	bank_codeMapper.deleteByExample(example);
	}


	@Override
	public int insert(suggestedPolicy record)
	{
        suggestedPolicyMapper bank_codeMapper = sqlSession.getMapper(suggestedPolicyMapper.class);
		return	bank_codeMapper.insert(record);
	}




	@Override
	public int updateByExample(@Param("record") suggestedPolicy record, @Param("example") suggestedPolicyExample example)
	{
        suggestedPolicyMapper bank_codeMapper = sqlSession.getMapper(suggestedPolicyMapper.class);
		return bank_codeMapper.updateByExample(record, example);
	}



}
