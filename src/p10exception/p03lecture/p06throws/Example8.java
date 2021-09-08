package p10exception.p03lecture.p06throws;

import java.io.IOException;

public class Example8 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws IOException{
		throw new IOException();
	}
	
	public static void method2() throws Exception {
		throw new Exception();
	}
	
	
	
}
