<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic11</title>

<style type="text/css">
.high-light{
	background: yellow;
}

.high-light-0{
	background: red; 
}
.high-light-1{
	background: orange;
}
.high-light-2{
	background: yellow;
}
.high-light-3{
	background: green;
}
.high-light-4{
	background: blue;
}
</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
		let arr = [
			{name : 'media', addr: '한국'},
			{name : '더조은', addr: '구로'},
			{name : 'kitri', addr: '강남'}
		];
	
		$.each(arr, function(i, obj) {
			
			var htmlStr = '';
			
			htmlStr += '<h1>';
			htmlStr += i + '번호:&nbsp;'+ obj.name + '&nbsp;주소:&nbsp;' + obj.addr;
			htmlStr += '</h1>';
		
			document.body.innerHTML += htmlStr;
		});
		
		
	});
	
</script>

</head>

<body>

<!-- 	<h1>item - 0</h1> -->
<!-- 	<h1>item - 1</h1> -->
<!-- 	<h1>item - 2</h1> -->
<!-- 	<h1>item - 3</h1> -->
<!-- 	<h1>item - 4</h1> -->
</body>
</html>