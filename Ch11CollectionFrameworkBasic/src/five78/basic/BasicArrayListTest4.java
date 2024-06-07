package five78.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class BasicArrayListTest4 {

	public static void main(String[] args) {
//		이터레이터의 특징
		ArrayList<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			numList.add(i);
		}
		
		Iterator it = numList.iterator();
		
		while(it.hasNext()) {
			Object obj = null;
			obj = it.next();
			int num = (int)obj;
			
			System.out.println(num);
		}
		
		System.out.println(it.hasNext());
		
		while(it.hasNext()) {
			System.out.println("?????");
		}

		System.out.println("=============");
		System.out.println("현재 numList 크기: " + numList.size());
		
		while(numList.size() != 0) {
			numList.remove(numList.size()-1);
		}
		
		System.out.println("remove 후 numList 크기: " + numList.size());
		
		if(numList.isEmpty()) {
			System.out.println("numList 객체에는 데이터가 존재하지 않습니다.");
		}
			
		
	}

}
