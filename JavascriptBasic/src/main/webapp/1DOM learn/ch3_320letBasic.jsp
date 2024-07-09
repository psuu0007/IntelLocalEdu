<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_316varBasic.jsp</title>

<style type="text/css">
</style>

<script type="text/javascript">
	
// 	let과 var의 차이
	
	var varNum = 10;
	var varNum = 20;	

	document.write(varNum + '<br>');
	
	let letNum = 100;
	letNum = 200;	

	document.write(letNum + '<br>');
// 	 Cannot access 'str' before initialization
	if(true){
// 		str = '초기화?';
// 		let str = 'asdf';
		var str = '신기하네';
// 		alert(str);
		
		
	}
	
</script>



</head>


<body>


</body>

<script type="text/javascript">
	alert(letNum + "여기도 스크립트 영역이다");
	alert(str);
</script>

</html>