package manejodeficheros.gestionarflujo.ficherostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichTextoBuf {

	public static void main(String[] args){
		try {
		File fichero = new File("J:\\ADT\\directorio\\escribirbuf.txt");
		BufferedReader br = new BufferedReader ( new FileReader (fichero));
		String linea;
		while((linea= br.readLine())!=null) {
			System.out.println(linea);
		}
		br.close();
		
	}catch(FileNotFoundException e) {
		System.out.println("No se encuentra el fichero");
	}catch (IOException e) {
		System.out.println("Es error de E/S");
	}
	
	}
}
