package com.funda.mybatis.dao;

import com.funda.mybatis.model.Member;

import java.util.ArrayList;

public interface MemberDAO {

	public ArrayList<Member> getMembers();
	public void insertMember(Member member);
	public void updateMember(String name);
	public void deleteMember(String name);

}
