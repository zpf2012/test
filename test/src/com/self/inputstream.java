package com.self;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputstream {

	public static void main(String[] args) {
		File file = new File("files/xiaofei.txt");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			while ((line = br.readLine())!= null) {
				System.out.println(line);
			}
			
			br.close();
			isr.close();
			
//			while (isr.read()!= -1) {
//				System.out.println(isr.read());
//			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
