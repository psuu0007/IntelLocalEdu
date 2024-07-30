package spms.servlets;

import java.io.IOException;
import java.sql.Connection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import spms.dao.MemberDao;
import spms.dto.MemberDto;

@WebServlet(value = "/auth/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = req.getRequestDispatcher("./LoginForm.jsp");
		rd.forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		try {
			ServletContext sc = this.getServletContext();
		
			// 미리 준비된 DB 객체 불러오기
			conn = (Connection)sc.getAttribute("conn");
			MemberDao memberDao = new MemberDao();
			memberDao.setConnection(conn);
			
			String email = req.getParameter("email");
			String pwd = req.getParameter("password");
			
			MemberDto memberDto;
			
			memberDto = memberDao.memberExist(email, pwd);
			
			// 회원이 없다면 로그인 실패 페이지로 이동
			if(memberDto == null) {
				RequestDispatcher dispatcher 
					= req.getRequestDispatcher("LoginFail.jsp");
			
				req.setAttribute("email", email);
				dispatcher.forward(req, res);
				return;
			}
			
			HttpSession session = req.getSession();
			session.setAttribute("memberDto", memberDto);
			
			res.sendRedirect("../member/list");
			
		} catch (Exception e) {
			e.printStackTrace();
			
			req.setAttribute("error", e);
//			req.setAttribute("caseByCase", "상황에 맞는 처리 부탁");
			req.setAttribute("msg1", "로그인을 실패하였습니다");
			
			RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(req, res);
//			건네준다
		} 
	}
	
}
