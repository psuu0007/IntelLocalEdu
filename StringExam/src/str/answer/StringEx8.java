package str.answer;

public class StringEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "2022/07/27"; // 기준
		String changeStr = "";
		
		int beforeCharPosition = 0;
		int afterCharPosition = 0;
		String tempYyyyStr = "";
		String tempMmStr = "";
		String tempDdStr = "";
		
//		날짜를 아래와 같이 출력하시오 
// 		ex: 출력형태 
//		2022/07/27
//		2022년07월27일 

		afterCharPosition = originStr.indexOf("/");
//		System.out.println(afterCharPosition);
		tempYyyyStr = originStr.substring(beforeCharPosition, afterCharPosition) 
			+ "년";
//		System.out.println(tempYyyyStr);
		
		beforeCharPosition = afterCharPosition + 1;
		
		afterCharPosition = originStr.indexOf("/", beforeCharPosition+1);
//		System.out.println(afterCharPosition);
		tempMmStr = originStr.substring(beforeCharPosition, afterCharPosition) 
			+ "월";
//		System.out.println(tempYyyyStr);
		
		beforeCharPosition = afterCharPosition + 1;
		
		afterCharPosition = originStr.length();
//		System.out.println(afterCharPosition);
		tempDdStr = originStr.substring(beforeCharPosition, afterCharPosition) 
			+ "일";
//		System.out.println(tempYyyyStr);
		
		changeStr = tempYyyyStr + tempMmStr + tempDdStr;
		
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
