package com.edu.error.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.freeBoard.controller.FreeBoardController;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController{

	private Logger log = LoggerFactory.getLogger(CustomErrorController.class);
	
	@RequestMapping("/error")
	public String handleError(HttpServletRequest req) throws Exception{
		Object status = req.getAttribute("jakarta.servlet.error.status_code");
		
		if(status != null) {
			Integer statusCode = Integer.valueOf(status.toString());
			log.info("handling error statusCode: {}", statusCode);
			
			if(statusCode == HttpStatus.NOT_FOUND.value()) {
				return "error/404";
			}else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				return "error/500";
			}
		}
		
		return "error/Error"; // 공통 오류 처리	
	}
	
}
