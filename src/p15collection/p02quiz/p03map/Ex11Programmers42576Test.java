package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex11Programmers42576Test {

	@Test
	void test() {
		Ex11Programmers42576 e = new Ex11Programmers42576();
		
		assertEquals("leo", e.solution(new String[]{"leo", "kiki", "eden"},new String[] {"eden", "kiki"}));
		assertEquals("vinko", e.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},new String[] {"josipa", "filipa", "marina", "nikola"}));
		assertEquals("mislav", e.solution(new String[]{"mislav", "stanko", "mislav", "ana"},new String[] {"stanko", "ana", "mislav"}));
	}

}
