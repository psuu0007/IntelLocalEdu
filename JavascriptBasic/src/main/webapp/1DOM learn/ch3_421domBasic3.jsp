<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_421domBasic3.jsp</title>

<style type="text/css">

.style_add {
	background: maroon;
	color: white;
}

</style>



</head>


<body>
	<div>
		<h1>선택자</h1>
		<h2 id="title">원거리 선택자</h2>
		<ul>
			<li class="dy_cls1_input">getElementById</li>
			<li class="dy_cls1_input">getElementsByTagnName</li>
		</ul>
		<h2 id="title2">근거리 선택자</h2>
		<ul id="list">
			<li class="dy_cls2_input">parentNode</li>
			<li class="dy_cls2_input">childNodes</li>
			<li class="dy_cls2_input">children</li>
			<li class="dy_cls3_input">firstChild</li>
			<li class="dy_cls3_input">previousSibling</li>
			<li class="dy_cls3_input">nextSibling</li>
		</ul>
	</div>

</body>
<script type="text/javascript">
	
	var dyCls1InputList = document.getElementsByClassName('dy_cls1_input');
	
	dyCls1InputList[0].style.fontWeight = 'bold';
	dyCls1InputList[0].style.fontSize = '24px';
	
	alert(dyCls1InputList[0].style.fontSize);
	
	var dyCls3InputList = document.getElementsByClassName('dy_cls3_input');
	
	dyCls3InputList[dyCls3InputList.length-1].className = 'style_add';
	
	
	
</script>

</html>