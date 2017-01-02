package com.funda.mybatis.service;

import com.funda.mybatis.dao.coupon_dataMapper;
import com.funda.mybatis.model.coupon_data;
import com.funda.mybatis.model.coupon_dataExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CouponDataDAOService implements coupon_dataMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<coupon_data> selectByExample(coupon_dataExample content) {

		coupon_dataMapper account_content = sqlSession.getMapper(coupon_dataMapper.class);
		List<coupon_data> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(coupon_data record) {
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return	coupon_dataMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") coupon_data record, @Param("example") coupon_dataExample example) {
		// TODO Auto-generated method stub
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return coupon_dataMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(coupon_dataExample example)
	{
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return	coupon_dataMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(coupon_dataExample example)
	{
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return	coupon_dataMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return	coupon_dataMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(coupon_data record)
	{
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return	coupon_dataMapper.insert(record);
	}



	@Override
	public List<coupon_data> selectByExampleWithBLOBs(coupon_dataExample example)
	{
		coupon_dataMapper account_content = sqlSession.getMapper(coupon_dataMapper.class);
		List<coupon_data> result = account_content.selectByExampleWithBLOBs(example);
		return result;
	}

	@Override
	public coupon_data selectByPrimaryKey(Integer idx)
	{

		coupon_dataMapper account_content = sqlSession.getMapper(coupon_dataMapper.class);
		coupon_data result = account_content.selectByPrimaryKey(idx);
		return result;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") coupon_data record, @Param("example") coupon_dataExample example)
	{
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return coupon_dataMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(@Param("record") coupon_data record, @Param("example") coupon_dataExample example)
	{
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return coupon_dataMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(coupon_data record)
	{
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return coupon_dataMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(coupon_data record)
	{
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return coupon_dataMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(coupon_data record)
	{
		coupon_dataMapper coupon_dataMapper = sqlSession.getMapper(com.funda.mybatis.dao.coupon_dataMapper.class);
		return coupon_dataMapper.updateByPrimaryKey(record);
	}


}
