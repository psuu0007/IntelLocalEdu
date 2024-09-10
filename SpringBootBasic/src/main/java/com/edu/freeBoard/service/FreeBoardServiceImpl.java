package com.edu.freeBoard.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.edu.freeBoard.dao.FreeBoardDao;
import com.edu.freeBoard.domain.FreeBoardVo;
import com.edu.util.FileUtils;

@Service
public class FreeBoardServiceImpl implements FreeBoardService{
	
	private static final Logger log = 
		LoggerFactory.getLogger(FreeBoardServiceImpl.class);
	
	@Autowired
	public FreeBoardDao freeBoardDao;
	
	@Autowired
	private FileUtils fileUtils;

	@Override
	public List<FreeBoardVo> freeBoardSelectList(int start, int end) {
		// TODO Auto-generated method stub
		return freeBoardDao.freeBoardSelectList(start, end);
	}

	@Override
	public int freeBoardSelectTotalCount() {
		// TODO Auto-generated method stub
		return freeBoardDao.freeBoardSelectTotalCount();
	}

	@Override
	public Map<String, Object> freeBoardSelectOne(int freeBoardId) {
		// TODO Auto-generated method stub
		Map<String, Object> resultMap = new HashMap<>();
		
		FreeBoardVo freeBoardVo = 
			freeBoardDao.freeBoardSelectOne(freeBoardId);
		resultMap.put("freeBoardVo", freeBoardVo);
		
		List<Map<String, Object>> freeBoardFileList = 
			freeBoardDao.freeBoardFileSelectList(freeBoardId);
		resultMap.put("freeBoardFileList", freeBoardFileList);
		
		return resultMap;
	}
	
	@Override
	public void freeBoardInsertOne(FreeBoardVo freeBoardVo
		, MultipartHttpServletRequest mhr) throws Exception{
		// TODO Auto-generated method stub
		freeBoardDao.freeBoardInsertOne(freeBoardVo);
		
		System.out.println("?????????: " + freeBoardVo.getFreeBoardId());
		
		List<Map<String, Object>> fileList =
			fileUtils.parseInsertFileInfo(freeBoardVo.getFreeBoardId()
			, mhr);
		
		for (int i = 0; i < fileList.size(); i++) {
			freeBoardDao.freeBoardFileInsertOne(fileList.get(i));
		}
	}

	@Override
	public void freeBoardUpdateOne(FreeBoardVo freeBoardVo) {
		// TODO Auto-generated method stub
		freeBoardDao.freeBoardUpdateOne(freeBoardVo);
	}

}
