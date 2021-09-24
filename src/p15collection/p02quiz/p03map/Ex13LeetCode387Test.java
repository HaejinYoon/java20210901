package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex13LeetCode387Test {

	@Test
	void test() {
		Ex13LeetCode387 e = new Ex13LeetCode387();
		
		assertEquals(0, e.firstUniqChar("leetcode"));
		assertEquals(2, e.firstUniqChar("loveleetcode"));
		assertEquals(-1, e.firstUniqChar("aabb"));
		assertEquals(4, e.firstUniqChar("lollipop"));
	}

}
