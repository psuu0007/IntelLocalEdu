<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryAnimate</title>

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
				left: '100px'
			}, 'slow');
			
			divObj.animate({
				fontSize: "20px"
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
	
	<p>흠 기본은 position을 알아야 만들 수 있다. 움직임이란 좌표를 기본적으로 알아야 한다</p>
	
	<div style="background: green; height: 100px; width: 200px; position: absolute;">
		hello ANI
	</div>
</body>
</html>