package manejodeficheros.gestionarflujo.ficherostexto;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichTexto {

	public static void main(String[] args) throws IOException {
		File fichero= new File ("J:\\ADT\\directorio\\fichero2.txt");
		FileReader fic = new FileReader(fichero);
		int i; // no se pueden declarar variables dentro de los args del bucle
		while((i= fic.read()) !=-1) 
		{
			System.out.print((char)i);//se castea como char porque el resultado que devuelve es un int
		}
		fic.close();
	}

}
