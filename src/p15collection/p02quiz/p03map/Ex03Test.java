package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class Ex03Test {

	@Test
	void test() {
		Ex03 e = new Ex03();
		
		Map<Integer, Integer> map = e.triple();
		
		assertEquals(5, map.size());
		assertEquals(3, map.get(1));
		assertEquals(6, map.get(2));
		assertEquals(9, map.get(3));
		assertEquals(12, map.get(4));
		assertEquals(15, map.get(5));
		
	}

}
