package com.funda.mybatis.service;

import com.funda.mybatis.dao.storeMapper;
import com.funda.mybatis.model.store;
import com.funda.mybatis.model.storeExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StoreDAOService implements storeMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<store> selectByExample(storeExample content) {

		storeMapper account_content = sqlSession.getMapper(storeMapper.class);
		List<store> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(store record) {
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return	storeMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") store record, @Param("example") storeExample example) {
		// TODO Auto-generated method stub
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return storeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(storeExample example)
	{
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return	storeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(storeExample example)
	{
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return	storeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return	storeMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(store record)
	{
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return	storeMapper.insert(record);
	}



	@Override
	public List<store> selectByExampleWithBLOBs(storeExample example)
	{
		storeMapper account_content = sqlSession.getMapper(storeMapper.class);
		List<store> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public store selectByPrimaryKey(Integer idx)
	{

		storeMapper account_content = sqlSession.getMapper(storeMapper.class);
		store result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") store record, @Param("example") storeExample example)
	{
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return storeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") store record, @Param("example") storeExample example)
	{
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return storeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(store record)
	{
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return storeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(store record)
	{
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return storeMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(store record)
	{
		storeMapper storeMapper = sqlSession.getMapper(com.funda.mybatis.dao.storeMapper.class);
		return storeMapper.updateByPrimaryKey(record);
	}


}
