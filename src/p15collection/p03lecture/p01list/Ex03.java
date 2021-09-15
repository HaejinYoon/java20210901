package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("spring");
		list.add("js");
		
		System.out.println(list.size());
		
		// 그냥 for
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.add("boot");
		list.add("list");
		
		System.out.println(list.size());
		
		// 향상된 for
		for(String str : list) {
			System.out.println(str);
		}
		
		// forEach(lambda)
		list.forEach(str -> System.out.println(str));
		
		//toStringn
		System.out.println(list);
	}
}
