package ch11.exam6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudyGroupUtil6 {
	
//	Map<Integer, List<Student>> groupMap = new HashMap<Integer, List<Student>>();
	int cnt = 1;
	
	public void setStudentGroup(Map<Integer, List<Student>> groupMap, 
		String[] studentNameArr1, int[] studentNumArr1) {
		
		List<Student> studyGroupList = new ArrayList<>();
		
		for (int i = 0; i < studentNumArr1.length; i++) {
			Student student = new Student(studentNameArr1[i], studentNumArr1[i]);
			
			studyGroupList.add(student);
		}
		groupMap.put(cnt, studyGroupList);
		cnt++;
	}

	public void studyGroupView(Map<Integer, List<Student>> groupMap) {

		Student student = null;
		for (int i = 0; i < groupMap.size(); i++) {
			
			int groupNum = i + 1;
			List<Student> studyGroup1List = groupMap.get(groupNum);
			System.out.println("====\t" + groupNum + "조\t====");

			for (int n = 0; n < studyGroup1List.size(); n++) {
				
				student = studyGroup1List.get(n);
				System.out.println(student.number + "번: " + student.name);
			}
		}

	}
}
