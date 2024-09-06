<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic13</title>

<style type="text/css">
.h1BgColor{
	background: silver;
}
</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
		for (var i = 0; i < 3; i++) {
			$('h1').eq(i).attr('class', 'h1BgColor');
		}
		
		
	});
	
</script>

</head>

<body>
	
	<div id='root'>
		<h1>item - 0</h1>
		<h1>item - 1</h1>
		<h1>item - 2</h1>
	</div>
</body>
</html>