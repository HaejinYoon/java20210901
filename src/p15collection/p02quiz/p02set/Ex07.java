package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex07 {
	public int countOnlyLetter(String str) {
		//한번만 사용된 문자의 갯수
		
		Set<Character> set = new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			if(set.contains(c)) {
				set.remove(c);
			}else {
				set.add(c);
			}
		}
		
		return set.size();
	}
}
