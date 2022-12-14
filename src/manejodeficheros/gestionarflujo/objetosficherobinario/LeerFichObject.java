package manejodeficheros.gestionarflujo.objetosficherobinario;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

public class LeerFichObject {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		extracted();	
	}

	private static void extracted() throws IOException, FileNotFoundException, ClassNotFoundException {
		Persona persona;
		File fic = new File("J:\\ADT\\directorio\\FichPersona.dat");
		ObjectInputStream objectIS = new ObjectInputStream (new FileInputStream(fic));
		int i=1;
		try {
			while(true) {
				persona= (Persona) objectIS.readObject();
				System.out.println(i+"=>");
				i++;
				System.out.printf("Nombre: %s, edad: %d%n", persona.getNombre(), persona.getEdad());
			}
			}catch (EOFException eo) {
				System.out.println("FIN DE LECTURA DE FICHERO");
			}catch(StreamCorruptedException x) {	
			}
			objectIS.close();
	}
}
