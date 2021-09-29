package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String ifile = "C:\\Users\\Haejin\\Desktop\\iotest\\다운로드.jpg";
		String ofile = "C:\\Users\\Haejin\\Desktop\\iotest\\outtest2.jpg";
		
		InputStream is = new FileInputStream(ifile);
		OutputStream os = new FileOutputStream(ofile);
		int content;
		while((content=is.read()) != -1) {
			os.write(content);
		}
		System.out.println("Program closed");
		is.close();
		os.close();
	}
}
