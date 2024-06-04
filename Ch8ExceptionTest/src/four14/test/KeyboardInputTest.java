package four14.test;

import java.util.Scanner;

public class KeyboardInputTest {

	public static void main(String[] args) {
		
		int userInputNum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키보드로 숫자만 입력");
		userInputNum = scanner.nextInt();
		
		
		System.out.println(userInputNum);
		
		
//		숫자만 입력해주세요
		
		System.out.println("프로그램 정상 종료");
		
	}
	
}
