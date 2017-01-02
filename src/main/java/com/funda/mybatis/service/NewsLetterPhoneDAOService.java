package com.funda.mybatis.service;

import com.funda.mybatis.dao.newsletter_phoneMapper;
import com.funda.mybatis.model.newsletter_phone;
import com.funda.mybatis.model.newsletter_phoneExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsLetterPhoneDAOService implements newsletter_phoneMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<newsletter_phone> selectByExample(newsletter_phoneExample content) {

		newsletter_phoneMapper account_content = sqlSession.getMapper(newsletter_phoneMapper.class);
		List<newsletter_phone> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(newsletter_phone record) {
		newsletter_phoneMapper newsletter_phoneMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_phoneMapper.class);
		return	newsletter_phoneMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") newsletter_phone record, @Param("example") newsletter_phoneExample example) {
		// TODO Auto-generated method stub
		newsletter_phoneMapper newsletter_phoneMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_phoneMapper.class);
		return newsletter_phoneMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(newsletter_phoneExample example)
	{
		newsletter_phoneMapper newsletter_phoneMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_phoneMapper.class);
		return	newsletter_phoneMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(newsletter_phoneExample example)
	{
		newsletter_phoneMapper newsletter_phoneMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_phoneMapper.class);
		return	newsletter_phoneMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		newsletter_phoneMapper newsletter_phoneMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_phoneMapper.class);
		return	newsletter_phoneMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(newsletter_phone record)
	{
		newsletter_phoneMapper newsletter_phoneMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_phoneMapper.class);
		return	newsletter_phoneMapper.insert(record);
	}




	@Override
	public newsletter_phone selectByPrimaryKey(Integer idx)
	{

		newsletter_phoneMapper account_content = sqlSession.getMapper(newsletter_phoneMapper.class);
		newsletter_phone result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExample(@Param("record") newsletter_phone record, @Param("example") newsletter_phoneExample example)
	{
		newsletter_phoneMapper newsletter_phoneMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_phoneMapper.class);
		return newsletter_phoneMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(newsletter_phone record)
	{
		newsletter_phoneMapper newsletter_phoneMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_phoneMapper.class);
		return newsletter_phoneMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(newsletter_phone record)
	{
		newsletter_phoneMapper newsletter_phoneMapper = sqlSession.getMapper(com.funda.mybatis.dao.newsletter_phoneMapper.class);
		return newsletter_phoneMapper.updateByPrimaryKey(record);
	}


}
