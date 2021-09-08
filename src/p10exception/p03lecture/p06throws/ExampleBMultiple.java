package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleBMultiple {
	public static void main(String[] args) throws Exception{
			method1();	
		}
		public static void method1() throws Exception {
			Class.forName("");//notfoundexception
			
			FileReader fr = new FileReader("");
			
			fr.close();
		}
}
