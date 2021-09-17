package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {
	public Set<String> dupSet(String[] arr){
		Set<String> set = new HashSet<>();
		Set<String> result = new HashSet<>();
		
		for(String s : arr) {
			if(set.contains(s)) {
				result.add(s);
			}else {
				set.add(s);
			}
		}
		return result;
	}
}
