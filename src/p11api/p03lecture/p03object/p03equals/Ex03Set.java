package p11api.p03lecture.p03object.p03equals;

import java.util.HashSet;
import java.util.Set;

public class Ex03Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		System.out.println(set.size()); //0
		
		set.add("java");
		System.out.println(set.size()); //1
		
		set.add("spring");
		System.out.println(set.size()); //2
		
		set.add("java");//담겨지지 않음. 이미 앞에 같은 객체가 있어서
		System.out.println(set.size()); //2
		
	}
}
