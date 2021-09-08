package p10exception.p03lecture.p06throws;

import java.io.IOException;

public class Example7Casting {
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
//		} catch( IOException e) {
		} catch (Exception e) {
			System.out.println("Exception occur");
		}
		
	}
	
	public static void method1() throws Exception {//IOExeption
		throw new IOException();
	}
}
