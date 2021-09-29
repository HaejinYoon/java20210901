package p18io.p03lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class Ex02 {
	public static void main(String[] args) throws Exception {
		byte[] datas = new byte[] {65, 65, 65, 65};
		
		OutputStream os = new FileOutputStream("C:\\Users\\Haejin\\Desktop\\iotest\\outtest3.txt");
		
		os.write(datas);
		os.write(datas);
		
		System.out.println("Program closed");
		os.close();
	}
}
