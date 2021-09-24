package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex13LeetCode387 {
	public int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		int count;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				count=map.get(c);
				count++;
				map.put(c, count);
			}else {
				map.put(c, 1);
			}
		}
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(map.get(c)==1) {
				return i;
			}
		}
		return -1;
	}
}
