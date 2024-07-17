//1.정답 점수5
function numCheck01(){
	var num=document.getElementsByName("num")[0].value;
	if(isNaN(num)){
		alert("숫자가 아닙니다.");
	}else{
		alert("숫자입니다.");
	}
}

//2.정답 점수5
function searchStr02(){
	var val=document.getElementById("val").value;
	var content=document.getElementsByTagName("pre")[0].textContent;
	if(content.indexOf(val)!=-1){
		alert(val+" 라는 단어가 존재합니다.");
	}else{
		alert(val+" (은)는 존재하지 않습니다.");
	}
}

//3.정답 15점
var newWinObj = '';
var myClickTag = '';

function popupWin03(myObj){
	 newWinObj = window.open("./JavascriptExamTestPopupWin.jsp", "popUpWin", "width=500px,height=500px");
	 	 
	 myClickTag = myObj;
	 
	 document.getElementById('sendChildVal').removeAttribute('disabled');
}

function popupWinSend03() {
	
	if(myClickTag){
//		newWinObj.document.getElementById('childInfo').value = '부모창에서 팝업창으로 값을 보내는 방법이다';
		newWinObj.document.getElementById('parentTagSelectId').value = myClickTag.id;
		newWinObj.document.getElementById('availableVal').value = myClickTag.value;
		
	}else{
		alert('라디오버튼을 클릭하고 전송 버튼을 누르세요!');
	}
}

//4.정답 5점
function allchk04(bool){
	var doc=document.getElementsByName("subject");
	for ( var i = 0; i < doc.length; i++) {
		doc[i].checked=bool.checked;
	}
}

//5번정답 10점
function guguDanView05(){
	var val=document.getElementById("guguVal").value;
	var str="";
	if(val > 0){
		for ( var i = 1; i < 10; i++) {
			str+=val+"*"+i+"="+(val*i)+"<br>";
		}
		document.getElementById("guguPrint").innerHTML=str;
	}
	
}

//6.정답 5점
function selPage06(){
	var selEle=document.getElementsByName("selsite")[0];
	var url=selEle.options[selEle.selectedIndex].value;
	location.href=url;
}

//7.정답 15점
function placeholderFnc07() {
	var initStr = '나를 외치다를 부른 가수는?';
	var phObj = document.getElementById('cry');
	var phChkVal = phObj.value.length;
	
	
	var rootObj = document.getElementById('root');
	var checkMaya = document.getElementById('maya');
	
	// chkVal 가 0이면 나를 외치다를 부른 가수는?로 초기화
	if(phChkVal == 0){
		
		if(checkMaya == null){
			var newDiv = document.createElement('div');
			var divText = document.createTextNode('마야');
			newDiv.setAttribute('id', 'maya');
			newDiv.setAttribute('style', 'border: 1px solid red');
			newDiv.appendChild(divText);
			rootObj.appendChild(newDiv);
		}
					
		phObj.value = initStr;
	}else{ // 
		if(checkMaya != null){
			var childObj = rootObj.children;
			
			// 무조건 div는 2개 존재하는 상황이다
			rootObj.removeChild(childObj[1]);
		}
	}
	
}
//8.정답 10점
function termShow08(){
	
	var startDateObj = document.getElementById('startDate');
	var endDateObj = document.getElementById('endDate');
	
	var startDateArr = startDateObj.value.split('-');
	var endDateArr = endDateObj.value.split('-');
	
	var startDate = new Date(startDateArr[0], startDateArr[1], startDateArr[2]);
	var endDate = new Date(endDateArr[0], endDateArr[1], endDateArr[2]);
	
	
	if((endDate - startDate) < 0){
		alert('종료일은 시작일 보다 빠를 수 없습니다. 다시 선택해주십시요');
		startDateObj.value = '';
		endDateObj.value = '';
	}else{
		alert((endDate.getTime() - startDate.getTime()) / (1000*60*60*24) + '일');
	}
	
}

//9.정답 10점
function domTest09(){
	var doc=document.forms[0];
	var vals=[doc.id.value, doc.pw.value, doc.addr.value, doc.phone.value];
	var table=document.createElement("table");
	var tableParent = document.getElementById('domTable');
	var tableList = tableParent.getElementsByTagName('table');
	
	for ( var i = 0; i < 1; i++) {
		var tr=document.createElement("tr");

		for ( var j = 0; j < vals.length; j++) {
			var td=document.createElement("td");
			td.textContent=vals[j];
			td.setAttribute("style", "border: 1px solid black; background-color:yellow;");
			tr.appendChild(td);
		}
		table.appendChild(tr);
	}
	table.setAttribute('style', "border: 1px solid black; width:200px; border-collapse: collapse;")
	
	tableParent.insertBefore(table, tableList[0]);
}

//10.정답 20점















