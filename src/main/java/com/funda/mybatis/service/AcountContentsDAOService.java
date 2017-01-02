package com.funda.mybatis.service;

import com.funda.mybatis.dao.account_contentsMapper;
import com.funda.mybatis.model.account_contents;
import com.funda.mybatis.model.account_contentsExample;
import com.funda.mybatis.model.account_contentsWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AcountContentsDAOService implements account_contentsMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<account_contents> selectByExample(account_contentsExample content) {

		account_contentsMapper account_content = sqlSession.getMapper(account_contentsMapper.class);
		List<account_contents> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(account_contentsWithBLOBs record) {
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return	account_contentsMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") account_contentsWithBLOBs record, @Param("example") account_contentsExample example) {
		// TODO Auto-generated method stub
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return account_contentsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(account_contentsExample example)
	{
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return	account_contentsMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(account_contentsExample example)
	{
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return	account_contentsMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return	account_contentsMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(account_contentsWithBLOBs record)
	{
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return	account_contentsMapper.insert(record);
	}



	@Override
	public List<account_contentsWithBLOBs> selectByExampleWithBLOBs(account_contentsExample example)
	{
		account_contentsMapper account_content = sqlSession.getMapper(account_contentsMapper.class);
		List<account_contentsWithBLOBs> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public account_contentsWithBLOBs selectByPrimaryKey(Integer idx)
	{

		account_contentsMapper account_content = sqlSession.getMapper(account_contentsMapper.class);
        account_contentsWithBLOBs result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") account_contentsWithBLOBs record, @Param("example") account_contentsExample example)
	{
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return account_contentsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") account_contents record, @Param("example") account_contentsExample example)
	{
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return account_contentsMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(account_contentsWithBLOBs record)
	{
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return account_contentsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(account_contentsWithBLOBs record)
	{
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return account_contentsMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(account_contents record)
	{
		account_contentsMapper account_contentsMapper = sqlSession.getMapper(com.funda.mybatis.dao.account_contentsMapper.class);
		return account_contentsMapper.updateByPrimaryKey(record);
	}


}
