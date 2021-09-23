package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex07 {
	public Map<String, String> swap(Map<String, String> param) {
		// param의 size가 2
		// 
		Map<String, String> map = new HashMap<>();
		
		map.put("a", param.get("b"));
		map.put("b", param.get("a"));
		
		
		
		
		return map;
	}
}
