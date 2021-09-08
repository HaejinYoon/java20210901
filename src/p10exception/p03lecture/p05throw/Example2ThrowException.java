package p10exception.p03lecture.p05throw;

import java.io.IOException;

public class Example2ThrowException {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		//RuntimeException을 상속 받지 않은 Exception은 try/catch를 사용해야 함.
		
		
		
		IOException e = new IOException();
		
		
		
		try {
			throw e;			
		} catch(IOException e1) {
			System.out.println("IO익셉션 발생");
		}
		
		
		
		
	}
}
