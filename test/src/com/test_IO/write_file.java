package com.test_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
/**
 * �ļ�д����
 * @author zhangpengfei
 * 
 */
public class write_file {

	public static void main(String[] args) {
		File f1 = new File("zpf.txt");		//ʹ��newʵ����������ÿ�ε��ú��������ᴴ��һ���µ��ļ�
		if (f1.exists()) {
			try {
				FileOutputStream fos = new FileOutputStream(f1);
				OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
				BufferedWriter bw = new BufferedWriter(osw);
				
				String str = "����С����ů�ҵ�����";
				bw.newLine();
				bw.write(str);
				
//				����ļ����Ȳ��رգ���ʱ�鿴�ļ����ݲ����ܿ���д�������
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
