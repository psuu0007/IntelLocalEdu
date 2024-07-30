package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import spms.dao.MemberDao;
import spms.dto.MemberDto;


/**
 *ALT + SHIFT + J: API 주석
 *회원 목록 조회 구현
 * 
 */
@WebServlet(value = "/member/list")
public class MemberListServlet extends HttpServlet {

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
			
			
			MemberDao memberDao = new MemberDao();
			memberDao.setConnection(conn);
			
			ArrayList<MemberDto> memberList = 
				(ArrayList<MemberDto>) memberDao.selectList();
			
			request.setAttribute("memberList", memberList);
			
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			
			RequestDispatcher dispatcher =
				request.getRequestDispatcher("/member/MemberListView.jsp");
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
		super.doPost(req, res);
	}
	
}
