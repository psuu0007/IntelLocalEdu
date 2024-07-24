<%@page import="spms.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>회원 목록</title>

<style type="text/css">

</style>

<script type="text/javascript">

</script>

</head>


<body>
	<p>
		<a href="./add">신규 회원 등록</a>
	</p>
	
	<%
		ArrayList<MemberDto> memberList = 
			(ArrayList<MemberDto>)request.getAttribute("memberList");
		for(MemberDto memberDto : memberList) {
		
	%>
	
	<%=memberDto.getMemberNo() %>,
	<a href='./update?memberNo=<%=memberDto.getMemberNo()%>'>
		<%=memberDto.getMemberName() %>
	</a>,
	<%=memberDto.getEmail() %>,
	<%=memberDto.getCreatedDate() %>,
	<a href='./delete?memberNo=<%=memberDto.getMemberNo()%>'>[삭제]</a>
	<br>
	
	<%
		} // for end
	%>

</body>
</html>