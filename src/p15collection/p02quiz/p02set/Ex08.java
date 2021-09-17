package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {
	public Set<Integer> diff(int[] a, int[] b){
		// a배열에만 있는 아이템들만 모은 set 리턴
		Set<Integer> setB = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		
		for( int i : b) {
			setB.add(i);
		}
		
		for(int i: a)
			if(!setB.contains(i)) {
				result.add(i);
			}
		
		
		
		
		return result;
	}
}
