package four14.basic;

public class ExceptionEx2 {

	public static void main(String[] args) {
//		tryCatch문 흐름
		
//		예외가 발생하지 않은 경우
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		
		System.out.println(6);
		
		
	}

}
