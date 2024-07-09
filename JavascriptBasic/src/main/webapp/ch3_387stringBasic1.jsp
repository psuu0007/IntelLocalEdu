<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_387stringBasic1.jsp</title>

<style type="text/css">
</style>


</head>


<body>


</body>

<script type="text/javascript">
	//charAt()
	var str = 'Javascript'
	console.log(str.charAt(0));
	// indexOf()
	var str = 'Javascript'
	console.log(str.indexOf('a'));
	console.log(str.indexOf('k'));
	// lastIndexOf()
	var str = 'Javascript'
	console.log(str.lastIndexOf('a'));
	// includes()
	var str = 'Javascript';
	console.log(str.includes('script'));
	// substring()
	var str = 'http://icoxpublish.com';
	console.log(str.substring(0, 4));
	console.log(str.substring(7));
	// substr()
	var str = 'http://icoxpublish.com';
	console.log(str.substr(7, 4));
	// split()
	var str = 'Javascript_jQuery';
	var division = str.split('_');
	console.log(division[0] + ', ' + division[1]);
	// replace()
	var str = 'm_out.gif';
	console.log(str.replace('out', 'over'));
	// concat()
	var str1 = 'nav';
	var str2 = '_bg';
	console.log(str1.concat(str2));
	// trim()
	var str = ' removeblank ';
	console.log(str.trim());
	// toLowerCase(), toUpperCase()
	var str = 'LowerCase';
	console.log(str.toLowerCase());
	var str = 'UpperCase';
	console.log(str.toUpperCase());
</script>

</html>