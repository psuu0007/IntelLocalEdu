package com.edu.freeBoard.domain;

import java.util.Date;

import com.edu.member.domain.MemberVo;

import jakarta.persistence.Id;
import lombok.Data;


@Data
public class FreeBoardVo extends MemberVo{

	@Id
	private int freeBoardId;		// 기본키
	private String freeBoardTitle;
	private String freeBoardContent;
	private Date createDate;
	private Date updateDate;
	
	
	
}
