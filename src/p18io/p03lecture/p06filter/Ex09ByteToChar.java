package p18io.p03lecture.p06filter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex09ByteToChar {
	public static void main(String[] args) throws Exception{
		String src = "C:\\Users\\Haejin\\Desktop\\iotest\\test5.txt";
		String des = "C:\\Users\\Haejin\\Desktop\\iotest\\test6.txt";
		
		InputStream is = new FileInputStream(src);
		OutputStream os =  new FileOutputStream(des);
		
		Reader rd = new InputStreamReader(is);
		Writer wr = new OutputStreamWriter(os);
		
		int data = 0;
		/* byte copy
		while((data=is.read())!=-1) {
			os.write(data);
		}
		*/
		
		// char copy
		while((data=rd.read())!=-1) {
			System.out.println((char) data);
			wr.write(data);
		}
		System.out.println("종료");
		
		
		
		
		
		is.close();
		os.close();
	}
}
