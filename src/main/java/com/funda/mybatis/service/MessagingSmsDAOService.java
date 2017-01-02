package com.funda.mybatis.service;

import com.funda.mybatis.dao.messaging_smsMapper;
import com.funda.mybatis.model.messaging_sms;
import com.funda.mybatis.model.messaging_smsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessagingSmsDAOService implements messaging_smsMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<messaging_sms> selectByExample(messaging_smsExample content) {

		messaging_smsMapper account_content = sqlSession.getMapper(messaging_smsMapper.class);
		List<messaging_sms> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(messaging_sms record) {
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return	messaging_smsMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") messaging_sms record, @Param("example") messaging_smsExample example) {
		// TODO Auto-generated method stub
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return messaging_smsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(messaging_smsExample example)
	{
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return	messaging_smsMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(messaging_smsExample example)
	{
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return	messaging_smsMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return	messaging_smsMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(messaging_sms record)
	{
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return	messaging_smsMapper.insert(record);
	}



	@Override
	public List<messaging_sms> selectByExampleWithBLOBs(messaging_smsExample example)
	{
		messaging_smsMapper account_content = sqlSession.getMapper(messaging_smsMapper.class);
		List<messaging_sms> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public messaging_sms selectByPrimaryKey(Integer idx)
	{

		messaging_smsMapper account_content = sqlSession.getMapper(messaging_smsMapper.class);
		messaging_sms result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") messaging_sms record, @Param("example") messaging_smsExample example)
	{
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return messaging_smsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") messaging_sms record, @Param("example") messaging_smsExample example)
	{
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return messaging_smsMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(messaging_sms record)
	{
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return messaging_smsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(messaging_sms record)
	{
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return messaging_smsMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(messaging_sms record)
	{
		messaging_smsMapper messaging_smsMapper = sqlSession.getMapper(com.funda.mybatis.dao.messaging_smsMapper.class);
		return messaging_smsMapper.updateByPrimaryKey(record);
	}


}
