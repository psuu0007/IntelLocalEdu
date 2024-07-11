<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_408eventListenerBasic2.jsp</title>

<style type="text/css">
div {
	padding: 50px;
	background-color: rgba(255, 0, 0, 0.2);
	text-align: center;
	cursor: pointer;
}
</style>


</head>


<body>
	이벤트 전파: 내가 관심있는 태그만 이벤트가 되길 바라는데 
	관련없는 태그(겹치는 태그(부모))의 이벤트도 작동되는 현상
	
	<h1>The stopPropagation() Method</h1>

	<p>Click DIV 1:</p>
	
	<div onclick="func2();">
		DIV 2
		<div onclick="func1(event);">DIV 1</div>
	</div>

	Stop propagation:
	<input type="checkbox" id="check">

	<p></p>

	<p>Because DIV 1 is inside Div 2, both DIVs get clicked when you
		click on DIV 1.
	</p>
	<p>Check the stop propagation checkbox, and try again.</p>
	<p>The stopPropagation() method allows you to prevent propagation
		of the current event.
	</p>



</body>

<script type="text/javascript">
	function func1(event) {
		alert("DIV 1");
		if (document.getElementById("check").checked) {
			event.stopPropagation();
		}
	}

	function func2() {
		alert("DIV 2");
	}
</script>

</html>