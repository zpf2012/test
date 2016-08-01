package com.test_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) {
		try {
			//创建输出流
			FileOutputStream fos = new FileOutputStream("text2.txt");
			//预设写到文件的字符串
			String s = "write 123123";
			//字符串转换为字符数组
			byte [] b = s.getBytes();
			//字符数组写入文件
			fos.write(b);
			//关闭输出流
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
