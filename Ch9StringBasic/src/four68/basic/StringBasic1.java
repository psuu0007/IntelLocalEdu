package four68.basic;

public class StringBasic1 {

	public static void main(String[] args) {
//		기본타입
		int iVal = 100;
		
		String numStr = String.valueOf(iVal) + 234;
//		System.out.println(numStr);
		
		double dVal = 200.0;
		String douStr = String.valueOf(dVal);
//		System.out.println(douStr);
		
		long lVal = 300L;
		String longNumStr = lVal + "";
		
//		객체 타입을 기본형 타입으로 변경해준다
		double sum = Integer.parseInt(numStr) + Double.parseDouble(douStr);
		
		System.out.println(longNumStr);
		
		System.out.println(numStr + " + " + douStr + " = " + sum);
		
//		기본형 값을 래퍼 클래스의 객체로 자동 변환해주는 것을 오토박싱(autoboxing)이라 하고
//		반대로 변환하는 것을 언박싱(unboxing)이라고 한다
		int n = 5;
		Integer iObj = new Integer(7);
		
//		언박싱
		n = n + iObj;
//		위의 코드는 컴파일 후에 아래와 같은 코드로 작동됨
		n = n + iObj.intValue();
		
		// 오토박싱
		iObj = n + iObj.intValue();
//		위의 코드는 컴파일 후에 아래와 같은 코드로 작동됨
		iObj = Integer.valueOf(n) + iObj;
		
	}
	
}
