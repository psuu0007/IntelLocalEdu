<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_421domTest4Answer.jsp</title>

<style type="text/css">

</style>


</head>


<body>
	<div id='formContainer'>
		<h1>선택자</h1>
		<h2 id="title">원거리 선택자</h2>
		<ul id='loginInfo'>
			<li><input type="text" value=""></li>
			<li><input type="password" value=""></li>
		</ul>
		<h2 id="title2">근거리 선택자</h2>
		<ul id="userInfo">
			<li><input type="text" value=""></li>
			<li><input type="text" value=""></li>
			<li><input type="text" value=""></li>
			<li><input type="text" value=""></li>
			<li><input type="text" value=""></li>
			<li><input type="text" value=""></li>
		</ul>
	</div>

</body>

<script type="text/javascript">
	// 순수 코드 작성
	/* 1.위의 formContainer 안에 있는 li태그 내부에 form의 input 태그를 작성한다
	
	==========
		
	loginInfo의 input 태그 값에는 자신의 아이디, 비번 값을 할당한다
	userInfo의 input 태그에는 
	나이
	직업
	성별
	생년월일
	취미
	기타
	정보를 자바스크립트로 입력한다 */
	
	var loginInfoDiv = document.getElementById('loginInfo');
	var loginInfoli1 = loginInfoDiv.children[0]; // 아이디
	var loginInfoli2 = loginInfoDiv.children[1]; // 비밀번호
	var userInfoDiv = document.getElementById('userInfo');
	var userInfoli1 = userInfoDiv.children[0]; // 나이
	var userInfoli2 = userInfoDiv.children[1]; // 직업
	var userInfoli3 = userInfoDiv.children[2]; // 성별
	var userInfoli4 = userInfoDiv.children[3]; // 생년월일
	var userInfoli5 = userInfoDiv.children[4]; // 취미
	var userInfoli6 = userInfoDiv.children[5]; // 기타
	
	//아이디
	loginInfoli1.children[0].value = 'choteam';
	//비밀번호
	loginInfoli2.children[0].value = '1234';
	
	//나이
	userInfoli1.children[0].value = '54';
	//직업
	userInfoli2.children[0].value = '개발자';
	//성별
	userInfoli3.children[0].value = '남';
	//생년월일
	userInfoli4.children[0].value = '1970.08.29';
	//취미
	userInfoli5.children[0].value = '게임';
	//기타
	userInfoli6.children[0].value = '감사합니다.';

	
</script>

</html>