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

@WebServlet(value = "/auth/logout")
public class LogoutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = req.getSession();
		
		session.invalidate();
		
		res.sendRedirect("./login");
		
	}
	
}
