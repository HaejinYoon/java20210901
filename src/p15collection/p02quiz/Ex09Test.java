package p15collection.p02quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Ex09Test {

	@Test
	void test() {
		Ex09 e = new Ex09();
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(8, 9, 10, 10, 9, 8));
		e.removeLastMax(list1);
		assertEquals(5, list1.size());
		assertEquals(9, list1.get(3));
		
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(-1, -2, -3, -100, -200, -1));
		e.removeLastMax(list2);
		assertEquals(5, list2.size());
		assertEquals(-200, list2.get(4));

		List<Integer> list3 = new ArrayList<>(Arrays.asList(10, 9, 8, 100, 1, 2, 3));
		e.removeLastMax(list3);
		assertEquals(6, list3.size());
		assertEquals(1, list3.get(3));
		
		}

}
