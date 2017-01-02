package com.funda.mybatis.service;

import com.funda.kcb.KCBClient;
import com.funda.kcb.KCBPerson;
import com.funda.mybatis.dao.application_dataMapper;
import com.funda.mybatis.model.application_data;
import com.funda.mybatis.model.application_dataExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ApplicationDataDAOService implements application_dataMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<application_data> selectByExample(application_dataExample content) {

		application_dataMapper application_data = sqlSession.getMapper(application_dataMapper.class);
		List<com.funda.mybatis.model.application_data> result = application_data.selectByExample(content);

		return result;
	}
/*
    @Override
    public int insertBatch(Map<String, Object> map, KCBPerson kcbPerson) {
        application_dataMapper account_contentsMapper = sqlSession.getMapper(application_dataMapper.class);
        Map<String, Object>paramMap = new HashMap<String, Object>();
        KCBClient client = new KCBClient();
        List<application_data> list=null;
        //client.getKCBClient371(kcbPerson);

        paramMap.put("list", list);
        //return account_contentsMapper.insertBatch(paramMap, kcbPerson);
    }
*/
	@Override
	public int insertSelective(application_data record) {
		application_dataMapper account_contentsMapper = sqlSession.getMapper(application_dataMapper.class);
		return	account_contentsMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") application_data record, @Param("example") application_dataExample example) {
		// TODO Auto-generated method stub
		application_dataMapper application_dataMapper = sqlSession.getMapper(application_dataMapper.class);
		return application_dataMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(application_dataExample example)
	{
		application_dataMapper application_dataMapper = sqlSession.getMapper(application_dataMapper.class);
		return	application_dataMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(application_dataExample example)
	{
		application_dataMapper application_dataMapper = sqlSession.getMapper(application_dataMapper.class);
		return	application_dataMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		application_dataMapper application_dataMapper = sqlSession.getMapper(application_dataMapper.class);
		return	application_dataMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(application_data record)
	{
		application_dataMapper application_dataMapper = sqlSession.getMapper(application_dataMapper.class);


		return	application_dataMapper.insert(record);
	}


    @Override
    public List<application_data> selectByExampleWithBLOBs(application_dataExample example)
    {

        application_dataMapper account_content = sqlSession.getMapper(application_dataMapper.class);
        List<application_data> result = account_content.selectByExampleWithBLOBs(example);
        return result;
    }


	@Override
	public application_data selectByPrimaryKey(Integer idx)
	{

		application_dataMapper account_content = sqlSession.getMapper(application_dataMapper.class);
		application_data result = account_content.selectByPrimaryKey(idx);
		return result;
	}



	@Override
	public int updateByExample(@Param("record") application_data record, @Param("example") application_dataExample example)
	{
		application_dataMapper application_dataMapper = sqlSession.getMapper(application_dataMapper.class);
		return application_dataMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(application_data record)
	{
		application_dataMapper application_dataMapper = sqlSession.getMapper(application_dataMapper.class);
		return application_dataMapper.updateByPrimaryKeySelective(record);
	}



	@Override
	public int updateByPrimaryKey(application_data record)
	{
		application_dataMapper application_dataMapper = sqlSession.getMapper(application_dataMapper.class);
		return application_dataMapper.updateByPrimaryKey(record);
	}


}
