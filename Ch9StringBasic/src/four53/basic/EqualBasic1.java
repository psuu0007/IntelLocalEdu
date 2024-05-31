package four53.basic;

public class EqualBasic1 {

	public static void main(String[] args) {
		
		
		String str1 = "문자들";
		String str2 = "문자들";
		
		String str3 = new String("문자들");
		String str4 = new String("문자들");
		
//		클래스
//		주소 비교?
//				다르면 다른것
		System.out.println("str1 == str2 결과: " + (str1 == str2));
		System.out.println("str1 == str3 결과: " + (str1 == str3));
		System.out.println("str1 == str4 결과: " + (str1 == str4));
		
		System.out.println("================================");
		
		System.out.println("str3 == str2 결과: " + (str3 == str2));
		System.out.println("str3 == str4 결과: " + (str3 == str4));
		
		System.out.println("str1.hashCode()");
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println("str2.hashCode()");
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str2));
		System.out.println("str3.hashCode()");
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str3));
		System.out.println("str4.hashCode()");
		System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str4));
		
	}
	
	
}
