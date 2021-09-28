package p14lambda.p02quiz;

import java.util.HashMap;
import java.util.Map;

public class Ex13 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("spring", 1);
		map.put("java", 1);
		map.put("html", 1);
		map.put("css", 1);
		
		map.replaceAll((k, v) -> {
			return k.length();
		});
		
		
		map.replaceAll((k, v) -> v=k.length());
		
		System.out.println(map);
		// {spring=6, css=3, java=4, html=4}
	}
}
