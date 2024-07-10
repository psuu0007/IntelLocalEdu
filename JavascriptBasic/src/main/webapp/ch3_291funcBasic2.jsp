<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>다른 교재ch3_291funcBasic2.jsp</title>

<style type="text/css">

</style>


</head>


<body>

	인자 값이 있는 함수
	
	<button onclick="greetFnc('반갑습니다');">인사1</button>
	<button onclick="greetFnc('안녕히 계세요 여러분~');">인사2</button>

</body>

<script type="text/javascript">
	function greetFnc(param) {
		alert(param);
	}
	
	
</script>

</html>