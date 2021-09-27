package p13generic.p03lecture.p03wildcard;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		//파라미터나 리턴타입에 작성됨
		ArrayList<? extends Number> list1 = new ArrayList<Integer>(); //변수 선언ㄴ시 사용되는 경우는 없음
		list1 = new ArrayList<Double>();
		list1 = new ArrayList<Long>();
		
//		list1 = new ArrayList<Object>(); //x
//		list1 = new ArrayList<String>(); //x
		
		//하위타입 제한
		ArrayList<? super Number> list2 = new ArrayList<Number>();
		list2 = new ArrayList<Object>();
		
//		list2 = new ArrayList<Integer>(); //x
//		list2 = new ArrayList<Double>();//x
		
		//제한없음
		ArrayList<?>  list3 = new ArrayList<Integer>();
		list3 = new ArrayList<Number>();
		list3 = new ArrayList<String>();
		list3 = new ArrayList<Object>();
		
		
		
	}
}
