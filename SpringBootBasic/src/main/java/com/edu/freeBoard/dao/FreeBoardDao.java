package com.edu.freeBoard.dao;

import java.util.List;

import com.edu.freeBoard.domain.FreeBoardVo;

public interface FreeBoardDao {
	public List<FreeBoardVo> freeBoardSelectList(int start, int end);
	public int freeBoardSelectTotalCount();
	
	public FreeBoardVo freeBoardSelectOne(int freeBoardId);

	public void freeBoardInsertOne(FreeBoardVo freeBoardVo);
	public void freeBoardUpdateOne(FreeBoardVo freeBoardVo);
	
}
