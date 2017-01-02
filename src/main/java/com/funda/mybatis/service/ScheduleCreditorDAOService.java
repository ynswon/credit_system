package com.funda.mybatis.service;

import com.funda.mybatis.dao.schedule_creditorMapper;
import com.funda.mybatis.model.schedule_creditor;
import com.funda.mybatis.model.schedule_creditorExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScheduleCreditorDAOService implements schedule_creditorMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<schedule_creditor> selectByExample(schedule_creditorExample content) {

		schedule_creditorMapper account_content = sqlSession.getMapper(schedule_creditorMapper.class);
		List<schedule_creditor> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(schedule_creditor record) {
		schedule_creditorMapper schedule_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_creditorMapper.class);
		return	schedule_creditorMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") schedule_creditor record, @Param("example") schedule_creditorExample example) {
		// TODO Auto-generated method stub
		schedule_creditorMapper schedule_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_creditorMapper.class);
		return schedule_creditorMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(schedule_creditorExample example)
	{
		schedule_creditorMapper schedule_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_creditorMapper.class);
		return	schedule_creditorMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(schedule_creditorExample example)
	{
		schedule_creditorMapper schedule_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_creditorMapper.class);
		return	schedule_creditorMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		schedule_creditorMapper schedule_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_creditorMapper.class);
		return	schedule_creditorMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(schedule_creditor record)
	{
		schedule_creditorMapper schedule_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_creditorMapper.class);
		return	schedule_creditorMapper.insert(record);
	}




	@Override
	public schedule_creditor selectByPrimaryKey(Integer idx)
	{

		schedule_creditorMapper account_content = sqlSession.getMapper(schedule_creditorMapper.class);
		schedule_creditor result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") schedule_creditor record, @Param("example") schedule_creditorExample example)
	{
		schedule_creditorMapper schedule_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_creditorMapper.class);
		return schedule_creditorMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(schedule_creditor record)
	{
		schedule_creditorMapper schedule_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_creditorMapper.class);
		return schedule_creditorMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(schedule_creditor record)
	{
		schedule_creditorMapper schedule_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.schedule_creditorMapper.class);
		return schedule_creditorMapper.updateByPrimaryKey(record);
	}


}
