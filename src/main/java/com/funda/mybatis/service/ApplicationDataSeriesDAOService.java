package com.funda.mybatis.service;

import com.funda.kcb.KCBPerson;
import com.funda.mybatis.dao.application_dataMapper;
import com.funda.mybatis.dao.application_data_seriesMapper;
import com.funda.mybatis.model.application_data;
import com.funda.mybatis.model.application_data_series;
import com.funda.mybatis.model.application_data_seriesExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ApplicationDataSeriesDAOService implements application_data_seriesMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<application_data_series> selectByExample(application_data_seriesExample content) {

		application_data_seriesMapper application_data_series = sqlSession.getMapper(application_data_seriesMapper.class);
		List<com.funda.mybatis.model.application_data_series> result = application_data_series.selectByExample(content);

		return result;
	}

    @Override
    public List<application_data_series> selectByCount(Integer ref_idx) {

        application_data_seriesMapper application_data_series = sqlSession.getMapper(application_data_seriesMapper.class);
        List<com.funda.mybatis.model.application_data_series> result = application_data_series.selectByCount(ref_idx);

        return result;
    }


    /*
    @Override
    public int insertBatch(Map<String, Object> map, KCBPerson kcbPerson)
    {
        application_dataMapper account_contentsMapper = sqlSession.getMapper(application_dataMapper.class);
        Map<String, Object>paramMap = new HashMap<String, Object>();
        List<application_data> list= null;

        paramMap.put("list", list);
        return account_contentsMapper.insertBatch(paramMap, kcbPerson);
    }
*/
	@Override
	public int insertSelective(application_data_series record) {
		application_data_seriesMapper application_data_seriesMapper = sqlSession.getMapper(com.funda.mybatis.dao.application_data_seriesMapper.class);
		return	application_data_seriesMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") application_data_series record, @Param("example") application_data_seriesExample example) {
		// TODO Auto-generated method stub
		application_data_seriesMapper application_data_seriesMapper = sqlSession.getMapper(com.funda.mybatis.dao.application_data_seriesMapper.class);
		return application_data_seriesMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(application_data_seriesExample example)
	{
		application_data_seriesMapper application_data_seriesMapper = sqlSession.getMapper(com.funda.mybatis.dao.application_data_seriesMapper.class);
		return	application_data_seriesMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(application_data_seriesExample example)
	{
		application_data_seriesMapper application_data_seriesMapper = sqlSession.getMapper(com.funda.mybatis.dao.application_data_seriesMapper.class);
		return	application_data_seriesMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
		application_data_seriesMapper application_data_seriesMapper = sqlSession.getMapper(com.funda.mybatis.dao.application_data_seriesMapper.class);
		return	application_data_seriesMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(application_data_series record)
	{
		application_data_seriesMapper application_data_seriesMapper = sqlSession.getMapper(com.funda.mybatis.dao.application_data_seriesMapper.class);
		return	application_data_seriesMapper.insert(record);
	}




	@Override
	public application_data_series selectByPrimaryKey(Integer idx)
	{

		application_data_seriesMapper account_content = sqlSession.getMapper(application_data_seriesMapper.class);
		application_data_series result = account_content.selectByPrimaryKey(idx);
		return result;
	}



	@Override
	public int updateByExample(@Param("record") application_data_series record, @Param("example") application_data_seriesExample example)
	{
		application_data_seriesMapper application_data_seriesMapper = sqlSession.getMapper(com.funda.mybatis.dao.application_data_seriesMapper.class);
		return application_data_seriesMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(application_data_series record)
	{
		application_data_seriesMapper application_data_seriesMapper = sqlSession.getMapper(com.funda.mybatis.dao.application_data_seriesMapper.class);
		return application_data_seriesMapper.updateByPrimaryKeySelective(record);
	}



	@Override
	public int updateByPrimaryKey(application_data_series record)
	{
		application_data_seriesMapper application_data_seriesMapper = sqlSession.getMapper(com.funda.mybatis.dao.application_data_seriesMapper.class);
		return application_data_seriesMapper.updateByPrimaryKey(record);
	}


}
