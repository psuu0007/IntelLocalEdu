package str.answer;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열 메서드를 활용haja하자"; // 기준
		String firstStr = "";
		String secondStr = "";
		String thirdStr = "";
		
//		split()메서드
//		문자열에서 뛰워쓰기 되어있는 각각의 단어를 분리하여 출력하시오
//		(주의: 공백이 없다)
// 		ex: 출력형태 
//		문자열
//		메서드를  
//		활용HAJA하자
		
		String[] strArr = originStr.split(" ");
		
		firstStr = strArr[0];
		secondStr = strArr[1];
		thirdStr = strArr[2].toUpperCase();
		
		System.out.println(originStr);
		System.out.println(firstStr);
		System.out.println(secondStr);
		System.out.println(thirdStr);

	}

}
