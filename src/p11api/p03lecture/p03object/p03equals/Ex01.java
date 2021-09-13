package p11api.p03lecture.p03object.p03equals;

public class Ex01 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1==o2);
		System.out.println(o1.equals(02));
		
		System.out.println("===========================");
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("s1 hashcode: "+s1.hashCode());
		System.out.println("s2 hashcode: "+s2.hashCode());
		
	}
}
