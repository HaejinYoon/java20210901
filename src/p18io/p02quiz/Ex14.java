package p18io.p02quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex14 {
	public static void main(String[] args) throws Exception{
		String src = "C:\\Users\\Haejin\\Desktop\\iotest\\outtestF.txt";
		String des = "C:\\Users\\Haejin\\Desktop\\iotest\\outtestG.txt";
		
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);
		
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		int cont;
		long start = System.currentTimeMillis();
		while((cont=bis.read())!=-1) {
			bos.write(cont);
		} //22ms
//		while((cont=is.read())!=-1) {
//			os.write(cont);
//		} //8973ms
		long end = System.currentTimeMillis();
		
		System.out.println(end-start + "ms");
				
		
		bis.close();
		bos.close();
		
	}
}
