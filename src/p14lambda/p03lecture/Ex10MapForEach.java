package p14lambda.p03lecture;

import java.util.HashMap;
import java.util.Map;

public class Ex10MapForEach {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(2, 200);
		map.put(3, 300);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("====forEach====");
		map.forEach((k, v) -> System.out.println(k+":"+v));
	}
}
