<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>	
<meta charset="UTF-8">
<title>ch3_355namelessFncTest1Answer</title>
<style>

</style>
</head>
	
<body>

</body>
<script>
const diceFnc = function() {
	let diceNum = 0;
	let maxDicNum = 0;
	
	for (let i = 0; i < 4; i++) {
		diceNum = Math.floor(Math.random() * 9) + 1;	
		
		if (diceNum > maxDicNum) {
			maxDicNum = diceNum;
		}
		console.log(diceNum);
	}
	
	console.log('최고 숫자: ' + maxDicNum);	
}

diceFnc();

</script>
</html>