<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_157displayBasic.jsp</title>
<style type="text/css">
li {
	list-style-type: none;
}

.gnb li {
/* 	display: inline; */
}

.gnb li a {
	display: inline-block;
	background: brown;
	color: #fff;
	width: 100px;
	height: 35px;
	line-height: 35px;
	text-align: center;
	text-decoration: none;
}

.gnb li a:hover {
	text-decoration: underline;
	background: #369;
	
}
</style>
</head>

<body>

	<ul class="gnb">
		<li><a href="#">Company</a></li>
		<li style="display: none;"><a href="#">Product</a></li>
		<li><a href="#">Service</a></li>
		<li><a href="#">Community</a></li>
	</ul>

</body>
</html>