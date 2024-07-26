<%@page import="spms.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	MemberDto sessionMemberDto = (MemberDto)session.getAttribute("memberDto");
%>

<div style="background-color: #DD7C73; color: #fff; 
	height: 20px; padding: 5px;">
	SPMS(Simple Project Management System)
	
	<span style="float: right;">
		<%=sessionMemberDto.getMemberName() %>
<!-- 		공통단의 코드들은 왠만해선 절대 경로로 설정해야 어떤 구조에서든 동작이 된다 -->
		<a style="color: white;" 
			href="<%=request.getContextPath()%>/auth/logout">로그아웃</a>
	</span>
</div>
