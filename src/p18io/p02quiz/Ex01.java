package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\Haejin\\Desktop\\iotest\\다운로드.jpg";
		InputStream is = new FileInputStream(file);
		int size = 0;
		while(is.read() != -1) {
			size++;
		}
		
		System.out.println("파일크기: " + size);
		System.out.println("프로그램 종료");
		is.close();
		
	}
}
