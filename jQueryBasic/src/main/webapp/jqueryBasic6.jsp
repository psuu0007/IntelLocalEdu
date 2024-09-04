<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic6</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
		// 콜백함수
// 		for (var i = 0; i < $('a').length; i++) {
// 			console.log($('a')[i].innerHTML);
// 		}
		
// 		집합, 체이닝
		/*
		$('a').attr('href', function() {
// 			자바스크립트 -> 제이쿼리화
			$(this).attr('href')
			
// 			console.log($(this).attr('href')); 
		});
 		*/
 		
//  		집합 인덱스?, 두 번째? 내가 관심을 가지는 객체
		$('a').attr('href', function(index, obj) {
// 			자바스크립트 -> 제이쿼리화
// 			$(obj).attr('href');
			
			console.log(obj);
			
			console.log(index + "\t:\t" + obj);
			console.log('=========================');
			
		});
	});
	
</script>

</head>

<body>
	<a href="http://1등.net" target="_blank" title="범용AI">chatGPT</a>
	<a href="http://2등.net" target="_parent" title="비지니스AI">copilet</a>
	<a href="http://3등.net" target="_top" title="ITAI">perplexAIty</a>

</body>
</html>