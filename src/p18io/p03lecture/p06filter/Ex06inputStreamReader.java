package p18io.p03lecture.p06filter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex06inputStreamReader {
	public static void main(String[] args) throws Exception{
		InputStream is = getInputStream("C:\\Users\\Haejin\\Desktop\\iotest\\test5.txt");
		Reader reader = new InputStreamReader(is);
		
//		System.out.println((char) is.read());
//		System.out.println((char) is.read());
//		System.out.println((char) is.read());
//		System.out.println((char) is.read());
		
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		
		reader.close();
		is.close();
	}
	
	public static InputStream getInputStream(String file) throws Exception {
		
		return new FileInputStream(file);
	}
}
