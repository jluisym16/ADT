package manejodeficheros.gestionarflujo.ficherostexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFichTextoPrint {

	public static void main(String[] args) {
		try {
			File fichero = new File ("J:\\ADT\\directorio\\escribirprint.txt");
			PrintWriter pw = new PrintWriter(new FileWriter(fichero));
			for(int i=0; i<10;i++) {
				pw.print("Fila nº: "+i);
			}
			pw.close();
		}catch(FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
		}catch (IOException e) {
			System.out.println("Es error de E/S");
		}
	}

}
