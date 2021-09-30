package p18io.p02quiz;

import java.io.FileWriter;
import java.io.Writer;

public class Ex09 {
	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\Haejin\\Desktop\\iotest\\outtest8.txt";
		Writer wr = new FileWriter(file);
		
		for(int i=65;i<91;i++) {
			wr.write(i);
		}
				
		
		
		wr.close();
	}
}
