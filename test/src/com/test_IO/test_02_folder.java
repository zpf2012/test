package com.test_IO;
/**
 * 文件夹的创建，删除
 */
import java.io.File;

public class test_02_folder {
	public static void main(String[] args) {
//		创建文件夹folder
		File folder = new File("new folder");
		folder.mkdir();
		System.out.println("文件夹创建完成");
//		创建文件夹folder2	
		File folder2 = new File("one/two/three");
		folder2.mkdirs();
		if(folder2.exists()){
			System.out.println("文件夹创建成功");
		}
//		创建文件夹folder3用于测试delete函数
		File folder3 = new File("one/two/three/main");
		folder3.mkdirs();
		
		folder2.delete();
		if(folder2.exists()){
//		需要删除的文件夹中只要不是空的，就无法被删除
			System.out.println("文件夹删除失败");
		}else{
			System.out.println("文件夹删除成功");
		}
		folder3.delete();
//		需要删除的文件夹中只要不是空的，就无法被删除		
		if(folder3.exists()){

			System.out.println("文件夹3删除失败");
			System.out.println("执行文件夹遍历...");
			
		}else{
			System.out.println("文件夹3删除成功");
		}
	}
}
