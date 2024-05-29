package two62.test;

public class FirstClass5 {

	void firstMethod() {
		secondMethod();
	}
	
	void secondMethod() {
		fourth(200);
	}
	
	void thirdMethod() {
		fourth(300);
	}
	
	void fourth(int n) {
		int temp = n;
		System.out.println(temp + n);
		
	}
	
}
