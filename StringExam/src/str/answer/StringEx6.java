package str.answer;

public class StringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String passwordOriginStr = "qwer1234"; // 기준
		String passwordChangeStr = "";
		
//		비밀번호를 숨기시오 
// 		ex: 출력형태(8글자라서 8개의 *이 출력됨) 
//		******** 

		int passwordCount = 0;
		passwordCount = passwordOriginStr.length();
		
		for (int i = 0; i < passwordCount; i++) {
			passwordChangeStr = passwordChangeStr + "*";
		}
		
		System.out.println(passwordOriginStr);
		System.out.println(passwordChangeStr);

	}

}
