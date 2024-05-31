package str.exam;

public class StringEx4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열 메서드를 활용haja하자"; // 기준
		String changeStr = "";
		
//		기존의 문자열에서 영어로 적힌 부분들을 모두 대문자화 하여 
//		출력되도록 하시오
// 		ex: 문자열 메서드를 (활용HAJA하자)
		
//		originStr.replace("활용haja하자", "(활용haja하자)");
		
		String[] splitArr = originStr.split(" ");

		changeStr = splitArr[0] + " " + splitArr[1] 
			+ " (" + splitArr[2].toUpperCase() + ")";
		
		
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
