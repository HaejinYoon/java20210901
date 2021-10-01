package p18io.p03lecture.p06filter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ex07OutputStreamWriter {
	public static void main(String[] args) throws Exception{
		OutputStream os = getOutputStream("C:\\Users\\Haejin\\Desktop\\iotest\\outtestH.txt");
		Writer writer = new OutputStreamWriter(os);
		os.write('a');
		os.write('한');
		
		writer.write('a');
		writer.write('한');
		
		writer.close();
		os.close();
	}
	
	
	public static OutputStream getOutputStream(String file) throws Exception {
		return new FileOutputStream(file);
	}
}
