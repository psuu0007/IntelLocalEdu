package two58;

public class MyMath {

//	메서드 표현식
//						매개변수 선언부
//	반환타입 메서드이름(타입 변수명, 타입 변수명, ,,,) {	메서드 선언부
	// 메서드 호출 시 수행될 코드 메서드 구현부(body)

//		반환타입
//	}

	int add(int a, int b) {
//		유효성 검사 validation
		if(a == 0 && b == 0) {
			System.out.println("0과 0은 + 결과는 0입니다.");
			return 0;
		}
		
		int result = a + b;
		
		System.out.println("더하기 메서드 수행됨");
		return result;
	}

	void sub(int a, int b) {
		int result = a + b;

		System.out.println(result);
		
//		return;
//		return result;
	}
	
//	곱하기 void, 나누기 예외? 숫자 / 0 오류 void

}
