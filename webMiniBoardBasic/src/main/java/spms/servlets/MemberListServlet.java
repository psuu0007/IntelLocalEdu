package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 *ALT + SHIFT + J: API 주석
 *회원 목록 조회 구현
 * 
 */
@WebServlet(value = "/member/list")
public class MemberListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		DB 객체 준비
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ServletContext sc = this.getServletContext();
		
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String password = sc.getInitParameter("password");
		
		try {
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
			
			res.setContentType("text/html");
			res.setCharacterEncoding("UTF-8");
			
			PrintWriter out = res.getWriter();
			
			String htmlStr = "";
			
			
			htmlStr += "<p>";
			htmlStr += "<a href='./add'>신규 회원 등록</a>";
			htmlStr += "</p>";
		
			
			out.println("<html><head><meta charset='UTF-8'>"
				+ "<title>회원목록</title>"
				+ "</head>");
			
			
			out.println("<body><h1>회원목록</h1>");
			// 신규회원 등록
			out.print(htmlStr);
			
//			select 결과 활용
			while(rs.next() == true) {
				out.println(
					rs.getInt("MEMBER_NO") + "," +
					"<a href='./update?memberNo=" + rs.getInt("MEMBER_NO") + 
					"'>" +
					rs.getString("MEMBER_NAME") + "</a>, " +
					rs.getString("EMAIL") + "," +
					rs.getDate("CRE_DATE") + "," + 
					"<a href='./delete?memberNo=" + 
					rs.getInt("MEMBER_NO") + "'>[삭제]</a>" + 
					"<br>"					
				);
			}
			out.println("</body></html>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
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
