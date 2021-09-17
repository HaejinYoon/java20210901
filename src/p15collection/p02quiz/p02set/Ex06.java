package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex06 {
	public int dupLetter(String str) {
		// 몇개의 문자가 중복사용되었는지?
		Set<String> set = new HashSet<>();
		Set<String> result = new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			if(set.contains(str.substring(i,i+1))) {
				result.add(str.substring(i,i+1));
			}else {
				set.add(str.substring(i,i+1));
			}
		}
		
		return result.size();
	}
}
