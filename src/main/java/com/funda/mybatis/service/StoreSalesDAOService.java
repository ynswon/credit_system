package com.funda.mybatis.service;

import com.funda.mybatis.dao.store_salesMapper;
import com.funda.mybatis.model.store_sales;
import com.funda.mybatis.model.store_salesExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StoreSalesDAOService implements store_salesMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<store_sales> selectByExample(store_salesExample content) {

		store_salesMapper account_content = sqlSession.getMapper(store_salesMapper.class);
		List<store_sales> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(store_sales record) {
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return	store_salesMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") store_sales record, @Param("example") store_salesExample example) {
		// TODO Auto-generated method stub
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return store_salesMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(store_salesExample example)
	{
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return	store_salesMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(store_salesExample example)
	{
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return	store_salesMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return	store_salesMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(store_sales record)
	{
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return	store_salesMapper.insert(record);
	}



	@Override
	public List<store_sales> selectByExampleWithBLOBs(store_salesExample example)
	{
		store_salesMapper account_content = sqlSession.getMapper(store_salesMapper.class);
		List<store_sales> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public store_sales selectByPrimaryKey(Integer idx)
	{

		store_salesMapper account_content = sqlSession.getMapper(store_salesMapper.class);
		store_sales result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") store_sales record, @Param("example") store_salesExample example)
	{
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return store_salesMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") store_sales record, @Param("example") store_salesExample example)
	{
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return store_salesMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(store_sales record)
	{
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return store_salesMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(store_sales record)
	{
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return store_salesMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(store_sales record)
	{
		store_salesMapper store_salesMapper = sqlSession.getMapper(com.funda.mybatis.dao.store_salesMapper.class);
		return store_salesMapper.updateByPrimaryKey(record);
	}


}
