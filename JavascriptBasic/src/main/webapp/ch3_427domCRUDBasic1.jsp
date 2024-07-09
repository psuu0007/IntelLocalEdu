<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_427domCRUDBasic1.jsp</title>

<style type="text/css">

#theBox {

	background: Gainsboro;
}

</style>


</head>


<body>
	<div id='theBox'>
		<h1>태그 생성 연습</h1>
	</div>

</body>
<script type="text/javascript">
	var newpTag = document.createElement('p');	
	var newbuttonTag1 = document.createElement('button');	
	var newbuttonTag2 = document.createElement('button');	
	var newText1 = document.createTextNode('버튼1');	
	var newText2 = document.createTextNode('버튼2');
	
	
	newbuttonTag1.setAttribute('id', 'btn1');
	newbuttonTag2.setAttribute('id', 'btn2');
	
	
	newbuttonTag1.appendChild(newText1);
	newbuttonTag2.appendChild(newText2);
	newpTag.appendChild(newbuttonTag1);
	newpTag.appendChild(newbuttonTag2);
	
	var theObj = document.getElementById('theBox');
	theObj.appendChild(newpTag);
		
</script>

</html>