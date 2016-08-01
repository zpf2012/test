package com.test_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 通过输入输出流拷贝文件
 * @author zhangpengfei
 * 利用字节数组传送数据
 */
public class FileCopyByByteStream {
	public static void main(String[] args) {
		try {
			//创建文件输入流
			FileInputStream fis = new FileInputStream("text.txt");
			
			//创建文件输出流
			FileOutputStream fos = new FileOutputStream("new_file.txt");
			StringBuilder sb = new StringBuilder();
			//创建字符数组
			byte input[] = new byte[10];
			//输入流读取到字符数组
			while (fis.read(input)!=-1) {
			//字符数组写入输出流
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
