package com.test_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("zpf.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("zpf1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line;
			while ((line = br.readLine())!= null) {
				bw.write(line+"\n");
			}
			
			System.out.println("文件复制结束");
			bw.close();
			fw.close();
			br.close();
			fr.close();
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
