package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex09 {
	public void removeLastMax(List<Integer> list) {
		//list의 마지막 가장 큰 값을 삭제
		int index=0;
		int max = list.get(0);
		
		for(int i=0;i<list.size();i++) {
			if(max<=list.get(i)) {
				max=list.get(i);
				index=i;
			}
		}
		list.remove(index);
		
	}
}
