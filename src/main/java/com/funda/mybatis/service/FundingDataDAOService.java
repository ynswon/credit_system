package com.funda.mybatis.service;

import com.funda.mybatis.dao.funding_dataMapper;
import com.funda.mybatis.model.funding_data;
import com.funda.mybatis.model.funding_dataExample;
import com.funda.mybatis.model.funding_dataWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FundingDataDAOService implements funding_dataMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<funding_data> selectByExample(funding_dataExample content) {

		funding_dataMapper funding_data = sqlSession.getMapper(funding_dataMapper.class);
		List<com.funda.mybatis.model.funding_data> result = funding_data.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(funding_dataWithBLOBs record) {
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return	funding_dataMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") funding_dataWithBLOBs record, @Param("example") funding_dataExample example) {
		// TODO Auto-generated method stub
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return funding_dataMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(funding_dataExample example)
	{
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return	funding_dataMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(funding_dataExample example)
	{
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return	funding_dataMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return	funding_dataMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(funding_dataWithBLOBs record)
	{
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return	funding_dataMapper.insert(record);
	}



	@Override
	public List<funding_dataWithBLOBs> selectByExampleWithBLOBs(funding_dataExample example)
	{
		funding_dataMapper funding_data = sqlSession.getMapper(funding_dataMapper.class);
		List<funding_dataWithBLOBs> result = funding_data.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public funding_dataWithBLOBs selectByPrimaryKey(Integer idx)
	{

		funding_dataMapper funding_data = sqlSession.getMapper(funding_dataMapper.class);
		funding_dataWithBLOBs result = funding_data.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") funding_dataWithBLOBs record, @Param("example") funding_dataExample example)
	{
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return funding_dataMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") funding_data record, @Param("example") funding_dataExample example)
	{
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return funding_dataMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(funding_dataWithBLOBs record)
	{
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return funding_dataMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(funding_dataWithBLOBs record)
	{
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return funding_dataMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(funding_data record)
	{
		funding_dataMapper funding_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.funding_dataMapper.class);
		return funding_dataMapper.updateByPrimaryKey(record);
	}


}
