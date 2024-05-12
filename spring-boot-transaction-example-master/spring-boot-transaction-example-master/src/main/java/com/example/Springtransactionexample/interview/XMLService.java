package com.example.Springtransactionexample.interview;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;



@Service
public class XMLService
{
	public void xmlProcessor(@RequestBody String input)
			throws JAXBException, ParserConfigurationException, SAXException, IOException
	{
		input = "<students>\r\n" + "<student> \r\n" + "	<name>arpan</name>\r\n" + "	<age>13<age>\r\n"
				+ "	<id>234</id>\r\n" + "</student>\r\n" + "<student> \r\n" + "	<name>babu</name>\r\n"
				+ "	<age>13<age>\r\n" + "	<id>3333</id>\r\n" + "</student>\r\n" + "\r\n" + "</students>	";

		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = (Document) db.parse(new InputSource(new StringReader(input)));
		Map<String, String> xmltext = new HashMap<String, String>();
		
		NodeList nodeList = (NodeList) doc.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++)
		{
			Node node = nodeList.item(i);
			xmltext.put(node.getNodeName(), node.getNodeValue());
		}
		
		



	}

	// public void Map<>

}
