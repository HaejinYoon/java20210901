package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
	public Map<Integer, Integer> doubling3(Map<Integer, Integer> param) {
		//param이 가지고 있는 value를 2배한 새 맵을 만들어서 return
		//param이 변경되면 안됨
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<param.size();i++) {
			Integer v = param.get(i);
			v= 2*v;
			map.put(i, v);
		}
		
		return map;
	}
	public Map<Integer, Integer> doubling(Map<Integer, Integer> param) {
		//param이 가지고 있는 value를 2배한 새 맵을 만들어서 return
		//param이 변경되면 안됨
		
		Map<Integer, Integer> map = new HashMap<>();
		
		Set<Integer> keys = param.keySet();
		for(Integer key : keys) {
			Integer val = param.get(key);
			map.put(key, val*2);
		}
		
		
		
		return map;
	}
	public Map<Integer, Integer> doubling2(Map<Integer, Integer> param) {
		Map<Integer, Integer> map = new HashMap<>();
		
		Set<Map.Entry<Integer, Integer>> entries = param.entrySet();
		for(Map.Entry<Integer, Integer> entry : entries) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			
			map.put(key, val*2);
		}
		
		return map;
	}
	
}
