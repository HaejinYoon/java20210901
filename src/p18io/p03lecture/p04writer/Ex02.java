package p18io.p03lecture.p04writer;

import java.io.FileWriter;
import java.io.Writer;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\Haejin\\Desktop\\iotest\\outtest9.txt";
		Writer wr = new FileWriter(name);
		char[] datas = {'s','p','r','i','n','g'};
		char[] datas2 = {'j','a','v','a'};
		
		wr.write(datas);
		wr.write(datas2);
		wr.write(datas, 2, 4);
		wr.close();
		System.out.println("program closed");
	}
}
