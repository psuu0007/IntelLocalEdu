<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>(HTML/CSS/Javascript)구구단 활용</title>
<style type="text/css">
 	input { 
 		width: 80px; 
 	} 
	
	.gugudan{
		float: left;
		margin-right: 20px;
	}

	.print{
		padding-left: 10px;
		border: 1px solid black;
	}

</style>

<script type="text/javascript">
	function guguDanView10(obj){
		var danNum = obj.value.charAt(0);
		var gugudanStr = '';
		
		var printTag = document.getElementById('print' + danNum);
		
		for (var i = 0; i < 9; i++) {
			gugudanStr += danNum + '*' + (i+1) + '=' + (danNum*(i+1)) + '<br/>';
		}
		
		printTag.innerHTML = gugudanStr;
	}

	function guguDanClear10(obj){
		var danNum = obj.value.charAt(0);
		var gugudanStr = danNum + '*' + 1 + '=' + (danNum*1);
		
		var printTag = document.getElementById('print' + danNum);
		
		printTag.innerHTML = gugudanStr;
	}
	
	window.onload = function() {
		var htmlStr = ''; 
		
		for (var i = 2; i <= 9; i++) {
			htmlStr += '<div class="'+ 'gugudan">';
			htmlStr += '<input type="' + 'button" id="' + 'dan' + i +'"' + 'value="' + i + '단" onclick=' +'"guguDanView10(this);' + '">'; 
			htmlStr += '<input type="' + 'button" id="' + 'danClear' + i + '"' + 'value="' + i +'단 제거" onclick=' +'"guguDanClear10(this);' + '">'; 
			htmlStr += '<div id="' + 'print' + i + '" ' +  'class="'+ 'print">' + i + '*1=' + (i*1) + '</div>';		
			htmlStr += '</div>'
		}

		document.getElementById('container').innerHTML = htmlStr;
	}
	
</script>
</head>
<body>
<h3>10.구구단 출력하기2</h3>
	<small>
		1. 각각의 버튼을 클릭시 내용에 맞는 구구단 출력	<br/>	
		2. 출력된 구구단의 내용은 제거 버튼 클릭시 이전 상태로 초기화 (꼭 자신의 단*1=계산값으로 초기화) <br/>
		3. html/css 화면과 동일해야 함 (작성 코드는 달라도 정말 비슷하게 보여야 함)<br/>
		4. 브라우저 창을 줄여도 움직이지 않는다 (스크롤 바가 나온다)<br/>
		5. 같은 단을 여러번 클릭해도 더 추가해서 나오지 않는다.<br/>
	</small>
	<fieldset id='container' style="width: 1450px; border: 4px solid red;">
		<!-- 화면을 보고 그대로 구현하시오 -->
<!-- 		<div class='gugudan'> -->
<!-- 			<input type="button" id='dan2' value="2단" onclick="guguDanView10(this);"> -->
<!-- 			<input type="button" id='danClear2' value="2단 제거" onclick="guguDanClear10(this);"> -->
<!-- 			<div id="print2" class='print'>2*1=2</div> -->
<!-- 		</div> -->
<!-- 		<div class='gugudan'> -->
<!-- 			<input type="button" id='dan3' value="3단" onclick="guguDanView10(this);"> -->
<!-- 			<input type="button" id='danClear3' value="3단 제거" onclick="guguDanClear10(this);"> -->
<!-- 			<div id="print3" class='print'>3*1=3</div> -->
<!-- 		</div> -->
<!-- 		<div class='gugudan'> -->
<!-- 			<input type="button" id='dan4' value="4단" onclick="guguDanView10(this);"> -->
<!-- 			<input type="button" id='danClear4' value="4단 제거" onclick="guguDanClear10(this);"> -->
<!-- 			<div id="print4" class='print'>4*1=4</div> -->
<!-- 		</div> -->
<!-- 		<div class='gugudan'> -->
<!-- 			<input type="button" id='dan5' value="5단" onclick="guguDanView10(this);"> -->
<!-- 			<input type="button" id='danClear5' value="5단 제거" onclick="guguDanClear10(this);"> -->
<!-- 			<div id="print5" class='print'>5*1=5</div> -->
<!-- 		</div> -->
<!-- 		<div class='gugudan'> -->
<!-- 			<input type="button" id='dan6' value="6단" onclick="guguDanView10(this);"> -->
<!-- 			<input type="button" id='danClear6' value="6단 제거" onclick="guguDanClear10(this);"> -->
<!-- 			<div id="print6" class='print'>6*1=6</div> -->
<!-- 		</div> -->
<!-- 		<div class='gugudan'> -->
<!-- 			<input type="button" id='dan7' value="7단" onclick="guguDanView10(this);"> -->
<!-- 			<input type="button" id='danClear7' value="7단 제거" onclick="guguDanClear10(this);"> -->
<!-- 			<div id="print7" class='print'>7*1=7</div> -->
<!-- 		</div> -->
<!-- 		<div class='gugudan'> -->
<!-- 			<input type="button" id='dan8' value="8단" onclick="guguDanView10(this);"> -->
<!-- 			<input type="button" id='danClear8' value="8단 제거" onclick="guguDanClear10(this);"> -->
<!-- 			<div id="print8" class='print'>8*1=8</div> -->
<!-- 		</div> -->
<!-- 		<div class='gugudan'> -->
<!-- 			<input type="button" id='dan9' value="9단" onclick="guguDanView10(this);"> -->
<!-- 			<input type="button" id='danClear9' value="9단 제거" onclick="guguDanClear10(this);"> -->
<!-- 			<div id="print9" class='print'>9*1=9</div> -->
<!-- 		</div> -->

	</fieldset>
		
</body>
</html>