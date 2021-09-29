package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\Haejin\\Desktop\\iotest\\test2.txt";
		InputStream is = new FileInputStream(file);
		
		byte[] data = new byte[10];
		int cnt = 0;
		
		while((cnt = is.read(data)) != -1) {
			
			for (int i=0; i<cnt; i++) {
				System.out.print(data[i] +",");
			}
			System.out.println();
		}
		System.out.println("Program exit");
		is.close();
	}
}
