package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex05Test {

	@Test
	void test() {
		Ex05 e = new Ex05();
		assertEquals(7, e.sum("3 4"));
		assertEquals(43, e.sum("10 33"));
		assertEquals(0, e.sum("-5 5"));
		
		assertEquals(7, e.sum2("3 4"));
		assertEquals(43, e.sum2("10 33"));
		assertEquals(0, e.sum2("-5 5"));
	}

}
