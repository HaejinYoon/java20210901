package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ex12LeetCode1Test {

	@Test
	void test() {
		Ex12LeetCode1 e = new Ex12LeetCode1();

		int[] ret1 = e.twoSum(new int[] { 2, 7, 11, 15 }, 9);
		assertEquals(2, ret1.length);
		Arrays.sort(ret1);
		assertEquals(0, ret1[0]);
		assertEquals(1, ret1[1]);

		int[] ret2 = e.twoSum(new int[] { 3, 2, 4 }, 6);
		assertEquals(2, ret2.length);
		Arrays.sort(ret2);
		assertEquals(1, ret2[0]);
		assertEquals(2, ret2[1]);
		
		int[] ret3 = e.twoSum(new int[] { 3, 3 }, 6);
		assertEquals(2, ret3.length);
		Arrays.sort(ret3);
		assertEquals(0, ret3[0]);
		assertEquals(1, ret3[1]);
	}

}
