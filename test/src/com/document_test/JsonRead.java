package com.document_test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonRead {

	public static void main(String[] args) {
		try {
			JsonParser parser = new JsonParser();
			JsonObject object = (JsonObject) parser.parse(new FileReader("test.json"));
//			获取json对象中的成员
			System.out.println("cat:"+object.get("cat").getAsString());
			System.out.println("pop:"+object.get("pop").getAsBoolean());
			
//			获取json文件中的数组对象
			JsonArray arr = object.get("languages").getAsJsonArray();
			for (int i = 0; i < arr.size(); i++) {
				System.out.println("------------------");
//			每一个数组作为一个json对象
				JsonObject subObject = arr.get(i).getAsJsonObject();
				System.out.println("id:"+subObject.get("id").getAsInt());
				System.out.println("name:"+subObject.get("name").getAsString());
				System.out.println("ide:"+subObject.get("ide").getAsString());
			
			}			
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
