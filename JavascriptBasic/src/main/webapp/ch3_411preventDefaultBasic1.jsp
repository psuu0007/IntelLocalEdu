<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ch3_411preventDefaultBasic1</title>

<script>
	window.onload = function() {
		const icox = document.getElementById('icox');
		icox.addEventListener('click', function(e) {
			e.preventDefault();

			alert('아이콕스');
		});
	};
</script>
</head>
<body>
	<div>
		<a href="http://icoxpublish.com" id="icox">아이콕스</a>
	</div>
</body>
</html>