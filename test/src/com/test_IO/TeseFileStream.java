package com.test_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
/**
 * 文件写入操作执行后，文件会被创建
 * @author zhangpengfei
 * 文件创建步骤：1、创建文件输出流。2、创建输入流写入。3、创建缓冲写入
 *
 */
public class TeseFileStream {
	public static void main(String[] args) {
		File file = new File("text.txt");
		File file2 = new File("xunshan.txt");

		if(file.exists()){
			try {
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis, "GBK");
				BufferedReader bfr = new BufferedReader(isr);
				
				String line;
				while((line=bfr.readLine()) != null){
					System.out.println(line);
				}
				bfr.close();
				isr.close();
				fis.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				FileOutputStream fos = new FileOutputStream(file2);
				OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
				BufferedWriter bfw = new BufferedWriter(osw);
				
				bfw.write("大王叫我来巡山啊\n");
				bfw.write("大王叫我来巡山一次\n");
				bfw.write("大王叫我来巡山两次\n");
				bfw.write("大王叫我来巡山三次\n");
				
				System.out.println("文件写入完成");
				bfw.close();
				osw.close();
				fos.close();
//				file2.deleteOnExit();
				
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
