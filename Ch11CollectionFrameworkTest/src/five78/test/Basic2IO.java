package five78.test;

import java.util.ArrayList;
import java.util.List;

public class Basic2IO {

	void allInOne(List<Integer> numberList) {
		for (int i = 0; i < 10; i++) {
			numberList.add(i + 1);
			System.out.println(numberList.get(i));
		}
	}

	void input(List<Integer> numberList) {
		for (int i = 0; i < 10; i++) {
			numberList.add(i + 1);
		}
	}
	
	void output(List<Integer> numberList) {
		for (int i = 0; i < 10; i++) {
			System.out.println(numberList.get(i));
		}
	}
	

}
