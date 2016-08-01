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
			
			bw.write("我想我就站在\n");
			bw.write("站在七月上");
//			关闭输出流的时候，缓冲区的内容才会被写到文件中
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
