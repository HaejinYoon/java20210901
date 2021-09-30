package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex12 {
	public static void main(String[] args) throws Exception{
		String file = "src/p18io/p02quiz/Ex12.java";
		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		
		int i=1;
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(i+":\t"+line);
			i++;
		}
		
		reader.close();
	}
}
