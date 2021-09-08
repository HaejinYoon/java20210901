package p10exception.p02quiz;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example7 {
	public static void main(String[] args) {
		//일반ㄴ 예외ㅣ(checked exception)
		IOException e = new IOException();
		
		try{
			throw e;
		} catch (IOException e1) {
			System.out.println("Exception");
		}
		
		try{
			throw new FileNotFoundException();
		} catch(FileNotFoundException e2) {
			System.out.println("file not found ex");
		}
	}
}
