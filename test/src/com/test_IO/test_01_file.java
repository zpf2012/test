package com.test_IO;

import java.io.File;
import java.io.IOException;

public class test_01_file {	
	public static void main(String[] args) {
		File file = new File("new hello.txt");
//		System.out.println(file.getName());
//		
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
		
		File renameto = new File("src/hello.txt");
//		renameto�������Խ��ļ�����������������ע���ļ�������ʱ�����ļ���Ҫ����ͬһ������
		file.renameTo(renameto);
		if(file.exists()){
			System.out.println("�ļ��Ѿ�����");
		}else{
			try {
				file.createNewFile();
				System.out.println("�ļ��Ѿ�����");
			} catch (IOException e) {
				System.out.println("�ļ��޷�����");
			}
			
		}
	}

}
