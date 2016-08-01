package com.document_test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

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
