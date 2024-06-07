package five78.test;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayListTest2_3 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		
//		for (int i = 0; i < 10; i++) {
//			setlist1(list1, i);
//			getlist1(list1, i);
//		}
		
//		for (int i = 0; i < 10; i++) {
			setlist1(list1, 0);
//		}
		
//		for (int i = 0; i < 10; i++) {
			getlist1(list1, 0);
//		}
		

	}
	
	public static void setlist1(List<Integer> list, int i) {
		list.add(i + 1);
	}
	
	public static void getlist1(List<Integer> list, int i) {
		System.out.println(list.get(i));
	}
}
