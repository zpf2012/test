package com.test_IO;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
/**
 * ʹ��apache�ṩ�Ŀ�����ļ��Ĳ���
 * @author zhangpengfei
 *	1.���ز�add���ļ�commons-io-2.5.jar
 *  2.ʹ�ÿ��ļ��ṩ�ķ�����ȡ�ļ��͸����ļ�
 */
public class ApacheIO {

	public static void main(String[] args) {
		File f = new File("test_io.txt");
		File f2 = new File("new_test_io.txt");
		try {
			
			String input = FileUtils.readFileToString(f,"GBK");
			System.out.println(input);
			
			FileUtils.copyFile(f, f2);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
