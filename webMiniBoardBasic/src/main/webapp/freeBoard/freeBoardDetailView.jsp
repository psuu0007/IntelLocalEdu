<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
}

.tableValue{
	width: 245px;
}
</style>

<script type="text/javascript">

</script>

</head>


<body>

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
				<fmt:formatDate value="${memberFreeBoardDto.createDate}" pattern="YYYY년MM월DD일 HH24:MI:SS" />
				</td>
			</tr>
			<tr>
				<td style="width: 980px;" colspan="4">
					<textarea rows="10" cols="100" style="width: 743px;">
						${memberFreeBoardDto.freeBoardContent}
					</textarea>
				</td>
			</tr>
		</table>
		<div>
			<span><button>이전페이지</button> <button>수정페이지로 이동</button></span>
		</div>
	</div>

</body>
</html>