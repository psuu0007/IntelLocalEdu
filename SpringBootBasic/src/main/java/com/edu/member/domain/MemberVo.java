package com.edu.member.domain;

import java.util.Date;

public class MemberVo {

	private int memberNo;    
	private String email;        
	private String memberName;  
	private String password;          
	private Date createdDate;     
	private Date modifiedDate;
	
	public MemberVo() {
		super();
	}

	public MemberVo(int memberNo, String email, String password, 
		String memberName, Date createdDate, Date modifiedDate) {
		super();
		this.memberNo = memberNo;
		this.email = email;
		this.password = password;
		this.memberName = memberName;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public MemberVo(String email, String memberName) {
		// TODO Auto-generated constructor stub
		this.email = email;
		this.memberName = memberName;
	}

	public MemberVo(int memberNo, String email, String memberName
		, Date createdDate) {
		super();
		this.memberNo = memberNo;
		this.email = email;
		this.memberName = memberName;
		this.createdDate = createdDate;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberVo [memberNo=");
		builder.append(memberNo);
		builder.append(", email=");
		builder.append(email);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", modifiedDate=");
		builder.append(modifiedDate);
		builder.append("]");
		return builder.toString();
	}

}
