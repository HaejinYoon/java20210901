package p11api.p03lecture.p04wrapper;

public class Ex06 {
	public static void main(String[] args) {
		int i1 = 1000;
		int i2 = 1000;
		
		System.out.println(i1==i2);
		
		Integer i3 = new Integer(1000);
		Integer i4 = new Integer(1000);
		
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println(i3.intValue()==i4.intValue());
	}
}
