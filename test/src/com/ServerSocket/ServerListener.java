package com.ServerSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerListener extends Thread{
	@Override
	public void run() {
		try {
			ServerSocket serverSocket = new ServerSocket(8899);
			while (true) {
//				bolck 阻塞
				System.out.println("服务器已启动。。。");
				Socket socket =  serverSocket.accept();
//				建立连接
				JOptionPane.showMessageDialog(null, "有客户端连接到了本地的12345端口");
//				将socket传递给新的线程
				new ChatSocket(socket).start();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ServerListener().start();
	}
}
