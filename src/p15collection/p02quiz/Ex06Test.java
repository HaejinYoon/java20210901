package p15collection.p02quiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ex06Test {

	@Test
	void test() {
		Ex06 e = new Ex06();
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(33);
		list1.add(3);
		list1.add(100);
		list1.add(-80);
		assertEquals(100, e.max(list1));
		assertEquals(10, e.max(Arrays.asList(7,8,9,10)));
		assertEquals(-1, e.max(Arrays.asList(-10,-8,-6,-1,-5)));
	}

}
