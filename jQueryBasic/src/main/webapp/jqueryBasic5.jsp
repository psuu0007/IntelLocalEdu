<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic5</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
 		var oneId = $('#one').attr('id');

 		console.log(oneId);
 		
 		$('#one').attr('title', '제목이라고요?');
 		
//  		attr('id')
//  		attr('id', 'sdfds')
//  		html('sddjsfhkdsjf'); 수정 셋 방식
//  		$('div').html(); 겟 방식
	});
	
	
</script>

</head>

<body>
	<div id='root' style="border: 1px solid black;">
		<ul>
			<li id='one' >Apple</li>
			<li id='two'>Bag</li>
			<li id='three'>Cat</li>
			<li id='four'>Dog</li>
			<li id='five'>Elephant</li>
		</ul>
	</div>

</body>
</html>