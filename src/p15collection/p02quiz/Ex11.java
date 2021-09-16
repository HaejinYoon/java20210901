package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
	public ArrayList<Integer> minMax(List<Integer> list){
		
		//파라미터로 받은 list의 최소값, 최대값을 아이템으로 갖는 ArrayList 리턴
		ArrayList<Integer> na = new ArrayList<>();
		int max = list.get(0);
		int min = list.get(0);
		for(int i=0; i<list.size();i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}
			if(list.get(i)<min) {
				min=list.get(i);
			}
		}
		na.add(min);
		na.add(max);
		
		return na;
	}
}
