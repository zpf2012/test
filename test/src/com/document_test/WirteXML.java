package com.document_test;

import java.io.File;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WirteXML {

	public static void main(String[] args) {
		try {
//			创建文件内容
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();//使用静态方法创建实例
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			
			Element root = doc.createElement("language");
			root.setAttribute("cat", "IT");
			Element lan1 = doc.createElement("lan");
			lan1.setAttribute("id", "1");
			Element name1 = doc.createElement("name");
			name1.setTextContent("Java");
			Element ide1 = doc.createElement("ide");
			ide1.setTextContent("Eclipse");
			
			lan1.appendChild(name1);
			lan1.appendChild(ide1);
			root.appendChild(lan1);
			doc.appendChild(root);
			
			
//	写入到新文件		
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			StringWriter writer = new StringWriter();
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			System.out.println(writer.toString());
			
			transformer.transform(new DOMSource(doc), new StreamResult(new File("new_xml.xml")) );
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

}
