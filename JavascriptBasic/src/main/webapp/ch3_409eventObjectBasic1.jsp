<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_409eventObjectBasic1.jsp</title>

<style type="text/css">
div {
	height: 100px;
	background: #718c00;
	margin-top: 20px;
	color: #fff
}
</style>

<script type="text/javascript">
	window.onload = function() {
		var bt = document.getElementById('bt');
		var area = document.getElementById('area');
		
		bt.onclick = function(event) {
			console.log(event.target);
			console.log(event.type);
			console.log(event.clientX);
			console.log(event.clientY);
			console.log(event.screenX);
			console.log(event.screenY);
		};
		area.onmousedown = function(event) {
			console.log(event.button);
		};
	};
</script>

</head>


<body>

	<button id="bt" ondblclick="">클릭</button>
	<div id="area">여기에 마우스 왼쪽, 가운데, 오른쪽 버튼 클릭</div>


</body>



</html>