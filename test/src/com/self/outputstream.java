package com.self;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class outputstream {

	public static void main(String[] args) {
		File file = new File("files/out.txt");
		
		FileOutputStream output;
		try {
			output = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(output, "GBK");
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("�����Ҿ�վ��\n");
			bw.write("վ��������");
//			�ر��������ʱ�򣬻����������ݲŻᱻд���ļ���
			bw.close();
			osw.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
