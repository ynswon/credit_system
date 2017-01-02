package com.funda.mybatis.service;

import com.funda.mybatis.dao.credit_policyMapper;
import com.funda.mybatis.dao.disqualifiedReasonsMapper;
import com.funda.mybatis.model.credit_policy;
import com.funda.mybatis.model.credit_policyExample;
import com.funda.mybatis.model.disqualifiedReasons;
import com.funda.mybatis.model.disqualifiedReasonsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CreditPolicyDAOService implements credit_policyMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<credit_policy> selectByExample(credit_policyExample content) {

        credit_policyMapper account_content = sqlSession.getMapper(credit_policyMapper.class);
		List<credit_policy> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(credit_policy record) {
        credit_policyMapper bank_codeMapper = sqlSession.getMapper(credit_policyMapper.class);
		return	bank_codeMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") credit_policy record, @Param("example") credit_policyExample example) {
		// TODO Auto-generated method stub
        credit_policyMapper bank_codeMapper = sqlSession.getMapper(credit_policyMapper.class);
		return bank_codeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(credit_policyExample example)
	{
        credit_policyMapper bank_codeMapper = sqlSession.getMapper(credit_policyMapper.class);
		return	bank_codeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(credit_policyExample example)
	{
        credit_policyMapper bank_codeMapper = sqlSession.getMapper(credit_policyMapper.class);
		return	bank_codeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
        credit_policyMapper bank_codeMapper = sqlSession.getMapper(credit_policyMapper.class);
		return	bank_codeMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(credit_policy record)
	{
        credit_policyMapper bank_codeMapper = sqlSession.getMapper(credit_policyMapper.class);
		return	bank_codeMapper.insert(record);
	}




	@Override
	public credit_policy selectByPrimaryKey(Integer idx)
	{

        credit_policyMapper account_content = sqlSession.getMapper(credit_policyMapper.class);
        credit_policy result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") credit_policy record, @Param("example") credit_policyExample example)
	{
        credit_policyMapper bank_codeMapper = sqlSession.getMapper(credit_policyMapper.class);
		return bank_codeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(credit_policy record)
	{
        credit_policyMapper bank_codeMapper = sqlSession.getMapper(credit_policyMapper.class);
		return bank_codeMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(credit_policy record)
	{
        credit_policyMapper bank_codeMapper = sqlSession.getMapper(credit_policyMapper.class);
		return bank_codeMapper.updateByPrimaryKey(record);
	}


}
