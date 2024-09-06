<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jsonBasic1</title>

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
// 		일반 제이슨
// 		var jsonObj = {'keyword' : '키밸류로 적는다', 'newKeyword' : 3};
		

// 		console.log(jsonObj['keyword']);
		
// 		배열활용 제이슨
// 		var jsonArrObj = {'keyword' : ['김', '유', '경', 4]};
		
// 		console.log(jsonArrObj);
		
// 		for (var i = 0; i < jsonArrObj.keyword.length; i++) {
// 			console.log(jsonArrObj.keyword[i]);
// 		}
		
		
		var jsonObjofObj = '{"keyword" : {"kind" : "포유류", "한글" : "우수성"}}';
		
		console.log(jsonObjofObj);
		
		jsonObjofObj = JSON.parse(jsonObjofObj);
		
		console.log(jsonObjofObj.keyword.kind);
	    console.log(jsonObjofObj.keyword['한글']);
	});
	
</script>

</head>

<body>


	
</body>
</html>