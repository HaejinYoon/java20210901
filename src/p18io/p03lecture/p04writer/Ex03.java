package p18io.p03lecture.p04writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		String src = "C:\\Users\\Haejin\\Desktop\\iotest\\outtest9.txt";
		String des = "C:\\Users\\Haejin\\Desktop\\iotest\\outtestA.txt";
		
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);

		char[] datas = new char[3];
		int cnt = 0;
		
		while((cnt = rd.read(datas)) != -1) {
			wr.write(datas, 0, cnt);
		}
		
		
		
		rd.close();
		wr.close();
		
		System.out.println("Program closed");
	}
}
