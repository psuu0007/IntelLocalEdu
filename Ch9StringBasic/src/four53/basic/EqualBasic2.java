package four53.basic;

import java.util.Scanner;

public class EqualBasic2 {

	public static void main(String[] args) {
		
//		빈 문자열(empty string)
		String str = "";
//		String str1;
//		String str2 = null;
//		null 일반적인 작동X 다르게 작동
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("하고 싶은 말이 뭐야?");
		str = scanner.nextLine();
		
		
		System.out.println("내가 하고 싶은 말은 그... ");
		System.out.println(str);
		
		if(str.equals("사귈래?")) {
			System.out.println("말로만?");
		}
		
		System.out.println(str.equals("아니야"));
		System.out.println("아니야" == str);
		System.out.println("좋아해" == str);
//		System.out.println("사귈래?" == str);
		
	}
	
	
}
