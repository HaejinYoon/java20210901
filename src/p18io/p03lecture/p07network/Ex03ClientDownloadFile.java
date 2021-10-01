package p18io.p03lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Ex03ClientDownloadFile {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket();
		System.out.println("Connection try+++++++");
		socket.connect(new InetSocketAddress("192.168.35.135", 33333));
		System.out.println("Connection success+++");
		
		//socket InputStream
		//file OutputStream
		
		OutputStream os = new FileOutputStream("C:\\Users\\Haejin\\Desktop\\iotest\\서버.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(os);
		InputStream is = socket.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		
		System.out.println("File download starts++++");
		int data =0;
		while ((data=bis.read())!=-1) {
			bos.write(data);
		}
		System.out.println("File download completed+");
		
		bis.close();
		bos.close();
		socket.close();
	}
}
