package str.answer;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열 메서드를 활용haja하자"; // 기준
		String changeStr = "";
		
//		기존의 문자열에서 영어로 적힌 부분들을 모두 대문자화 하여 
//		출력되도록 하시오
// 		ex: 문자열 메서드를 (활용haja하자)
		
		int findIdx = -1;
		String findStr = "haja";
		String tempStr1 = "";
		String tempStr2 = "";
		String tempStr3 = "";
		String frontStr = "";
		
		
		
		findIdx = originStr.indexOf("활용");
		frontStr = originStr.substring(0, findIdx);
		tempStr1 = originStr.substring(findIdx, findIdx + "활용".length());
		tempStr1 = "(" + tempStr1;
//		System.out.println(tempStr1);
		
		findIdx = originStr.indexOf("haja");
		tempStr2 = originStr.substring(findIdx, findIdx + findStr.length());
		tempStr2 = tempStr2.toUpperCase();
//		System.out.println(tempStr2);
		
		findIdx = originStr.indexOf("하자");
		tempStr3 = originStr.substring(findIdx, findIdx + "하자".length());
		tempStr3 = tempStr3 + ")";
//		System.out.println(tempStr3);
		
		
		changeStr = frontStr + tempStr1 + tempStr2 + tempStr3;
//		
//		
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
