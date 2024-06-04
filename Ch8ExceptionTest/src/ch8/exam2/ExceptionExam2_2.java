package ch8.exam2;
public class ExceptionExam2_2 {
	public static void main(String[] args) {
		boolean b = true;
		b = method(b);
		b = method(b);
	} // main
	static boolean method(boolean b) {
		try {
			System.out.println(1);
			if (b){
				throw new RuntimeException();
			}
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			
			return true;
		} catch (Exception e) {
			System.out.println(4);
			
			return false;
		} finally {
			System.out.println(5);
			return false;
		}
//		System.out.println(6);
	}
}
