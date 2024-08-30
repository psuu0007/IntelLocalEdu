<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
   
<html>
<head>
<meta charset='UTF-8'>
<title>회원정보 수정</title>

<script type="text/javascript">
	function pageMoveListFnc() {
		location.href = "./list";
	}
	
	function pageMoveMemberDeleteFnc(memberId) {
		let url = "/member/delete/" + memberId;
		
		fetch(url, {
			method: 'DELETE'
		})
		.then(function(response) {
// 			return response.json();
			if(response.ok){
				
				return response.text();
				
			}else{
				throw new Error('회원삭제 실패 했네');
			}
		}).then(function(data) {
// 			alert(data);
					
			location.href = './list';
		}).catch(function(error){
			alert(error.message || '회원삭제 시 통신에 문제 발생');
		});
		
	}
</script>

</head>

<body>

	<jsp:include page="/WEB-INF/views/Header.jsp"/>

	<h1>회원정보</h1>
	<form action='./update' method='post'>
		<div>
			<label for="memberNo">번호</label>
			<input type='text' id='memberNo' name='memberNo' value='${memberVo.memberNo}' 
				readonly="readonly">
		</div>
		<div>
			<label for="memberName">이름</label>
			<input type='text' id='memberName' name='memberName' value='${memberVo.memberName}'>
		</div>
		<div>
			<label for="email">이메일</label>
			<input type='text' id='email' name='email' value='${memberVo.email}'>
		</div>
		<div>
			<label for="createDate">가입일</label>
			<fmt:formatDate value="${requestScope.memberVo.createdDate}" 
				pattern="yyyy-MM-dd hh:mm:ss"/> 
		</div>
		<div>
			<input type='submit' value='저장'>
			<input type='button' value='삭제' 
            	onclick='pageMoveMemberDeleteFnc(${memberVo.memberNo});'>
			<input type='button' value='회원목록으로 이동' onclick='pageMoveListFnc();'>
		</div>
		
	</form>

	<jsp:include page="/WEB-INF/views/Tail.jsp"/>
</body>
</html>
