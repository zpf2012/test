package com.test_IO;

import java.io.File;
import java.io.IOException;

public class test_03_FileProperty {

	public static void main(String[] args) {
		File file1 = new File("test.txt");
		try {
/**
 * 获取文件属性
 */
			file1.createNewFile();
			System.out.println("文件的绝对路径："+file1.getAbsolutePath());
//			获取的父级路径为当前相对路径的上一级，创建文件的时候上级路径为空，所以输出结果为null
			System.out.println("文件的父级路径："+file1.getParent());
//			获取父级路径的方法是通过绝对路径进行转换
			System.out.println("文件的父级路径为："+new File(file1.getAbsolutePath()).getParent());
			System.out.println("文件是否隐藏："+file1.isHidden());
			System.out.println("文件是否可读："+file1.canRead());
			System.out.println("是否为文件夹："+file1.isDirectory());
/**
 * 修改文件的属性			
 */
			File file2 = new File("test1.txt");
			if(file2.exists()){
//				设置写属性
				file2.setWritable(true);
//				设置读属性
				file2.setReadable(false);
//				设置只读
				file2.setReadOnly();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件创建失败");
		}
		
	}
}
