package com.funda.mybatis.service;

import com.funda.mybatis.dao.balance_and_depositMapper;
import com.funda.mybatis.model.balance_and_deposit;
import com.funda.mybatis.model.balance_and_depositExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BalanceAndDepositDAOService implements balance_and_depositMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<balance_and_deposit> selectByExample(balance_and_depositExample content) {

		balance_and_depositMapper account_content = sqlSession.getMapper(balance_and_depositMapper.class);
		List<balance_and_deposit> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(balance_and_deposit record) {
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return	balance_and_depositMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") balance_and_deposit record, @Param("example") balance_and_depositExample example) {
		// TODO Auto-generated method stub
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return balance_and_depositMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(balance_and_depositExample example)
	{
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return	balance_and_depositMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(balance_and_depositExample example)
	{
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return	balance_and_depositMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return	balance_and_depositMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(balance_and_deposit record)
	{
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return	balance_and_depositMapper.insert(record);
	}



	@Override
	public List<balance_and_deposit> selectByExampleWithBLOBs(balance_and_depositExample example)
	{
		balance_and_depositMapper account_content = sqlSession.getMapper(balance_and_depositMapper.class);
		List<balance_and_deposit> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public balance_and_deposit selectByPrimaryKey(Integer idx)
	{

		balance_and_depositMapper account_content = sqlSession.getMapper(balance_and_depositMapper.class);
		balance_and_deposit result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") balance_and_deposit record, @Param("example") balance_and_depositExample example)
	{
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return balance_and_depositMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") balance_and_deposit record, @Param("example") balance_and_depositExample example)
	{
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return balance_and_depositMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(balance_and_deposit record)
	{
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return balance_and_depositMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(balance_and_deposit record)
	{
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return balance_and_depositMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(balance_and_deposit record)
	{
		balance_and_depositMapper balance_and_depositMapper = sqlSession.getMapper(com.funda.mybatis.dao.balance_and_depositMapper.class);
		return balance_and_depositMapper.updateByPrimaryKey(record);
	}


}
