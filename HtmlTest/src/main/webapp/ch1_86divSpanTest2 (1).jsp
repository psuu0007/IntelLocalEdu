<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>	
<meta charset="UTF-8">
<title>ch1_86divSpanTest2</title>
<style>
	
	/* title */
	.title {
		font-size: 1.5em;
    margin-block-start: 0.83em;
    margin-block-end: 0.83em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    font-weight: bold;
    unicode-bidi: isolate;
	}
	
	/* tablr common */
	.tableSection, span {
		border:1px solid black;
	  border-collapse: collapse;
	}
	
	/* table */
	.tableSection {
		width: 400px;	
    display: table;
    text-indent: initial;
    unicode-bidi: isolate;
    border-spacing: 2px;
	}
	
	.tableSection .tableBody {
    display: table-row-group;
    vertical-align: middle;
    unicode-bidi: isolate;
    border-color: inherit;
	}
	
	.tableSection .tableBody .row {
		display: table-row;
    vertical-align: inherit;
    unicode-bidi: isolate;
    border-color: inherit;
	}
	
	.tableSection .tableBody .row span {
		display: table-cell;
	}
	
	.tableSection .tableBody .firstRow .primaryColor {
		background-color: graytext;
		font-weight: bold;
		text-align: center;
	}
	
	.tableSection .firstRow .firstCol,
	.tableSection .secondRow .firstCol,
	.tableSection .thirdRow .firstCol,
	.tableSection .fourthRow .firstCol {
		width: 120px;
	}
	
	.tableSection .firstRow .secondCol,
	.tableSection .secondRow .secondCol,
	.tableSection .thirdRow .secondCol,
	.tableSection .fourthRow .secondCol {
		width: 188.844px;
	}
	
	.tableSection .firstRow .thirdCol,
	.tableSection .secondRow .thirdCol,
	.tableSection .thirdRow .thirdCol,
	.tableSection .fourthRow .thirdCol {
		width: 81.156px;
	}
	
	table, th, td {
	  border:1px solid black;
	  border-collapse: collapse;
	}
	
	th {
		background: graytext;
	}
</style>
</head>
	
<body>
<h2>DIV와 SPAN태그를 활용하여 이 html구조를 완벽하게 제현하시오</h2>

<table style="width: 400px;">
  <tr>
    <th style="width: 120px;">Firstname</th>
    <th>Lastname</th> 
    <th>Age</th>
  </tr>
  <tr>
    <td>Jill</td>
    <td>Smith</td>
    <td>50</td>
  </tr>
  <tr>
    <td>Eve</td>
    <td>Jackson</td>
    <td>94</td>
  </tr>
  <tr>
    <td>John</td>
    <td>Doe</td>
    <td>80</td>
  </tr>
</table>

<br />

<div class="title">DIV와 SPAN태그를 활용하여 이 html구조를 완벽하게 제현하시오</div>

<div class="tableSection">
	<div class="tableBody">
	
		<div class="row firstRow">
			<span class="primaryColor firstCol">Firstname</span>
			<span class="primaryColor secondCol">Lastname</span>
			<span class="primaryColor thirdCol">Age</span>
		</div>
		
		<div class="row secondRow">
			<span class="firstCol">Jill</span>
			<span class="secondCol">Smith</span>
			<span class="thirdCol">50</span>
		</div>
		
		<div class="row thirdRow">
			<span class="firstCol">Eve</span>
			<span class="secondCol">Jackson</span>
			<span class="thirdCol">94</span>
		</div>
		
		<div class="row fourthRow">
			<span class="firstCol">John</span>
			<span class="secondCol">Doe</span>
			<span class="thirdCol">80</span>
		</div>
		
	</div>
</div>
</body>
</html>