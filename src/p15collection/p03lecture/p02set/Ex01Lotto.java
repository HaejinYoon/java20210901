package p15collection.p03lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex01Lotto {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size()<6) {
			int ran = (int)(Math.random()*45+1);
			System.out.println(ran);
			lotto.add(ran);
		}
		
		System.out.println("==================");
		for(int l: lotto) {
			System.out.println(l);
		}
	}
}
