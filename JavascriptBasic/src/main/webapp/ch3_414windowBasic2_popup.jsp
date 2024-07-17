<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_414windowBasic2_popup.jsp</title>

<style type="text/css">
	*{margin:0; padding:0;}
</style>

<script type="text/javascript">
	
	function getParentTitleFnc() {
		let childInfoObj = document.getElementById('childInfo');
		
		childInfoObj.value = 
			window.opener.document.getElementById('parentTitle').innerHTML;
		
		
	}
	
</script>

</head>


<body>
	<h1>여기는 자식 윈도우(창)야</h1>

	<p>
		<img src="images/popup.jpg" alt="이달에 새로나온책"  usemap="#pop"/>
	</p>
	<map name="pop" id="pop">
    	<area shape="rect" coords="228,371,294,399" href="#" 
    		onclick="window.close();" alt="창 닫기"/>
	</map>


	<input type="text" id='childInfo' value="부모의 값을 가져온다?">
	<input type="button" onclick="getParentTitleFnc();" value="동작 버튼">
</body>



</html>