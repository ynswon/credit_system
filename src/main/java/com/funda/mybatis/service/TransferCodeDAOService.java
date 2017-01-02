package com.funda.mybatis.service;

import com.funda.mybatis.dao.transfer_codeMapper;
import com.funda.mybatis.model.transfer_code;
import com.funda.mybatis.model.transfer_codeExample;
import com.funda.mybatis.model.transfer_codeWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransferCodeDAOService implements transfer_codeMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<transfer_code> selectByExample(transfer_codeExample content) {

		transfer_codeMapper account_content = sqlSession.getMapper(transfer_codeMapper.class);
		List<transfer_code> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(transfer_codeWithBLOBs record) {
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return	transfer_codeMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") transfer_codeWithBLOBs record, @Param("example") transfer_codeExample example) {
		// TODO Auto-generated method stub
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return transfer_codeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(transfer_codeExample example)
	{
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return	transfer_codeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(transfer_codeExample example)
	{
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return	transfer_codeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return	transfer_codeMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(transfer_codeWithBLOBs record)
	{
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return	transfer_codeMapper.insert(record);
	}



	@Override
	public List<transfer_codeWithBLOBs> selectByExampleWithBLOBs(transfer_codeExample example)
	{
		transfer_codeMapper account_content = sqlSession.getMapper(transfer_codeMapper.class);
		List<transfer_codeWithBLOBs> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public transfer_codeWithBLOBs selectByPrimaryKey(Integer idx)
	{

		transfer_codeMapper account_content = sqlSession.getMapper(transfer_codeMapper.class);
		transfer_codeWithBLOBs result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") transfer_codeWithBLOBs record, @Param("example") transfer_codeExample example)
	{
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return transfer_codeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") transfer_code record, @Param("example") transfer_codeExample example)
	{
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return transfer_codeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(transfer_codeWithBLOBs record)
	{
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return transfer_codeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(transfer_codeWithBLOBs record)
	{
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return transfer_codeMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(transfer_code record)
	{
		transfer_codeMapper transfer_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_codeMapper.class);
		return transfer_codeMapper.updateByPrimaryKey(record);
	}


}
