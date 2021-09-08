package p10exception.p02quiz;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example9 {
	public static void main(String[] args) throws IOException{
		method1();
	}
	
	public static void method1() throws IOException{
		method2();
	}
	public static void method2() throws IOException {
		method3();
	}
	public static void method3 () throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		
		is.close();
	}
}
