package ejercicio_01;

import java.io.IOException;
import java.util.jar.Attributes;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

@SuppressWarnings("deprecation")
public class Ejercicio1_6 {
	public class GestionContenido extends DefaultHandler {
		public GestionContenido() {
			super();
		}

		public void startDocument() {
			System.out.println("Comienzo del DocumentoXML");
		}

		public void endDocument() {
			System.out.println("Final del DocumentoXML");
		}

		public void startElement(String uri, String nombre, String nombreC, Attributes atts) {
			System.out.printf("\t Principio Elemento: %s %n", nombre);
		}

		public void endElement(String uri, String nombre, String nombreC) {
			System.out.printf("\t Fin elemento %s %n ", nombre);
		}

		public void characters(char[] ch, int inicio, int longitud) throws SAXException {
			String car = new String(ch, inicio, longitud);
			car = car.replaceAll("[\t\n", "");
			System.out.printf("\t Caracters: %s %n", car);
		}
	}

	public static void main(String[] args) throws SAXException, IOException {
		XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
		//GestionContenido gestor = new GestionContenido();
		//procesadorXML.setContentHandler(gestor);
		InputSource fileXML = new InputSource("Empleados.xml");
		procesadorXML.parse(fileXML);

	}

	
}
