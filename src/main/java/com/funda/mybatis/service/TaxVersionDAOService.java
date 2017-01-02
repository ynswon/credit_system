package com.funda.mybatis.service;

import com.funda.mybatis.dao.tax_versionMapper;
import com.funda.mybatis.model.tax_version;
import com.funda.mybatis.model.tax_versionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaxVersionDAOService implements tax_versionMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<tax_version> selectByExample(tax_versionExample content) {

		tax_versionMapper account_content = sqlSession.getMapper(tax_versionMapper.class);
		List<tax_version> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(tax_version record) {
		tax_versionMapper tax_versionMapper = sqlSession.getMapper(com.funda.mybatis.dao.tax_versionMapper.class);
		return	tax_versionMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") tax_version record, @Param("example") tax_versionExample example) {
		// TODO Auto-generated method stub
		tax_versionMapper tax_versionMapper = sqlSession.getMapper(com.funda.mybatis.dao.tax_versionMapper.class);
		return tax_versionMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(tax_versionExample example)
	{
		tax_versionMapper tax_versionMapper = sqlSession.getMapper(com.funda.mybatis.dao.tax_versionMapper.class);
		return	tax_versionMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(tax_versionExample example)
	{
		tax_versionMapper tax_versionMapper = sqlSession.getMapper(com.funda.mybatis.dao.tax_versionMapper.class);
		return	tax_versionMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		tax_versionMapper tax_versionMapper = sqlSession.getMapper(com.funda.mybatis.dao.tax_versionMapper.class);
		return	tax_versionMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(tax_version record)
	{
		tax_versionMapper tax_versionMapper = sqlSession.getMapper(com.funda.mybatis.dao.tax_versionMapper.class);
		return	tax_versionMapper.insert(record);
	}




	@Override
	public tax_version selectByPrimaryKey(Integer idx)
	{

		tax_versionMapper account_content = sqlSession.getMapper(tax_versionMapper.class);
		tax_version result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") tax_version record, @Param("example") tax_versionExample example)
	{
		tax_versionMapper tax_versionMapper = sqlSession.getMapper(com.funda.mybatis.dao.tax_versionMapper.class);
		return tax_versionMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(tax_version record)
	{
		tax_versionMapper tax_versionMapper = sqlSession.getMapper(com.funda.mybatis.dao.tax_versionMapper.class);
		return tax_versionMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(tax_version record)
	{
		tax_versionMapper tax_versionMapper = sqlSession.getMapper(com.funda.mybatis.dao.tax_versionMapper.class);
		return tax_versionMapper.updateByPrimaryKey(record);
	}


}
