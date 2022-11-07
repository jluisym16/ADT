package movidarepaso.ficheros.binario;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1_2 {

	public static void main(String[] args) throws IOException {
	
			
	try {
		FileReader f = new FileReader(args[0]);
		int i=f.read();
		while(i!=-1) {
			char m = (char) i;
			System.out.print(m);
			i=f.read();
		}
		f.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("No existe fichero");

	} catch (IndexOutOfBoundsException e) {
		// TODO Auto-generated catch block
		System.out.println("No hay argumento");

	}
	}
	
}
