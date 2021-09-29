package p18io.p03lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\\\Users\\\\Haejin\\\\Desktop\\\\iotest\\\\다운로드.jpg"); // 6778 bytes
		OutputStream os = new FileOutputStream("C:\\\\Users\\\\Haejin\\\\Desktop\\\\iotest\\\\outtest6.jpg");
		
		byte[] datas = new byte[100];
		int len = 0;
		
		while ((len = is.read(datas)) != -1) {
			os.write(datas, 0, len);
		}
		
		System.out.println("프로그램 종료");
		is.close();
		os.close();
	}
}
