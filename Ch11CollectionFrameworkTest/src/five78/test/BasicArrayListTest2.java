package five78.test;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayListTest2 {

	public static void main(String[] args) {

//		2.
//		1~10까지 데이터를 저장하고 

//		출력한다
//		1
//		2
//		3
//		.
//		.
//		10
//		
//		이후 
//		
//		1삭제
//		2삭제
//		10까지 모두 삭제하는 코드를 작성하시오
//		
//		마지막에 
//		리스트의 사이즈: 0이 출력되도록 하시오
		// 1~10까지 데이터 저장 및 순차적으로 출력 후 삭제

		List<Integer> numberList = new ArrayList<>();

		// 넣음 동시 출력
		for (int i = 0; i < 10; i++) {
			numberList.add(i + 1);
			System.out.println(numberList.get(i));
		}

		for (int i = 0; i < 10; i++) {
			numberList.add(i + 1);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(numberList.get(i));
		}

		// 개별 출력
//				for (int number : numberList) {
//					System.out.println(number);
//				}

		// while문 사용 remove

		while (numberList.size() > 0) {
			numberList.remove(0);
		}

		// for문 사용 remove
//		The value of the local variable i is not used
		for (; numberList.size() > 0;) {
			numberList.remove(0);
		}

		System.out.println("리스트의 사이즈: " + numberList.size());

	}

}
