package spms.freeboard.controller;

import java.io.IOException;
import java.sql.Connection;

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
import spms.freeboard.dto.MemberFreeBoardDto;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/freeBoard/update"})
public class FreeBoardUpdateController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;

		try {
			int freeBoardId = Integer.parseInt(req.getParameter("freeBoardId"));
			
			ServletContext sc = this.getServletContext();
						
			conn = (Connection)sc.getAttribute("conn");
			
			FreeBoardDao freeBoardDao = new FreeBoardDao();
			freeBoardDao.setConnection(conn);
			
			// update 화면으로 변경해야 한다
			MemberFreeBoardDto memberFreeBoardDto = 
				freeBoardDao.freeBoardSelectOne(freeBoardId);
			
			req.setAttribute("MemberFreeBoardDto", memberFreeBoardDto);
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
