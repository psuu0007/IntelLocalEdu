<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch1_38aBasic.jsp</title>

</head>

<body>
	<h1>a 태그</h1>
	<a href="http://icoxpublish.com/">아이콕스</a>
	<a href="mailto:icoxpub@naver.com">icoxpub@naver.com</a>

<!-- 퍼블리셔들은 html 시멘틱? -> 코드

프론트 -> 시멘틱 -> 객체지향 (유지보수, 개발 효율?)
패턴화 -->
	<section>
		<h2>새로나온책</h2>
		<p>반응형 웹퍼블리싱</p>
	</section>
	<a href="#content">본문바로가기</a>
	<p id="content">본문내용</p>

</body>
</html>