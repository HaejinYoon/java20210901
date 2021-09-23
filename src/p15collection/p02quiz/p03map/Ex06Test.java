package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Ex06Test {

	@Test
	void test() {
Ex06 e = new Ex06();
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 300);
		map.put(200, 6);
		map.put(-1, 7);
		
		e.doubling(map);
		
		assertEquals(3, map.size());
		assertEquals(600, map.get(1));
		assertEquals(12, map.get(200));
		assertEquals(14, map.get(-1));
	}

}
