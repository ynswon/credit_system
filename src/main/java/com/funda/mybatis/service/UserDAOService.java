package com.funda.mybatis.service;

import com.funda.mybatis.dao.userMapper;
import com.funda.mybatis.model.user;
import com.funda.mybatis.model.userExample;
import com.funda.mybatis.model.userWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOService implements userMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<user> selectByExample(userExample content) {

		userMapper account_content = sqlSession.getMapper(userMapper.class);
		List<user> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(userWithBLOBs record) {
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return	userMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") userWithBLOBs record, @Param("example") userExample example) {
		// TODO Auto-generated method stub
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return userMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(userExample example)
	{
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return	userMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(userExample example)
	{
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return	userMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return	userMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(userWithBLOBs record)
	{
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return	userMapper.insert(record);
	}



	@Override
	public List<userWithBLOBs> selectByExampleWithBLOBs(userExample example)
	{
		userMapper account_content = sqlSession.getMapper(userMapper.class);
		List<userWithBLOBs> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public userWithBLOBs selectByPrimaryKey(Integer idx)
	{

		userMapper account_content = sqlSession.getMapper(userMapper.class);
		userWithBLOBs result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") userWithBLOBs record, @Param("example") userExample example)
	{
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return userMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") user record, @Param("example") userExample example)
	{
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return userMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(userWithBLOBs record)
	{
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(userWithBLOBs record)
	{
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return userMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(user record)
	{
		userMapper userMapper = sqlSession.getMapper(com.funda.mybatis.dao.userMapper.class);
		return userMapper.updateByPrimaryKey(record);
	}


}
