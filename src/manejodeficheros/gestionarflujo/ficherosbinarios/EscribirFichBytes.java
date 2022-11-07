package manejodeficheros.gestionarflujo.ficherosbinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFichBytes {

	public static void main(String[] args) throws IOException {
		File fic = new File ("J:\\ADT\\directorio\\FichBytes.dat");
		FileOutputStream fileout = new FileOutputStream ("fic", true);
		FileInputStream filein = new FileInputStream("fic");
		int i;
		//para escribir
		for( i=0; i<100;i++) {
			fileout.write(i);//Datos de salida que solo pueden ser int
		}
		fileout.close();
		
		//para leer
		while((i=filein.read())!=-1) {
			System.out.println(i);
		}
		filein.close();
	}

}
