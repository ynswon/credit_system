package com.funda.mybatis.service;

import com.funda.mybatis.dao.disqualifiedReasonsMapper;
import com.funda.mybatis.model.disqualifiedReasons;
import com.funda.mybatis.model.disqualifiedReasonsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DisQualifiedReasonDAOService implements disqualifiedReasonsMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<disqualifiedReasons> selectByExample(disqualifiedReasonsExample content) {

        disqualifiedReasonsMapper account_content = sqlSession.getMapper(disqualifiedReasonsMapper.class);
		List<disqualifiedReasons> result = account_content.selectByExample(content);

		return result;
	}


	@Override
	public int insertSelective(disqualifiedReasons record) {
        disqualifiedReasonsMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.disqualifiedReasonsMapper.class);
		return	bank_codeMapper.insertSelective(record);
	}


	@Override
	public int updateByExampleSelective(@Param("record") disqualifiedReasons record, @Param("example") disqualifiedReasonsExample example) {
		// TODO Auto-generated method stub
        disqualifiedReasonsMapper bank_codeMapper = sqlSession.getMapper(disqualifiedReasonsMapper.class);
		return bank_codeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(disqualifiedReasonsExample example)
	{
        disqualifiedReasonsMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.disqualifiedReasonsMapper.class);
		return	bank_codeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(disqualifiedReasonsExample example)
	{
        disqualifiedReasonsMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.disqualifiedReasonsMapper.class);
		return	bank_codeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer idx)
	{
        disqualifiedReasonsMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.disqualifiedReasonsMapper.class);
		return	bank_codeMapper.deleteByPrimaryKey(idx);
	}

	@Override
	public int insert(disqualifiedReasons record)
	{
        disqualifiedReasonsMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.disqualifiedReasonsMapper.class);
		return	bank_codeMapper.insert(record);
	}




	@Override
	public disqualifiedReasons selectByPrimaryKey(Integer idx)
	{

        disqualifiedReasonsMapper account_content = sqlSession.getMapper(disqualifiedReasonsMapper.class);
        disqualifiedReasons result = account_content.selectByPrimaryKey(idx);
		return result;
	}


	@Override
	public int updateByExample(@Param("record") disqualifiedReasons record, @Param("example") disqualifiedReasonsExample example)
	{
        disqualifiedReasonsMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.disqualifiedReasonsMapper.class);
		return bank_codeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(disqualifiedReasons record)
	{
        disqualifiedReasonsMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.disqualifiedReasonsMapper.class);
		return bank_codeMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public int updateByPrimaryKey(disqualifiedReasons record)
	{
        disqualifiedReasonsMapper bank_codeMapper = sqlSession.getMapper(com.funda.mybatis.dao.disqualifiedReasonsMapper.class);
		return bank_codeMapper.updateByPrimaryKey(record);
	}


}
