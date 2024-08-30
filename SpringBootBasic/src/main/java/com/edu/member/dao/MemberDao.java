package com.edu.member.dao;

import java.util.List;

import com.edu.member.domain.MemberVo;

public interface MemberDao {

	List<MemberVo> memberSelectList(); // 민재 질문
	
	public MemberVo memberExist(String email, String password);
	public abstract int memberInsertOne(MemberVo memberVo);  // int? 보근 질문
	
	public MemberVo memberSelectOne(int no);
	public int memberUpdateOne(MemberVo memberVo);
	public int memberDeleteOne(int no);
}
