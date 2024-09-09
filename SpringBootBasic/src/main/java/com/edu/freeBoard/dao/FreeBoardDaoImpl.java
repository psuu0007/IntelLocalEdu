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
	
	
}
