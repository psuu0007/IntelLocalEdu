package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import spms.dao.MemberDao;
import spms.dto.MemberDto;

@WebServlet(value = "/member/add")
public class MemberAddServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		res.sendRedirect("./MemberForm.jsp");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		try {
			
			String emailStr = req.getParameter("email");
			String pwdStr = req.getParameter("password");
			String memberNameStr = req.getParameter("memberName");
			
			MemberDto memberDto = new MemberDto();
			memberDto.setEmail(emailStr);
			memberDto.setPassword(pwdStr);
			memberDto.setMemberName(memberNameStr);
			
			ServletContext sc = this.getServletContext();
			conn = (Connection)sc.getAttribute("conn");
			
			MemberDao memberDao = new MemberDao();
			memberDao.setConnection(conn);
		
			int result;
			
			result = memberDao.memberInsert(memberDto);
			
			// 0이면 추가한 회원이 없다는 의미
			// 1이면 추가한 회원이 한명 있다는 의미
			if(result == 0) {
				System.out.println("회원가입 실패");
			}
			
			res.sendRedirect("./list");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("error", e);
			RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/Error.jsp");
			
			dispatcher.forward(req, res);
		}
		
	}
	
}
