package four14.basic;

public class ExceptionEx8 {

	public static void main(String[] args) {
		
		System.out.println(returnTestMethod());
		
	}

	
	static int returnTestMethod() {
		int[] numArr = null;
		System.out.println(1);
		System.out.println(2);
//		
		try {
			System.out.println(3);
//			System.out.println(100 / 0); 
//			numArr[0] = 1; 
			System.out.println(4); 
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(5);
			
			return 9999;   // 현재 실행 중인 메서드를 종료한다
		} catch (Exception e) { // 모든 예외 처리 가능
			System.out.println(6);
		} finally {
			System.out.println("finally");
			System.out.println(7);
		}
		
		System.out.println(8);
		
		
		return 0;
	}
}
