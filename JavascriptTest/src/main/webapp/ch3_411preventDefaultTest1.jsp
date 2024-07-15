<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ch3_411preventDefaultTest1</title>

<script>
	
</script>
</head>
<body>
	<form action="./success.jsp"> 성공 페이지에서 성공 경고창만 뛰우시오
		<div class="Xb9hP">
			<input type="text" value="" id="lastName">
			<div class="AxOyFc snByac" aria-hidden="true">성(선택사항)</div>
		</div>
		<div class="Xb9hP">
			<input type="text" value="" id="firstName">
			<div class="AxOyFc snByac" aria-hidden="true">이름(선택사항)</div>
		</div>
		
		<div class="Xb9hP">
			<div class="AxOyFc snByac" aria-hidden="true">
				다음 페이지 이동 전에 성이름이 3~4글자면 작동되게 하시오
			</div>
			<input type="submit" value="다음" id="firstName">
		</div>
	</form>

</body>
</html>