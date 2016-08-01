package com.document_test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
/**
 * 使用一个string可以直接生成一个XML文件
 * @author zhangpengfei
 * 要求string中的字符串内容要符合XML文件的书写格式
 */
public class TestDom4j {

	public static void main(String[] args) {
		String  domstring = "<root><people>xiaofei</people></root>";
		
		try {
			Document document = DocumentHelper.parseText(domstring);
			
			System.out.println(document.asXML());
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
