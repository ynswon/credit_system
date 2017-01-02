package com.funda.mybatis.service;

import com.funda.kcb.KCBClient;
import com.funda.kcb.KCBPerson;
import com.funda.mybatis.dao.applicationMapper;
import com.funda.mybatis.dao.applicationMapper;
import com.funda.mybatis.model.application;
import com.funda.mybatis.model.applicationExample;
import com.funda.mybatis.model.applicationWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ApplicationDAOService implements applicationMapper {

	@Autowired
	private SqlSession sqlSession;

    @Override
    public List<applicationWithBLOBs> selectByExampleWithBLOBs(applicationExample content) {

        applicationMapper application = sqlSession.getMapper(applicationMapper.class);
        List<applicationWithBLOBs> result = application.selectByExampleWithBLOBs(content);

        return result;
    }


    @Override
	public List<application> selectByExample(applicationExample content) {

		applicationMapper application = sqlSession.getMapper(applicationMapper.class);
		List<com.funda.mybatis.model.application> result = application.selectByExample(content);

		return result;
	}


    @Override
    public List<application> selectByGroup(applicationExample content) {

        applicationMapper application = sqlSession.getMapper(applicationMapper.class);
        List<com.funda.mybatis.model.application> result = application.selectByGroup(content);

        return result;
    }

    @Override
    public List<application> selectByLimit(applicationExample content) {

        applicationMapper application = sqlSession.getMapper(applicationMapper.class);
        List<com.funda.mybatis.model.application> result = application.selectByLimit(content);

        return result;
    }


	@Override
	public int insertSelective(applicationWithBLOBs record) {
		applicationMapper account_contentsMapper = sqlSession.getMapper(applicationMapper.class);
		return	account_contentsMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") applicationWithBLOBs record, @Param("example") applicationExample example) {
		// TODO Auto-generated method stub
		applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
		return applicationMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(applicationExample example)
	{
		applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
		return	applicationMapper.countByExample(example);
	}

    @Override
    public int maxByExample(applicationExample example)
    {
        applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
        return	applicationMapper.maxByExample(example);
    }


	@Override
	public int deleteByExample(applicationExample example)
	{
		applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
		return	applicationMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
		return	applicationMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(applicationWithBLOBs record)
	{
		applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);


		return	applicationMapper.insert(record);
	}




	@Override
	public applicationWithBLOBs selectByPrimaryKey(Integer idx)
	{

		applicationMapper account_content = sqlSession.getMapper(applicationMapper.class);
        applicationWithBLOBs result = account_content.selectByPrimaryKey(idx);
		return result;
	}


    @Override
    public int updateByExampleWithBLOBs(@Param("record") applicationWithBLOBs record, @Param("example") applicationExample example)
    {
        applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
        return applicationMapper.updateByExample(record, example);
    }


	@Override
	public int updateByExample(@Param("record") application record, @Param("example") applicationExample example)
	{
		applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
		return applicationMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(applicationWithBLOBs record)
	{
		applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
		return applicationMapper.updateByPrimaryKeySelective(record);
	}



	@Override
	public int updateByPrimaryKey(application record)
	{
		applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
		return applicationMapper.updateByPrimaryKey(record);
	}


    @Override
    public int updateByPrimaryKeyWithBLOBs(applicationWithBLOBs record)
    {
        applicationMapper applicationMapper = sqlSession.getMapper(applicationMapper.class);
        return applicationMapper.updateByPrimaryKeyWithBLOBs(record);
    }
}
