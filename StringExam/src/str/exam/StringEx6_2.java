package str.exam;

public class StringEx6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String passwordOriginStr = "qwer1234"; // 기준
		String passwordChangeStr = "";
		
//		비밀번호를 숨기시오 
// 		ex: 출력형태(8글자라서 8개의 *이 출력됨) 
//		******** 
		
		for (int i = 0; i < passwordOriginStr.length(); i++) {
			//passwordOriginStr.charAt(i);
			if (i < 4) {
				passwordChangeStr = passwordChangeStr + "*";
			}
			else {
				passwordChangeStr = passwordChangeStr 
					+ passwordOriginStr.charAt(i);
			}
			//passwordChangeStr 
//				= passwordChangeStr.replace(passwordOriginStr.charAt(i), '*');
		}
		
		System.out.println(passwordOriginStr);
		System.out.println(passwordChangeStr);

	}

}
