<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_421domBasic4.jsp</title>

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
	
	var listUl = document.getElementById('list');
	var parentObj = listUl.parentNode;
	
	alert(parentObj.tagName);
	
	
// 	var childObjList = listUl.childNodes;
	var childObjList = listUl.children;
	
	for (var i = 0; i < childObjList.length; i++) {
		document.write((i+1) + "번째: " + childObjList[i].textContent + '<br/>');
	}
	
	
	
</script>

</html>