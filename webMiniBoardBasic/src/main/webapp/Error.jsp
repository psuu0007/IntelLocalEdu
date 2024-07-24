<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>시스템 오류</title>

<style type="text/css">

</style>

<script type="text/javascript">

// 	function pageMoveMemberListFnc() {
// 		location.href = './member/list';
// 	}

</script>

</head>
<%
	String msg1 = (String)request.getAttribute("caseByCase");
%>

<body>
	<h1>시스템 오류</h1>
	<pre>
		다시 한번 확인해주세요!
		지금 입력하신 주소의 페이지는 사라졌거나 다른 페이지로 변경되었습니다.
		주소를 다시 확인해주세요.
		만약 계속해서 이 문제가 발생된다면 
		시스템 운영팀(사내번호: 8282)에연락하기 바랍니다.
	</pre>
	
	<div>
		<%=msg1 %>
	</div>
<!-- 	<button onclick="pageMoveMemberListFnc();">회원목록으로 이동</button> -->


</body>
</html>