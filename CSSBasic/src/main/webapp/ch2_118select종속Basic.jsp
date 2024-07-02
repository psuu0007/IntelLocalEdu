<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_118select종속Basic.jsp</title>
<style type="text/css">
/* 종속 선택자 */
p#sub_p {
	border: 5px solid lightblue;
}


</style>
</head>

<body>
	<div id="abox">
		<p id='sub_p' title="aaa">7월의 여행지</p>
		<p>8월의 여행지</p>
		<ul>
			<li>
				<p>1주차 여행지</p>
			</li>
			<li>
				<p>2주차 여행지</p>
			</li>
		</ul>
	</div>
	
	<p class='bBox' title="aaa">내년의 여행지</p>
</body>
</html>