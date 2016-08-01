package com.test_IO;

import java.io.File;
import java.io.IOException;

public class test_03_FileProperty {

	public static void main(String[] args) {
		File file1 = new File("test.txt");
		try {
/**
 * ��ȡ�ļ�����
 */
			file1.createNewFile();
			System.out.println("�ļ��ľ���·����"+file1.getAbsolutePath());
//			��ȡ�ĸ���·��Ϊ��ǰ���·������һ���������ļ���ʱ���ϼ�·��Ϊ�գ�����������Ϊnull
			System.out.println("�ļ��ĸ���·����"+file1.getParent());
//			��ȡ����·���ķ�����ͨ������·������ת��
			System.out.println("�ļ��ĸ���·��Ϊ��"+new File(file1.getAbsolutePath()).getParent());
			System.out.println("�ļ��Ƿ����أ�"+file1.isHidden());
			System.out.println("�ļ��Ƿ�ɶ���"+file1.canRead());
			System.out.println("�Ƿ�Ϊ�ļ��У�"+file1.isDirectory());
/**
 * �޸��ļ�������			
 */
			File file2 = new File("test1.txt");
			if(file2.exists()){
//				����д����
				file2.setWritable(true);
//				���ö�����
				file2.setReadable(false);
//				����ֻ��
				file2.setReadOnly();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ�����ʧ��");
		}
		
	}
}
