package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex08 {
	public void swap(Map<String, String> param) {
		// param size : 2
		// param 키는 "a", "b"
		// param 각 값을 변경(swap)
		Map<String, String> tmp = new HashMap<>();
		tmp.put("a", param.get("a"));
		param.put("a", param.get("b"));
		param.put("b", tmp.get("a"));
		
	}
}
