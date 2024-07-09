<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>ch3_387stringTest.jsp</title>
<style type="text/css">
p {
	padding-left: 160px;
}

#allDiv{
	width: 500px;
	margin: auto;
}

#demoView {
	border: 1px solid black;
	width: 300px;
	height: 100px;
	padding-top: 70px;
	margin-left: 25px;
	margin-top: 5px;
	text-align: center;
}

#buttonAll button {
	border: 1px solid skyblue;
	background-color: rgba(0, 0, 0, 0);
	color: skyblue;
	padding: 5px;
}

#buttonAll button:hover {
	color: white;
	background-color: skyblue;
}

#button1 {
	margin-right: -4px;
	border-top-left-radius: 5px;
	border-bottom-left-radius: 5px;
}

#button6 {
	border-top-right-radius: 5px;
	border-bottom-right-radius: 5px;
}

#button2{
	margin-right: -6px;
	margin-left: -3px;
}

 #button3{
 	margin-right: -6px;
 }
 
 #button4{
 margin-right: -7px;
 }
 
 #button5{
 margin-right: -7px;
 }
 

</style>





</head>


<body>
	<div id="allDiv">
		<div id="buttonAll">
			<button id="button1" onclick="replaceFnc();">1번 정답</button>
			<button id="button2" onclick="replaceFnc2();">2번 정답</button>
			<button id="button3" onclick="splitFnc1();">3번 정답</button>
			<button id="button4" onclick="substringFnc();">4번 정답</button>
			<button id="button5" onclick="toLowerCaseFnc();">5번 정답</button>
			<button id="button6" onclick="splitFnc2();">6번 정답</button>
		</div>
		<p>정답↓</p>
		<div id='demoView'></div>
	</div>
</body>

<script type="text/javascript">
	const examStr1 = '자바를 자바라';
	const examStr2 = '자바를 자바라';
	const examStr3 = '자바를 자바라';
	const examStr4 = '문자열 안에서 마지막 문자 앞 글자가 무엇인지 출력하시오(자바를 자바라)';
	const examStr5 = 'THANK PSU VERY MUCH';
	const examStr6 = 'thank psu Very MUCH';
	const answerdiv = document.getElementById('demoView');

	function replaceFnc() {
		let str = examStr1.replaceAll('자바', 'db');

		// 		document.answerdiv.write(examStr1);
		answerdiv.textContent = str;
		// 		answerdiv.innerHTML = str1;
	}

	function replaceFnc2() {
		let str = examStr2.replace('자바', 'db');
		answerdiv.textContent = str;
	}
	function splitFnc1() {
		let str = examStr3.split(' ');
		let replaceStr = str[1].replace('자바', '잡아');
		answerdiv.textContent = str[0] + ' ' + replaceStr;
	}
	function substringFnc() {
		let str = examStr4.charAt(examStr4.length - 2);
		answerdiv.textContent = str;
	}
	function toLowerCaseFnc() {
		let str = examStr5.toLowerCase()
		answerdiv.textContent = str;
	}
	function splitFnc2() {
		let str = examStr6.split(' ');
		let upperStr = str[0].toUpperCase() + ' ' + str[1].replace('psu', 'YOU');
		let lowerStr = str[2].toLowerCase() + ' ' + str[3].toLowerCase();
		answerdiv.textContent = upperStr + ' ' + lowerStr + '!!';
	}
</script>
</html>