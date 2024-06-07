package ch11.exam3;

import java.util.List;
import java.util.Map;

public class StudyGroupUtil {
	
//	의존관계
	public void studyGroupView(Map<Integer, List<String>> groupMap) {

		for (int i = 0; i < groupMap.size(); i++) {
			int groupNum = i + 1;
			List<String> studyGroup1List = groupMap.get(groupNum);
			System.out.println("====\t" + groupNum + "조\t====");

			int number = 0;
			for (int n = 0; n < studyGroup1List.size(); n++) {
				number = n + 1;
				System.out.println(number + "번: " + studyGroup1List.get(n));
			}
		}

	}

}
