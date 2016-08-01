package com.test_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteFile extends Thread{
	File file;
	int block;
	int l = 50;
	
	public WriteFile(File f, int i){
		this.file = f;
		this.block = i;
	}
	
	@Override
	public void run() {
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			raf.seek((block-1)*l);
			raf.writeBytes("this is block"+block);
			
			for (int i = 0; i < 20; i++) {
				raf.writeBytes("-");
			}
			raf.writeBytes("\n");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
