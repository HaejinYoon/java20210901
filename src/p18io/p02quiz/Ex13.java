package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex13 {
	public static void main(String[] args) throws Exception{
		String src = "src/p18io/p02quiz/Ex13.java";
		String des = "C:\\Users\\Haejin\\Desktop\\iotest\\Ex13.java";
		
		Reader r = new FileReader(src);
		BufferedReader br = new BufferedReader(r);
		Writer w = new FileWriter(des);
		BufferedWriter bw = new BufferedWriter(w);
		
		String line;
		int ln=1;
		while((line=br.readLine())!=null) {
			bw.write(ln+":"+line);
			bw.write("\n");
			ln++;
		}
		
		
		r.close();
		br.close();
		bw.close();
		w.close();
		System.out.println("Program terminated");
	}
}
