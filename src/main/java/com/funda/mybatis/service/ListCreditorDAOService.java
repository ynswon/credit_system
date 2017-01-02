package com.funda.mybatis.service;

import com.funda.mybatis.dao.list_creditorMapper;
import com.funda.mybatis.model.list_creditor;
import com.funda.mybatis.model.list_creditorExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ListCreditorDAOService implements list_creditorMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<list_creditor> selectByExample(list_creditorExample content) {

		list_creditorMapper account_content = sqlSession.getMapper(list_creditorMapper.class);
		List<list_creditor> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(list_creditor record) {
		list_creditorMapper list_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_creditorMapper.class);
		return	list_creditorMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") list_creditor record, @Param("example") list_creditorExample example) {
		// TODO Auto-generated method stub
		list_creditorMapper list_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_creditorMapper.class);
		return list_creditorMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(list_creditorExample example)
	{
		list_creditorMapper list_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_creditorMapper.class);
		return	list_creditorMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(list_creditorExample example)
	{
		list_creditorMapper list_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_creditorMapper.class);
		return	list_creditorMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		list_creditorMapper list_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_creditorMapper.class);
		return	list_creditorMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(list_creditor record)
	{
		list_creditorMapper list_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_creditorMapper.class);
		return	list_creditorMapper.insert(record);
	}



	@Override
	public list_creditor selectByPrimaryKey(Integer idx)
	{

		list_creditorMapper account_content = sqlSession.getMapper(list_creditorMapper.class);
		list_creditor result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") list_creditor record, @Param("example") list_creditorExample example)
	{
		list_creditorMapper list_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_creditorMapper.class);
		return list_creditorMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(list_creditor record)
	{
		list_creditorMapper list_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_creditorMapper.class);
		return list_creditorMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(list_creditor record)
	{
		list_creditorMapper list_creditorMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_creditorMapper.class);
		return list_creditorMapper.updateByPrimaryKey(record);
	}


}
