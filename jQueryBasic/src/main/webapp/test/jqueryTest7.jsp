<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryTest7</title>

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
		
		동기들의 이름, 나이, 하고싶은 말을 배열 객체에 저장한다
		
		객체 배열을 활용하여 각각의 div에 h1, h2, h3로 출력한다
		
		
	});
	
</script>

</head>

<body>

	<div><h1>이름: 조병철 나이: 30 하고싶은 말: 나는 전설이다</h1></div>
	<div><h2>이름: 국하현 나이: 30 하고싶은 말: 나는 전설이다</h2></div>
	<div>item - 2</div>
	<div>item - 3</div>
	
</body>
</html>