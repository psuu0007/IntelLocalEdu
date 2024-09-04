<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic4</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
// 		체이닝 메서드
		$('#root > ul > li').css('color', 'orange').attr('class', 'liStyle');

// 		var liList = $('#root > ul > li');
// 		liList.css('color', 'green');
// 		liList.attr('class', 'liStyle');
	});
	
	
</script>

</head>

<body>
	<div id='root' style="border: 1px solid black;">
		<ul>
			<li>Apple</li>
			<li>Bag</li>
			<li>Cat</li>
			<li>Dog</li>
			<li>Elephant</li>
		</ul>
	</div>

	

</body>
</html>