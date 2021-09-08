package p10exception.p02quiz;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example8 {
	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
