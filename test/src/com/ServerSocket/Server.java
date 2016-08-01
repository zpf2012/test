package com.ServerSocket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server extends Thread{
	
	@Override
	public void run() {
		String name = "客户端：[%s:%s]";
		
		try {
			ServerSocket ss = new ServerSocket(8899);
			Socket s = null;
			System.out.println("服务器已启动。。。");
			while (true) {
//				accept()返回值是socket
				s = ss.accept();
				System.out.println(String.format(name, s.getInetAddress().getHostAddress(),s.getPort()));
//				System.out.println("有客户连接");
//				向客户端输出一行数据（只能输出一行）
				PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
				pw.println(s.getInputStream());
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Server s = new Server();
		s.start();
	}
}
