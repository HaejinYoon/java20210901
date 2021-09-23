package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex09 {
	public Map<Character, Integer> countCharacter(String str) {
		//str의 문자가 몇번 나오는지 count
		//문자를 key 몇번 value로 갖는 map을 만들어서 return
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			Integer cnt = 0;
			
			for(int j=0;j<str.length();j++) {
				if(str.substring(i,i+1).equals(str.substring(j,j+1))) {
					cnt++;
				}
			}
				
			map.put(str.charAt(i), cnt);
		}
		return map;
	}
}
