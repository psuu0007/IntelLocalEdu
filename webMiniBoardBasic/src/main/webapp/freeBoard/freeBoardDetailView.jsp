<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>자유게시판 상세페이지</title>

<style type="text/css">
	table, tr, th, td{
		border: 1px solid black;
		border-collapse: collapse;
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
	window.onload = function () {
		// textarea 문자열 정렬 처리 로직
		let textAreaTag = document.getElementById('textAreaTag');
	//		alert(textAreaTag.textContent);
		textAreaTag.textContent = textAreaTag.textContent.trim();
	};
	
	
</script>

</head>


<body>
	<jsp:include page="/Header.jsp"/>
	
	<div id="container">

		<table style="width: 1000px;">
			<tr>
				<td class="tableSubject">주제</td>
				<td style="width: 735px;" colspan="3">
					${memberFreeBoardDto.freeBoardTitle}
				</td>
				
			</tr>
			
			<tr>
				<td class="tableSubject">작성자</td>
				<td class="tableValue">${memberFreeBoardDto.freeBoardWriter}</td>
				<td class="tableSubject">게시번호</td>
				<td class="tableValue">${memberFreeBoardDto.freeBoardId}</td>
			</tr>
			<tr>
				<td class="tableSubject">email</td>
				<td class="tableValue">${memberFreeBoardDto.email}</td>
				<td class="tableSubject">글생성일</td>
				<td class="tableValue">
				<fmt:formatDate value="${memberFreeBoardDto.createDate}" 
					pattern="yyyy년 MM월 dd일 HH:mm:ss" />
				</td>
			</tr>
			<tr>
				<td style="width: 980px;" colspan="4">
					<textarea id='textAreaTag' rows="10" cols="100" style="width: 990px;">
						${memberFreeBoardDto.freeBoardContent}
					</textarea>
				</td>
			</tr>
		</table>
		<div>
			<span>
				<button onclick="pageMoveFreeBoardListFnc();">이전페이지</button>
				<button>수정페이지로 이동</button>
			</span>
		</div>
	</div>
	
	<jsp:include page="/Tail.jsp"/>
</body>
</html>