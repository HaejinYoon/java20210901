package p15collection.p02quiz.p02set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

class Ex02Test {

	@Test
	void test() {
		Ex02 e = new Ex02();
		Set<String> set1 = e.toSet(new String[] {"java", "spring", "html"});
		
		assertEquals(3, set1.size());
		
		Set<String> set2 = e.toSet(new String[] {"java", "Java", "jAva", "jaVa", "javA"});
		
		assertEquals(5, set2.size());
		
		Set<String> set3 = e.toSet(new String[] {"spring", "java", "css", "java", "css"});
		
		assertEquals(3, set3.size());
	
	}

}
