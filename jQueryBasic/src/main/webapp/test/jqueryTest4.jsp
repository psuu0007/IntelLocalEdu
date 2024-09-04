<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jqueryTest4</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
	$(document).ready(function () {
 		$('li').attr('id', function (index, identified) {
// 			console.log(index + ' : ' + t);
		});
 		
 		$('button').each(function(index, obj) {
// 			alert(obj);
			$(this).on('click', function(){
// 				$(obj).attr('id');
				var liTitleStr = $('#' + $(this).html()).attr('title');
				
				$('#root').html(liTitleStr);
			});
		});
	});
// 	html('<div>sdkfjsdl</div>');
	
</script>

</head>

<body>
	<div style="border: 1px solid black;">
		<ul>
			<li id='one' title="사과">Apple</li>
			<li id='two' title="가방">Bag</li>
			<li id='three' title="야옹이">Cat</li>
			<li id='four' title="멍뭉이">Dog</li>
			<li id='five' title="엘펀트">Elephant</li>
		</ul>
	</div>
	
	<div id='root' style="border: 1px solid black;">

	</div>
	
	<button>one</button>
	<button>two</button>
	<button>three</button>
	<button>four</button>
	<button>five</button>
</body>
</html>