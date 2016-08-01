package com.test_IO;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
/**
 * 使用Apache提供的api拷贝文件
 * @author zhangpengfei
 *	1.添加commons-io-2.5.jar
 *  2.使用库中提供的方法拷贝文件
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
