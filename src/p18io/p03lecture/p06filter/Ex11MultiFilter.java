package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex11MultiFilter {
	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\Haejin\\Desktop\\iotest\\outtestJ.txt";
		
		InputStream is = new FileInputStream(file);
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		//inputStream to Reader
		//Reader를 BufferedReader로  감싸서 (BufferedReader의 변수 br)
		
		//읽어서 출력
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		System.out.println("Closed");
		is.close();
		
		
	}
}
