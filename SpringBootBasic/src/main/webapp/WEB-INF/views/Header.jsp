<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="background-color: #DD7C73; color: #fff; 
	height: 20px; padding: 5px;">
	SPMS(Simple Project Management System)
	
	<c:if test="${sessionScope.member.email ne null}">
		<span style="float: right;">
			${member.memberName}
			<a style="color: white;" 
				href="<%=request.getContextPath()%>/member/logout">로그아웃</a>
		</span>
	</c:if>
	
</div>
