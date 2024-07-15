<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_formRadioBasic1.jsp</title>

<style type="text/css">
</style>


</head>


<body>
	<h2>Radio Buttons</h2>

	<p>
		The <strong>input type="radio"</strong> defines a radio button:
	</p>

	<p>Choose your favorite Web language:</p>
	<form action="/action_page.php">
		<input type="radio" id="angula.js" name="fav_language" value="angula.js">
		<label for="angula.js">angula.js</label><br>

		<input type="radio" id="vue" name="fav_language" value="vue">
		<label for="vue.js">vue.js</label><br>

		<input type="radio" id="html" name="fav_language" value="HTML">
		<label for="html">HTML</label><br>
		
		<input type="radio" id="css" name="fav_language" value="CSS">
		<label for="css">CSS</label><br>
		
		<input type="radio" id="javascript" name="fav_language" value="JavaScript">
		<label for="javascript">JavaScript</label><br><br>
		 
		<input type="submit" value="Submit">
	</form>

</body>

<script type="text/javascript">
	
</script>

</html>