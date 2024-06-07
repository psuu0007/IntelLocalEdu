package five78.test;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayListTest2_2 {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();

		Basic2IO b = new Basic2IO();
		
//		b.allInOne(numberList);
		
		b.input(numberList);
//
		b.output(numberList);
		System.out.println();
		
		b.output(numberList);
	}

}
