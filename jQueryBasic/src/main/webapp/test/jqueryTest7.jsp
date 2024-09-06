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
		
// 		동기들의 이름, 나이, 하고싶은 말을 배열 객체에 저장한다
		const studentArr = [
	         { name: "국하현", age: "26", ment: "나는 자고싶다" },
	         { name: "조병철", age: "30", ment: "나는 서른이다" },
	         { name: "김민재", age: "30", ment: "나는 서른이다" },
	         { name: "이상현", age: "30", ment: "나는 서른이다" },      
	    ];
		
// 		객체 배열을 활용하여 각각의 div에 h1, h2, h3로 출력한다
		
// 		$("div").each(function(i, obj) {
// 	         let htmlStr = "";
	         
// 	         htmlStr += "<h" + (i + 1) + ">";
// 	         htmlStr += "이름:&nbsp;" + studentArr[i].name + "&nbsp;나이:&nbsp;" 
// 	         	+ studentArr[i].age;
// 	         htmlStr += "&nbsp;하고싶은&nbsp;말:&nbsp;" + studentArr[i].ment;
// 	         htmlStr += "</h" + (i + 1) + ">";
	         
// 	         $(obj).html(htmlStr);
// 	    });

		var htmlStrArr = new Array();

		$.each(studentArr, function(i, obj) {
			
			htmlStrArr[i] = '<h' + (i + 1) + '>';
			htmlStrArr[i] += i + '번호:&nbsp;'+ obj.name + '&nbsp;주소:&nbsp;' + obj.age;
			htmlStrArr[i] += '</h' + (i + 1) + '>';
			
		});
		
		$("div").each(function(i, obj) {
			 $(obj).html(htmlStrArr[i]);
		});
		
	});
	
</script>

</head>

<body>
<!-- 부모 - 자식 -->
<!-- 나 - 너 -->
<!-- 주인 - 노예 -->

	<div>예시: <h1>이름: 조병철 나이: 30 하고싶은 말: 나는 전설이다</h1></div>
	<div><h2>이름: 국하현 나이: 30 하고싶은 말: 나는 전설이다</h2></div>
	
	<div>item - 2</div>
	<div>item - 3</div>
	
</body>
</html>