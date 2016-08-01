package com.test_IO;

import java.io.File;

public class test_04_filescan {
	public static void main(String[] args) {
		test_04_filescan t1 = new test_04_filescan();
		t1.printFiles(new File("../test"));
	}
	
	public void printFiles(File dir){
		if(dir.isDirectory()){
			File next[] = dir.listFiles();
			for(int i = 0; i < next.length; i++){				
				if(next[i].isDirectory()){
					System.out.print(next[i].getName()+"/");
					printFiles(next[i]);
				}else{
					System.out.println(next[i].getName());
				}
			}
		}
	}
}
