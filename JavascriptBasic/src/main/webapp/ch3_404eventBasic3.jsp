<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_404eventBasic3.jsp</title>

<style type="text/css">
</style>


</head>


<body>

	<p>
		When you submit the form, a function is triggered which alerts
		some text.
	</p>

	<form action="./ch3_404eventBasic1.jsp" onsubmit="myFunction();">
		Enter name: <input type="text" name="fname">
		<br> 
		Enter 글자: <input type="text" name="tempData"> 
		<input type="submit" value="데이터 전송?">
		<input type="reset" value="초기화 같은 느낌?">
	</form>


</body>

<script type="text/javascript">
	function myFunction() {
		alert("여기서 form의 데이터들을 유효성 검사한다");
		
	}
</script>

</html>