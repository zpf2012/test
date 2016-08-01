package com.test_IO;

import java.io.File;
import java.io.IOException;

public class test_01_file {	
	public static void main(String[] args) {
		File file = new File("new hello.txt");
//		System.out.println(file.getName());
//		
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
		
		File renameto = new File("src/hello.txt");
//		renameto操作可以将文件创建出来并命名，注意文件重命名时两个文件需要处于同一分区中
		file.renameTo(renameto);
		if(file.exists()){
			System.out.println("文件已经存在");
		}else{
			try {
				file.createNewFile();
				System.out.println("文件已经创建");
			} catch (IOException e) {
				System.out.println("文件无法创建");
			}
			
		}
	}

}
