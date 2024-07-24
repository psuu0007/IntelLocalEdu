package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String driver = "";
		String url = "";
		String user = "";
		String password = ""; 
		
//		try문 안에 예외처리가 관련이 없더라도 
//		모든 관련 로직은 어떤 문제가 생기는지 알 수 있도록 처리해야 한다
		try {
			ServletContext sc = this.getServletContext();
			
			driver = sc.getInitParameter("driver");
			url = sc.getInitParameter("url");
			user = sc.getInitParameter("user");
			password = sc.getInitParameter("password");
			
//			오라클 객체 불러오기
			Class.forName(driver);
			// 드라이브매니저에 jdbc 등록 -> db 연결 -> db 객체
			conn = DriverManager.getConnection(url, user, password);
//			sql 실행 객체 준비
			
			String sql = "";
			
			sql += "SELECT MEMBER_NO, EMAIL, PWD, MEMBER_NAME, CRE_DATE";
			sql += " FROM MEMBER";
			sql += " ORDER BY MEMBER_NO ASC";
			
			pstmt = conn.prepareStatement(sql);
			
			// db에 sql문 전달, 실행
			rs = pstmt.executeQuery(sql);
			
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			
			ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
			
			int memberNo = 0;
			String memberName = "";
			String email = "";
			Date creDate = null;
			
			MemberDto memberDto = null;
			while(rs.next()) {
				memberNo = rs.getInt("MEMBER_NO");
				memberName = rs.getString("MEMBER_NAME");
				email = rs.getString("EMAIL");
				creDate = rs.getDate("CRE_DATE");
				
				memberDto = new MemberDto();
				
				memberDto.setMemberNo(memberNo);
				memberDto.setMemberName(memberName);
				memberDto.setEmail(email);
				memberDto.setCreatedDate(creDate);
				
				memberList.add(memberDto);
			}
			
			request.setAttribute("memberList", memberList);
			
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
		} finally {
//			db 객체 메모리 해제
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} // finally 종료
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, res);
	}
	
}
