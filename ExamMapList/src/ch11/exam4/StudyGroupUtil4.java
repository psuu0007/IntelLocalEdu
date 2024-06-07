package ch11.exam4;

import java.util.List;
import java.util.Map;

public class StudyGroupUtil4 {
	
//	의존관계
	public void studyGroupView(Map<Integer, List<Student>> groupMap) {

		Student student = null;
		for (int i = 0; i < groupMap.size(); i++) {
			int groupNum = i + 1;
			List<Student> studyGroup1List = groupMap.get(groupNum);
			System.out.println("====\t" + groupNum + "조\t====");

//			int number = 0;
			for (int n = 0; n < studyGroup1List.size(); n++) {
//				number = n + 1;
				
				student = studyGroup1List.get(n);
				System.out.println(student.number + "번: " + student.name);
			}
		}

	}

}
