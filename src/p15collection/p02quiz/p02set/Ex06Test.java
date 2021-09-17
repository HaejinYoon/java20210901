package p15collection.p02quiz.p02set;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex06Test {

	@Test
	void test() {
		Ex06 e = new Ex06();
		
		assertEquals(1, e.dupLetter("java"));
		assertEquals(0, e.dupLetter("spring"));
		assertEquals(1, e.dupLetter("aaaaaaaaaaaaaa"));
		assertEquals(3, e.dupLetter("captainamerica"));
	}

}
