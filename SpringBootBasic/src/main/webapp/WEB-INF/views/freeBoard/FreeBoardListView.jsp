<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>자유게시판 목록</title>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<style type="text/css">
table, tr, th, td{
	border: 1px solid black;
	border-collapse: collapse;
}

tr > th{
	background: gray;
}

.aTagStyle{
	cursor: pointer;
}

.aTagStyle:hover {
	color: lightgreen;
	background: gray;
}

#container{ 
	border: 1px solid black;
}

#container > tr{
	width: 980px;
}

.tableSubject{
	width: 245px;
	background-color: gray;
}

.tableValue{
	width: 245px;
}

</style>

<script type="text/javascript">
	function storeFileMakeUlFnc(freeBoardFileList) {
		const storeFileListUl = $('#storeFileList');
		
		storeFileListUl.html('');
		let listItem = null;
		if(freeBoardFileList.length == 0){
			listItem = $('<li>저장된 파일이 없습니다.</li>');
			
			storeFileListUl.html(listItem);
			return;
		}
		
		var liHtmlStr = '';
		for (let i = 0; i < freeBoardFileList.length; i++) {
			listItem = document.createElement('li');
			
			liHtmlStr = freeBoardFileList[i].originalFileName
			+ '&nbsp;&nbsp;'
			+ freeBoardFileList[i].freeBoardFileSize + '(kb)'
			+ '<img alt="image not found" src="/img/' 
			+ freeBoardFileList[i].storedFileName 
			+ '" style="width: 150px;" fileId="'
			+ freeBoardFileList[i].freeBoardFileId+'"/>'
			+ '<span><input type="button" value="수정">'
			+ '<input type="button" value="삭제" id="imgFileDel'+i+'"></span>';
			
			listItem.innerHTML = liHtmlStr;
			storeFileListUl.append(listItem);
		}
		
		$('input[id^="imgFileDel"]').on('click', function (e) {
			e.preventDefault();
			
			var parentLi = $(this).closest('li');
			var imgTag = parentLi.find('img');
			
			parentLi.html('<span delFileId="' 
				+imgTag.attr('fileId') + '">이미지가 삭제되었습니다</span>');
		});	
	} // 파일 ui제작 함수 end
	

	$(document).ready(function () {
// 		alert('???');
		
		// 게시판 추가 화면
		$('#aFreeBoardInsert').on('click', function(event) {
			var myObj = $(this);
			
			event.preventDefault();
			
			let containerTag = $('#container');
			let htmlStr = '';
			
			htmlStr += '<table style="width: 1000px;">';
			
			htmlStr += '<tr>';
			htmlStr += '<td class="tableSubject">주제</td>';
			htmlStr += '<td style="width: 735px;">';
			htmlStr += '<input type="text" id="freeBoardTitle" name="freeBoardTitle" ';
			htmlStr += 'value="" size="100px">';
			htmlStr += '</td>';
			htmlStr += '</tr>';
			
			htmlStr += '<tr>';
			htmlStr += '<td style="width: 980px;" colspan="2">';
			htmlStr += '<textarea id="freeBoardContent" name="freeBoardContent" ';
			htmlStr += 'rows="10" cols="100" style="width: 990px;">';
			htmlStr += '</textarea>';
			htmlStr += '</td>';
			htmlStr += '</tr>';
			
			htmlStr += '</table>';
			
	htmlStr += '<div id="fileContainer" style="border: 1px solid black;">';
	htmlStr += '<label for="inputFreeBoardFile">파일</label>';
	htmlStr += '<input type="file" id="inputFreeBoardFile" name="freeBoardFileList"';
	htmlStr += ' multiple>';
	htmlStr += '<ul id="fileList" class="fileUploadList"></ul>';
	htmlStr += '</div>';
	
	htmlStr += '<div>';
	htmlStr += '<span>';
	htmlStr += '<button onclick="pageMoveFreeBoardListFnc(1);">이전페이지</button>';
	htmlStr += '<button id="btnFreeBoardInsert">작성완료</button>';
	htmlStr += '</span>';
	htmlStr += '</div>';
			
			containerTag.html(htmlStr);
			
			const inputFreeBoardFile = document.getElementById('inputFreeBoardFile');
			const fileListUl = document.getElementById('fileList');
			
			inputFreeBoardFile.addEventListener('change', function(e) {
				fileListUl.innerHTML = '';
				for (let i = 0; i < inputFreeBoardFile.files.length; i++) {
					let listItem = document.createElement('li');
					listItem.innerHTML = inputFreeBoardFile.files[i].name 
						+ '&nbsp;&nbsp;'
						+ inputFreeBoardFile.files[i].size + '(byte)';
					fileListUl.appendChild(listItem);
				}
			}); // 이벤트 등록 끝
			
		});
		
// 		동적 이벤트 등록?
		// 게시판 추가 버튼 작동
		$('#container').on('click', '#btnFreeBoardInsert', function(event) {
			event.preventDefault();
					
			
			var inputMemberNoTag = $('#inputMemberNo');
			var freeBoardTitleTag = $('#freeBoardTitle');
			var freeBoardContentTag = $('#freeBoardContent');
			
			const inputFreeBoardFileArr 
				= $('#inputFreeBoardFile')[0].files;
			
			var formDataObj = new FormData();
			
			formDataObj.append('freeBoardId', 0);
			formDataObj.append('memberNo', inputMemberNoTag.val());
			formDataObj.append('freeBoardTitle', freeBoardTitleTag.val());
			formDataObj.append('freeBoardContent'
				, freeBoardContentTag.val());
			
// 			var jsonDataObj = {
// 				freeBoardId: 0,
// 				memberNo: inputMemberNoTag.val(),
// 				freeBoardTitle: freeBoardTitleTag.val(),
// 				freeBoardContent: freeBoardContentTag.val(),
// 				createDate: null,
// 				updateDate: null
// 			};

// 			파일 데이터 추가 처리
			if(inputFreeBoardFileArr.length > 0){
				for (var i = 0; i < inputFreeBoardFileArr.length; i++) {
					formDataObj.append('inputFreeBoardFileArr' + i
						, inputFreeBoardFileArr[i]);
				}
			}
			
			$.ajax({
				url: '/freeBoard/',
				method: 'POST',
// 				contentType: 'application/json', 제이슨은 파일처리 안됨
				contentType: false,
				// jquery에서 브라우저가 자동으로 content-type을 설정하도록 함
				processData: false,
				data: formDataObj,
				success: function (data) {
					alert('166줄: 드디어 파일 추가 될려나? ' + data);
					location.href = './list';
				},
				error: function(xhr, status) {
					alert(xhr.status);
					alert(status);
				}
			}); // ajax end
			
		});
		
	}); // onload
	
// 	자유게시판 수정 form 화면 이동 혹은 생성
	function restRequestFreeUpdateFnc(tableTdTag) {
		let tableTdTagObj = $(tableTdTag);
		
		let parentTr = tableTdTagObj.parent();
		let freeBoardIdStr = parentTr.children().eq(0).text();
// 		alert('freeBoardIdStr: ' + freeBoardIdStr);
		
		var curPageInput = $('#curPage');
		
		$.ajax({
			url: '/freeBoard/' + freeBoardIdStr + '?curPage=' + curPageInput.val(),
			method: 'GET',
			dataType: 'json',
			success: function (data) {
// 				alert('일단 여기 도착하나? '+ data);
				var freeBoardVo = data.freeBoardVo;
				var freeBoardFileList = data.freeBoardFileList;
				var curPageStr = data.curPage;
				
				console.log('curPageStr: ' + curPageStr);
				
				let createDate = new Date(freeBoardVo.createDate)
					.toLocaleString('ko-KR', {
					year: 'numeric',
					month: '2-digit',
					day: '2-digit',
					hour: '2-digit',
					minute: '2-digit',
					second: '2-digit'
				});
				
				
				
				let containerTag = $('#container');
				let htmlStr = '';
				
				htmlStr += '<table style="width: 1000px;">';
				
				htmlStr += '<tr>';
				htmlStr += '<td class="tableSubject">주제</td>';
				htmlStr += '<td style="width: 735px;" colspan="3">';
				htmlStr += '<input type="text" id="freeBoardTitle" name="freeBoardTitle" ';
				htmlStr += 'value="'+freeBoardVo.freeBoardTitle+'" size="100px">';
				htmlStr += '</td>';
				htmlStr += '</tr>';
				
				htmlStr += '<tr>';
				htmlStr += '<td class="tableSubject">작성자</td>';
				htmlStr += '<td class="tableValue">'+freeBoardVo.memberName+'</td>';
				htmlStr += '<td class="tableSubject">게시판 번호</td>';
				htmlStr += '<td class="tableValue">';
					
		htmlStr += '<input type="text" id="freeBoardId" name="freeBoardId"';
			htmlStr += 'value="'+freeBoardVo.freeBoardId+'" readonly="readonly">';
				htmlStr += '</td>';
				htmlStr += '</tr>';
				
				htmlStr += '<tr>';
				htmlStr += '<td class="tableSubject">이메일</td>';
				htmlStr += '<td class="tableValue">'+freeBoardVo.email+'</td>';
				htmlStr += '<td class="tableSubject">작성일자</td>';
				htmlStr += '<td class="tableValue">';
				htmlStr += createDate;
				htmlStr += '</td>';
				htmlStr += '</tr>';
				
				htmlStr += '<tr>';
				htmlStr += '<td style="width: 980px;" colspan="4">';
		htmlStr += '<textarea id="freeBoardContent" name="freeBoardContent"';
				htmlStr += ' rows="10" cols="100" style="width: 990px;">';
				htmlStr += '</textarea>';
				htmlStr += '</td>';
				htmlStr += '</tr>';
				
				htmlStr += '</table>';
				
	htmlStr += '<div id="fileContainer" style="border: 1px solid black;">';
	htmlStr += '<label for="inputFreeBoardFile">파일</label>';
	htmlStr += '<input type="file" id="inputFreeBoardFile" name="freeBoardFileList"';
	htmlStr += ' multiple>';
	htmlStr += '<ul id="storeFileList" class="fileUploadList"></ul>';
	htmlStr += '</div>';
	
	// 권한의 여부
	var inputSessionMemberNoTag = $('#inputMemberNo');
	
	if(freeBoardVo.memberNo == inputSessionMemberNoTag.val()){
		htmlStr += '<div>';
		htmlStr += '<span>';
	htmlStr += '<button onclick="pageMoveFreeBoardListFnc('+curPageStr+');">이전페이지</button>';
	htmlStr += '<button onclick="restRequestFreeBoardUpdateCtrFnc();">';
		htmlStr += '수정완료</button>';
		
		htmlStr += '<input type="button" value="삭제하기" ';
		htmlStr += 'onclick="restRequestFreeBoardDeleteCtrFnc('
				+ freeBoardVo.freeBoardId + ', ' + freeBoardVo.memberNo + ', ' 
				+ curPageStr + ');">';
				
		htmlStr += '</span>';
		htmlStr += '</div>';
	}else{
		htmlStr += '<div>';
		htmlStr += '<span>';
	htmlStr += '<button onclick="pageMoveFreeBoardListFnc('+curPageStr+');">이전페이지</button>';
		htmlStr += '</span>';
		htmlStr += '</div>';
	}
				containerTag.html(htmlStr);
				
				let freeBoardContentTag = $('#freeBoardContent');
				freeBoardContentTag.text(freeBoardVo.freeBoardContent);
				
				storeFileMakeUlFnc(freeBoardFileList);
				
			const inputFreeBoardFile 
				= document.getElementById('inputFreeBoardFile');
			const fileListUl = document.getElementById('fileList');
			inputFreeBoardFile.addEventListener('change', function(e) {
				fileListUl.innerHTML = '';
				for (let i = 0; i < inputFreeBoardFile.files.length; i++) {
					let listItem = document.createElement('li');
					listItem.innerHTML = inputFreeBoardFile.files[i].name 
						+ '&nbsp;&nbsp;'
						+ inputFreeBoardFile.files[i].size + '(byte)';
					fileListUl.appendChild(listItem);
				}
			}); // 이벤트 등록 끝
			},
			error: function(xhr, status) {
				alert(xhr.status);
				alert(status);
			}
		}); // ajax end
		
	}
	
// 	자유게시판 db 정보 수정
	function restRequestFreeBoardUpdateCtrFnc() {
		
		var inputMemberNoTag = $('#inputMemberNo');
		var freeBoardIdTag = $('#freeBoardId');
		var freeBoardTitleTag = $('#freeBoardTitle');
		var freeBoardContentTag = $('#freeBoardContent');
		
		var formDataObj = new FormData();
		
		formDataObj.append('freeBoardId', freeBoardIdTag.val());
		formDataObj.append('memberNo', inputMemberNoTag.val());
		formDataObj.append('freeBoardTitle', freeBoardTitleTag.val());
		formDataObj.append('freeBoardContent', freeBoardContentTag.val());
		
		var storeFileListUl = $('#storeFileList');
		console.log(storeFileListUl);
		
		// 이미지를 삭제할 예정인 데이터 수집
		storeFileListUl.find('span[delFileId]').each(function (index, item) {
			formDataObj.append('delFreeBoardFileIdList', $(item).attr('delFileId'));
		});
		
		// 새롭게 생긴 파일들 데이터 수집
		const inputFreeBoardFileArr = $('#inputFreeBoardFile')[0].files;
		
		if(inputFreeBoardFileArr.length > 0){
			for (var i = 0; i < inputFreeBoardFileArr.length; i++) {
				formDataObj.append('inputFreeBoardFileArr' + i
					, inputFreeBoardFileArr[i]);
			}
		}
		
		$.ajax({
			url: '/freeBoard/' + freeBoardIdTag.val(),
			method: 'PATCH',
			processData: false,
			contentType: false,
			data: formDataObj,
			success: function (resultMap) {
// 				alert('386line: 일단 게시판 수정 도착하나? '+ resultMap);
				var freeBoardVo = resultMap.freeBoardVo;
				var freeBoardFileList = resultMap.freeBoardFileList;
				
				let createDate = new Date(freeBoardVo.createDate)
					.toLocaleString('ko-KR', {
					year: 'numeric',
					month: '2-digit',
					day: '2-digit',
					hour: '2-digit',
					minute: '2-digit',
					second: '2-digit'
				});
				
				let containerTag = $('#container');
				
				let htmlStr = `
				
	<table style="width: 1000px;">
	  <tr>
	    <td class="tableSubject">주제</td>
	    <td style="width: 735px;" colspan="3">
	      <input type="text" id="freeBoardTitle" name="freeBoardTitle" 
	      	value="\${freeBoardVo.freeBoardTitle}" size="100px" />
	    </td>
	  </tr>
	  
	  <tr>
	    <td class="tableSubject">작성자</td>
	    <td class="tableValue">\${freeBoardVo.memberName}</td>
	    <td class="tableSubject">게시판 번호</td>
	    <td class="tableValue">
	      <input id="freeBoardId" name="freeBoardId" 
	      	value="\${freeBoardVo.freeBoardId}" readonly="readonly" />
	    </td>
	  </tr>
	  
	  <tr>
	    <td class="tableSubject">이메일</td>
	    <td class="tableValue">\${freeBoardVo.email}</td>
	    <td class="tableSubject">작성일자</td>
	    <td class="tableValue">\${createDate}</td>
	  </tr>
	  
	  <tr>
	    <td style="width: 980px;" colspan="4">
	      <textarea id="freeBoardContent" name="freeBoardContent" 
	      	rows="10" cols="100" style="width: 990px;">
	      	</textarea>
	    </td>
	  </tr>
	</table>
	
	<div id="fileContainer" style="border: 1px solid black;">
	    <label for="inputFreeBoardFile">파일</label>
	    <input type="file" id="inputFreeBoardFile" name="freeBoardFileList" multiple>
	    <ul id="fileList" class="fileUploadList"></ul>
	    <ul id="storeFileList" class="fileUploadList"></ul>
	</div>
	
	<div>
	  <span>
	    <button onclick="pageMoveFreeBoardListFnc(1);">이전페이지</button>
	    <button onclick="restRequestFreeBoardUpdateCtrFnc();">수정 완료</button>
		<input type="button" value="삭제하기" 
			onclick="restRequestFreeBoardDeleteCtrFnc(\${freeBoardVo.freeBoardId}
			, \${freeBoardVo.memberNo}, 1);">
	  </span>
	</div>
	`;
				
				containerTag.html(htmlStr);
				
				let freeBoardContentTag = $('#freeBoardContent');
				freeBoardContentTag.text(freeBoardVo.freeBoardContent);
				
				storeFileMakeUlFnc(freeBoardFileList);
				
			},
			error: function(xhr, status) {
				console.log(xhr.status);
				console.log(status);
				
				var errorMessage = xhr.responseJSON ? xhr.responseJSON.errorMsg :
					'알 수 없는 오류가 발생했습니다.';
				alert('오류: ' + errorMessage);
			}
		}); // ajax end
		
	}
	

	function restRequestFreeBoardDeleteCtrFnc(freeBoardId, memberNo, curPageStr) {
		$.ajax({
			url : '/freeBoard/' + freeBoardId + '?memberNo=' + memberNo 
				+ '&curPage=' + curPageStr,
			method : 'DELETE',
			dataType : 'text',
			success : function (data) {
				alert("성공 485line: " + data);
				
				var curPage = data;
				
				location.href = './list' + '?curPage=' + curPage;
			},
			error : function(xhr, status) {
				console.log(xhr.status);
				alert(status);
			}
		});	
		
	}
	
	
</script>

</head>


<body>


	<jsp:include page="/WEB-INF/views/Header.jsp"/>
	
	<div id="container">
	
		<h1>자유게시판 목록</h1>
		<p>
			<a id="aFreeBoardInsert" href="#">자유게시판 글쓰기</a>
		</p>
		
		
		<table>
			<tr>
				<th>번호</th><th>주제</th><th>작성자</th>
				<th>생성날짜</th><th>수정날짜</th><th>비고[삭제]</th>
			</tr>
		<c:forEach var="freeBoardVo" items="${freeBoardList}">
			<tr>
				<td>${freeBoardVo.freeBoardId}</td>
				<td class='aTagStyle' onclick="restRequestFreeUpdateFnc(this);">
					${freeBoardVo.freeBoardTitle}
				</td>
				<td>${freeBoardVo.memberName}</td>
				<td>${freeBoardVo.createDate}</td>
				<td>${freeBoardVo.updateDate}</td>
				<td style="text-align: center;">[삭제]</td>
			</tr>
		</c:forEach>	
		</table>
		
		<jsp:include page="/WEB-INF/views/common/Paging.jsp">
			<jsp:param value="${pagingMap}" name="pagingMap"/>
		</jsp:include>
	
		<form id='pagingForm' action="./list" method="post">
			<input type="hidden" id='curPage' name="curPage"
			value="${pagingMap.pagingVo.curPage}">
		</form>
	
	</div>
	
	
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>
	<form id='freeBoardListForm' action="./list" method="post">
		<input id='userSelectFreeBoardId' type="hidden" 
			name="freeBoardId" value="">
	
	</form>
	
</body>
</html>