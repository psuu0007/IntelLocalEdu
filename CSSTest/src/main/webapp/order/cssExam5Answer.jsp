<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div{
	border: 1px solid black;
}
#parent {
	background: red;
	color: blue;
}

#parent #child {
	background: orange;
	color: green;
}

#grandchild {
	background: yellow;
	color: red;
}

.first #grandchild {
	background: green;
	color: black;
}

#parent-child {
	background: blue;
	color: purple;
}

#parent .second {
	background: purple;
	color: orange;
}
</style>
</head>
<body>
<!-- #parent -->
	<div id="parent" class="first">
		a
<!-- 		#parent #child -->
		<div id="child" class="first">
			b
<!-- 		#grandchild 보다 	.first #grandchild가 우선순위가 높다  -->
			<div id="grandchild" class="first">이 텍스트의 색상은 무엇일까요?</div>
		</div>

<!-- #parent-child보다   #parent .second 우선순위가 높다-->
		<div id="parent-child" class="second">
			d
<!-- 			#parent-child 보다 #parent .second가 더 높다 -->
			<div id="parent-grandchild" class="second">이 텍스트의 색상은 무엇일까요?</div>
		</div>

	</div>
</body>
</html>