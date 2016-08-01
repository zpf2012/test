package com.test_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 使用RandomAccessFile读文件，可以从一个随机的位置开始读取
 * @author zhangpengfei
 *
 */
public class WriteFileMain {

	static File file = new File("test.txt");
	public static void main(String[] args) {
		/**
		 * 使用线程写入文件
		 */
//		if(file.exists()){
//			file.delete();
//			
//		}
////		启动线程
//		new WriteFile(file, 1).start();
//		new WriteFile(file, 2).start();
//		new WriteFile(file, 3).start();
//		new WriteFile(file, 4).start();
//		new WriteFile(file, 5).start();
//		
		/**
		 * 指针指向100的位置，从这个位置开始读20个字节的文件内容
		 */
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "r");
			raf.seek(100);
			
			byte [] str = new byte [20];
			raf.read(str);
			String string = new String(str);
			
			System.out.println(string);
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
	}

}
