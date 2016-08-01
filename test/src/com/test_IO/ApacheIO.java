package com.test_IO;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
/**
 * 使用apache提供的库进行文件的操作
 * @author zhangpengfei
 *	1.下载并add库文件commons-io-2.5.jar
 *  2.使用库文件提供的方法读取文件和复制文件
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
