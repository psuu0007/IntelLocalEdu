package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


/**
 * ALT + SHIFT + J : API 주석
 * 회 원목록 조회 구현
 * 
 */
public class MemberListServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		// JDBC 수행 순서
		// DB 객체 준비
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "eduTest";
		String password = "eduTest12";
				
		try {
			// 오라클 객체 불러오기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 드라이브매니저에 jdbc 등록 -> db 연결 -> db 객체
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			
			String sql = "";
			
			sql += "SELECT MEMBER_NO, EMAIL, PWD, MEMBER_NAME, CRE_DATE, MOD_DATE\r\n";
			sql += "FROM MEMBER\r\n";
			sql += "ORDER BY MEMBER_NO ASC";
			
			// db에 sql문 결과 전달
			rs = stmt.executeQuery(sql);
			
			res.setContentType("text/html");
			res.setCharacterEncoding("UTF-8");
			
			PrintWriter out = res.getWriter();
			
			out.println("<html><head><title>회원목록</title><head>");
			out.println("<body><h1>회원목록</h1>");
			
			// select 결과 활용
			while(rs.next() == true) {
				out.println(
					rs.getInt("MEMBER_NO") + "," +	
					rs.getString("MEMBER_NAME") + "," +	
					rs.getString("EMAIL") + "," +	
					rs.getDate("CRE_DATE") + "," +	
					rs.getDate("MOD_DATE") + "<br>"
				);				
			}
				out.println("</body></html>");
		}	catch (ClassNotFoundException e) {
				e.printStackTrace();
		}	catch (SQLException e) {
				e.printStackTrace();
		}	finally {
			// db 객체 메모리 해제
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {	
					e.printStackTrace();				
				}
			}
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {	
					e.printStackTrace();				
				}
			}
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {	
					e.printStackTrace();				
				}		
			}
			
		}// service 종료

	}// 
}