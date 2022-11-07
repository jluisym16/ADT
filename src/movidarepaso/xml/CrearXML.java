package movidarepaso.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CrearXML {
	public static void main(String[] args) {
		
		try {
			//Para crear un parser, se tiene que crear una instancia del factory entre un trycatch
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			DocumentBuilder builder= factory.newDocumentBuilder();
			DOMImplementation implementation= builder.getDOMImplementation();
			
			Document documento = implementation.createDocument(null, "concesionario", null);
			
			Element coches= documento.createElement("coches");
			Element coche= documento.createElement("coche");
			
			Element matricula= documento.createElement("matricula");//se crea un elemento matricula
			Text textMatricula = documento.createTextNode("1111AAA");//se crea un texto
			matricula.appendChild(textMatricula);//le ponemos a matricula un valor 
			coche.appendChild(matricula);//le ponemos al coche un campo matricula
			
			coches.appendChild(coche);
			
			documento.getDocumentElement().appendChild(coches);
			
			Source source = new DOMSource(documento);
			Result result = new StreamResult(new File("J:\\ADT\\directorio\\concesionario.xml")); //ruta del archivo
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
