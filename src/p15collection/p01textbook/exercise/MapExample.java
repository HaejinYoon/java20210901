package p15collection.p01textbook.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<String, Integer>();
		Set<String> nm = map.keySet();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		for(String s:nm) {
			totalScore+=map.get(s);
			if(maxScore<map.get(s)) {
				maxScore=map.get(s);
				name=s;
			}
		}
		
		
		System.out.println("평균점수: "+totalScore/3);
		System.out.println("최고점수: "+maxScore);
		System.out.println("최고점수를 받은 아이디: "+name);
	}
}
