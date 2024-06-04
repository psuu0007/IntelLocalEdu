package four14.basic;

public class ExceptionEx5 {

	public static void main(String[] args) {


		int[] numArr = null;
		System.out.println(1);
		System.out.println(2);
//		
		try {
			System.out.println(3);
//			System.out.println(100 / 0); 
//			numArr[0] = 1; 
			System.out.println(4); 
//			멀티 catch블럭
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
			System.out.println(5);
		} catch (Exception e) { // 모든 예외 처리 가능
			System.out.println(6);
		} finally {
			System.out.println("finally");
			System.out.println(7);
		}
		
		System.out.println(8);
		
	}

}
