<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryBasic1</title>

<style type="text/css">

</style>

<script type="text/javascript" src="./jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(document).ready(function () {
// 		var jsPara = document.getElementById('root');
		
// 		alert(jsPara.style.border);
		
		alert('hello jquery');
		
// 		jsPara.innerHTML = 'hello jQuery1';
		$('#root').html('hello jQuery1');
	});
	
	$(function () {
// 		var jsPara = document.getElementById('root');
		
// 		alert(jsPara.style.border);
		
		alert('hello jquery');
		
		$('#root').html('hello jQuery2');
	});
</script>

</head>

<body>
	<div id='root' class='' style="border: 1px solid black;">
	</div>

</body>
</html>