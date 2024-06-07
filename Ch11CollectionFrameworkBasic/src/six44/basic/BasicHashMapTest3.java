package six44.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicHashMapTest3 {

	public static void main(String[] args) {
		
		HashMap<String, String> userInfoMap = new HashMap<String, String>();
		
		userInfoMap.put("myId", "1234");
		userInfoMap.put("log", "qwer");
		userInfoMap.put("dog", "asdf");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력");
			System.out.print("id: ");
			String idStr = scan.nextLine().trim();
			
			System.out.print("pwd: ");
			String pwdStr = scan.nextLine().trim();
			System.out.println();
			
			if(userInfoMap.containsKey(idStr) == false) {
				System.out.println("입력하신 id는 존재하지 않습니다");
				System.out.println("다시 입력해주세요");
				
				continue;
			}else {
				if(userInfoMap.get(idStr).equals(pwdStr) == false) {
					System.out.println("비밀번호가 일치하지 않습니다");
					System.out.println("다시 입력해주세요");
				}else {
					System.out.println("id와 비밀번호가 일치합니다");
					System.out.println("로그인 되었습니다");
					break;
				}
			}
		}
		
		
	}
	
}
