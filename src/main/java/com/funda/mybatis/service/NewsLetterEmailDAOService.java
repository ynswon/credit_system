package com.funda.mybatis.service;

import com.funda.mybatis.dao.newsletter_emailMapper;
import com.funda.mybatis.model.newsletter_email;
import com.funda.mybatis.model.newsletter_emailExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsLetterEmailDAOService implements newsletter_emailMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<newsletter_email> selectByExample(newsletter_emailExample content) {

		newsletter_emailMapper account_content = sqlSession.getMapper(newsletter_emailMapper.class);
		List<newsletter_email> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(newsletter_email record) {
		newsletter_emailMapper newsletter_emailMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_emailMapper.class);
		return	newsletter_emailMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") newsletter_email record, @Param("example") newsletter_emailExample example) {
		// TODO Auto-generated method stub
		newsletter_emailMapper newsletter_emailMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_emailMapper.class);
		return newsletter_emailMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(newsletter_emailExample example)
	{
		newsletter_emailMapper newsletter_emailMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_emailMapper.class);
		return	newsletter_emailMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(newsletter_emailExample example)
	{
		newsletter_emailMapper newsletter_emailMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_emailMapper.class);
		return	newsletter_emailMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		newsletter_emailMapper newsletter_emailMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_emailMapper.class);
		return	newsletter_emailMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(newsletter_email record)
	{
		newsletter_emailMapper newsletter_emailMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_emailMapper.class);
		return	newsletter_emailMapper.insert(record);
	}



	@Override
	public newsletter_email selectByPrimaryKey(Integer idx)
	{

		newsletter_emailMapper account_content = sqlSession.getMapper(newsletter_emailMapper.class);
		newsletter_email result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") newsletter_email record, @Param("example") newsletter_emailExample example)
	{
		newsletter_emailMapper newsletter_emailMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_emailMapper.class);
		return newsletter_emailMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(newsletter_email record)
	{
		newsletter_emailMapper newsletter_emailMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_emailMapper.class);
		return newsletter_emailMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(newsletter_email record)
	{
		newsletter_emailMapper newsletter_emailMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_emailMapper.class);
		return newsletter_emailMapper.updateByPrimaryKey(record);
	}


}
