<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ch3_427domCRUDTest2_Answer.jsp</title>
</head>

<body>
	
	<div>
		<ul id='theList'>
			<li>리스트2</li>
			<li>리스트3</li>
			<li>리스트1</li>
			<li>리스트4</li>
		</ul>
	</div>
	
	<h1>문서 객체 조작</h1>
	
	<div id='thirdDiv'>
		ㅇ
	</div>
	
</body>

<script type="text/javascript">

	var theListObj = document.getElementById('theList');
	var liTagList = theListObj.getElementsByTagName('li');
	
//	div를 새로 만들고 새로만든 div를 기존div사이에 배치하기
	var secondDivTag = document.createElement('div');
	document.body.appendChild(secondDivTag);
	var thedivList = document.getElementsByTagName('div');

//	div사이에 배치
	document.body.insertBefore(secondDivTag, thedivList[1]); 

//	div id 주기
	secondDivTag.setAttribute('id', 'secondDiv');

//	ul 복사하기
	var ulTagList = thedivList[0].getElementsByTagName('ul');
	var copyUlTagList = ulTagList[0].cloneNode('true'); 
	secondDivTag.appendChild(copyUlTagList);

//	카피 ul의 li 리스트 갖고오기
	var newliTagList = copyUlTagList.getElementsByTagName('li');

//	스타일 추가
	copyUlTagList.setAttribute('style', 'background: black;');
	secondDivTag.setAttribute('style', 'border: 1px solid black;');

	for (var i = 0; i < newliTagList.length; i++) {
	    newliTagList[i].setAttribute('style', 'color: white; border: 1px solid black;');
	}

//	<li>리스트1</li> 을 복제한다
	var copyliTagList = liTagList[2].cloneNode('true');
	theListObj.insertBefore(copyliTagList,liTagList[0]);

//	삭제
	theListObj.removeChild(liTagList[3]);
	theListObj.removeChild(liTagList[3]);

//	copy ul 의 <li>리스트1</li> 을 복제한다	
	var copyliTagList2 = newliTagList[2].cloneNode('true');
	copyUlTagList.insertBefore(copyliTagList2,newliTagList[0]);
//	삭제
	copyUlTagList.removeChild(newliTagList[3]);
</script>

</html>

