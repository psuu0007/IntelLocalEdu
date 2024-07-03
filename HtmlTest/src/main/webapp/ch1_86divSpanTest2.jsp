<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	.clsFirstBox {
		border:1px solid black;
		width: 400px;
	}
	.clsSecondBox {
		width: 400px;
		background: graytext;
	}
	span {
		display: inline-block;
		padding: 0px;
		margin: 0px;
	}
	.clsSecondBox span {
		font-weight: bold;
		text-align: center;
	}
	.clsSpan1 {
		width: 120px;
		height: 24px;
		border-right:1px solid black;
	}
	.clsSpan2 {
		width: 190px;
		height: 24px;
		border-right:1px solid black;
	}
	.clsSpan3 {
		width: 70px;
		height: 24px;
	}
	.clsOtherBox {
		border-bottom:1px solid black;
	}
	
</style>

</head>


<body>

	<h2>DIV와 SPAN 태그를 활용하여 이 html 구조를 완벽하게 재현 하시오!</h2>
	
	<div class='clsFirstBox'>
		<div class='clsSecondBox'>
			<span class='clsSpan1'>Firstname</span>
			<span class='clsSpan2'>Lastname</span>
			<span class='clsSpan3'>Age</span>
		</div>
		<div class='clsOtherBox'>
			<span class='clsSpan1'>Jill</span>
			<span class='clsSpan2'>Smith</span>
			<span class='clsSpan3'>50</span>
		</div>
		<div class='clsOtherBox'>
			<span class='clsSpan1'>Eve</span>
			<span class='clsSpan2'>Jackson</span>
			<span class='clsSpan3'>94</span>
		</div>
		<div class='clsEndBox'>
			<span class='clsSpan1'>John</span>
			<span class='clsSpan2'>Doe</span>
			<span class='clsSpan3'>80</span>
		</div>
	</div>

</body>
</html>