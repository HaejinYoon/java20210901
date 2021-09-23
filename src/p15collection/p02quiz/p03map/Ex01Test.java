package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Ex01Test {

	@Test
	void test() {
		Ex01 e = new Ex01();
		
		Map<Integer, Integer> map = new HashMap<>();
		e.put(map);
		
		assertEquals(2, map.get(1));
		assertEquals(4, map.get(2));
		assertEquals(2, map.size());
		assertFalse(map.containsKey(3));
	}

}
