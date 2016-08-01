package com.test_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) {
		try {
			//创建文件输出流
			FileOutputStream fos = new FileOutputStream("text2.txt");
			//设置需要写入的内容
			String s = "write 123123";
			//转换为字节数组
			byte [] b = s.getBytes();
			//写入文件
			fos.write(b);
			//关闭流
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
