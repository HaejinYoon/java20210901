package p15collection.p02quiz.p02set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

class Ex03Test {

	@Test
	void test() {
		Ex03 e = new Ex03();

		Set<Integer> set1 = e.dupSet(new int[] {1, 2, 3});
		assertEquals(0, set1.size());
		
		Set<Integer> set2 = e.dupSet(new int[] {3, 4, 5, 5});
		assertEquals(1, set2.size());
		
		Set<Integer> set3 = e.dupSet(new int[] {3, 4, 5, 3, 4, 5});
		assertEquals(3, set3.size());
		
		
	}

}
