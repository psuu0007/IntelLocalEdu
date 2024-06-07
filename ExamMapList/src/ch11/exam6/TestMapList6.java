package ch11.exam6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapList6 {

	public static void main(String[] args) {
		
		String[] studentNameArr1 = {"조무연", "김민재", "송승은"};
		int[] studentNumArr1 = {1, 2, 3};
		
		String[] studentNameArr2 = {"조병철", "국하현", "김진우"};
		int[] studentNumArr2 = {1, 2, 3};
		
		String[] studentNameArr3 = {"김유경", "김보근", "이상현"};
		int[] studentNumArr3 = {1, 2, 3};
		
		Map<Integer, List<Student>> groupMap = 
			new HashMap<Integer, List<Student>>();

		StudyGroupUtil6 studyGroupUtil = new StudyGroupUtil6();
		
		studyGroupUtil.setStudentGroup(groupMap, studentNameArr1, studentNumArr1);
		
		studyGroupUtil.setStudentGroup(groupMap, studentNameArr2, studentNumArr2);
		studyGroupUtil.setStudentGroup(groupMap, studentNameArr3, studentNumArr3);
		
		studyGroupUtil.studyGroupView(groupMap);
	}

}
