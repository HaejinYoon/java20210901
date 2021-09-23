package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex04 {
	public Map<String, Integer> length(List<String> strs){
		// list에 있는 String을 키, 그 문자열(key)의 길이를 밸류로 갖는 map을 만들어서 return
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<strs.size();i++) {
			map.put(strs.get(i), strs.get(i).length());
		}
		
//		for (String str : strs) {
//			map.put(str, str.length());
//		}
		return map;
	}
}
