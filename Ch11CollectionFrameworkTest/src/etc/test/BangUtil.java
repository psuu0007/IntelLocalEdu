package etc.test;

import java.util.List;
import java.util.Map;

public class BangUtil {
	
	public void bangUtilView(Map <Integer, List<String>> bangMap) {

	
		for (int i = 0; i < bangMap.size(); i++) {
			int groupNum = i + 1;
			List<String> bang1List = bangMap.get(groupNum);
			System.out.println(groupNum + "층에 사는 수강생들");
			
			int number = 0;
			for (int n = 0; n < bang1List.size(); n++) {
				number = n+1;
				System.out.println(groupNum * 100 + number + "호: " + bang1List.get(n));
		    }
			System.out.println();
		}
	}
}
