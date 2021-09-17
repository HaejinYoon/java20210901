package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ex08Test {

	@Test
	void test() {
		Ex08 e= new Ex08();
		assertEquals(3,e.maxLastIndex(Arrays.asList(8,9,10,10,9,8)));
		assertEquals(5,e.maxLastIndex(Arrays.asList(-1,-2,-3,-100,-200,-1)));
		assertEquals(3,e.maxLastIndex(Arrays.asList(10,9,8,100,1,2,3)));
		
		assertEquals(3,e.maxLastIndex2(Arrays.asList(8,9,10,10,9,8)));
		assertEquals(5,e.maxLastIndex2(Arrays.asList(-1,-2,-3,-100,-200,-1)));
		assertEquals(3,e.maxLastIndex2(Arrays.asList(10,9,8,100,1,2,3)));
	}

}
