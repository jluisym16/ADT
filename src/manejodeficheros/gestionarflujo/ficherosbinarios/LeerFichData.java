package manejodeficheros.gestionarflujo.ficherosbinarios;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerFichData {

	public static void main(String[] args) throws IOException {
		File fic = new File("J:\\ADT\\directorio\\FichData.dat");
		DataInputStream dis = new DataInputStream(new FileInputStream(fic));
		String nom;
		int edad;
		try {
			while (true) {
				nom = dis.readUTF();
				edad = dis.readInt();
				System.out.println("Nombre: " + nom + " edad: " + edad);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		dis.close();
	}

}
