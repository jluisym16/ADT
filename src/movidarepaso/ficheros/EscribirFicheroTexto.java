package movidarepaso.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroTexto {

	public static void main(String[] args) throws IOException {
		File f= new File("J:\\ADT\\directorio\\cosa.txt");
		FileWriter fic= new FileWriter (f);
		String cadena= "akjsfdajkf";
		System.out.println("Se ha escrito " +cadena);
		fic.close();
	}

}
