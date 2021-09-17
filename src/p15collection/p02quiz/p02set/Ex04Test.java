package p15collection.p02quiz.p02set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

class Ex04Test {

	@Test
	void test() {
		Ex04 e = new Ex04();
		Set<String> set1 = e.dupSet(new String[] {"cap", "ironman", "widow"});
		assertEquals(0, set1.size());
		
		Set<String> set2 = e.dupSet(new String[] {"rm", "jungkook", "bts", "bts"});
		assertEquals(1, set2.size());
		
		Set<String> set3 = e.dupSet(new String[] {"itzy", "itzy", "red", "velvet", "son", "son"});
		assertEquals(2, set3.size());
	}

}
