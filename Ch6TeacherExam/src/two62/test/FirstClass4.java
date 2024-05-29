package two62.test;

public class FirstClass4 {

	void firstMethod(int num) {
		secondMethod();
		System.out.println(num);
	}
	
	void secondMethod() {
		System.out.println("secondMethod() 시작");
		thirdMethod();
		System.out.println("secondMethod() 수행");
	}
	
	void thirdMethod() {
		System.out.println("thirdMethod() 수행");
	}
	
}
