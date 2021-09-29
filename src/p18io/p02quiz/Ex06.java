package p18io.p02quiz;

import java.io.FileReader;
import java.io.Reader;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\Haejin\\Desktop\\iotest\\test3.txt";
		Reader r = new FileReader(fileName);
		int c;
		while((c=r.read())!=-1) {
			System.out.println((char)c);
		}
		
		
		r.close();
	}
}
