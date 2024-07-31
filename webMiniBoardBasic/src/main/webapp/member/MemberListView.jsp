<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>회원 목록</title>

<style type="text/css">

</style>

<script type="text/javascript">

</script>

</head>


<body>

	<jsp:include page="/Header.jsp"/>
	
	<h1>회원 목록</h1>
	<p>
		<a href="./add">신규 회원 등록</a>
	</p>
	


	<c:forEach var="memberDto" items="${memberList}">
		${memberDto.memberNo},
		<a href='./update?memberNo=${memberDto.memberNo}'>
			${memberDto.memberName}
		</a>,
		${memberDto.email},
		<fmt:formatDate value="${memberDto.createdDate}" pattern="yyyy년 MM월 dd일 HH:mm:ss" />,
		<a href='./delete?memberNo=${memberDto.memberNo}'>[삭제]</a>
		<br>
	</c:forEach>
	
	<jsp:include page="/Tail.jsp"/>

</body>
</html>