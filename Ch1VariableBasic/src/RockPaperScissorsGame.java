import java.util.Scanner;

public class RockPaperScissorsGame {

//	제어문 중에 하나
//	Switch문
//	단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고
//	표현도 간결하므로 알아보기 쉽다
//	경우의 수가 많은 경우라면 if문 보다 스위치문이 나은 선택일 수 있다.
//	기본 구조
//	
//	switch (key) {
//	case value: {
//		
//		yield type;
//	}
//	default:
//		throw new IllegalArgumentException("Unexpected value: " + key);
//	}
	
	public static void main(String[] args) {
		int user, com;
		String userHandStr = "";
		String comHandStr = "";
		
//		의미 치환? 
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력");
		
		Scanner scan = new Scanner(System.in);
		
		user = scan.nextInt(); 
//		0.000000 ~ 0.99999999999  0,1,2
//									1,2,3
		com = (int)(Math.random() * 3) + 1;
//									범위  최소 시작값
//		
//		개발코드와 사용자의 상호작용 사이의 치환 로직
		if(user == 1) {
			userHandStr = "가위";
		}else if(user == 2) {
			userHandStr = "바위";
		}else if(user == 3) {
			userHandStr = "보";
		}
		
		System.out.println("당신은 " + userHandStr + "입니다");
		System.out.println("컴은 " + com + "입니다");
		System.out.println();
		
		switch (user - com) {
			case 2, -1:
				System.out.println("당신이 졌습니다.");
				break;
			case 1, -2:{
				System.out.println("당신이 이겼습니다.");
				break;
			}
				
			case 0: {
				System.out.println("비겼습니다");
				break;
			}
				
		}
		
		System.out.println("프로그램 종료");
		
		scan.close();
	}
	
	
	
	
}
