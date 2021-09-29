package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\Haejin\\Desktop\\iotest\\test2.txt";
		InputStream is = new FileInputStream(file);
		
		byte[] data = new byte[10];
		int dataSize1 = is.read(data);
		int dataSize2 = is.read(data);
		int dataSize3 = is.read(data);
		int dataSize4 = is.read(data);
		int dataSize5 = is.read(data); //더 이상 읽을 데이터가 없을 때는 -1
		int dataSize6 = is.read(data); //더 이상 읽을 데이터가 없을 때는 -1
		
		System.out.println(dataSize1);
		System.out.println(dataSize2);
		System.out.println(dataSize3);
		System.out.println(dataSize4);
		System.out.println(dataSize5);
		System.out.println(dataSize6);
		is.close();
	}
}
