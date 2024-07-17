<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_414windowBasic2.jsp</title>

<style type="text/css">
</style>

<script type="text/javascript">
	const childBannerWindow = window.open("./ch3_414windowBasic2_popup.jsp"
		,"childBanner" ,"width=768px, height=800px, left=200px, top=20px"
		+ ", scrollbars=no, toolbar=no, location=no");
	
	function childInterfaceFnc() {
		var childTextViewObj = document.getElementById('childTextView');
		
		childTextViewObj.innerHTML = childBannerWindow.document
			.getElementById('childInfo').value;
	}
	
	
</script>

</head>


<body>
	<h1 id='parentTitle' onclick="childInterfaceFnc();">오프너페이지</h1>

	<div id='childTextView' 
		style="width: 100px; height: 200px; border: 1px solid black;">
	
	</div>
</body>

<script type="text/javascript">
	
</script>

</html>