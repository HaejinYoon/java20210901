package p18io.p02quiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class Ex07Test {

	@Test
	void test() throws Exception {
		Ex07 e = new Ex07();
		Map<Character, Integer> map1 = e.count("C:\\Users\\Haejin\\Desktop\\iotest\\test3.txt");
		
		assertEquals(4, map1.size());
		assertEquals(1, map1.get('가'));
		assertEquals(1, map1.get('나'));
		assertEquals(1, map1.get('a'));
		assertEquals(1, map1.get('b'));
		assertEquals(null, map1.get('c'));
		
		Map<Character, Integer> map2 = e.count("C:\\Users\\Haejin\\Desktop\\iotest\\test2.txt");
		
		assertEquals(3 ,map2.size());
		assertEquals(11, map2.get('j'));
		assertEquals(11, map2.get('v'));
		assertEquals(22, map2.get('a'));
	}

}
