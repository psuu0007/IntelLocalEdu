package stu.edu.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HelloWorld implements Servlet{
	
	ServletConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 호출");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig 호출");
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServletInfo 호출");
		return "";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출");
		
		this.config = config;
		
		String emailStr = this.config.getInitParameter("email");
		
		System.out.println("컨텍스트 렙레에서 입출된 내용 확인");
		System.out.println("이메일: " + emailStr);
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service 호출");
		
	}
	

}
