package p11api.p03lecture.p03object.p02hashcode;

public class Ex02 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		String s1 = new String("spring");
		String s2 = new String("spring");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2);
	}
}
