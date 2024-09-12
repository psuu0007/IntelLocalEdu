package com.edu.freeBoard.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.freeBoard.domain.FreeBoardVo;

@Repository
public class FreeBoardDaoImpl implements FreeBoardDao{

	@Autowired
	private SqlSession sqlSession;
	
	String namespace = "com.edu.freeBoard.";

	@Override
	public List<FreeBoardVo> freeBoardSelectList(int start, int end) {
		// TODO 마음대로 하면 되요
		Map<String, Object> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		
		return sqlSession.selectList(namespace + "freeBoardSelectList", map);
	}

	@Override
	public int freeBoardSelectTotalCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + "freeBoardSelectTotalCount");
	}

	@Override
	public FreeBoardVo freeBoardSelectOne(int freeBoardId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + "freeBoardSelectOne"
			, freeBoardId);
	}
	
	@Override
	public void freeBoardInsertOne(FreeBoardVo freeBoardVo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + "freeBoardInsertOne", freeBoardVo);
	}

	@Override
	public void freeBoardUpdateOne(FreeBoardVo freeBoardVo) {
		// TODO Auto-generated method stub
		sqlSession.update(namespace + "freeBoardUpdateOne", freeBoardVo);
	}

	@Override
	public void freeBoardFileInsertOne(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + "freeBoardFileInsertOne", map);
	}

	@Override
	public List<Map<String, Object>> freeBoardFileSelectList(int no) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + "freeBoardFileSelectList"
			, no);
	}

	@Override
	public List<Map<String, Object>> 
		fileSelectStoredFileName(List<Integer> delFreeBoardFileIdList) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + "fileSelectStoredFileName"
			, delFreeBoardFileIdList);
	}

	@Override
	public int deleteFileByFreeFileIds(List<Integer> delFreeBoardFileIdList) {
		// TODO Auto-generated method stub
		return sqlSession.delete(namespace + "deleteFileByFreeFileIds"
			, delFreeBoardFileIdList);
	}

	@Override
	public int deleteFileByFreeBoardId(int freeBoardId) {
		// TODO Auto-generated method stub
		return sqlSession.delete(namespace + "deleteFileByFreeBoardId", freeBoardId);
	}

	@Override
	public List<Map<String, Object>> selectFileByFreeBoardId(int freeBoardId) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + "selectFileByFreeBoardId", freeBoardId);
	}

	@Override
	public void freeBoardDeleteOne(int freeBoardId, int memberNo) {
		// TODO Auto-generated method stub
		Map<String, Integer> paramMap = new HashMap<>();
		paramMap.put("freeBoardId", freeBoardId);
		paramMap.put("memberNo", memberNo);
		
		sqlSession.delete(namespace + "freeBoardDeleteOne", paramMap);
	}
	
	
}
