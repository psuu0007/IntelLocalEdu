package ch11.exam4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapList4 {

	public static void main(String[] args) {
		
//		Map과 List를 활용한 문제3
//		맵에 여러 데이터 그룹을 다루는 경우
//		객체지향화 적용
//		현업 레벨
		
		Map<Integer, List<Student>> groupMap = 
			new HashMap<Integer, List<Student>>();
		
//		키는 그룹
//		밸류는 그룹에 속한 사람들
		
		List<Student> studyGroup1List = new ArrayList<>();
		Student student1 = new Student("조무연", 1);
		Student student2 = new Student("김민재", 2);
		Student student3 = new Student("송승은", 3);
		
		studyGroup1List.add(student1);
		studyGroup1List.add(student2);
		studyGroup1List.add(student3);
		
		groupMap.put(1, studyGroup1List);
		
		List<Student> studyGroup2List = new ArrayList<Student>();
		Student student4 = new Student("조병철", 1);
		Student student5 = new Student("국하현", 2);
		Student student6 = new Student("김진우", 3);
		
		studyGroup2List.add(student4);
		studyGroup2List.add(student5);
		studyGroup2List.add(student6);
		
		groupMap.put(2, studyGroup2List);
		
		List<Student> studyGroup3List = new ArrayList<Student>();
		Student student7 = new Student("김유경", 1);
		Student student8 = new Student("김보근", 2);
		Student student9 = new Student("이상현", 3);
		
		studyGroup3List.add(student7);
		studyGroup3List.add(student8);
		studyGroup3List.add(student9);
		
		groupMap.put(3, studyGroup3List);
		
		StudyGroupUtil4 studyGroupUtil = new StudyGroupUtil4();
		
		studyGroupUtil.studyGroupView(groupMap);
	}
	
}
