package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Ex10Test {

	@Test
	void test() {
		Ex10 e = new Ex10();
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(8, 9, 10, 10, 9, 8));
		ArrayList<Integer> r1 = e.evenList(list1);
		assertEquals(4, r1.size());
		assertEquals(6, list1.size());
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(-1, -2, -3, -100, -200, -1));
		ArrayList<Integer> r2 = e.evenList(list2);
		assertEquals(3, r2.size());
		assertEquals(6, list2.size());
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(10, 9, 8, 100, 1, 2, 3));
		ArrayList<Integer> r3 = e.evenList(list3);
		assertEquals(4, r3.size());
		assertEquals(7, list3.size());
	}

}
