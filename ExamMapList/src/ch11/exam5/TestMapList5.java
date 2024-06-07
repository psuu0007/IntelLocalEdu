package ch11.exam5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapList5 {

	public static void main(String[] args) {
		
//		Map과 List를 활용한 문제3
//		맵에 여러 데이터 그룹을 다루는 경우
//		객체지향화 적용
//		변수 단순화
		
		Map<Integer, List<Student>> groupMap = 
			new HashMap<Integer, List<Student>>();
		
//		키는 그룹
//		밸류는 그룹에 속한 사람들
		
		List<Student> studyGroup1List = new ArrayList<>();
		
		Student student = new Student("조무연", 1);
		studyGroup1List.add(student);
		
		student = new Student("김민재", 2);
		studyGroup1List.add(student);
		
		student = new Student("송승은", 3);
		studyGroup1List.add(student);
		
		groupMap.put(1, studyGroup1List);
		
		
		List<Student> studyGroup2List = new ArrayList<Student>();
		student = new Student("조병철", 1);
		studyGroup2List.add(student);
		
		student = new Student("국하현", 2);
		studyGroup2List.add(student);
		
		student = new Student("김진우", 3);
		studyGroup2List.add(student);
		
		
		groupMap.put(2, studyGroup2List);
		
		List<Student> studyGroup3List = new ArrayList<Student>();
		student = new Student("김유경", 1);
		studyGroup3List.add(student);
		
		student = new Student("김보근", 2);
		studyGroup3List.add(student);
		
		student = new Student("이상현", 3);
		studyGroup3List.add(student);
		
		
		groupMap.put(3, studyGroup3List);
		
		StudyGroupUtil5 studyGroupUtil = new StudyGroupUtil5();
		
		studyGroupUtil.studyGroupView(groupMap);
	}
	
}
