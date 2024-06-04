package four14.basic;

public class ExceptionEx3 {

	public static void main(String[] args) {
//		tryCatch문 흐름
		
//		예외가 발생한 경우
		int[] numArr = null;
		System.out.println(1);
		System.out.println(2);
//		
		try {
			System.out.println(3);
			numArr[0] = 1; // 예외가 발생한 순간 그 이후 코드는 작동 안함
			System.out.println(4); 
		} catch (NullPointerException npe) {
			System.out.println(5);
		}
		
		System.out.println(6);
		
		
	}

}
