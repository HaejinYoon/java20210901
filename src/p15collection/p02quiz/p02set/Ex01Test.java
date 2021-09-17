package p15collection.p02quiz.p02set;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

class Ex01Test {

	@Test
	void test() {
		
		Ex01 e = new Ex01();
		
		Set<Integer> set1 = e.toSet(new int[] {3, 4, 5});
		assertEquals(3, set1.size());
		
		Set<Integer> set2 = e.toSet(new int[] {3, 4, 5, 6, 5});
		assertEquals(4, set2.size());
	}

}
