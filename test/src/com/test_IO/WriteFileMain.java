package com.test_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * ʹ��RandomAccessFile���ļ������Դ�һ�������λ�ÿ�ʼ��ȡ
 * @author zhangpengfei
 *
 */
public class WriteFileMain {

	static File file = new File("test.txt");
	public static void main(String[] args) {
		/**
		 * ʹ���߳�д���ļ�
		 */
//		if(file.exists()){
//			file.delete();
//			
//		}
////		�����߳�
//		new WriteFile(file, 1).start();
//		new WriteFile(file, 2).start();
//		new WriteFile(file, 3).start();
//		new WriteFile(file, 4).start();
//		new WriteFile(file, 5).start();
//		
		/**
		 * ָ��ָ��100��λ�ã������λ�ÿ�ʼ��20���ֽڵ��ļ�����
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
