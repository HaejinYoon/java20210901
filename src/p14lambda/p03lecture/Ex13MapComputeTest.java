package p14lambda.p03lecture;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import p15collection.p02quiz.p03map.Ex09;

class Ex13MapComputeTest {

	@Test
	void test() {
		Ex09 e = new Ex09();
		
		String s = "keysvalues";
		
		Map<Character, Integer> map = e.countCharacter(s);
		
		assertEquals(8, map.size());
		assertEquals(2, map.get('e'));
		assertEquals(2, map.get('s'));
		assertEquals(1, map.get('k'));
		assertEquals(null, map.get('z'));
		
	}

}
