<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
   
<html>
<head>
<meta charset='UTF-8'>
<title>회원 상세정보</title>

<style type="text/css">
.info-section {
	border: 1px solid #000;
	padding: 10px;
/* 	margin-bottom: 10px; */
}

.info-label {
	font-weight: bold;
}

.info-value {
	margin-left: 10px;
}

.button-section {
	margin-top: 20px;
}
</style>

<script type="text/javascript">
	function pageMoveListFnc() {
		location.href = "./list";
	}
	
	function pageMoveUpdateFnc(no) {
		
		var url = './update?memberNo=' + no; 
		
		location.href = url;
		
	}
	
</script>

</head>

<body>

	<jsp:include page="/WEB-INF/views/Header.jsp"/>
	<h1>회원정보</h1>
	
	<div id='container'>
	
		<div class="info-section">
			<span class="info-label">번호</span>
			<span class="info-value">${memberVo.memberNo}</span>
		</div>
		<div class="info-section">
			<span class="info-label">이름</span>
			<span class="info-value">${memberVo.memberName}</span>
		</div>
		<div class="info-section">
			<span class="info-label">이메일</span>
			<span class="info-value">${memberVo.email}</span>
		</div>
		<div class="info-section">
			<span class="info-label">가입일</span>
			<span class="info-value">
				<fmt:formatDate value="${requestScope.memberVo.createdDate}" 
				pattern="yyyy-MM-dd hh:mm:ss"/>
			</span>
		</div>
		<div class="button-section">
			<button onclick="pageMoveUpdateFnc(${memberVo.memberNo});">
				회원정보 변경하기
			</button>
			<button onclick='pageMoveListFnc();'>회원목록으로 이동</button>
		</div>
	
	</div>	
	
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>
</body>
</html>
