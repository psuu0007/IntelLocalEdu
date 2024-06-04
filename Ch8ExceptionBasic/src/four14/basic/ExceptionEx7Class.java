package four14.basic;

//일반 클래스 
public class ExceptionEx7Class {
	
//	메서드에 예외 선언하기
	void method1() throws ArithmeticException {
		System.out.println(123 / 2);
		System.out.println(123 / 0);
	}

	void method2() throws Exception {
		String str = null;
		
		str.equals("ad");
	}
	
}
