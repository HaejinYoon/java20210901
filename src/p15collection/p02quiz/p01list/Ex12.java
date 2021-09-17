package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex12 {
	public boolean mirror(List<Integer> list) {
		// list 중간 인덱스 기준으로 왼쪽 오른쪽이 거울처럼 같은지 
		int len = list.size()/2;
		
		for(int i=0;i<=list.size()/2;i++) {
			if(list.get(i)!=(list.get(list.size()-1-i))) {
				return false;
			}
		}
		return true;
	}
}
