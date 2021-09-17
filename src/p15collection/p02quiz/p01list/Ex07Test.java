package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ex07Test {

	@Test
	void test() {
		Ex07 e = new Ex07();
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(33);
		list1.add(3);
		list1.add(100);
		list1.add(-80);
		assertEquals(2, e.maxIndex(list1));
		assertEquals(3, e.maxIndex(Arrays.asList(7,8,9,10)));
		assertEquals(3, e.maxIndex(Arrays.asList(-10,-8,-6,-1,-5)));
		assertEquals(0, e.maxIndex(Arrays.asList(100, 50, 40, 100, 0)));
	}

}
