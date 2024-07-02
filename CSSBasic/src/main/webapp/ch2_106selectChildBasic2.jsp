<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_106selectChildBasic2.jsp</title>
<style type="text/css">
/* 자식 선택자 */
.abox > p {
	color: blue;
}

</style>
</head>

<body>
	<div class="abox">
		<p>7월의 여행지</p>
		
		<ul>
			<li>
				<p>1주차 여행지</p>
			</li>
			<li>
				<p>2주차 여행지</p>
			</li>
		</ul>
		<p>8월의 여행지</p>
	</div>
	
	<p>내년의 여행지</p>
</body>
</html>