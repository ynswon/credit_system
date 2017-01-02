package com.funda.mybatis.service;

import com.funda.mybatis.dao.schedule_debtorMapper;
import com.funda.mybatis.model.schedule_debtor;
import com.funda.mybatis.model.schedule_debtorExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScheduleDebtorDAOService implements schedule_debtorMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<schedule_debtor> selectByExample(schedule_debtorExample content) {

		schedule_debtorMapper account_content = sqlSession.getMapper(schedule_debtorMapper.class);
		List<schedule_debtor> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(schedule_debtor record) {
		schedule_debtorMapper schedule_debtorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_debtorMapper.class);
		return	schedule_debtorMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") schedule_debtor record, @Param("example") schedule_debtorExample example) {
		// TODO Auto-generated method stub
		schedule_debtorMapper schedule_debtorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_debtorMapper.class);
		return schedule_debtorMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(schedule_debtorExample example)
	{
		schedule_debtorMapper schedule_debtorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_debtorMapper.class);
		return	schedule_debtorMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(schedule_debtorExample example)
	{
		schedule_debtorMapper schedule_debtorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_debtorMapper.class);
		return	schedule_debtorMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		schedule_debtorMapper schedule_debtorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_debtorMapper.class);
		return	schedule_debtorMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(schedule_debtor record)
	{
		schedule_debtorMapper schedule_debtorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_debtorMapper.class);
		return	schedule_debtorMapper.insert(record);
	}




	@Override
	public schedule_debtor selectByPrimaryKey(Integer idx)
	{

		schedule_debtorMapper account_content = sqlSession.getMapper(schedule_debtorMapper.class);
		schedule_debtor result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") schedule_debtor record, @Param("example") schedule_debtorExample example)
	{
		schedule_debtorMapper schedule_debtorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_debtorMapper.class);
		return schedule_debtorMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(schedule_debtor record)
	{
		schedule_debtorMapper schedule_debtorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_debtorMapper.class);
		return schedule_debtorMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(schedule_debtor record)
	{
		schedule_debtorMapper schedule_debtorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_debtorMapper.class);
		return schedule_debtorMapper.updateByPrimaryKey(record);
	}


}
