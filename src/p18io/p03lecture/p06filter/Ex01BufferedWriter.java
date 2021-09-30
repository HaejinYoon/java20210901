package p18io.p03lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Ex01BufferedWriter {
	public static void main(String[] args) throws Exception{
		// BufferedWriter
		
		
		String name = "C:\\Users\\Haejin\\Desktop\\iotest\\outtestE.txt";
		Writer writer = new FileWriter(name);
		BufferedWriter bw = new BufferedWriter(writer);
		
		long start = System.currentTimeMillis();
		for(int i=0; i<1024 * 1024 * 1024; i++) {
//			writer.write('a');
			bw.write('a');
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start + "ms");
		System.out.println("end");
		bw.close();
		writer.close();
		
	}
}
