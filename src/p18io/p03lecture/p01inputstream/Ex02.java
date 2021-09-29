package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;



public class Ex02 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\Haejin\\Desktop\\iotest\\test1.txt";
		InputStream is = new FileInputStream(file);
		
		int input = 0;
		
		while((input = is.read()) != -1) {
			System.out.println(input);
		}
		
		System.out.println("프로그램 종료");
		is.close();
	}
}
