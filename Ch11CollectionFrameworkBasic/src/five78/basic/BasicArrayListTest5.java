package five78.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BasicArrayListTest5 {

	public static void main(String[] args) {
//		List 정렬 방법
		ArrayList<Integer> numList = new ArrayList<>();
		
		
		for (int i = 0; i < 5; i++) {
			numList.add((int)(Math.random()*100));
		}
		System.out.println(numList);
		
//		오름차순
		Collections.sort(numList);
		System.out.println("오름차순");
		System.out.println("Collections.sort(numList): " + numList);
		
//		내림차순
		Collections.sort(numList, Collections.reverseOrder());
		System.out.println("내림차순");
		System.out.println("Collections.sort(numList, "
			+ "Collections.reverseOrder()): " + numList);
		
		// 오름차순 정렬 (익명 클래스 사용)
		Collections.sort(numList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); // 내림차순으로 정렬
			}
		});

		// 결과 출력
		System.out.println("오름차순");
		System.out.println("Comparator(): " + numList);

		// 내림차순 정렬 (익명 클래스 사용)
		Collections.sort(numList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1); // 내림차순으로 정렬
			}
		});

		// 결과 출력
		System.out.println("내림차순");
		System.out.println("Comparator(): " + numList);

	}

}
