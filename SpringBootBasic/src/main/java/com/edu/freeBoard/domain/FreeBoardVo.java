package com.edu.freeBoard.domain;

import java.util.Date;

import com.edu.member.domain.MemberVo;

public class FreeBoardVo extends MemberVo{

	private int freeBoardId;		// 기본키
	private String freeBoardTitle;
	private String freeBoardContent;
	private Date createDate;
	private Date updateDate;
	
	public FreeBoardVo() {
		super();
	}

	public FreeBoardVo(int freeBoardId, String freeBoardTitle, String freeBoardContent, 
		Date createDate, Date updateDate) {
		super();
		this.freeBoardId = freeBoardId;
		this.freeBoardTitle = freeBoardTitle;
		this.freeBoardContent = freeBoardContent;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getFreeBoardId() {
		return freeBoardId;
	}

	public void setFreeBoardId(int freeBoardId) {
		this.freeBoardId = freeBoardId;
	}

	public String getFreeBoardTitle() {
		return freeBoardTitle;
	}

	public void setFreeBoardTitle(String freeBoardTitle) {
		this.freeBoardTitle = freeBoardTitle;
	}

	public String getFreeBoardContent() {
		return freeBoardContent;
	}

	public void setFreeBoardContent(String freeBoardContent) {
		this.freeBoardContent = freeBoardContent;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FreeBoardVo [freeBoardId=");
		builder.append(freeBoardId);
		builder.append(", freeBoardTitle=");
		builder.append(freeBoardTitle);
		builder.append(", freeBoardContent=");
		builder.append(freeBoardContent);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", updateDate=");
		builder.append(updateDate);
		builder.append("]");
		return builder.toString();
	}
	
}
