package com.edu.freeBoard.dao;

import java.util.List;
import java.util.Map;

import com.edu.freeBoard.domain.FreeBoardVo;

public interface FreeBoardDao {
	public List<FreeBoardVo> freeBoardSelectList(int start, int end);
	public int freeBoardSelectTotalCount();
	
	public FreeBoardVo freeBoardSelectOne(int freeBoardId);
	public List<Map<String, Object>> freeBoardFileSelectList(int no);
	
	public void freeBoardInsertOne(FreeBoardVo freeBoardVo);
	public void freeBoardUpdateOne(FreeBoardVo freeBoardVo);
	
	public void freeBoardFileInsertOne(Map<String, Object> map);
	public List<Map<String, Object>> 
		fileSelectStoredFileName(List<Integer> delFreeBoardFileIdList);
	public int deleteFileByFreeFileIds(List<Integer> delFreeBoardFileIdList);
	
	public int deleteFileByFreeBoardId(int freeBoardId);
	public List<Map<String, Object>> selectFileByFreeBoardId(int freeBoardId);
	public void freeBoardDeleteOne(int freeBoardId, int memberNo);
	
	
}
