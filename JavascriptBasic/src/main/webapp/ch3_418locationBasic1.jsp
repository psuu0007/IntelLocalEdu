<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_418locationBasic1.jsp</title>

<style type="text/css">
</style>


</head>


<body>

	<a href="https://www.naver.com/">다른 페이지로 이동</a>	

	<button id='pageMoveBtn' onclick="pageMoveFnc();">다른 페이지로 이동2</button>
</body>

<script type="text/javascript">
	function pageMoveFnc() {
// 		alert(location.href);
		location.href = 'https://www.daum.net/';
	}
	
</script>

</html>