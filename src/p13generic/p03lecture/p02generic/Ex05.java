package p13generic.p03lecture.p02generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Ex05 {
	//제한된 타입 파라미터
	public static void main(String[] args) {
		Box2<ArrayList> b1;
		Box2<LinkedList> b2;
		Box2<List> b3;
		
//		Box2<Object> b4; //X
//		Box2<HashSet> b5; //x
	}
}

class Box2<T extends List> {
	
}
