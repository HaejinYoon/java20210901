package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class Ex02Test {

	@Test
	void test() {
		Ex02 e = new Ex02();
		
		Map<Integer, Integer> map = e.put();
		
		assertEquals(2, map.size());
		assertEquals(2, map.get(1));
		assertEquals(4, map.get(2));
		assertFalse(map.containsKey(3));
		
	}

}
