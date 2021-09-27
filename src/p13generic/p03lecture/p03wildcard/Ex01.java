package p13generic.p03lecture.p03wildcard;

import java.util.ArrayList;

public class Ex01 {
	//wildcard
	
	public static void main(String[] args) {
		Number n1 = new Integer(3);
		
		ArrayList<Number> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
//		list1 = list2; //(x) 이게 된다면....
		list1.add(new Double(3.14)); // 이게 되야함
		
		//결론 ArrayList<Number>는 ArrayList<Integer>의 상위 타입이 아니다.
		
		
		
	}
}
