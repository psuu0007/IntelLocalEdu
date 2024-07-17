<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style type="text/css">
fieldset {
	width: 70%;
	border-radius: 10px;
}

body {
	margin-left: 20%;
}
</style>
<script type="text/javascript" src="./JavascriptExamAnswer2.js"></script>
</head>

<body>
	<h3>1.숫자 판별하기 (5점)</h3>
	<small>* 입력란에 값을 입력하고 버튼을 클릭하면 입력값이 숫자인지 아닌지 판별하여 알림창으로
		"숫자입니다"/"숫자가 아닙니다" 출력하기</small>
	<br>
	<fieldset>
		<legend>숫자입력</legend>
		<input type="text" name="num">
		<input type="button" value="판별" onclick="numCheck01();">
	</fieldset>

	<!-- -----------------------------------------------------------------------------------------------------------  -->
	<h3>2.문자열 검색하기 (5점)</h3>
	<small>* 입력란에 원하는 검색어를 입력하고 버튼을 클릭하면 검색할 내용에서 검색어가 존재하는지 여부를 <br />
		알림창으로 "검색어 라는 단어가 존재합니다."/"검색어 (은)는 존재하지 않습니다." 출력하기 <br/>
		ex) 삼성을 검색했다면 '삼성 라는 단어가 존재합니다.' 
	</small>
	<br>
	<fieldset>
		<b>검색할 단어:</b>
			<input type="text" id="val">
			<input type="button" value="검색" onclick="searchStr02();"><br> -검색할 내용:
		<pre>
       삼성전자는 4일(현지시간) 독일 베를린에서 'IFA 2013(세계가전박람회)' 전시회 개막에 앞서 
     '삼성 모바일 언팩' 행사를 갖고 '갤럭시노트3'와 '갤럭시기어' 등을 공개했다.
       갤럭시노트3는 5.5인치 갤럭시노트2보다 큰 풀HD 슈퍼아몰레드 5.7인치 화면을 탑재했다.
</pre>
	</fieldset>

	<!-- -----------------------------------------------------------------------------------------------------------  -->
	<h3>3.팝업창 띄우기 (15점)</h3>
	<small>* 
	1.라디오버튼을 클릭하면 팝업창을 뛰우고<br/> 
	<font color="red"><strong>
	2. 자식창으로 값 전송 버튼을 클릭<br/>
		(만약 1번을 수행하지 않고 2번 수행시 '라디오버튼을 클릭하고 전송 버튼을 누르세요!'<br/>
		 알림창 출력 및 팝업창을 열지않는다)
	</strong></font><br/>
	3. 팝업창이 뜬 후 부모창의 '자식창으로 값 전송' 버튼을 클릭하지 않고 팝업창의 '부모창 정보 전달' 버튼을 클릭시<br/>
	 '부모창에서 자식창으로 값 전송을 눌러주세요' 알림창 출력
	4. 팝업창이 뜬 후 자식창으로 값 전송을 클릭하면 라디오 버튼의 value값이 팝업페이지의 hidden input태그 중 <br/>
	parentTagSelectId와 availableVal에 값을 전달하고 유효성 검사를 수행 후<br/> 
	5. 팝업창에서 부모창 정보 전달 버튼을 클릭하면 <br/>
	6. 부모페이지의 span태그 내용에 선택한 라디오버튼의 value 값은 사용불가능,<br/>
	 그 이외의 값은 사용가능이란 값으로 부모창의 span태그에 출력<br/> 
	ex) 네이버 선택시 daum, google, 그 외 모든 글자는 사용가능 출력,<br/>
	 다음 선택시 naver, google, 그 외 모든 글자는 사용가능 이라고 부모창에 출력<br/>
	7. 팝업창에서 확인 버튼 클릭시 팝업창 닫기 및 부모창에 있는 자식창으로 값 전송 버튼 비활성화.<br/>
	8. 팝업창이 닫힌 후 처음 선택이 네이버였다면 구글이나 다음 라디오버튼을 누르면 비활성화 된 전송 버튼 활성화
	</small>
	<fieldset>
		<legend>선택한 라디오 버튼의 value를 팝업창에서 검사후 결과받기</legend>
		<input type="radio" id="checkuseSite1" name="site" value="naver" onclick="popupWin03(this);">네이버<br>
		<input type="radio" id="checkuseSite2" name="site" value="daum" onclick="popupWin03(this);">다음<br> 
		<input type="radio" id="checkuseSite3" name="site" value="google" onclick="popupWin03(this);">구글<br>
		<input type="button" id="sendChildVal" value="자식창으로 값 전송" onclick="popupWinSend03();">
		
		<!-- ex) 네이버 선택시 naver 사용불가능 다른 모든 글자는 사용가능이라고 span태그 안에 출력 -->
		<span id='checkComplete' style="border: 1px solid black;">검색한 내용는 사용불가능 or 검색한 내용는 사용가능</span>
		
	</fieldset>

	<!-- -----------------------------------------------------------------------------------------------------------  -->
	<h3>4.전체선택버튼 구현하기 (5점)</h3>
	<small>* 전체선택버튼을 클릭하면 체크항목을 모두 체크하거나 해제시키자.</small>
	<fieldset>
		<legend>가장 좋아하는 과목은?</legend>
		<input type="checkbox" name="all" onclick="allchk04(this);">전체선택<br>
		<input type="checkbox" id='subject1' name="subject">Java<br>
		<input type="checkbox" id='subject2' name="subject">DataBase<br> 
		<input type="checkbox" id='subject3' name="subject">HTML/CSS<br> 
		<input type="checkbox" id='subject4' name="subject">Javascript
	</fieldset>

<!-- -----------------------------------------------------------------------------------------------------------  -->
	<h3>5.구구단 출력하기 (10점)</h3>
	<small>*
		1. 입력값은 숫자이다.<br/>		
		2. 0단 이하는 존재하지 않는다 ex: 0단 or -2단 <br/>
		3. 10단 이상도 존재한다 ex: 10단 or 1000단<br/>
		4. 0단 이하의 값을 입력시 아무것도 작동하지 않는다.<br/>
		5. 내용이 출력된 이후 다른 값 입력후 출력 버튼을 누르면 기존의 내용이 사라지고 input에 입력된 구구단 출력<br/>
		6. 출력 내용은 입력값이 2라면 2*1=2 한줄 내리고 2*2=4 한줄 내리고 2*3=6 ... 2*9=18로 출력한다
	</small>
	<fieldset>
		<legend>원하는 구구단을 입력하고 화면에 출력합니다.<br/>
		</legend>
		<input type="text" id="guguVal">
		<input type="button" value="출력" onclick="guguDanView05();">
		<div id="guguPrint"></div>
	</fieldset>

	<!-- -----------------------------------------------------------------------------------------------------------  -->
	<h3>6.select태그 사용하기 (5점)</h3>
	<small>* 선택된 항목의 사이트로 페이지 이동하기.(현재창에서 페이지 이동)</small>
	<fieldset>
		<legend>이동할 페이지를 선택하세요</legend>
		<select name="selsite" onchange="selPage06();" style="height: 30px;">
			<option value="http://www.naver.com">네이버</option>
			<option value="http://www.daum.net">다음</option>
			<option value="http://www.hankyung.com">한경</option>
		</select>
	</fieldset>

	<!-- -----------------------------------------------------------------------------------------------------------  -->
	<h3>7.HTML5 플레이스홀더 구현 및 활용하기 (15점)</h3>
	<small>*
			1.나를 외치다를 부른 가수는?이 초기값이다<br/>
			2.input에 내용이 하나도 없다면, <br/>
			3.id가 root인 태그 안에 div 태그를<br/>
			  id가 cry인 태그 뒤에 추가하고<br/> 
			4.추가한 div 내용에 '마야'라고 출력하며<br/>
			   테두리는 빨간색으로 적용하시오<br/>
			5.input에 내용이 하나라도 존재하면 추가한 div는 제거하시오.<br/>   
			6.placeholder의 기본 기능과 1~5내용이 모두 적용되어야 함
	</small>
	<fieldset>
		<legend>스스로 HTML5에서 placeholder기능을 분석하여 작성하시오</legend>
		<div id='root'>
			<input type="text" id='cry' name='cry' value='나를 외치다를 부른 가수는?' onchange="placeholderFnc07();">
		</div>
	</fieldset>

	<!-- -----------------------------------------------------------------------------------------------------------  -->
	<h3>8.시작일과 종료일 사이의 일수 구하기 (10점)</h3>
	<small>*
	1.시작일과 종료일 입력 후 일수보기 버튼 클릭시 시작일과 종료일의 차를 알림창으로 일수 출력<br/>
	(ex: 2016-12-06 ~ 2016-12-07 시 '1일' 알림창으로 출력)<br/>
	2.시작일보다 종료일이 빠른 날짜로 입력후 일수보기 버튼 클릭 시<br/> 
	'종료일은 시작일 보다 빠를 수 없습니다. 다시 선택해주십시요' 라고 알림창으로 출력<br/>
	3.2번 상태에서 알림창 종료 후 입력한 시작일과 종료일은 값을 설정하기 전 상태로 초기화하시오
	</small>
	<fieldset>
		시작일:<input type="date" id="startDate">
		<span>~</span>
		종료일:<input type="date" id="endDate">
		<button onclick="termShow08();">일수보기</button>
	</fieldset>

	<!-- -----------------------------------------------------------------------------------------------------------  -->
	<h3>9.입력값 테이블로 출력하기 (10점)</h3>
	<small>
		*
		1.id가 domTable인 태그 안에<br/>
		2.아이디, 패스워드, 주소, 전화번호를<br/>
		3.tr하나에 td네개를 순서대로 입력한 내용이 출력<br/>
		4.추가 버튼 클릭시 기존의 테이블보다 앞에 계속 추가되도록 작성하시오.<br/>
		5.내용은 입력하지 않아도 추가되도록 한다. 
	</small>
	<fieldset>
		<legend>테이블의 스타일 적용: 넓이:200px 경계선 합치기, td 스타일 적용: 배경색: yellow;</legend>
		<form>
			아 이 디:<input type="text" name="id"><br> 
			패스워드:<input type="password" name="pw"><br>
			주 소:<input type="text" name="addr"><br> 
			전화번호:<input type="text" name="phone"><br>
			<input type="button" value="추가" onclick="domTest09();">
		</form>
		<div id="domTable"></div>
	</fieldset>

	<!-- -----------------------------------------------------------------------------------------------------------  -->
	<h3>10.구구단 출력하기2 (20점)</h3>
	<small>
		1. JavascriptExam10Test.jsp에서 계속....	
		
	</small>
	
</body>
</html>