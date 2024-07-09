<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_430domInnelHtmlBasic1.jsp</title>

<style type="text/css">
div{
	width: 300px;
	border: 1px solid black;
}

p{
	border: 1px solid black;
}
</style>



</head>


<body>
	<h1>innerHtml?</h1>
	
	<div id='divObj'>
		
	</div>
	
<!-- 	<div id='divObj'> -->
<!-- 		<p style="background-color: aqua;">이벤트? event</p>		 -->
<!-- 		<button>마우스 왼쪽 클릭</button> -->
<!-- 	</div> -->
	
	<div>demo</div>

</body>

<script type="text/javascript">
	var divObj = document.getElementById('divObj');
	
	var htmlStr = '';
	
	htmlStr += '<p style="background-color: aqua;">이벤트? event</p>';
	htmlStr += '<button>마우스 왼쪽 클릭</button>';
	
	divObj.innerHTML = htmlStr;
	
</script>


</html>