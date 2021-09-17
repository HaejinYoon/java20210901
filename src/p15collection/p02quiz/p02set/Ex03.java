package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public Set<Integer> dupSet(int[] arr){
		//arr 배열에 중복된 값들만 set에 모아서 리턴
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					set.add(arr[i]);
				}
			}
		}
		
		return set;
	}
}
