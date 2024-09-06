<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryStudy2</title>

<style type="text/css">

</style>

<script type="text/javascript" src="./jquery-3.7.1.js"></script>
<script type="text/javascript">
var jsonStr = '{"employees":';
jsonStr +=	'[';
jsonStr += '{"firstName" : "john", "lastName" : "doe"},';
jsonStr += '{"firstName" : "anna", "lastName" : "smith"},';
jsonStr += '{"firstName" : "대", "lastName" : "상현"}';
jsonStr += ']';
jsonStr += '}';

alert(jsonStr);
alert(jsonStr.employees);

var jsonObject = JSON.parse(jsonStr);

alert(jsonObject);
alert(jsonObject.employees);
	
</script>

</head>

<body>
	

</body>
</html>