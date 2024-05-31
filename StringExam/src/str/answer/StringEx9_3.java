package str.answer;

public class StringEx9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "He is a good bTS fan. He like bTS can run as fast as me bTS."; // 기준
										 
//		문자열 안에 2번째 bTs만 BTS로 변경하시오

		String frontStr = "";
		String endStr = "";
		String changeStr = "";
		String resultStr = "";
		
		String findStr = "bTS";
		int strIndex = 0;
		int searchCnt = 0; 
		
		
		for(int i=0; i<2; i++)  {
			strIndex = originStr.indexOf(findStr, strIndex) + 1;
			
			if(strIndex == -1) {
				break;
			}
			
			searchCnt++;
			
			if(searchCnt == 2) {
				strIndex = strIndex - 1;
				frontStr = originStr.substring(0, strIndex);
				endStr = originStr.substring(strIndex + findStr.length());
				changeStr = "BTS";
				resultStr = frontStr + changeStr + endStr;
			}
			
		}

		System.out.println(originStr);
		System.out.println(resultStr);
		

	}

}
