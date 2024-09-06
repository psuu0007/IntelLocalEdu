<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryAnimate2</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
		$('button').click(function() {
			var divObj = $('div');
			
			divObj.animate({
				height: '300px',
				opacity: "0.4"
			}, 'slow');
			
			divObj.animate({
				width: '300px',
				opacity: "0.8"
			}, 'slow');
			
			divObj.animate({
				height: '100px',
				opacity: "0.4"
			}, 'slow');
			
			divObj.animate({
				width: '100px',
				opacity: "0.8"
			}, 'slow');
			
			
		});
		
	});
	
</script>

</head>

<body>
<!-- 	퍼블리셔? gif 파일? 영상 미디어 -->
<!-- 	좌표? -->
<!-- 	기술 -> 애니메이션 장인 정신 -> 생명 창조계 -->
	<button>애니 제작이란?</button>
	
	<p>노력의 산물이다.. 또한 자신이 무엇을 행하고 싶은지 설계를 해야한다</p>
	
	<div style="background: hotpink; height: 100px; width: 100px; position: absolute;">
		
	</div>
</body>
</html>