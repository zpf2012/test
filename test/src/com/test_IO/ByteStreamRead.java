package com.test_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamRead {
	public static void main(String[] args) {

		try {
			FileInputStream file3 = new FileInputStream("text.txt");
			byte byarr [] = new byte [10];	//设置的字符数组长度比文件内容大,
			file3.read(byarr);
			
			String instring = new String(byarr);
			System.out.println(instring);
			
			file3.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
