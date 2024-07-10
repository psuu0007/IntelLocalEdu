<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_408eventListenerBasic1.jsp</title>

<style type="text/css">
img{
	width: 100px;
	height: 100px;
}
</style>


</head>


<body>

	<div>
		이벤트 리스너 등록 방법
		<img id='domLevel2' src="./images/img1.jpg">
		<img id='otherDomTest' src="./images/img2.jpg">
	</div>



</body>

<script type="text/javascript">
	function myFunction() {
		alert('다양한 브라우저에서 동작을 지원해서 표준이다. \n자바스크립트 이벤트 연결 방법3');
		
	}
	
	var domLevel2Obj = document.getElementById('domLevel2');
	
	domLevel2Obj.addEventListener('dblclick', myFunction);
	
	
	
	var otherDomTestObj = document.getElementById('otherDomTest');
	
	otherDomTestObj.addEventListener('click', function(e) {
		alert('이것이 익명함수다');
	});
	
	
</script>

</html>