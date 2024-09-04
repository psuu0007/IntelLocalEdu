<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryTest2</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>
<script type="text/javascript">

	window.onload = function() {
// 		var h1Arry = document.getElementsByTagName('h1');

// 		for (var i = 0; i < h1Arry.length; i++) {
// 			h1Arry[i].style.color = 'orange';
// 		}
		
		for (var i = 0; i < document.getElementsByTagName('h1').length; i++) {
			document.getElementsByTagName('h1')[i].style.color 
				= 'red';
		}

	}
</script>

</head>

<body>
	<div id='root' class='' style="border: 1px solid black;">
	</div>

	<h1>안녕</h1>
	<p>제이쿼리에서 장단점</p>
	
	<h1>Low War</h1>
	<p>취업은 전쟁이닷!</p>
	
	<div>자라</div>
</body>
</html>