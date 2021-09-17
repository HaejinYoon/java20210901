package p15collection.p02quiz.p02set;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex07Test {

	@Test
	void test() {
		Ex07 e = new Ex07();
		
		assertEquals(3, e.countOnlyLetter("abc"));
		assertEquals(2, e.countOnlyLetter("abca"));
		assertEquals(2, e.countOnlyLetter("java"));
		assertEquals(0, e.countOnlyLetter("aaaaaa"));
	}

}
