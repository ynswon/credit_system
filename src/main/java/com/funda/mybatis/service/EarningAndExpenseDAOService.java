package com.funda.mybatis.service;

import com.funda.mybatis.dao.earnings_and_expenseMapper;
import com.funda.mybatis.model.earnings_and_expense;
import com.funda.mybatis.model.earnings_and_expenseExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EarningAndExpenseDAOService implements earnings_and_expenseMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<earnings_and_expense> selectByExample(earnings_and_expenseExample content) {

		earnings_and_expenseMapper earnings_and_expense = sqlSession.getMapper(earnings_and_expenseMapper.class);
		List<com.funda.mybatis.model.earnings_and_expense> result = earnings_and_expense.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(earnings_and_expense record) {
		earnings_and_expenseMapper earnings_and_expenseMapper = sqlSession.getMapper(com.funda.mybatis.dao.earnings_and_expenseMapper.class);
		return	earnings_and_expenseMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") earnings_and_expense record, @Param("example") earnings_and_expenseExample example) {
		// TODO Auto-generated method stub
		earnings_and_expenseMapper earnings_and_expenseMapper = sqlSession.getMapper(com.funda.mybatis.dao.earnings_and_expenseMapper.class);
		return earnings_and_expenseMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(earnings_and_expenseExample example)
	{
		earnings_and_expenseMapper earnings_and_expenseMapper = sqlSession.getMapper(com.funda.mybatis.dao.earnings_and_expenseMapper.class);
		return	earnings_and_expenseMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(earnings_and_expenseExample example)
	{
		earnings_and_expenseMapper earnings_and_expenseMapper = sqlSession.getMapper(com.funda.mybatis.dao.earnings_and_expenseMapper.class);
		return	earnings_and_expenseMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		earnings_and_expenseMapper earnings_and_expenseMapper = sqlSession.getMapper(com.funda.mybatis.dao.earnings_and_expenseMapper.class);
		return	earnings_and_expenseMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(earnings_and_expense record)
	{
		earnings_and_expenseMapper earnings_and_expenseMapper = sqlSession.getMapper(com.funda.mybatis.dao.earnings_and_expenseMapper.class);
		return	earnings_and_expenseMapper.insert(record);
	}



	@Override
	public earnings_and_expense selectByPrimaryKey(Integer idx)
	{

		earnings_and_expenseMapper earnings_and_expense = sqlSession.getMapper(earnings_and_expenseMapper.class);
		com.funda.mybatis.model.earnings_and_expense result = earnings_and_expense.selectByPrimaryKey(idx);
		return result;
	}



	@Override
	public int updateByExample(@Param("record") earnings_and_expense record, @Param("example") earnings_and_expenseExample example)
	{
		earnings_and_expenseMapper earnings_and_expenseMapper = sqlSession.getMapper(com.funda.mybatis.dao.earnings_and_expenseMapper.class);
		return earnings_and_expenseMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(earnings_and_expense record)
	{
		earnings_and_expenseMapper earnings_and_expenseMapper = sqlSession.getMapper(com.funda.mybatis.dao.earnings_and_expenseMapper.class);
		return earnings_and_expenseMapper.updateByPrimaryKeySelective(record);
	}



	@Override
	public int updateByPrimaryKey(earnings_and_expense record)
	{
		earnings_and_expenseMapper earnings_and_expenseMapper = sqlSession.getMapper(com.funda.mybatis.dao.earnings_and_expenseMapper.class);
		return earnings_and_expenseMapper.updateByPrimaryKey(record);
	}


}
