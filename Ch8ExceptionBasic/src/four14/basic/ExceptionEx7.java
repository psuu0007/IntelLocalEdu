package four14.basic;

//예외 발생시키기
public class ExceptionEx7 {

	public static void main(String[] args) {

		ExceptionEx7Class ex7 = new ExceptionEx7Class();
		
		try {
			ex7.method1();
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
		
//		Unhandled exception type Exception
		try {
			ex7.method2();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
