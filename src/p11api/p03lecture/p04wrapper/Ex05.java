package p11api.p03lecture.p04wrapper;

public class Ex05 {
	public static void main(String[] args) {
		int i1 = 300; //4byte
		Integer i2 = 300;
		
//		i1 =null; //x
		i2 =null; //o
		
		short s1 = 100; //2byte
		Short s2 = 100;
		
		i1 = s1;
//		i2 = s2;//x
//		i2 = (Integer) s2; //x
		i2 = s2.intValue();
		
		int i3 = i2 +100; // auto unboxing
		System.out.println(i3);
		
		Object o1 = i2;
		i2 = (Integer) o1;
	}
}
