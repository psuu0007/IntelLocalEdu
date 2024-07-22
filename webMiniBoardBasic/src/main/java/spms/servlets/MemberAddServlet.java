package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberAddServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet을 수행");
		
		res.setContentType("text/html");
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		
		String htmlStr = "";
		
		htmlStr += "<html><head><title>회원 등록</title></head>";
		htmlStr += "<body>";
		htmlStr += "<h1>회원등록</h1>";
		htmlStr += "<form action='add' method='post'>";
		htmlStr += "이름: <input type='text' name='memberName'><br>";
		htmlStr += "이메일: <input type='text' name='email'><br>";
		htmlStr += "암호: <input type='password' name='password'><br>";
		htmlStr += "<input type='submit' value='추가'>";
		htmlStr += "<input type='reset' value='취소'>";
		htmlStr += "</form>";
		htmlStr += "</body></html>";
		
		out.println(htmlStr);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "edu";
		String password = "edu12";
		
		try {
			String emailStr = req.getParameter("email");
			String pwdStr = req.getParameter("password");
			String memberNameStr = req.getParameter("memberName");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "";
			
			sql = "INSERT INTO MEMBER";
			sql += "(MEMBER_NO, EMAIL, PWD, MEMBER_NAME, CRE_DATE, MOD_DATE)";
			sql += "VALUES(MEMBER_NO_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, SYSDATE)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emailStr);
			pstmt.setString(2, pwdStr);
			pstmt.setString(3, memberNameStr);
			
			pstmt.executeUpdate();
			
			// 다른 화면 혹은 다른 서블릿을 호출하는 메서드
			res.sendRedirect("./list");
			
			// 사용자에게 백단에서 무슨 일이 벌어진건지 알려주는 화면을 제작해야함
//			res.setContentType("text/html");
//			res.setCharacterEncoding("UTF-8");
			
//			PrintWriter out = res.getWriter();
			
//			String htmlStr = "";
//			
//			htmlStr += "<html>";
//			htmlStr += "<head>";
////			htmlStr += "<meta charset='UTF-8' " 
////			+ "http-equiv='Refresh' content='2; url=list'>";
//			htmlStr += "<meta charset='UTF-8'>";
//			htmlStr += "<title>회원등록 결과</title>";
//			htmlStr += "</head>";
//			htmlStr += "<body>";
//			htmlStr += "<p>";
//			htmlStr += "등록 성공입니다!";
//			htmlStr += "</p>";
//			htmlStr += "</body>";
//			htmlStr += "</html>";
//			
//			out.println(htmlStr);
			
//			res.addHeader("Refresh", "20; url=./list");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
		} // finally end
		
	}
	
}
