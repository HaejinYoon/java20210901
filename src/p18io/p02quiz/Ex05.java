package p18io.p02quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		// 파일명:outtest4.txt
		// 파일크기:1024bytes
		// 내용은 상관없음
		// 파일 만들어보기
		// OutputStream.write(byte[]) 사용해보기
		
		OutputStream os = new FileOutputStream("C:\\Users\\Haejin\\Desktop\\iotest\\outtest4.txt");
		
		byte[] datas = new byte[1024];
		
		for(int i=0; i<1024;i++) {
			os.write(datas);
		}
				
		System.out.println("Program closed");
		os.close();
	}
}
