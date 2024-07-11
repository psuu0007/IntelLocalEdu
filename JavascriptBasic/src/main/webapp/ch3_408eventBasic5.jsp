<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_408eventBasic5.jsp</title>

<style type="text/css">
</style>


</head>


<body>

	<button id='btn1'>이벤트 연습1</button>
	<button id='btn2'>이벤트 연습2</button>


</body>

<script type="text/javascript">
	var btn1Obj = document.getElementById('btn1');
	
	
	
	btn1Obj.addEventListener('click', function(e) {
		alert('나는 처음 등록했어');	
	});
	btn1Obj.addEventListener('click', function(e) {
		alert('나는 처음이 아냐');	
	});
	
	var btn2Obj = document.getElementById('btn2');
	
	btn2Obj.onclick = function () {
		alert('btn2Obj 처음 등록했어');
	};
	
	btn2Obj.onclick = function () {
		alert('btn2Obj 처음이 아냐');
	};
	
</script>

</html>