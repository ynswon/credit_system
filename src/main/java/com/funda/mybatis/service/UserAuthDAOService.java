package com.funda.mybatis.service;

import com.funda.mybatis.dao.user_authMapper;
import com.funda.mybatis.model.user_auth;
import com.funda.mybatis.model.user_authExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserAuthDAOService implements user_authMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<user_auth> selectByExample(user_authExample content) {

		user_authMapper account_content = sqlSession.getMapper(user_authMapper.class);
		List<user_auth> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(user_auth record) {
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return	user_authMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") user_auth record, @Param("example") user_authExample example) {
		// TODO Auto-generated method stub
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return user_authMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(user_authExample example)
	{
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return	user_authMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(user_authExample example)
	{
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return	user_authMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return	user_authMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(user_auth record)
	{
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return	user_authMapper.insert(record);
	}



	@Override
	public List<user_auth> selectByExampleWithBLOBs(user_authExample example)
	{
		user_authMapper account_content = sqlSession.getMapper(user_authMapper.class);
		List<user_auth> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public user_auth selectByPrimaryKey(Integer idx)
	{

		user_authMapper account_content = sqlSession.getMapper(user_authMapper.class);
		user_auth result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") user_auth record, @Param("example") user_authExample example)
	{
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return user_authMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") user_auth record, @Param("example") user_authExample example)
	{
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return user_authMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(user_auth record)
	{
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return user_authMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(user_auth record)
	{
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return user_authMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(user_auth record)
	{
		user_authMapper user_authMapper = sqlSession.getMapper(com.funda.mybatis.dao.user_authMapper.class);
		return user_authMapper.updateByPrimaryKey(record);
	}


}
