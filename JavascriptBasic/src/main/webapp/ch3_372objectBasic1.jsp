<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_372objectBasic1.jsp</title>

<style type="text/css">
</style>

<script type="text/javascript">


	var person = {
		name: '커피',
		age: 24,
		'hobby': 'it커뮤니티 탐방',
		getPrintInfo : function() {
			alert('이름: ' + this.name + ', 나이: ' + this.age);
		}
	};
	
	console.log(person.name);
	console.log(person['age']);
	
	person.getPrintInfo();
	
	console.log(person.hobby);
	
// 	수정
	person.name = '클레어';
	
// 	객체 속성 추가
	person.firstName = '레드필드';
	
	// 함수 수정
	person.getPrintInfo = function() {
		alert('대충 하자');
	}
	
	console.log(person.name);
	console.log(person["firstName"]);
	
	person.getPrintInfo();
	
	
</script>

</head>


<body>


</body>



</html>