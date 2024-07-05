<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>ch2_246positionBasic.jsp</title>
<style type="text/css">
.center {
	margin: 320px auto;
	width: 50%;
	border: 3px solid green;
	padding: 10px;
}

.center:after {
	content: "";
	display: block;
	clear: left;
} 

.div1 {
	float: left;
	margin: auto;
	width: 300px;
}

.marginDiv {
	margin-left: 155px;
}

table {
	border-collapse: collapse;
	table-layout: fixed;
}

tr, td {
	border: 1px solid black;
}
</style>

</head>


<body>


	<div class="center">
		<div class="div1 marginDiv">
			<table class="table1">
				<tr>
					<td colspan="4">공연요금</td>
				</tr>
				<tr>
					<td>구분</td>
					<td>S석</td>
					<td colspan="2">VIP석</td>
				</tr>
				<tr>
					<td>성인</td>
					<td>30,000원</td>
					<td colspan="2">50,000원</td>
				</tr>
				<tr>
					<td>청소년</td>
					<td>40,000원</td>
					<td colspan="2">60,000원</td>
				</tr>
				<tr>
					<td>소인</td>
					<td colspan="3">미취학 아동 일반 요금의 50%</td>

				</tr>
				<tr>
					<td rowspan="2">공연시간</td>
					<td>1회</td>
					<td colspan="2">13:00시 - 15:00시</td>
				</tr>
				<tr>
					<td>2회</td>
					<td colspan="2">17:00시 - 19:00시</td>
				</tr>
			</table>
		</div>

		<div class="div1">
			<table class="table1">
				<tr>
					<td colspan="4">공연요금</td>
				</tr>
				<tr>
					<td>구분</td>
					<td>S석</td>
					<td colspan="2">VIP석</td>
				</tr>
				<tr>
					<td>성인</td>
					<td>30,000원</td>
					<td colspan="2">50,000원</td>
				</tr>
				<tr>
					<td>청소년</td>
					<td>40,000원</td>
					<td colspan="2">60,000원</td>
				</tr>
				<tr>
					<td>소인</td>
					<td colspan="3">미취학 아동 일반 요금의 50%</td>

				</tr>
				<tr>
					<td rowspan="2">공연시간</td>
					<td>1회</td>
					<td colspan="2">13:00시 - 15:00시</td>
				</tr>
				<tr>
					<td>2회</td>
					<td colspan="2">17:00시 - 19:00시</td>
				</tr>
			</table>
		</div>
	</div>


</body>
</html>