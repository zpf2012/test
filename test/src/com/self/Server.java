package com.self;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(12345);
			Socket socket = null;
			System.out.println("服务器已启动。。。");
			
			while (true) {
				socket = serverSocket.accept();
				System.out.println("有客户端连接服务器:"+socket.getInetAddress().getHostAddress()+":"+socket.getPort());
				
				String output = "Hello Client";
				
				PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
				pw.println(output);
				pw.println(socket.getOutputStream());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
