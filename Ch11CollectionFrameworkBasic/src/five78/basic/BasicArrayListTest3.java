package five78.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicArrayListTest3 {

	public static void main(String[] args) {
		
		
//		Iterator
		
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
		
	}
	
}
