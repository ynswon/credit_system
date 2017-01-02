package com.funda.mybatis.service;

import com.funda.mybatis.dao.transfer_listMapper;
import com.funda.mybatis.model.transfer_list;
import com.funda.mybatis.model.transfer_listExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransferListDAOService implements transfer_listMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<transfer_list> selectByExample(transfer_listExample content) {

		transfer_listMapper account_content = sqlSession.getMapper(transfer_listMapper.class);
		List<transfer_list> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(transfer_list record) {
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return	transfer_listMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") transfer_list record, @Param("example") transfer_listExample example) {
		// TODO Auto-generated method stub
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return transfer_listMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(transfer_listExample example)
	{
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return	transfer_listMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(transfer_listExample example)
	{
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return	transfer_listMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return	transfer_listMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(transfer_list record)
	{
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return	transfer_listMapper.insert(record);
	}



	@Override
	public List<transfer_list> selectByExampleWithBLOBs(transfer_listExample example)
	{
		transfer_listMapper account_content = sqlSession.getMapper(transfer_listMapper.class);
		List<transfer_list> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public transfer_list selectByPrimaryKey(Integer idx)
	{

		transfer_listMapper account_content = sqlSession.getMapper(transfer_listMapper.class);
		transfer_list result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") transfer_list record, @Param("example") transfer_listExample example)
	{
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return transfer_listMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") transfer_list record, @Param("example") transfer_listExample example)
	{
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return transfer_listMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(transfer_list record)
	{
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return transfer_listMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(transfer_list record)
	{
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return transfer_listMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(transfer_list record)
	{
		transfer_listMapper transfer_listMapper = sqlSession.getMapper(com.funda.mybatis.dao.transfer_listMapper.class);
		return transfer_listMapper.updateByPrimaryKey(record);
	}


}
