<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_388mapAndFilterBasic1.jsp</title>

<style type="text/css">
</style>
<script type="text/javascript">
	/*
		- Array.filter() 
			
			주어진 함수 테스트를 통과하는(true를 반환하는) "모든 요소"를 "새로운 배열로 반환"한다.
			모든 요소가 테스트를 통과하지 못하면(false를 반환) "빈 배열을 반환"한다.
	
			* 조건문과 유사	
	
			
		- Array.map()
		
			대상 배열의 길이만큼 주어진 함수를 실행한다. 
			주어진 함수의 반환 값을 모아 "새로운 배열을 반환"한다.
					
	*/
	
	let numList = [1, 2, 3, 4, 5];
	
	/* 
	- elt: 
		현재 처리 중인 배열의 요소
		배열의 i번째 값 
		=> 배열을 순회하며 각 요소가 이 매개변수로 전달됨
	
	- i: 
		현재 처리 중인 요소의 인덱스(index)
		=> 배열을 순회하며 각 요소의 위치를 나타냄
		
	- array: 
		현재 처리 중인 배열 자체를 참조(일반적으로 사용하는 경우는 드뭄)
		함수 내에서 원본 배열의 다른 요소에 접근해야 할 때 유용하며,
		현재 처리 중인 배열의 길이나 다른 속성을 확인할 때 사용할 수 있음
	
	- context(thisArg):
		함수 내에서 this로 사용될 값을 지정 == 바인딩(일반적으로 사용하는 경우는 드뭄)
		특정 객체의 메서드나 속성에 접근해야 할 때 유용
	*/

	/*
	const numListFilering = numList.filter(function(elt, i, array) {
		if (elt > 3) return true;
	});
	
	document.write(numListFilering);
	*/
	
	/*
	const mulNumList = numList.map(function(elt, i, array) {
		return elt * 10;
	});
		
	document.write(mulNumList);
	*/
	
	/*
	const finallyList = numList
		.filter(function(elt, i, array) {
			if (elt > 3) return true;
		})
		.map(function(elt, i, array) {
			return elt * 10;
		});
	
	document.write(finallyList);
	*/
	
	

	// function abc() return 10; // 함수 선언문
	
	// const edf = function() {}; // 함수 표현식
	
	// 화살표 함수
	// const aaa = () => {};
	
	// 호이스팅: 함수 선언부가 유효범위 최상단으로 끌어올려지는 현상, 함수 선언(문)에서만 발생
	
	const finallyList2 = numList
		.filter(elt => elt > 3)
		.map(elt => elt * 10);
	
	document.write(finallyList2);
	
	
</script>

</head>


<body>


</body>

</html>