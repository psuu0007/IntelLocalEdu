<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_404eventBasic4.jsp</title>

<style type="text/css">
</style>


</head>


<body>

	<div>
		When you submit the form, a function is triggered which alerts
		some text.
		<img id='domLevel0' src="./images/img1.jpg">
	</div>



</body>

<script type="text/javascript">
	function myFunction() {
		alert('최초의 자바스크립트 이벤트 연결 방법');
		
	}
	
	var domLevel0Obj = document.getElementById('domLevel0');
	
	domLevel0Obj.onclick = myFunction;
	
	
	
	
</script>

</html>