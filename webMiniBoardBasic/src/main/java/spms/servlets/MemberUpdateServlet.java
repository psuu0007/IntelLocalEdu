package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/member/update"})
public class MemberUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		

		try {
			int memberNo = Integer.parseInt(req.getParameter("memberNo"));
			
			
			ServletContext sc = this.getServletContext();
						
			conn = (Connection)sc.getAttribute("conn");
			
			MemberDao memberDao = new MemberDao();
			memberDao.setConnection(conn);
			
			MemberDto memberDto = memberDao.memberSelectOne(memberNo);
			
			req.setAttribute("memberDto", memberDto);
			RequestDispatcher rd = 
				req.getRequestDispatcher("./memberUpdateForm.jsp");
			rd.forward(req, res);
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error", e);
			RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/Error.jsp");
			
			dispatcher.forward(req, res);
			
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		MemberDto memberDto = null;
		
		try {
			ServletContext sc = this.getServletContext();
			
			String emailStr = req.getParameter("email");
			String memberNameStr = req.getParameter("memberName");
			int memberNo = Integer.parseInt(req.getParameter("memberNo"));
			
			memberDto = new MemberDto();
			
			memberDto.setEmail(emailStr);
			memberDto.setMemberName(memberNameStr);
			memberDto.setMemberNo(memberNo);
			
			conn = (Connection)sc.getAttribute("conn");
			
			MemberDao memberDao = new MemberDao();
			memberDao.setConnection(conn);
			
			int result = memberDao.memberUpdate(memberDto);

			if(result == 0) {
				System.out.println("회원 정보 조회가 실패하였습니다.");
			}
			
			res.sendRedirect("list");
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("error", e);
			RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/Error.jsp");
			
			dispatcher.forward(req, res);
		}
		
	}
	
}
