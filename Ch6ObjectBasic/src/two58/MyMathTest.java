package two58;

public class MyMathTest {

	public static void main(String[] args) {
//		return문
//		현재 실행중인 메서드를 종료하고 호출한 메서드로 되돌아간다.
//		모든 메서드는 적어도 하나 이상의 return문이 반드시 있어야 한다.
//		void 리턴형
		
		MyMath mm = new MyMath();
		int myResult = 0;
//		call
		
		myResult = mm.add(10, 2);
		System.out.println(myResult);
		
		myResult = mm.add(0, 0);
		System.out.println(myResult);
		
		mm.sub(7, 1);
		
//		return;
	}
	
}
