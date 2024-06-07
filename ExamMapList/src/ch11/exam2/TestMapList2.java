package ch11.exam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapList2 {

	public static void main(String[] args) {
		
//		Map과 List를 활용한 문제2
//		맵에 여러 데이터 그룹을 다루는 경우
//		
		
		Map<Integer, List<String>> groupMap = 
			new HashMap<Integer, List<String>>();
		
//		키는 그룹
//		밸류는 그룹에 속한 사람들
		
		List<String> studyGroup1List = new ArrayList<String>();
		
		studyGroup1List.add("조무연");
		studyGroup1List.add("김민재");
		studyGroup1List.add("송승은");
		
		groupMap.put(1, studyGroup1List);
		
		List<String> studyGroup2List = new ArrayList<String>();
		
		studyGroup2List.add("조병철");
		studyGroup2List.add("국하현");
		studyGroup2List.add("김진우");
		
		groupMap.put(2, studyGroup2List);
		
		List<String> studyGroup3List = new ArrayList<String>();
		
		studyGroup3List.add("김유경");
		studyGroup3List.add("김보근");
		studyGroup3List.add("이상현");
		
		groupMap.put(3, studyGroup3List);
		
		studyGroupView(groupMap);
	}
	
	public static void studyGroupView(Map <Integer, List<String>> groupMap) {
		
		for (int i = 0; i < groupMap.size(); i++) {
			int groupNum = i + 1;
			List<String> studyGroup1List = groupMap.get(groupNum);
			System.out.println("====\t" + groupNum + "조\t====");
			
			int number = 0;
			for (int n = 0; n < studyGroup1List.size(); n++) {
				number = n+1;
				System.out.println(number + "번: " + studyGroup1List.get(n));
			}
		}
		
	}
	
}
