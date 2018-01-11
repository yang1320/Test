package com;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.dom4j.Attribute;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class TestXml {
		/**
		 * 　　XML的解析方式分为四种：1、DOM解析；2、SAX解析；3、JDOM解析；4、DOM4J解析。
		 * 其中前两种属于基础方法，是官方提供的平台无关的解析方式；
		 * 后两种属于扩展方法，它们是在基础的方法上扩展出来的，只适用于java平台。
		 * @throws IOException 
		 * @throws SAXException 
		 * @throws ParserConfigurationException 
		 * @throws DocumentException 
		 */
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, DocumentException {
//		DomParse();
		Dom4jParse();
	}
	
	@Test
	public static void DomParse() throws ParserConfigurationException,IOException, SAXException{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder  db=dbf.newDocumentBuilder();
		Document document=db.parse("source/book.xml");
		Element element=document.getDocumentElement();
//		System.out.println(element.getNodeName()+":\t"+element.getNodeValue());
//		System.out.println(element.getNodeType()+":\t"+element.getTagName()+"\ntext:\t"+element.getTextContent());
		NodeList nlist=element.getElementsByTagName("book");
		System.out.println(nlist.item(0).getNodeValue());
		System.out.println("1111111111:"+nlist.item(1).getChildNodes().item(1).getFirstChild().getNodeValue());
//		System.out.println("1111111111:"+nlist.item(1).getChildNodes().item(1).getTextContent());
		/**
		 * null
1111111111:安徒生童话
1111111111:安徒生童话
		 * 
		 */

	}
	
	
	@Test
	public static void Dom4jParse() throws DocumentException{
		SAXReader reader=new SAXReader();
		org.dom4j.Document document=reader.read(new File("source/book.xml"));
		org.dom4j.Element element=document.getRootElement();
		
		System.out.println("根节点："+element.getXPathResult(1).getName());
		System.out.println("根节点内容："+element.getText());
		Iterator iterator=element.elementIterator();
//		while(iterator.hasNext()){
//			System.out.println("name"+((org.dom4j.Element)iterator.next()).getName());
//			
//			System.out.println("ss"+((org.dom4j.Element)iterator.next()).getXPathResult(1).getText());
//		}
//		
//		/**
//		 根节点：book
//		根节点内容：
//		    
//		        
//		
//		namebook
//		ss安徒生童话
//		 */
		
//		while(iterator.hasNext()){
//			org.dom4j.Element element1=(org.dom4j.Element)iterator.next();
//			List<Attribute> list=element1.attributes();
//			
//			System.out.println(list.get(0).getName()+"\t"+list.get(0).getStringValue()+": "+list.get(0).getValue());
//		}
//		
		while(iterator.hasNext()){
			org.dom4j.Element element2=(org.dom4j.Element) iterator.next();
			
			System.out.println(element2.getName()+"\t"+element2.getStringValue());
			System.out.println(((org.dom4j.Element)element2.elements().get(1)).getStringValue());
		}
		
		
	}
	

}
