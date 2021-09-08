package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;

public class Example2Throws {
	public static void main(String[] args) {
		
		try{
			method1();
		}catch(FileNotFoundException e) {
			System.out.println("file not found...");
		}
		
		
	}
	
	public static void method1() throws FileNotFoundException{
		
		throw new FileNotFoundException();
	}
}
