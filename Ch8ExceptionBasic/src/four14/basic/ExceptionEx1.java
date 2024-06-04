package four14.basic;

public class ExceptionEx1 {

	public static void main(String[] args) {

		int n = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
				result = n / (int) (Math.random() * 10);
//				result = n / 0;
				System.out.println(result);

			} catch (ArithmeticException ae) {
				// TODO: handle exception
				System.out.println(0);
				System.out.println("예외 처리 성공");
			}

		}

	}

}
