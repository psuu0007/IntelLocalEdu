<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>ch1_86divSpanTestAnswer.jsp</title>

<style type="text/css">
#container {
	width: 400px;
	border: 1px solid black;
}

#container div{
	padding: 1px;
	margin: 0px;
}

#container span{
	display: inline-block;
	margin: 0px;
	border: 1px solid black;
}

#div_header span{
	font-weight: bold;
	text-align: center;
	background: graytext;
}

.first_cell{
	width: 120px;
}

.second_cell{
	width: 180px;
}

.third_cell{
	width: 78px;
}
</style>

</head>

<body>

	<div style="font-size: 1.5em; font-weight: bold; 
	margin: 20px 5px;">DIV와 SPAN태그를 활용하여 이 html구조를 완벽하게 제현하시오</div>

	<div id="container">
		<div id="div_header">
			<span style="width: 120px;">Firstname</span>
			<span style="width: 180px;">Lastname</span>
			<span style="width: 78px;">Age</span>
		</div>
		<div>
			<span class="first_cell">Jill</span>
			<span class="second_cell">Smith</span>
			<span class="third_cell">50</span>
		</div>
		<div>
			<span class="first_cell">Eve</span>
			<span class="second_cell">Jackson</span>
			<span class="third_cell">94</span>
		</div>
		<div>
			<span class="first_cell">John</span>
			<span class="second_cell">Doe</span>
			<span class="third_cell">80</span>
		</div>
		
	</div>

</body>
</html>
