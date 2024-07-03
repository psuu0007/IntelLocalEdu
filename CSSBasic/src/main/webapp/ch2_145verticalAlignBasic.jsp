<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_143textAlignBasic.jsp</title>
<style type="text/css">
p { border: 1px solid #000; }
.valign img { vertical-align: middle; }
.valign_top img { vertical-align: top; }

</style>
</head>

<body>
	
	<p>
        나는 자유다
        <img src="img/imfree.png" width="150" alt="자유">
    </p>
    <p class="valign">
        나는 자유다 middle
        <img src="img/imfree.png" width="150" alt="자유">
    </p>
    <p class="valign_top">
        나는 자유다 top
        <img src="img/imfree.png" width="150" alt="자유">
    </p>
	
</body>
</html>