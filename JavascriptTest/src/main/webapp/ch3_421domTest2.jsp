<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_421domTest2.jsp</title>

<style type="text/css">
</style>



</head>


<body>
	<div>
		<h1>선택자</h1>
		<h2 id="title">원거리 선택자</h2>
		<ul>
			<li>getElementById</li>
			<li>getElementsByTagnName</li>
		</ul>
		<h2 id="title2">근거리 선택자</h2>
		<ul id="list">
			<li>parentNode</li>
			<li>childNodes</li>
			<li>children</li>
			<li>firstChild</li>
			<li>previousSibling</li>
			<li>nextSibling</li>
		</ul>
	</div>

</body>

<script type="text/javascript">
	//	모든 li태그들에 class를 작성한다 class에 들어갈 값은 dy_cls_input

	//	서로 다른 ul을 통해 li들을 각각 적용한다
	//	첫번째 ul의 li들은 배경색을 분홍색으로 지정한다
	//	두번째 ul의 li들은 경계선을 모두 서로 다른 값으로 지정한다
	var myLiTagList = document.getElementsByTagName("li");

	for (var i = 0; i < myLiTagList.length; i++) {
		myLiTagList[i].className = "dy_cls_input";
	}

	var myUlTagList = document.getElementsByTagName("ul");

	var firstUlOfliList = myUlTagList[0].getElementsByTagName("li")

	for (var i = 0; i < firstUlOfliList.length; i++) {
		firstUlOfliList[i].style.background = "pink";
	}

	var secondUlOfliList = myUlTagList[1].getElementsByTagName("li")

// 	for (var i = 0; i < secondUlOfliList.length; i++) {
// 		secondUlOfliList[i].style.border = (i + 1) + 'px solid #ff2d' + i + 'e';
// 	}
	
	var borderColorList = ['Crimson', 'LightSalmon', 'GoldenRod', 'DarkSeaGreen',
		'DeepSkyBlue', 'DarkBlue'];
	
	for (var i = 0; i < secondUlOfliList.length; i++) {
		secondUlOfliList[i].style.border 
			= (i + 1) + 'px solid ' + borderColorList[i];
	}
</script>

</html>