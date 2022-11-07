package ejercicio_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import manejodeficheros.gestionarflujo.objetosficherobinario.Persona;

public class Ejercicio1_5 {

	public static void main(String[] args) throws IOException {
		File fic = new File("J:\\ADT\\directorio\\FichPersona.dat");
		if (fic.exists()) {
			ObjectInputStream objectIS = new ObjectInputStream(new FileInputStream(fic));
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			Persona persona;
			try {
				DocumentBuilder builder = factory.newDocumentBuilder();
				DOMImplementation imp = builder.getDOMImplementation();
				Document doc = imp.createDocument(null, "Personas", null);
				doc.setXmlVersion("1.0");
				try {
					while (true) {
						persona = (Persona) objectIS.readObject();
						Element raiz = (Element) doc.createElement("persona");
						doc.getDocumentElement().appendChild((Node) raiz);
						CrearElemento("nombre", persona.getNombre().trim(), raiz, doc);
						CrearElemento("edad", Integer.toString(persona.getEdad()), raiz, doc);
					}
				} catch (Exception e) {
				}
				Source source = new DOMSource(doc);
				StreamResult result = new StreamResult(new java.io.File("Personas.xml"));
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
				transformer.transform(source, result);
				objectIS.close();
			} catch (Exception e) {
			}
		} else {
			System.out.println("EL FICHERO NO EXISTE");
		}
	}

	static void CrearElemento(String perso, String valor, Element raiz, Document document) {
		Element elem = (Element) document.createElement(perso);
		Text text = document.createTextNode(valor);
		((Node) raiz).appendChild((Node) elem);
		((Node) elem).appendChild(text);
	}


}
