<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_112selectProBasic.jsp</title>
<style type="text/css">
/* 속성 선택자 */
p[title] {
	border: 5px solid lightblue;
}

div[class='abox']{
	font-size: 50px;
}


</style>
</head>

<body>
	<div class="abox">
		<p title="aaa">7월의 여행지</p>
		<p>8월의 여행지</p>
		<ul>
			<li>
				<p title="g54g54">1주차 여행지</p>
			</li>
			<li>
				<p>2주차 여행지</p>
			</li>
		</ul>
	</div>
	
	<p class='abox' title="aaa">내년의 여행지</p>
</body>
</html>