<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic12</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
		$('h1').filter('.my').css({
			background: "black",
			color: "white"
		});
		
// 		매개변수 -> 여러개
// 		리턴? 한개
// 		5 -> 필터? 3 -> css
		
		$('h1').filter(function(index) {
			return index % 2 == 1;
		}).css({
			fontStyle: "oblique",
			fontWeight: "lighter"
		});
	});
	
</script>

</head>

<body>

	<h1 class='my'>item - 0</h1>
	<h1>item - 1</h1>
	<h1 class='my'>item - 2</h1>
	<h1>item - 3</h1>
	<h1 class='my'>item - 4</h1>
</body>
</html>