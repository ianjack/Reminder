package com.nc.reminder.parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandler extends DefaultHandler {
	
	public static final String LOG_TAG = "XMLHandler";

	/*
	 * (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<attributes.getLength();i++){
			sb.append(attributes.getQName(i)+":"+attributes.getValue(i));
		}
		System.out.println("{ uri: "+uri+", localName: "+localName+", qName: "+qName+", attributes: { "+sb.toString()+" } }");
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		System.out.println(ch);
	}
}
