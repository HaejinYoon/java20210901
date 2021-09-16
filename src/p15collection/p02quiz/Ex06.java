package p15collection.p02quiz;

import java.util.Collections;
import java.util.List;

public class Ex06 {
	public int max(List<Integer> list) {
		//list 아이테 중 최대값 리턴
		Collections.sort(list);
		int max=list.get(list.size()-1);
		return max;
	}
	public int max2(List<Integer> list) {
		int max = list.get(0);
		
		for(int item : list) {
			max = (max<item) ? item:max;
		}
		return max;
	}
}
