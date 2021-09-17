package p15collection.p03lecture.p02set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex03Iterator {
	public static void main(String[] args) {
		// p.735
		// Iterator 열거자
		// Main method : hasNext(), next()
		
		Set<String> set = new HashSet<>();
		
		set.add("ironman");
		set.add("captain");
		set.add("spiderman");
		set.add("widow");
		set.add("hulk");
		
		Iterator<String> iterator = set.iterator();
		String e1= iterator.next();
		String e2= iterator.next();
		String e3= iterator.next();
		String e4= iterator.next();
		String e5= iterator.next();
		//String e6= iterator.next();

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		System.out.println("=======================");
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String i1 = iterator.next();
			System.out.println(i1);
		}
		
		System.out.println("=======================");
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println("=======================");
		List<String> list = new ArrayList<>();
		list.add("suga");
		list.add("v");
		list.add("jimin");
		list.add("jin");
		list.add("rm");
		list.add("bts");
		list.add("bts");
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}
}
