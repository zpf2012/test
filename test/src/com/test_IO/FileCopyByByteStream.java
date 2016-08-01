package com.test_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyByByteStream {
	public static void main(String[] args) {
		try {
			//创建输入流用来读取文件
			FileInputStream fis = new FileInputStream("text.txt");
			
			//创建输出流用来写入文件
			FileOutputStream fos = new FileOutputStream("new_file.txt");
			StringBuilder sb = new StringBuilder();
			//创建字节数组存放读取的内容
			byte input[] = new byte[10];
			//fis.read()返回值为-1表示读取完毕，否则表示读到了内容
			while (fis.read(input)!=-1) {
			//写入文件
				fos.write(input);
			}	
			
			//关闭输入输出流
			fos.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
