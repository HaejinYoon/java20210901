package p15collection.p02quiz.p01list;

import java.util.ArrayList;

public class Ex13 {
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		while(lotto.size()<6) {
			int ran=(int)(Math.random()*45+1);
			if(!lotto.contains(ran)) {
				lotto.add(ran);
			}

			
//			lotto.add(i,(int)(Math.random()*45+1));
//			System.out.println(lotto);
//			for(int j=0;j<i;j++) {
//				if(lotto.get(j)==lotto.get(i)) {
//					lotto.remove(i);
//					i--;
//				}
//			}
		}
		for(int l : lotto) {
			System.out.print(l+" ");
		}
	}
}
