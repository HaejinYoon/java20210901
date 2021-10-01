package p18io.p03lecture.p07network;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) throws Exception{
		int port=33333;
		InetSocketAddress endpoint = new InetSocketAddress("192.168.35.135", port);
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(endpoint);
		
		System.out.println("Connection ready");
		
		Socket socket = serverSocket.accept();
		System.out.println(socket.getRemoteSocketAddress());

		System.out.println("Connection end");
		socket.close();
		serverSocket.close();
		
	}
}
