<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_408eventListenerBasic4.jsp</title>

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
<!-- 	onload에서 작업한다 -->
<!-- 	a태그를 누르면 네이버 메인 페이지로 이동한다 -->
<!-- 	그런데 childDiv의 id값을 경고창에 출력한 후 이동해야 한다 -->
<!-- 	그런데 parentDiv에도 이벤트로 자신의 id값을 경고창에 출력하는 이벤트는 등록되어 있는데 -->
<!-- 	작동은 안되어야 한다 -->
<!-- 	그렇게 만들어 보시오 -->
	<h1>The stopPropagation() Method</h1>

	<p>Click DIV 1:</p>
	
	<div id='parentDiv'>
		DIV 2
		<div id='childDiv'>
	
			<a href='네이버 주소 메인 페이지 뛰우기'>네이버 메인 페이지로 이동</a>
	
		</div>
	</div>


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

</script>

</html>