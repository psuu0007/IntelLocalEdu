package five78.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicArrayListTest2 {

	public static void main(String[] args) {
		
//		명명규칙
//		num
//		str
//		numArr
//		strArr
//		numList 
//		strList
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			numList.add(i);
		}
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(numList.get(i));
//		}
		
//		확장된 for문 or forEach문
//		출력
		for (int num : numList) {
			System.out.println(num);
		}
		
		
	}
	
}
