package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		//파일내용 상관없이
		//outtest2.txt파일을
		//1024bytes 크기로 만들기
		String file = "C:\\Users\\Haejin\\Desktop\\iotest\\outtest2.txt";
		OutputStream os = new FileOutputStream(file);
		int i=0;
		while(i<1024) {
			os.write(i);
			i++;
		}
		System.out.println("Program closed");
		os.close();
	}
}
