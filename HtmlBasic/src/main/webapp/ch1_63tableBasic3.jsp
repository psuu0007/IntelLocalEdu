<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch1_63tableBasic3.jsp</title>
<style>
table{
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
}

td{
    border: 1px solid #000;
}
</style>
</head>

<body>
	<table>
        <tr>
            <td colspan="3" style="background: red; 
            	text-align: right;">1공연 요금</td>
        </tr>
        <tr>
            <td>2구분</td>
            <td>3S석</td>
            <td>4VIP석</td>
        </tr>
    </table>    
    
    <table>
        <tr>
            <td rowspan="2" style="border: solid blue 2px; 
            	text-align: center;">1</td>
            <td>2</td>
            <td>3</td>
        </tr>
        <tr>            
            <td>4</td>
            <td>5</td>
        </tr>
    </table>
</body>
</html>