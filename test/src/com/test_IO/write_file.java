package com.test_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
/**
 * 文件写入流
 * @author zhangpengfei
 * 
 */
public class write_file {

	public static void main(String[] args) {
		File f1 = new File("zpf.txt");		//使用new实例化对象导致每次调用函数，都会创建一个新的文件
		if (f1.exists()) {
			try {
				FileOutputStream fos = new FileOutputStream(f1);
				OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
				BufferedWriter bw = new BufferedWriter(osw);
				
				String str = "红红的小脸温暖我的心窝";
				bw.newLine();
				bw.write(str);
				
//				如果文件流等不关闭，此时查看文件内容并不能看到写入的内容
				bw.close();
				osw.close();
				fos.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
