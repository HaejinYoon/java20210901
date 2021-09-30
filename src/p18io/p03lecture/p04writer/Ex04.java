package p18io.p03lecture.p04writer;

import java.io.FileWriter;
import java.io.Writer;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\Haejin\\Desktop\\iotest\\outtestC.txt";
		Writer wr = new FileWriter(name);
		
		wr.write("java");
		wr.write("\n");
		wr.write("spring");
		
		wr.close();
		
		System.out.println("done");
	}
}
