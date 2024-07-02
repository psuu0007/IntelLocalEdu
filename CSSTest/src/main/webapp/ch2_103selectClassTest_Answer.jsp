<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>	
<meta charset="UTF-8">
<title>ch2_103selectClassTest.jsp</title>
<!-- 내부 스타일 -->
<style type="text/css">
	#tableDiv {
		border: 1px solid black;
		width: 500px;
		height: 300px;
		text-align: center;
	}
	
	#tableDiv-table {
		border-collapse: collapse;
		width: 500px;
		height: 258px;
	}
	
	.firstRow_columns {
		font-weight: 700;
	}
	
	.commonRowStyle {
		background-color: skyblue;
	}
</style>
</head>

<body>
	<h1>Hello CSS</h1>
	<p>id 선택자</p>
	
	<div id="tableDiv">
		<!-- 경계선 검은색 실선 1px, 가로 500, 세로 300  -->
			테이블 3행 2열 생성
			테이블 1행의 열들은 모두 글자 굵게 적용
			나머지 행들의 칼럼들은 배경색 좋아하는 색으로 동일하게 적용
	
		<table id="tableDiv-table">
			<tr>
				<td class="firstRow_columns">1행 1열</td>
				<td class="firstRow_columns">1행 2열</td>
			</tr>
			<tr>
				<td class="commonRowStyle">2행 1열</td>
				<td class="commonRowStyle">2행 2열</td>
			</tr>
			<tr>
				<td class="commonRowStyle">3행 1열</td>
				<td class="commonRowStyle">3행 2열</td>
			</tr>
		</table>
	</div>
	
	<p>Hello CSS</p>
	<p>태그 선택자</p>
	
	
</body>
</html>