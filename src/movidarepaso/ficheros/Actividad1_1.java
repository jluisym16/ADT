package movidarepaso.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad1_1 {

	public static void main(String[] args) throws IOException {
		String directorio;
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Introduce el directorio: ");
		directorio = br.readLine();
		File f = new File (directorio);
		String archivos[]= f.list();
		if(archivos== null){
			System.out.println("no hay archivos");
		}else {
			for (int i = 0; i<archivos.length;i++) {
				System.out.println("");
			}
		}
	}
}
