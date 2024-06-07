package etc.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import etc.test.*;

public class Bang {

	public static void main(String[] args) {
		
		Map<Integer, List<String>> bangMap = 
				new HashMap<Integer, List<String>>();
		
		
		List<String> bang1List = new ArrayList<String>();
		
		bang1List.add("조무연");
		bang1List.add("김민재");
		
		bangMap.put(1, bang1List);

		
		List<String> bang2List = new ArrayList<String>();
		
		bang2List.add("송승은");
		bang2List.add("조병철");
		
		bangMap.put(2, bang2List);
		
		List<String> bang3List = new ArrayList<String>();
		
		bang3List.add("국하현");
		bang3List.add("이상현");
		
		bangMap.put(3, bang3List);
		
	    BangUtil bUtil = new BangUtil();
		
		bUtil.bangUtilView(bangMap);

	}

}
