package com.test_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyByByteStream {
	public static void main(String[] args) {
		try {
			//����������������ȡ�ļ�
			FileInputStream fis = new FileInputStream("text.txt");
			
			//�������������д���ļ�
			FileOutputStream fos = new FileOutputStream("new_file.txt");
			StringBuilder sb = new StringBuilder();
			//�����ֽ������Ŷ�ȡ������
			byte input[] = new byte[10];
			//fis.read()����ֵΪ-1��ʾ��ȡ��ϣ������ʾ����������
			while (fis.read(input)!=-1) {
			//д���ļ�
				fos.write(input);
			}	
			
			//�ر����������
			fos.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
