package p15collection.p01textbook;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	// 728 page
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add(2, "database");
		list.add("ibatis");
		list.add("ibatis");
		list.add("ibatis");
		
		list.forEach(str -> System.out.println(str));
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2:" + skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		System.out.println(list.get(2));
		
		list.remove("ibatis");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
