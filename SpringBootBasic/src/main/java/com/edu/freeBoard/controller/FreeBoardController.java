package com.edu.freeBoard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.edu.freeBoard.domain.FreeBoardVo;
import com.edu.freeBoard.service.FreeBoardService;
import com.edu.util.Paging;

@RestController
@RequestMapping("/freeBoard")
public class FreeBoardController {

	private Logger log = LoggerFactory.getLogger(FreeBoardController.class);
	private final String logTitleMsg = "==FreeBoardController==";
	
	@Autowired
	private FreeBoardService freeBoardService;
	
	@RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView freeBoardList(@RequestParam(defaultValue = "1") int curPage) {
		log.info(logTitleMsg);
		log.info("@RequestMapping freeBoardList curPage: {}", curPage);
		
		int totalCount = freeBoardService.freeBoardSelectTotalCount();
		
		Paging pagingVo = new Paging(totalCount, curPage);
		int start = pagingVo.getPageBegin();
		int end = pagingVo.getPageEnd();
//		
		List<FreeBoardVo> freeBoardList 
			= freeBoardService.freeBoardSelectList(start, end);
		
		Map<String, Object> pagingMap = new HashMap<>();
		pagingMap.put("totalCount", totalCount);
		pagingMap.put("pagingVo", pagingVo);
		
		ModelAndView mav = new ModelAndView("freeBoard/FreeBoardListView");
		mav.addObject("freeBoardList", freeBoardList);
		mav.addObject("pagingMap", pagingMap);
		
		return mav;
	}
	
	@PostMapping("/")
	public ResponseEntity<Map<String, String>> 
		freeBoardInsertCtr(@ModelAttribute FreeBoardVo freeBoardVo
			, MultipartHttpServletRequest mhr){
		log.info(logTitleMsg);
		log.info("@PostMapping freeBoardInsertCtr freeBoardVo: {}"
			, freeBoardVo);
		
		
		try {
			freeBoardService.freeBoardInsertOne(freeBoardVo, mhr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.info("자유게시판 추가에서 문제 발생 원래는 화면 처리");
			e.printStackTrace();
		}
		
		Map<String, String> jsonMap = new HashMap<String, String>();
		jsonMap.put("result", "success");
		
		return ResponseEntity.ok(jsonMap);
	}
	
	//게시판 수정 화면으로 이동
	@GetMapping("/{freeBoardId}")
	public ResponseEntity<Map<String, Object>> 
		freeBoardUpdate(@PathVariable int freeBoardId, @RequestParam int curPage){
		log.info(logTitleMsg);
		log.info("@GetMapping freeBoardUpdate freeBoardId: {}, curPage: {}"
			, freeBoardId, curPage);
		
		Map<String, Object> resultMap = 
			freeBoardService.freeBoardSelectOne(freeBoardId);
		
		resultMap.put("curPage", curPage);
		
		return ResponseEntity.ok(resultMap);
	}
	
	//게시판 수정 DB
	@PatchMapping("/{freeBoardId}")
	public ResponseEntity<?> 
		freeBoardUpdateCtr(@PathVariable int freeBoardId
			, @RequestParam Map<String, String> freeBoardMap
			, MultipartHttpServletRequest mhr
			, @RequestParam(value="delFreeBoardFileIdList", required = false)
				List<Integer> delFreeBoardFileIdList){
		log.info(logTitleMsg);
		log.info("@PatchMapping freeBoardUpdateCtr freeBoardId: {}, "
			+ "freeBoardMap: {}, delFreeBoardFileIdList: {}"
			, freeBoardId, freeBoardMap, delFreeBoardFileIdList);
		
		FreeBoardVo freeBoardVo = new FreeBoardVo();
		freeBoardVo.setFreeBoardId(freeBoardId);
		freeBoardVo.setMemberNo(Integer.parseInt(freeBoardMap.get("memberNo")));
		freeBoardVo.setFreeBoardTitle(freeBoardMap.get("freeBoardTitle"));
		freeBoardVo.setFreeBoardContent(freeBoardMap.get("freeBoardContent"));
		
		try {
			freeBoardService.freeBoardUpdateOne(freeBoardVo, mhr, delFreeBoardFileIdList);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Map<String, String> errorResponseMap = new HashMap<>();
			errorResponseMap.put("errorMsg", "게시판 등록자가 아닌것 같다.");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.contentType(MediaType.APPLICATION_JSON).body(errorResponseMap);
		}
//		수정?
		
		Map<String, Object> resultMap 
			= freeBoardService.freeBoardSelectOne(freeBoardId);
		
		return ResponseEntity.ok(resultMap);
	}
	
	@DeleteMapping("/{freeBoardId}")
	public ResponseEntity<Integer> freeBoardDelete(@PathVariable int freeBoardId
		, @RequestParam int memberNo, @RequestParam int curPage){
		log.info(logTitleMsg);
		log.info("@DeleteMapping freeBoardDelete freeBoardId: {}, memberNo: {} "
			+ ", curPage: {}", freeBoardId, memberNo, curPage);
		
		freeBoardService.freeBoardDeleteOne(freeBoardId, memberNo);
		
		return ResponseEntity.ok(curPage);
	}
	
}
