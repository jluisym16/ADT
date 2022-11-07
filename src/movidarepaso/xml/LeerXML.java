package movidarepaso.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LeerXML {

	public static void main(String[] args) {
		
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document documento =  builder.parse(new File("J:\\ADT\\directorio\\concesionario.xml"));
			NodeList listaCoches = documento.getElementsByTagName("coche");
			
			for(int i=0; i<listaCoches.getLength();i++) {
				Node nodo = listaCoches.item(i);
				if(nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element e= (ELEMENT) nodo;
					NodeList hijos = e.getChildNodes();
					for(int j=0;i<hijos.getLength();i++) {
							
					}
				}
			}
	}

}
