package str.answer;

public class StringEx9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "Hello Asia.java"; // 기준
		int strCount = 0; // 결과

//		문자열 안에 a가 몇 개 존재하는지 출력하시오

		char findStr = 'a';
		
		for (int i = 0; i < originStr.length(); i++) {
			if(originStr.charAt(i) == findStr) {
				strCount++;
			}
		}

		System.out.println(originStr);
		System.out.println("갯수: " + strCount);

	}

}
