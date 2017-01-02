package com.funda.mybatis.service;

import com.funda.mybatis.dao.list_couponMapper;
import com.funda.mybatis.model.list_coupon;
import com.funda.mybatis.model.list_couponExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ListCouponDAOService implements list_couponMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<list_coupon> selectByExample(list_couponExample content) {

		list_couponMapper account_content = sqlSession.getMapper(list_couponMapper.class);
		List<list_coupon> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(list_coupon record) {
		list_couponMapper list_couponMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_couponMapper.class);
		return	list_couponMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") list_coupon record, @Param("example") list_couponExample example) {
		// TODO Auto-generated method stub
		list_couponMapper list_couponMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_couponMapper.class);
		return list_couponMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(list_couponExample example)
	{
		list_couponMapper list_couponMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_couponMapper.class);
		return	list_couponMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(list_couponExample example)
	{
		list_couponMapper list_couponMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_couponMapper.class);
		return	list_couponMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		list_couponMapper list_couponMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_couponMapper.class);
		return	list_couponMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(list_coupon record)
	{
		list_couponMapper list_couponMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_couponMapper.class);
		return	list_couponMapper.insert(record);
	}



	@Override
	public list_coupon selectByPrimaryKey(Integer idx)
	{

		list_couponMapper account_content = sqlSession.getMapper(list_couponMapper.class);
		list_coupon result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") list_coupon record, @Param("example") list_couponExample example)
	{
		list_couponMapper list_couponMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_couponMapper.class);
		return list_couponMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(list_coupon record)
	{
		list_couponMapper list_couponMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_couponMapper.class);
		return list_couponMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(list_coupon record)
	{
		list_couponMapper list_couponMapper = sqlSession.getMapper(com.funda.mybatis.dao.list_couponMapper.class);
		return list_couponMapper.updateByPrimaryKey(record);
	}


}
