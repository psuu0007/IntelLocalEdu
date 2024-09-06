<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>applyJsonAjaxBasic</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
		$('#transfer').on('click', function() {
			
			var jsonKeyStr = $('#param').val();
			
			$.ajax({
				url: './employeesDoc.json',
				type: 'post',
				dataType: 'json',
				success: function(jsonObj) {
					var htmlStr = '';
					$.each(jsonObj[jsonKeyStr], function(i, item) {
						htmlStr += i + '&nbsp; : &nbsp;' 
							+ item.firstName + item.lastName + '<br/>';
					});
					
					$('#dic').html(htmlStr);
				}
			}); // ajax end
			
		});
		
		
		
	});
	
</script>

</head>

<body>

	<button id="transfer">Click me</button>
	
	<input type="text" name="param" id='param' value="">
	<div id="dic"></div>
</body>
</html>