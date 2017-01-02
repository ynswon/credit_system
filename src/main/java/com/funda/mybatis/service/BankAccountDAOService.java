package com.funda.mybatis.service;

import com.funda.mybatis.dao.bank_accountMapper;
import com.funda.mybatis.model.bank_account;
import com.funda.mybatis.model.bank_accountExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BankAccountDAOService implements bank_accountMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<bank_account> selectByExample(bank_accountExample content) {

		bank_accountMapper account_content = sqlSession.getMapper(bank_accountMapper.class);
		List<bank_account> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(bank_account record) {
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return	bank_accountMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") bank_account record, @Param("example") bank_accountExample example) {
		// TODO Auto-generated method stub
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return bank_accountMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(bank_accountExample example)
	{
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return	bank_accountMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(bank_accountExample example)
	{
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return	bank_accountMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return	bank_accountMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(bank_account record)
	{
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return	bank_accountMapper.insert(record);
	}



	@Override
	public List<bank_account> selectByExampleWithBLOBs(bank_accountExample example)
	{
		bank_accountMapper account_content = sqlSession.getMapper(bank_accountMapper.class);
		List<bank_account> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public bank_account selectByPrimaryKey(Integer idx)
	{

		bank_accountMapper account_content = sqlSession.getMapper(bank_accountMapper.class);
		bank_account result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") bank_account record, @Param("example") bank_accountExample example)
	{
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return bank_accountMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") bank_account record, @Param("example") bank_accountExample example)
	{
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return bank_accountMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(bank_account record)
	{
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return bank_accountMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(bank_account record)
	{
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return bank_accountMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(bank_account record)
	{
		bank_accountMapper bank_accountMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_accountMapper.class);
		return bank_accountMapper.updateByPrimaryKey(record);
	}


}
