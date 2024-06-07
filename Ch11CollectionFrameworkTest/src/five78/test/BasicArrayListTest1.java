package five78.test;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayListTest1 {

	public static void main(String[] args) {

//		1.
//		5명의 반 동기생의 이름을 입력한다
//		순서대로 출력한다
		List<String> list1 = new ArrayList<String>();

		list1.add("김유경");
		list1.add("송승은");
		list1.add("국하현");
		list1.add("이상현");
		list1.add("조무연");
		list1.add("김진우");
		
		System.out.println(list1.size());

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));

		}

	}

}
