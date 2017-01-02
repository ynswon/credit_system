package com.funda.mybatis.service;

import com.funda.mybatis.dao.auto_tokenMapper;
import com.funda.mybatis.model.auto_token;
import com.funda.mybatis.model.auto_tokenExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AutoTokenDAOService implements auto_tokenMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<auto_token> selectByExample(auto_tokenExample content) {

		auto_tokenMapper account_content = sqlSession.getMapper(auto_tokenMapper.class);
		List<auto_token> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(auto_token record) {
		auto_tokenMapper auto_tokenMapper = sqlSession.getMapper(com.funda.mybatis.dao.auto_tokenMapper.class);
		return	auto_tokenMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") auto_token record, @Param("example") auto_tokenExample example) {
		// TODO Auto-generated method stub
		auto_tokenMapper auto_tokenMapper = sqlSession.getMapper(com.funda.mybatis.dao.auto_tokenMapper.class);
		return auto_tokenMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(auto_tokenExample example)
	{
		auto_tokenMapper auto_tokenMapper = sqlSession.getMapper(com.funda.mybatis.dao.auto_tokenMapper.class);
		return	auto_tokenMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(auto_tokenExample example)
	{
		auto_tokenMapper auto_tokenMapper = sqlSession.getMapper(com.funda.mybatis.dao.auto_tokenMapper.class);
		return	auto_tokenMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		auto_tokenMapper auto_tokenMapper = sqlSession.getMapper(com.funda.mybatis.dao.auto_tokenMapper.class);
		return	auto_tokenMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(auto_token record)
	{
		auto_tokenMapper auto_tokenMapper = sqlSession.getMapper(com.funda.mybatis.dao.auto_tokenMapper.class);
		return	auto_tokenMapper.insert(record);
	}



	@Override
	public auto_token selectByPrimaryKey(Integer idx)
	{

		auto_tokenMapper account_content = sqlSession.getMapper(auto_tokenMapper.class);
		auto_token result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExample(@Param("record") auto_token record, @Param("example") auto_tokenExample example)
	{
		auto_tokenMapper auto_tokenMapper = sqlSession.getMapper(com.funda.mybatis.dao.auto_tokenMapper.class);
		return auto_tokenMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(auto_token record)
	{
		auto_tokenMapper auto_tokenMapper = sqlSession.getMapper(com.funda.mybatis.dao.auto_tokenMapper.class);
		return auto_tokenMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(auto_token record)
	{
		auto_tokenMapper auto_tokenMapper = sqlSession.getMapper(com.funda.mybatis.dao.auto_tokenMapper.class);
		return auto_tokenMapper.updateByPrimaryKey(record);
	}


}
