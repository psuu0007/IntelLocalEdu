package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
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
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			ServletContext sc = this.getServletContext();
		
			// 미리 준비된 DB 객체 불러오기
			conn = (Connection)sc.getAttribute("conn");
			
			String email = req.getParameter("email");
			String pwd = req.getParameter("password");
			String memberName = "";
			
			String sql = "";
			int colIndex = 1;
			
			sql += "SELECT MEMBER_NO, EMAIL, MEMBER_NAME";
			sql += " FROM MEMBER";
			sql += " WHERE EMAIL = ? AND PWD = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(colIndex++, email);
			pstmt.setString(colIndex, pwd);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				email = rs.getString("EMAIL");
				memberName = rs.getString("MEMBER_NAME");
				
				MemberDto memberDto = new MemberDto(email, memberName);
				
				HttpSession session = req.getSession();
				
				
				session.setAttribute("memberDto", memberDto);
				
				res.sendRedirect("../member/list");
			}else {
				RequestDispatcher dispatcher 
					= req.getRequestDispatcher("LoginFail.jsp");
				
				dispatcher.forward(req, res);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
//			throw new ServletException(e);
			req.setAttribute("error", e);
			req.setAttribute("caseByCase", "상황에 맞는 처리 부탁");
			
			RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(req, res);
//			건네준다
		} 
	}
	
}
