<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ch3_407onloadBasic1</title>
<style>
#myDIV {
	background-color: coral;
	padding: 16px;
}

</style>
<script>
	window.onload = function() {
		const demoObj = document.getElementById('demo');
		demoObj.style.backgroundColor = 'skyblue';
		demoObj.innerHTML = '<input value="하늘색"/>';
	}
</script>
</head>
<body>
	<h1>The Element Object</h1>
	<h2>The removeEventListener() Method</h2>

	<div id="myDIV">
		This orange element has an onmousemove event handler that displays a
		random number when you move the mouse inside.
		<p>
			html이 실행되면 id가 demo인 태그에 input 태그 하나 생성하고 value에 하늘색, p태그에는 하늘색 배경색 적용
		</p>
		<button>Remove</button>
	</div>

	<p id="demo"></p>

</body>
<script>
	
</script>
</html>