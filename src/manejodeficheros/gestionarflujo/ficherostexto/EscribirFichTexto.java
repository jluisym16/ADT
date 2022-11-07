package manejodeficheros.gestionarflujo.ficherostexto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichTexto {

	public static void main(String[] args) throws IOException {
		File fichero = new File ("J:\\ADT\\directorio\\fdsalkjñ.txt");
		FileWriter fic =new FileWriter (fichero, true);
		String cadena ="Esto es una prueba con FileWriter";
		char[] cad=cadena.toCharArray();
		String prov[]= {"1","1","1","1","1","1","1",};
		fic.write(cad);
		for(int i=0; i<prov.length;i++) {
			fic.write(prov[i]);
			fic.write("\n");
		}
		fic.append(".");
		fic.close();
	}

}
