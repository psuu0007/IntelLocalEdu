import java.util.Scanner;

public class SwitchBasic1 {
	public static void main(String[] args) {

//	제어문 중 하나
//	switch문
// 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고	
// 표현도 간결하므로 알아보기 쉽다
//	경우의 수가 많은 경우라면 if문 보다 스위치문이 나은 선택일 수 있다
//	기본구조 
//	switch (key) {
//	case value: {
//		
//		yield type;
//	}
//	default:
//		throw new IllegalArgumentException("Unexpected value: " + key);
//	}
//	
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();
		String grade = "";
		
		switch (score / 10) {
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
		}
		System.out.println("학점:" + grade);

	}

}
