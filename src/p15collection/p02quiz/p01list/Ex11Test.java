package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Ex11Test {

	@Test
	void test() {
		Ex11 e = new Ex11();
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(8, 9, 10, 10, 9, 8));
		ArrayList<Integer> r1 = e.minMax(list1);
		
		assertEquals(2, r1.size());
		assertEquals(8, r1.get(0));
		assertEquals(10, r1.get(1));
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(-1, -2, -3, -100, -200, -1));
		ArrayList<Integer> r2 = e.minMax(list2);
		
		assertEquals(2, r2.size());
		assertEquals(-200, r2.get(0));
		assertEquals(-1, r2.get(1));
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(10, 9, 8, 100, 1, 2, 3));
		ArrayList<Integer> r3 = e.minMax(list3);
		
		assertEquals(2, r3.size());
		assertEquals(1, r3.get(0));
		assertEquals(100, r3.get(1));
	}

}
