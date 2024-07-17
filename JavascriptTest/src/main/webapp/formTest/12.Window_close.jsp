<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript">
	function dateshow() {
		var d = new Date();
		var y = d.getFullYear();
		var m = d.getMonth() + 1;
		var a = d.getDate();

		var t = m + '/' + a + '/' + y + ' ';
		alert("당신의 페이지 방문일은 " + t + "입니다.");
		var childObj = document.getElementById('childInfo');
		
		childObj.value = t;
	}
	
	function sendParent(){
		var childObj = document.getElementById('childInfo');
		window.opener.document.getElementById('parentInfo').innerHTML 
			= childObj.value;
		
		window.close();
	}
</script>
<style type="text/css">
img {
	width: 300px;
	height: 300px;
}

#rootContainer {
    margin: auto;
    width: 50%;
    border: 3px solid green;
    padding: 10px;
}
</style>
</head>
<body onLoad="dateshow()">
	<div id='rootContainer'>
		<img src="../images/img2.jpg">
		<form>
			<input type="button" value="부모창 정보 전달" onclick="sendParent();">
			<input type="text" id='childInfo' value="부모창으로 정보 전달">
		</form>
	</div>
</body>
</html>