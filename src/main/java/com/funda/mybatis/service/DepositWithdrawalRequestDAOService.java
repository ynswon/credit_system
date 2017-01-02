package com.funda.mybatis.service;

import com.funda.mybatis.dao.deposit_withdrawal_requestMapper;
import com.funda.mybatis.model.deposit_withdrawal_request;
import com.funda.mybatis.model.deposit_withdrawal_requestExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepositWithdrawalRequestDAOService implements deposit_withdrawal_requestMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<deposit_withdrawal_request> selectByExample(deposit_withdrawal_requestExample content) {

		deposit_withdrawal_requestMapper account_content = sqlSession.getMapper(deposit_withdrawal_requestMapper.class);
		List<deposit_withdrawal_request> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(deposit_withdrawal_request record) {
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return	deposit_withdrawal_requestMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") deposit_withdrawal_request record, @Param("example") deposit_withdrawal_requestExample example) {
		// TODO Auto-generated method stub
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return deposit_withdrawal_requestMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(deposit_withdrawal_requestExample example)
	{
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return	deposit_withdrawal_requestMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(deposit_withdrawal_requestExample example)
	{
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return	deposit_withdrawal_requestMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return	deposit_withdrawal_requestMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(deposit_withdrawal_request record)
	{
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return	deposit_withdrawal_requestMapper.insert(record);
	}



	@Override
	public List<deposit_withdrawal_request> selectByExampleWithBLOBs(deposit_withdrawal_requestExample example)
	{
		deposit_withdrawal_requestMapper account_content = sqlSession.getMapper(deposit_withdrawal_requestMapper.class);
		List<deposit_withdrawal_request> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public deposit_withdrawal_request selectByPrimaryKey(Integer idx)
	{

		deposit_withdrawal_requestMapper account_content = sqlSession.getMapper(deposit_withdrawal_requestMapper.class);
		deposit_withdrawal_request result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") deposit_withdrawal_request record, @Param("example") deposit_withdrawal_requestExample example)
	{
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return deposit_withdrawal_requestMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") deposit_withdrawal_request record, @Param("example") deposit_withdrawal_requestExample example)
	{
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return deposit_withdrawal_requestMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(deposit_withdrawal_request record)
	{
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return deposit_withdrawal_requestMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(deposit_withdrawal_request record)
	{
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return deposit_withdrawal_requestMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(deposit_withdrawal_request record)
	{
		deposit_withdrawal_requestMapper deposit_withdrawal_requestMapper = sqlSession.getMapper(com.funda.mybatis.dao.deposit_withdrawal_requestMapper.class);
		return deposit_withdrawal_requestMapper.updateByPrimaryKey(record);
	}


}
