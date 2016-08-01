package com.test_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferByteStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("RandomAccessFile.mp4");
			BufferedInputStream  bis = new BufferedInputStream(fis);
			/*
			 * BufferedInputStream  bis = new BufferedInputStream(fis,1000);
			 * 创建带有缓冲区的输入流
			 */
			
			
			FileOutputStream fos = new FileOutputStream("NewMovie.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int count = 0;
			long oldtime = System.currentTimeMillis();
			byte b[] = new byte [1500];
//			读取文件
			while(bis.read(b) != -1){
				bos.write(b);
				count++;
			};
			
//			关闭流
			bos.close();
			fos.close();
			bis.close();
			fis.close();
			
			System.out.println("读取的次数"+count);
			System.out.println("消耗的时间:"+(System.currentTimeMillis()-oldtime)+"ms");
			
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
