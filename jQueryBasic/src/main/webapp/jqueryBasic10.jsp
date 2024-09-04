<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic10</title>

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
// 		자바스크립트 방식
// 		var object = {};
		
// 		object.name = '이상현';
// 		object.gender = 'Male';
// 		object.money = 10000;
		
// 		console.log(object);
		
// 		for (var myVar in object) {
// 			alert(myVar + "    \t:\t    " + object[myVar]);
// 		}
		
		var obj = {};
		$.extend(obj, {
			name : '이상현',
			gender : 'Male',
			money : 10000
		});
		
		console.log(obj);
		
		var output = '';
		$.each(obj, function(key, value) {
			output += key + ': ' + value + '\n';
		});
		
		alert(output);
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