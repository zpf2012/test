package com.test_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) {
		try {
			//���������
			FileOutputStream fos = new FileOutputStream("text2.txt");
			//Ԥ��д���ļ����ַ���
			String s = "write 123123";
			//�ַ���ת��Ϊ�ַ�����
			byte [] b = s.getBytes();
			//�ַ�����д���ļ�
			fos.write(b);
			//�ر������
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
