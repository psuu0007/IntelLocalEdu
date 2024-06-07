package ch11.exam1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapList {

	public static void main(String[] args) {
		
//		Map과 List를 활용한 문제1
//		맵에 하나의 그룹 데이터를 다루는 경우
		
		Map<String, List<String>> groupMap = new HashMap<String, List<String>>();
		
//		키는 그룹
//		밸류는 그룹에 속한 사람들
		
		List<String> studyGroupList = new ArrayList<String>();
		
		studyGroupList.add("조무연");
		studyGroupList.add("김민재");
		studyGroupList.add("송승은");
		
		groupMap.put("공부할 사람들", studyGroupList);
		
		
		studyGroupView(groupMap);
	}
	
//	의존관계
	public static void studyGroupView(Map <String, List<String>> groupMap) {
		List<String> studyGroupList = groupMap.get("공부할 사람들");
		
		int number = 0;
		for (int i = 0; i < studyGroupList.size(); i++) {
			number = i+1;
			System.out.println(number + "번: " + studyGroupList.get(i));
		}
	}
	
}
