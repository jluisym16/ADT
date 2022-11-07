package manejodeficheros.gestionarflujo.ficherostexto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichTextoBuf {

	public static void main(String[] args) {
		try {
			File fichero = new File ("J:\\ADT\\directorio\\escribirbuf.txt");
			BufferedWriter bw= new BufferedWriter(new FileWriter(fichero));
			for(int i=0; i<10;i++) {
				bw.write("Línea nº: "+i);
				bw.newLine();
			}
			bw.close();
		}catch(FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
		}catch (IOException e) {
			System.out.println("Es error de E/S");
		}
	}

}
