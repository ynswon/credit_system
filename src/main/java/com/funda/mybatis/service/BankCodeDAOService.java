package com.funda.mybatis.service;

import com.funda.mybatis.dao.bank_codeMapper;
import com.funda.mybatis.model.bank_code;
import com.funda.mybatis.model.bank_codeExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BankCodeDAOService implements bank_codeMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<bank_code> selectByExample(bank_codeExample content) {

		bank_codeMapper account_content = sqlSession.getMapper(bank_codeMapper.class);
		List<bank_code> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(bank_code record) {
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return	bank_codeMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") bank_code record, @Param("example") bank_codeExample example) {
		// TODO Auto-generated method stub
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return bank_codeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(bank_codeExample example)
	{
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return	bank_codeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(bank_codeExample example)
	{
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return	bank_codeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return	bank_codeMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(bank_code record)
	{
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return	bank_codeMapper.insert(record);
	}



	@Override
	public List<bank_code> selectByExampleWithBLOBs(bank_codeExample example)
	{
		bank_codeMapper account_content = sqlSession.getMapper(bank_codeMapper.class);
		List<bank_code> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public bank_code selectByPrimaryKey(Integer idx)
	{

		bank_codeMapper account_content = sqlSession.getMapper(bank_codeMapper.class);
		bank_code result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") bank_code record, @Param("example") bank_codeExample example)
	{
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return bank_codeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") bank_code record, @Param("example") bank_codeExample example)
	{
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return bank_codeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(bank_code record)
	{
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return bank_codeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(bank_code record)
	{
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return bank_codeMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(bank_code record)
	{
		bank_codeMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.bank_codeMapper.class);
		return bank_codeMapper.updateByPrimaryKey(record);
	}


}
