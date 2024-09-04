<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>페이징(Paging?)</title>

<style type="text/css">
nav > ul {
	list-style-type: none;
    padding: 0px;
    overflow: hidden;
    background-color: #333333;
/*     width: 1000px; */ /* 넓이를 주면 고정  */
    display: table; /* table을 주면  요소의 내용에 맞게 자동으로 크기 */
    margin-left: auto;
    margin-right: auto;
    
}

nav > ul > li {
	float: left;
}

nav > ul > li > a {
    display: block;
    color: white; 
    text-align: center;
    padding: 16px;
    text-decoration: none;
}

nav > ul > li > a:hover {
    color: #FFD9EC;
    background-color: #5D5D5D;
    font-weight: bold;
}

</style>

<script type="text/javascript">

</script>

</head>


<body>

	<nav>
		<ul>
<!-- 		ㄷ 한자 -->    
			<li><a href="#"><span>≪</span></a></li>
			
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			
			<li><a href="#"><span>≫</span></a></li>
			
		</ul>	
	</nav>


</body>
</html>