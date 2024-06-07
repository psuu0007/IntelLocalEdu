package six44.basic;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMapTest1 {

	public static void main(String[] args) {
		
		Map<String, Integer> humanMap = new HashMap<String, Integer>();
		
		humanMap.put("국하현", 1);
		humanMap.put("김민재", 2);
		humanMap.put("김진우", 5);
		humanMap.put("송승은", 6);
		humanMap.put("이상현", 7);
		
		System.out.println(humanMap);
		
		int humanNumber = humanMap.get("국하현");
		
		System.out.println(humanNumber);
		
		System.out.println(humanMap.get("김진우"));
		System.out.println(humanMap.get("이상현"));
		
		
	}
	
}
