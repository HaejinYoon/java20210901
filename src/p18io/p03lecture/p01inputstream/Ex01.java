package p18io.p03lecture.p01inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18io/p03lecture/p01inputstream/Ex01.java";
		
		File file = new File(fileName);
		System.out.println(file.exists());
		
		String fileName2 = "C:\\Users\\Haejin\\Desktop\\iotest\\test1.txt";
		File file2 = new File(fileName2);
		System.out.println(file2.exists());
		
		InputStream is = new FileInputStream(file2);
		int byte1 = is.read(); // read : 1byte를 읽고 리턴
		int byte2 = is.read();
		int byte3 = is.read(); // 더이상 읽을 내용이 없으면 -1 리턴
		int byte4 = is.read();
		
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte3);
		System.out.println(byte4);
	}
}
