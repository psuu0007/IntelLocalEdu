<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic7</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
		
		$('#root').html(function(index, myObj) {
			
			console.log(index + "\t:\t" + myObj);
			
		});
		
		console.log('==========================');
		
		$('a').html(function(index, myObj) {
			
			console.log(index + "\t:\t" + myObj);
			
		});
	});
	
</script>

</head>

<body>

	<div id='root' style="border: 1px solid black;">
		<a href="http://1등.net" target="_blank" title="범용AI">chatGPT</a>
		<a href="http://2등.net" target="_parent" title="비지니스AI">copilet</a>
		<a href="http://3등.net" target="_top" title="ITAI">perplexAIty</a>
	</div>
</body>
</html>