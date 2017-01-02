package com.funda.mybatis.service;

import com.funda.mybatis.dao.contactMapper;
import com.funda.mybatis.model.contact;
import com.funda.mybatis.model.contactExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDAOService implements contactMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<contact> selectByExample(contactExample content) {

		contactMapper account_content = sqlSession.getMapper(contactMapper.class);
		List<contact> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(contact record) {
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return	contactMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") contact record, @Param("example") contactExample example) {
		// TODO Auto-generated method stub
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return contactMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(contactExample example)
	{
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return	contactMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(contactExample example)
	{
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return	contactMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return	contactMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(contact record)
	{
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return	contactMapper.insert(record);
	}



	@Override
	public List<contact> selectByExampleWithBLOBs(contactExample example)
	{
		contactMapper account_content = sqlSession.getMapper(contactMapper.class);
		List<contact> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public contact selectByPrimaryKey(Integer idx)
	{

		contactMapper account_content = sqlSession.getMapper(contactMapper.class);
		contact result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") contact record, @Param("example") contactExample example)
	{
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return contactMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") contact record, @Param("example") contactExample example)
	{
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return contactMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(contact record)
	{
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return contactMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(contact record)
	{
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return contactMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(contact record)
	{
		contactMapper contactMapper = sqlSession.getMapper(contactMapper.class);
		return contactMapper.updateByPrimaryKey(record);
	}


}
