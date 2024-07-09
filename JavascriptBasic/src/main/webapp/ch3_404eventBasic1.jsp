<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_404eventBasic1.jsp</title>

<style type="text/css">

</style>


</head>


<body>
	
	<button onclick="testFnc();">이벤트 발생</button>

</body>

<script type="text/javascript">
	function testFnc() {
		alert('함수는 다양하게 쓰이는데 이벤트랑 1:1로 사용하는 경우가 있다');
	}

	let tnt = 1;
	function otherFnc() {
		alert(tnt++);
	}
	
	otherFnc();
</script>

</html>