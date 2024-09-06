<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic14</title>

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
// 		이벤트 등록
		$('h1').on('click', function() {
			$(this).css('border', '1px solid black');
		});	
		
	});
	
</script>

</head>

<body>
<!-- 	퍼블리셔? gif 파일? 영상 미디어 -->
	
<!-- 	기술 -> 애니메이션 장인 정신 -> 생명 창조계 -->
	<div id='root'>
		<h1>item - 0</h1>
		<h1>item - 1</h1>
		<h1>item - 2</h1>
	</div>
	
	
</body>
</html>