<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_415timeBasic1.jsp</title>

<style type="text/css">
</style>


</head>


<body>

	

</body>

<script type="text/javascript">
// 	일정 시간마다 지정한 함수를 반복적으로 실행하는 함수
// 	표현식
// 	setInterval(function() {
// 		실행문
// 	}, ms);
	
// 	let cnt = 0;
	
// 	setInterval(function() {
// 		cnt++;
// 		alert('4초 마다 실행' + cnt);
// 	}, 4000);
	
	// 한번만 수행하는 함수
	let cnt2 = 0;
	setTimeout(function() {
		cnt2++;
		alert('4초 마다 실행' + cnt2);
	}, 4000);
	
</script>

</html>