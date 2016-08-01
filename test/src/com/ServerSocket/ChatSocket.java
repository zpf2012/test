package com.ServerSocket;

import java.io.IOException;
import java.net.Socket;

public class ChatSocket extends Thread {

	Socket socket;

	public ChatSocket(Socket s) {
		this.socket = s;
	}

	public void chat(String out){
		try {
			socket.getOutputStream().write(out.getBytes("UTF-8"));
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		int count = 0;
		while (true) {
			count++;			
			chat("loop:"+count);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
