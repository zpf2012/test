package com.document_test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonWrite {

	public static void main(String[] args) {
		JsonObject object = new JsonObject();
		object.addProperty("cat", "IT");
//		创建数组元素
		JsonArray arr = new JsonArray();
//		添加数组元素lan1		
		JsonObject lan1 = new JsonObject();
		lan1.addProperty("id", 1);
		lan1.addProperty("name", "Java");
		lan1.addProperty("ide", "Eclipse");
		arr.add(lan1);
//		添加数组元素lan2	
		JsonObject lan2 = new JsonObject();
		lan2.addProperty("id", 2);
		lan2.addProperty("name", "Swift");
		lan2.addProperty("ide", "XCode");
		arr.add(lan2);
//		添加数组元素lan3	
		JsonObject lan3 = new JsonObject();
		lan3.addProperty("id", 3);
		lan3.addProperty("name", "C#");
		lan3.addProperty("ide", "Visual studio");
		arr.add(lan3);

		object.add("languages", arr);
		
		object.addProperty("pop", true);
//		可以使用json文件进行网络传输或者保存到本地文件
		System.out.println(object.toString());
	}

}
