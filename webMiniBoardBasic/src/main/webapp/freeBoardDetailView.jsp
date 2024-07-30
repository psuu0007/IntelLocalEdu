<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<td style="width: 735px;" colspan="3">${freeBoardDto}</td>
				
			</tr>
			
			<tr>
				<td class="tableSubject">작성자</td><td class="tableValue"></td>
				<td class="tableSubject">게시번호</td><td class="tableValue"></td>
			</tr>
			<tr>
				<td class="tableSubject">email</td><td class="tableValue"></td>
				<td class="tableSubject">글생성일</td><td class="tableValue"></td>
			</tr>
			<tr>
				<td style="width: 980px;" colspan="4">
					<textarea rows="10" cols="100" style="width: 743px;"></textarea>
				</td>
			</tr>
		</table>
		<div>
			<span><button>이전페이지</button> <button>수정페이지로 이동</button></span>
		</div>
	</div>

</body>
</html>