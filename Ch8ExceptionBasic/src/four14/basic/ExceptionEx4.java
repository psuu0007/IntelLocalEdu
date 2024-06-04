package four14.basic;

public class ExceptionEx4 {

	public static void main(String[] args) {

//		예외가 발생하면 발생한 예외에 해당하는 클래스의 인스턴스가 만들어 진다
//		여기서는 NullPointerException이 발생했으므로 널포인터익셉션 인스턴스가 생성된다
//		모든 예외 클래스는 Exception 클래스의 자식이므로
//		catch블럭의 괄호에 Exception클래스를 선언해 놓으면 어떤 종류의 예외가 발생하더라도
//		이 catch블럭에 의해서 처리된다
		

		int[] numArr = null;
		System.out.println(1);
		System.out.println(2);
//		
		try {
			System.out.println(3);
			numArr[0] = 1; // 예외가 발생한 순간 그 이후 코드는 작동 안함
			System.out.println(4); 
//		} catch (ArithmeticException e) {
		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
//			Cannot store to int array because "numArr" is null
			npe.printStackTrace();
//			java.lang.NullPointerException: 
//				Cannot store to int array because "numArr" is null
//			at four14.basic.ExceptionEx4.main(ExceptionEx4.java:20)
			
			System.out.println(5);
		} catch (Exception e) { // 모든 예외 처리 가능
			System.out.println(e.getMessage());
//			Cannot store to int array because "numArr" is null
			e.printStackTrace();
//			java.lang.NullPointerException: 
//			Cannot store to int array because "numArr" is null
//			at four14.basic.ExceptionEx4.main(ExceptionEx4.java:20)
			System.out.println(6);
		}
		
		System.out.println(7);
		
		
	}

}
