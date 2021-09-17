package p15collection.p02quiz.p02set;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex5Test {

	@Test
	void test() {
		Ex05 e = new Ex05();
		
		assertEquals(3, e.countLetter("cap"));
		assertEquals(3, e.countLetter("java"));
		assertEquals(6, e.countLetter("ironman"));
		assertEquals(1, e.countLetter("aaaaaaaaa"));
	}

}
