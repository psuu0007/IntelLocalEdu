<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>	
<meta charset="UTF-8">
<title>ch3_404eventTest2_etc</title>
<style>
.bg {
	background-color: green;
}

</style>
</head>
	
<body>
	<h1>토글 적용해보기</h1>
	<h2>사용자가 입력할 때 초록색, 입력이 완료되서 벗어나면 원래색</h2>
	<h2>id 등 추가 속성은 필요할 때 자발적으로 추가</h2>
	
	<details ontoggle="bgColorGreenFnc(this)">
		<!-- <input placeholder="별명 입력해봐"/> -->
	</details>
	
	<details ontoggle="bgColorGreenFnc(this)">
		<input placeholder="취미 입력해봐"/>
	</details>
	
	<!-- <input onfocus="bgColorGreenFnc(this)"  placeholder="별명 입력해봐"/>
	<input placeholder="취미 입력해봐"/> -->

</body>
<script>

function myFunction() {
	  alert("The ontoggle event occured");
	}

function bgColorGreenFnc(obj) {
	obj.style.backgroundColor = 'green';
}

function bgColorWhiteFnc(obj) {
	obj.style.backgroundColor = '#fff';
}

function addClassFnc(obj) {
	if (obj.classList.contains("bg")) {
		obj.classList.remove("bg");
	} else {
		obj.classList.add("bg");
	}
}

</script>
</html>