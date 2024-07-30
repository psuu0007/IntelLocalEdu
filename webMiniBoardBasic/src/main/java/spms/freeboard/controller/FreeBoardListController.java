package spms.freeboard.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import spms.dao.MemberDao;
import spms.dto.MemberDto;
import spms.freeboard.dao.FreeBoardDao;
import spms.freeboard.dto.FreeBoardDto;
import spms.freeboard.dto.MemberFreeBoardDto;


/**
 *ALT + SHIFT + J: API 주석
 *회원 목록 조회 구현
 * 
 */
@WebServlet(value = "/freeBoard/list")
public class FreeBoardListController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request
		, HttpServletResponse response)
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		DB 객체 준비
		Connection conn = null;
		
		try {
			ServletContext sc = this.getServletContext();
		
			// 미리 준비된 DB 객체 불러오기
			conn = (Connection)sc.getAttribute("conn");
			
			
			FreeBoardDao freeBoardDao = new FreeBoardDao();
			freeBoardDao.setConnection(conn);
			
			ArrayList<FreeBoardDto> freeBoardList = 
				(ArrayList<FreeBoardDto>) freeBoardDao.selectList();
			
			request.setAttribute("freeBoardList", freeBoardList);
			
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			
			RequestDispatcher dispatcher =
				request.getRequestDispatcher("/freeBoard/FreeBoardListView.jsp");
			dispatcher.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			
//			throw new ServletException(e);
			request.setAttribute("error", e);
			request.setAttribute("caseByCase", "상황에 맞는 처리 부탁");
			
			RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(request, response);
//			건네준다
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null;

		try {
			// 낭비되는 부분이 큰 코드
			String freeBoardIdStr = req.getParameter("freeBoardId");
			int freeBoardId = Integer.parseInt(freeBoardIdStr);
			
			ServletContext sc = this.getServletContext();
						
			conn = (Connection)sc.getAttribute("conn");
			
			FreeBoardDao freeBoardDao = new FreeBoardDao();
			freeBoardDao.setConnection(conn);
			
			MemberFreeBoardDto memberFreeBoardDto = 
				freeBoardDao.freeBoardSelectOne(freeBoardId);
			
			req.setAttribute("memberFreeBoardDto", memberFreeBoardDto);
			RequestDispatcher rd = 
				req.getRequestDispatcher("./freeBoardDetailView.jsp");
			rd.forward(req, res);
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error", e);
			RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/Error.jsp");
			
			dispatcher.forward(req, res);
			
		}
	}
	
}
