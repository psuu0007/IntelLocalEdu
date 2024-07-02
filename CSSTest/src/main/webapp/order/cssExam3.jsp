<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div {
	background-color: yellow;
}

.container {
	background-color: pink;
}

#main-container {
	background-color: gray;
}

div .container {
	background-color: green;
}
</style>
</head>
<body>
	<div id="main-container" class="container">이 박스의 배경색은 무엇일까요?</div>
</body>