package com.nc.reminder.parser;

import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public class XMLParse {

	private static final String URL = "http://www.google.com/notebook/feeds/17223754689560843137/notebooks/BDSMKQgoQ9py98Lcj?alt=rss";
	
	public XMLParse() {
	}

	public static void main(String... args) throws Exception {
		// obtenemos una instancia de la fabrica de parsers
		SAXParserFactory spf = SAXParserFactory.newInstance();
		// obtengo un nuevo parser SAX
		SAXParser sp = spf.newSAXParser();
		// obtengo el lector XML del parser SAX
		XMLReader xr = sp.getXMLReader();

		// obtengo la URL fuente
		URL sourceUrl = new URL(URL);

		// creo un nuevo manejador
		XMLHandler xh = new XMLHandler();
		// lo agrego al lector
		xr.setContentHandler(xh);
		// ejecuto la lectura de la URL y la parseo
		xr.parse(new InputSource(sourceUrl.openStream()));
		
		

	}
}
