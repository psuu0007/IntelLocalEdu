package five78.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicArrayListTest1 {

	public static void main(String[] args) {
		
//		List list1 = new ArrayList(5);
//		제너릭스 or 지네릭스(Generics)
		List<Integer> list1 = new ArrayList<Integer>(5);
//		int num[] = new int[3];
//		
//		num[1] = 1;
		
//		Type safety: The method add(Object) belongs to the raw type List. 
//		References to generic type List<E> should be parameterized
		list1.add(1);
//		The constructor Integer(int) has been deprecated 권장하지 않는다 
//		since version 9 and marked for removal
		list1.add(new Integer(2));
		list1.add(3);
		list1.add(4);
//		list1.add(234);
		
//		add를 하면 모든 데이터는 Object로 변환된다
//		다형성 원리로 저장
		list1.add(new Integer(5));
		
//		System.out.println(list1);
		
//		int n = (int)list1.get(0);
		int n = list1.get(0);
//		Object obj = list1.get(0);
		
		System.out.println(n);
		
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));

		// 원하는 위치에 추가
		System.out.println("현재 데이터 상태: " + list1);
		list1.add(0, 100);
		list1.add(4, 200);
		System.out.println("수정 후 데이터 상태: " + list1);
		
//		수정?
		System.out.println("현재 데이터 상태: " + list1);
		list1.set(0, 0);
		list1.set(4, 300);
		System.out.println("수정 후 데이터 상태: " + list1);
		
//		삭제?
		System.out.println("현재 데이터 상태: " + list1);
		list1.remove(list1.size()-1);
		list1.remove(0);
		System.out.println("수정 후 데이터 상태: " + list1);
		
//		Collections.sort(list1);
//		System.out.println("수정 후 데이터 상태: " + list1);
		
	}
	
}
