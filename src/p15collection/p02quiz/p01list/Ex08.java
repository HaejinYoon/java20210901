package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex08 {
	public int maxLastIndex(List<Integer> list) {
		//list의 최대값이 있는 마지막 인덱스
		int index=0;
		int max = list.get(0);
		
		for(int i=0;i<list.size();i++) {
			if(max<=list.get(i)) {
				max=list.get(i);
				index=i;
			}
		}
		return index;
	}
	
	public int maxLastIndex2(List<Integer> list) {
		int max = list.get(list.size()-1);
		int index = list.size()-1;
		for(int i=list.size()-2; i>=0; i--) {
			if(list.get(i)>max){
				max = list.get(i);
				index=i;
			}
		}
		return index;
	}
}
