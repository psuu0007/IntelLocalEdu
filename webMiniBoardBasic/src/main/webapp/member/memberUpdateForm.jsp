<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   
<html>
<head>
<meta charset='UTF-8'>
<title>회원상세 정보&수정</title>

<script type="text/javascript">
	function pageMoveListFnc() {
		location.href = "./list";
	}
	
	function pageMoveDeleteFnc(no) {
		var url = "./delete?memberNo=" + no
		location.href = url;
	}
</script>

</head>

<jsp:useBean id="memberDto"
	scope="request"
	class="spms.dto.MemberDto"/>

<body>

	<jsp:include page="/Header.jsp"/>

	<h1>회원정보</h1>
	<form action='./update' method='post'>
		번호: <input type='text' name='memberNo' 
		value='${memberDto.memberNo}' 
		readonly="readonly"><br>
		 
		이름: <input type='text' name='memberName' 
		value='${memberDto.memberName}'><br>
		 
		이메일: <input type='text' name='email' 
		value='${memberDto.email}'><br>
		 
		가입일: ${requestScope.memberDto.createdDate} <br>
		 
		<input type='submit' value='정보 수정'>
		<input type='button' value='삭제' 
			onclick='pageMoveDeleteFnc(${memberDto.memberNo})'>
		<input type='button' value='취소' onclick='pageMoveListFnc();'>
	</form>

	<jsp:include page="/Tail.jsp"/>
</body>
</html>
