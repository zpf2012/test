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
 * �ļ�д�����ִ�к��ļ��ᱻ����
 * @author zhangpengfei
 * �ļ��������裺1�������ļ��������2������������д�롣3����������д��
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
				
				bfw.write("����������Ѳɽ��\n");
				bfw.write("����������Ѳɽһ��\n");
				bfw.write("����������Ѳɽ����\n");
				bfw.write("����������Ѳɽ����\n");
				
				System.out.println("�ļ�д�����");
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
