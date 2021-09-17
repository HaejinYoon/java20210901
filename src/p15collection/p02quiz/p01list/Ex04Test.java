package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex04Test {

	@Test
	void test() {
		Ex04 e = new Ex04();
		assertEquals(4,e.remainder(4));
		assertEquals(2,e.remainder(12));
		assertEquals(3,e.remainder(33));
	}

}
