package com.funda.mybatis.service;

import com.funda.mybatis.dao.bank_account_fundaMapper;
import com.funda.mybatis.model.bank_account_funda;
import com.funda.mybatis.model.bank_account_fundaExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BankAccountFundaDAOService implements bank_account_fundaMapper
{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<bank_account_funda> selectByExample(bank_account_fundaExample content) {

		bank_account_fundaMapper account_content = sqlSession.getMapper(bank_account_fundaMapper.class);
		List<bank_account_funda> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(bank_account_funda record) {
		bank_account_fundaMapper bank_account_fundaMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_account_fundaMapper.class);
		return	bank_account_fundaMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") bank_account_funda record, @Param("example") bank_account_fundaExample example) {
		// TODO Auto-generated method stub
		bank_account_fundaMapper bank_account_fundaMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_account_fundaMapper.class);
		return bank_account_fundaMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(bank_account_fundaExample example)
	{
		bank_account_fundaMapper bank_account_fundaMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_account_fundaMapper.class);
		return	bank_account_fundaMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(bank_account_fundaExample example)
	{
		bank_account_fundaMapper bank_account_fundaMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_account_fundaMapper.class);
		return	bank_account_fundaMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		bank_account_fundaMapper bank_account_fundaMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_account_fundaMapper.class);
		return	bank_account_fundaMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(bank_account_funda record)
	{
		bank_account_fundaMapper bank_account_fundaMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_account_fundaMapper.class);
		return	bank_account_fundaMapper.insert(record);
	}




	@Override
	public bank_account_funda selectByPrimaryKey(Integer idx)
	{

		bank_account_fundaMapper account_content = sqlSession.getMapper(bank_account_fundaMapper.class);
		bank_account_funda result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") bank_account_funda record, @Param("example") bank_account_fundaExample example)
	{
		bank_account_fundaMapper bank_account_fundaMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_account_fundaMapper.class);
		return bank_account_fundaMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(bank_account_funda record)
	{
		bank_account_fundaMapper bank_account_fundaMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_account_fundaMapper.class);
		return bank_account_fundaMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(bank_account_funda record)
	{
		bank_account_fundaMapper bank_account_fundaMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_account_fundaMapper.class);
		return bank_account_fundaMapper.updateByPrimaryKey(record);
	}


}
