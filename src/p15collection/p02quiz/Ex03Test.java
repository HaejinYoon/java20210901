package p15collection.p02quiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex03Test {

	@Test
	void test() {
		assertEquals(0, 0);
		assertEquals(1, 1);
		assertEquals(3.14, 3.14);
//		assertEquals(2, 1);
		
		Ex03 e = new Ex03();
		assertEquals(0, e.triple(0));
		assertEquals(3, e.triple(1));
		assertEquals(6, e.triple(2));
	}
	
}
