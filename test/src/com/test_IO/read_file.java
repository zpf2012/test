package com.test_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class read_file {
	public static void main(String[] args) throws IOException {
		File file = new File("zpf1.txt");
		file.createNewFile();
		if (file.exists()) {
			System.out.println("file Exist");
			try {
				//FileInputStream���ֽ���
				FileInputStream fis = new FileInputStream(file);	
				//InputStreamReader���ַ������ƶ��ַ������Ա�����������
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				//ʹ使用br.readLine()读取一行数据
				String line = null;
				while ((line = br.readLine())!= null) {
					System.out.println(line);
				}
				
				br.close();
				isr.close();
				fis.close();
		
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}else{
			System.out.println("�ļ�������");
		}
	}
}
