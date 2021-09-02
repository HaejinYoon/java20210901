package p07extends.p01textbook.s070703;

import p07extends.p01textbook.s070702.Tire;

public class Car {
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	
	int run() {
		for (Tire t : tires) {
			t.roll();
		}
		
		return 0;
	}
}
