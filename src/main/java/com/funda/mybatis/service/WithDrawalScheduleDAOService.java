package com.funda.mybatis.service;

import com.funda.mybatis.dao.withdrawal_scheduleMapper;
import com.funda.mybatis.model.withdrawal_schedule;
import com.funda.mybatis.model.withdrawal_scheduleExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WithDrawalScheduleDAOService implements withdrawal_scheduleMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<withdrawal_schedule> selectByExample(withdrawal_scheduleExample content) {

		withdrawal_scheduleMapper account_content = sqlSession.getMapper(withdrawal_scheduleMapper.class);
		List<withdrawal_schedule> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(withdrawal_schedule record) {
		withdrawal_scheduleMapper withdrawal_scheduleMapper = sqlSession.getMapper(com.funda.mybatis.dao.withdrawal_scheduleMapper.class);
		return	withdrawal_scheduleMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") withdrawal_schedule record, @Param("example") withdrawal_scheduleExample example) {
		// TODO Auto-generated method stub
		withdrawal_scheduleMapper withdrawal_scheduleMapper = sqlSession.getMapper(com.funda.mybatis.dao.withdrawal_scheduleMapper.class);
		return withdrawal_scheduleMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(withdrawal_scheduleExample example)
	{
		withdrawal_scheduleMapper withdrawal_scheduleMapper = sqlSession.getMapper(com.funda.mybatis.dao.withdrawal_scheduleMapper.class);
		return	withdrawal_scheduleMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(withdrawal_scheduleExample example)
	{
		withdrawal_scheduleMapper withdrawal_scheduleMapper = sqlSession.getMapper(com.funda.mybatis.dao.withdrawal_scheduleMapper.class);
		return	withdrawal_scheduleMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		withdrawal_scheduleMapper withdrawal_scheduleMapper = sqlSession.getMapper(com.funda.mybatis.dao.withdrawal_scheduleMapper.class);
		return	withdrawal_scheduleMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(withdrawal_schedule record)
	{
		withdrawal_scheduleMapper withdrawal_scheduleMapper = sqlSession.getMapper(com.funda.mybatis.dao.withdrawal_scheduleMapper.class);
		return	withdrawal_scheduleMapper.insert(record);
	}




	@Override
	public withdrawal_schedule selectByPrimaryKey(Integer idx)
	{

		withdrawal_scheduleMapper account_content = sqlSession.getMapper(withdrawal_scheduleMapper.class);
		withdrawal_schedule result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") withdrawal_schedule record, @Param("example") withdrawal_scheduleExample example)
	{
		withdrawal_scheduleMapper withdrawal_scheduleMapper = sqlSession.getMapper(com.funda.mybatis.dao.withdrawal_scheduleMapper.class);
		return withdrawal_scheduleMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(withdrawal_schedule record)
	{
		withdrawal_scheduleMapper withdrawal_scheduleMapper = sqlSession.getMapper(com.funda.mybatis.dao.withdrawal_scheduleMapper.class);
		return withdrawal_scheduleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(withdrawal_schedule record)
	{
		withdrawal_scheduleMapper withdrawal_scheduleMapper = sqlSession.getMapper(com.funda.mybatis.dao.withdrawal_scheduleMapper.class);
		return withdrawal_scheduleMapper.updateByPrimaryKey(record);
	}


}
