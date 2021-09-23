package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex10 {
	public Map<String, Integer> sum(Map<String, Integer> map1, Map<String, Integer> map2) {
		//map1과 map2에 키가 둘 다 있으면 밸류를 더해서 추가
		//한쪽에만 있으면 그냥 추가
		//한 새 map을 만들어서 리턴
		Map<String, Integer> sm = new HashMap<>();
		
		Set<String> m1 = map1.keySet();
		for(String key1 : m1) {
			sm.put(key1, map1.get(key1));
		}
		
		Set<String> m2 = map2.keySet();
		for(String key2: m2) {
			if(sm.containsKey(key2)) {
				sm.put(key2, map1.get(key2)+map2.get(key2));
			} else {
				sm.put(key2, map2.get(key2));
			}
		}
		
		return sm;
	}
}
