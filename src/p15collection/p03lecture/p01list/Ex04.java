package p15collection.p03lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("html");
		
		System.out.println(list.get(-1)); 
		System.out.println(list.get(2)); //indexOutOfBoundsException
		
	}
}
