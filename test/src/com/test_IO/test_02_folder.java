package com.test_IO;
/**
 * �ļ��еĴ�����ɾ��
 */
import java.io.File;

public class test_02_folder {
	public static void main(String[] args) {
//		�����ļ���folder
		File folder = new File("new folder");
		folder.mkdir();
		System.out.println("�ļ��д������");
//		�����ļ���folder2	
		File folder2 = new File("one/two/three");
		folder2.mkdirs();
		if(folder2.exists()){
			System.out.println("�ļ��д����ɹ�");
		}
//		�����ļ���folder3���ڲ���delete����
		File folder3 = new File("one/two/three/main");
		folder3.mkdirs();
		
		folder2.delete();
		if(folder2.exists()){
//		��Ҫɾ�����ļ�����ֻҪ���ǿյģ����޷���ɾ��
			System.out.println("�ļ���ɾ��ʧ��");
		}else{
			System.out.println("�ļ���ɾ���ɹ�");
		}
		folder3.delete();
//		��Ҫɾ�����ļ�����ֻҪ���ǿյģ����޷���ɾ��		
		if(folder3.exists()){

			System.out.println("�ļ���3ɾ��ʧ��");
			System.out.println("ִ���ļ��б���...");
			
		}else{
			System.out.println("�ļ���3ɾ���ɹ�");
		}
	}
}
