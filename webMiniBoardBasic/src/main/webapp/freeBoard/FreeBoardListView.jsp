<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>자유게시판 목록</title>

<style type="text/css">
table, tr, th, td{
		border: 1px solid black;
		border-collapse: collapse;
}
</style>

<script type="text/javascript">

</script>

</head>


<body>

	<jsp:include page="/Header.jsp"/>
	
	<h1>자유게시판 목록</h1>
	<p>
		<a href="./add">자유게시판 글쓰기</a>
	</p>
	
	
	<table>
		<tr>
			<th>번호</th><th>주제</th>	<th>작성자</th>
			<th>생성날짜</th><th>수정날짜</th>
		</tr>
	<c:forEach var="freeBoardDto" items="${freeBoardList}">
		<tr>
			<td>${freeBoardDto.freeBoardId}</td>
			<td><a href='#'>${freeBoardDto.freeBoardTitle}</a></td>
			<td>${freeBoardDto.freeBoardWriter}</td>
			<td>${freeBoardDto.createDate}</td>
			<td>${freeBoardDto.updateDate}</td>
		</tr>
	</c:forEach>	
	</table>
	
	
		
<%-- 		<a href='./update?freeBoardNo=${freeBoardDto.freeBoardNo}'> --%>
<%-- 			${freeBoardDto.freeBoardName} --%>
<!-- 		</a>, -->
<%-- 		<a href='./delete?freeBoardNo=${freeBoardDto.freeBoardNo}'>[삭제]</a> --%>
	
	
	<jsp:include page="/Tail.jsp"/>

</body>
</html>