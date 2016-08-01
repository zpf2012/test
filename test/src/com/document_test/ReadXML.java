package com.document_test;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 * 读取XML文件内容
 * @author zhangpengfei
 *
 */
public class ReadXML {

	public static void main(String[] args) {
		try {
//			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse("languages.xml");
			
			Element root = doc.getDocumentElement();
			System.out.println("cat="+root.getAttribute("cat"));
			NodeList list = root.getElementsByTagName("lan");
			for (int i = 0; i < list.getLength(); i++) {
				Element lan = (Element) list.item(i);
				System.out.println("---------------");
				System.out.println("id="+lan.getAttribute("id"));
				
				NodeList c = lan.getChildNodes();
				for (int j = 0; j < c.getLength(); j++) {
					Node cc = c.item(j);
					if(cc instanceof Element){
						System.out.println(cc.getNodeName()+"="+cc.getTextContent());
					}
				}
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
