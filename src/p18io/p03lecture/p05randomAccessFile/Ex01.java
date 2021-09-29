package p18io.p03lecture.p05randomAccessFile;

import java.io.RandomAccessFile;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\Haejin\\Desktop\\iotest\\raf.txt";
		RandomAccessFile raf = new RandomAccessFile(name, "rw");
		
		raf.write('a');
		raf.write('a');
		raf.write('a');
		
		raf.seek(1);
		
		raf.write('d');
		raf.write('e');
		
		raf.close();
		System.out.println("Program closed");
		}
}
