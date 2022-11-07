package manejodeficheros.clasesasociadas;

import java.io.File;
import java.io.IOException;

public class CrearDir {

	public static void main(String[] args) {
		File d = new File("J:\\ADT\\directorio");
		File f1 = new File(d, "fichero1.txt");
		File f2 = new File(d, "fichero2.txt");
		d.mkdir();
		try {
			if (f1.createNewFile())
				System.out.println("Fichero1 creado correctamente");
			else
				System.out.println("No se ha podido crear el fichero1");
			if (f2.createNewFile())
				System.out.println("Fichero2 creado correctamente");
			else
				System.out.println("No se ha podido crear el fichero2");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		f1.renameTo(new File(d, "fichero1nuevo"));
		try {
			File f3 = new File("J:\\ADT\\directorio\\fichero3.txt");
			f3.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
