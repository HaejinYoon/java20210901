package p10exception.p03lecture.p06throws;

public class Example6FlowThrows {
	public static void main(String[] args) throws Exception {
		System.out.println("Program initiated");
		method1();
		System.out.println("Program terminated");
	}
		
	public static void method1() throws Exception {
		throw new Exception();
	}
}
