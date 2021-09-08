package p10exception.p03lecture.p06throws;

public class Example4 {
	public static void main(String[] args) throws Exception {
		System.out.println("Program starts");
		
		method1();
		
		System.out.println("Program terminated");
	}
	
	public static void method1() throws Exception {
		System.out.println("method1 initiated");
		
		method2();
		
		System.out.println("method1 terminated");
	}
	
	public static void method2() throws Exception{
		System.out.println("method2 initiated");
		
		throw new Exception();
		
		//System.out.println("method2 terminated");
	}
}
