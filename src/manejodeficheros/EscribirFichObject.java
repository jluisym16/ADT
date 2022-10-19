package manejodeficheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirFichObject {

	public static void main(String[] args) throws IOException {
		Persona persona;
		File fic = new File("G:\\ADT\\FichPersona.dat");
		FileOutputStream fileout = new FileOutputStream(fic, true);
		ObjectOutputStream objectOS = new ObjectOutputStream(fileout);
		String nombres[]= {"Ana","Luis Miguel", "Alicia", "Pedro", "Manuel", "Andres", "Julio", "María Jesus"};
		int edades []= {14,15,13,15,16,12,16,14};
		System.out.println("GRABO LOS DATOS DE PERSONA");
		for(int i=0; i<edades.length;i++) {
			persona= new Persona (nombres[i],edades[i]);
			objectOS.writeObject(persona);
			System.out.println("GRABO LOS DATOS DE PERSONA");
		}
		objectOS.close();
	}

}
