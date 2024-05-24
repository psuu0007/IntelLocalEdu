
public class ArrayBasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] testArr = new String[3];
		
		String[] strArr = {"홍", "이순신", "김유신"};
		
//		for (int i = 0; i < 3; i++) {
//			System.out.println(strArr[i]);
//		}
		System.out.println(strArr.length);
		System.out.println("====================");
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
	}

}
