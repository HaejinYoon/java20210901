package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\Haejin\\Desktop\\iotest\\다운로드.jpg";
		InputStream is = new FileInputStream(name);
		
		byte[] data = new byte[100];
		int cnt = 0;
		int fileSize = 0;
		
		while((cnt=is.read(data))!=-1) {
			for(int i=0; i<cnt; i++) {
				fileSize++;
			}
		}
		
		System.out.println("파일크기: "+ fileSize+"bytes");
		System.out.println("프로그램 종료");
		is.close();
		
	}
}
