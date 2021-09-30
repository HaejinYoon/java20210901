package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex03BufferedReader {
	public static void main(String[] args) throws Exception{
		String name = "src/p18io/p03lecture/p06filter/Ex03BufferedReader.java";
		Reader reader = new FileReader(name);
		BufferedReader br = new BufferedReader(reader);
		
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		br.close();
		reader.close();
		System.out.println("Close");
	}
}
