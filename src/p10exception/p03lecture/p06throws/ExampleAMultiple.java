package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleAMultiple {
public static void main(String[] args) {
		
		
		try {
			method1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			method1();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void method1() throws ClassNotFoundException, FileNotFoundException, IOException {
		Class.forName("");//notfoundexception
		
		FileReader fr = new FileReader("");
		
		fr.close();
	}
}
