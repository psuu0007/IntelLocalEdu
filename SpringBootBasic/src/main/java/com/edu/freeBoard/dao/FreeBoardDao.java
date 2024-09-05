package com.edu.freeBoard.dao;

import java.util.List;

import com.edu.freeBoard.domain.FreeBoardVo;

public interface FreeBoardDao {
	public List<FreeBoardVo> freeBoardSelectList(int start, int end);
	public int freeBoardSelectTotalCount();
	
	public void freeBoardInsertOne(FreeBoardVo freeBoardVo);
	
}
