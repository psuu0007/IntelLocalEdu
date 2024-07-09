<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_433formTraBasic1.jsp</title>

<style type="text/css">
</style>


</head>


<body>
	<form action="#" name="frm1">
		<input type="search" name="search" placeholder="검색어입력"> 
		<input type="submit" value="확인">
	</form>
	<form action="#" name="frm2">
		<input type="text" name="subject" placeholder="과목입력"> 
		<input type="password" name="credit" placeholder="학점입력"> 
		<input type="submit" value="확인">
	</form>

</body>
<script type="text/javascript">

	window.onload = function() {
		var frm1 = document.frm1;
		var frm2 = document.frm2;
		console.log(frm1.search.placeholder);
		console.log(frm2.subject.placeholder);
		console.log(frm2.credit.placeholder);
		
		console.log(document.forms[0].elements[0].placeholder);
		console.log(document.forms[1][1].placeholder);
		
		console.log(document.forms['frm1'].elements['search'].placeholder);
		console.log(document.forms['frm2']['subject'].placeholder);
	}
</script>

</html>