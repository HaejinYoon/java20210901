package p18io.p03lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02ServerSendFIle {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.35.135", 33333));
		
		System.out.println("Connection prepared ===========");
		Socket socket = serverSocket.accept();
		System.out.println("Connection Established=========");
		//file Inputstream
		//socket OutputStream
		
		InputStream is = new FileInputStream("C:\\Users\\Haejin\\Desktop\\iotest\\다운로드.jpg");
		BufferedInputStream bis = new BufferedInputStream(is);
		
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		System.out.println("File transmission starts=======");
		int data = 0;
		while((data=bis.read())!=-1) {
			bos.write(data);
		}
		System.out.println("File transmission ended========");
		
		bos.close();
		bis.close();
		
		socket.close();
		serverSocket.close();
	}
}
