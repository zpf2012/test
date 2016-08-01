package com.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("10.211.119.208", 12345);
			System.out.println("客户端已连接到服务器");
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			String line;
			line = br.readLine();
			System.out.println(line);				
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
