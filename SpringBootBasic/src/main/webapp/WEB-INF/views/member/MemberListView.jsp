<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>회원 목록</title>

<style type="text/css">
table, th, tr, td{
	border: 1px solid black;
	border-collapse: collapse;	
}

.aTagStyle{ 
	cursor: pointer;
}

.aTagStyle:hover {
	color: white;
	text-decoration: underline;
	background: OrangeRed;
}
</style>

<script type="text/javascript">
	function pageMoveFreeBoardDetailFnc(tableTdTag) {
// 		alert(tableTdTag);
		
		let parentTr = tableTdTag.parentNode;
		
		let memberNoStr = parentTr.children[0].textContent;
		
		console.log(memberNoStr);
		
		let memberNoObj = document.getElementById('memberNo');
		memberNoObj.value = memberNoStr;
		
		let memberSelectOneFormObj = document.getElementById('memberSelectOneForm');
		memberSelectOneFormObj.submit();
	}
</script>

</head>


<body>

	<jsp:include page="/WEB-INF/views/Header.jsp"/>
	
	<h1>회원 목록</h1>
	
	<p>
		<a href="./add">신규 회원 등록</a>
	</p>
	
	<div>
		<form id="pagingForm" action="./list" method="get">
			<select name="searchOption">
			<c:choose>
				<c:when test="${searchMap.searchOption == 'all'}">
					<option value="all" selected="selected">이름+이메일</option>
					<option value="memberName">이름</option>
					<option value="email">이메일</option>
				</c:when>
				<c:when test="${searchMap.searchOption == 'memberName'}">
					<option value="all">이름+이메일</option>
					<option value="memberName" selected="selected">이름</option>
					<option value="email">이메일</option>
				</c:when>
				<c:when test="${searchMap.searchOption == 'email'}">
					<option value="all">이름+이메일</option>
					<option value="memberName">이름</option>
					<option value="email" selected="selected">이메일</option>
				</c:when>
			</c:choose>
			</select>
			<input type="text" name="keyword" value="${searchMap.keyword}"
				placeholder="회원명 or 이메일 검색">
			<input type="submit" value="검색">
		</form>
	</div>
	
	<table>
		<tr>
			<th>번호</th><th>이름</th>
			<th>이메일</th><th>생성일</th><th>비고[삭제]</th>
		</tr>
	
	<c:choose>
	
		<c:when test="${not empty memberList}">
	
			<c:forEach var="memberVo" items="${memberList}">
		<tr>
			<td>${memberVo.memberNo}</td>
			<td>${memberVo.memberName}</td>
			<td class="aTagStyle" onclick="pageMoveFreeBoardDetailFnc(this);">
				${memberVo.email}
			</td>
			<td>
				<fmt:formatDate value="${memberVo.createdDate}" 
					pattern="yyyy년 MM월 dd일 HH:mm:ss" />
			</td>
			<td>
				<a href='./delete?memberNo=${memberVo.memberNo}'>[삭제]</a>
			</td>
		</tr>
			</c:forEach>
		</c:when>
	
		<c:otherwise>
		<tr>
			<td colspan="5">회원이 존재하지 않습니다</td>
		</tr>
		</c:otherwise>
	
	</c:choose>
	</table>
	
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>
	<form id="memberSelectOneForm" action="./detail" method="get">
		<input type="hidden" id="memberNo" name="memberNo" value="">
	</form>

</body>
</html>