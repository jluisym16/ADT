package ejercicio_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1_2 {
	public static void main(String[] args) {
		FileReader reader = null;
		int aux = 0;
		try {
			if (args.length != 1) {
				System.out.println("Hay que introducir un argumento.");
				System.exit(0);
			}
			File archivo = new File(args[0]);
			reader = new FileReader(archivo);
			while ((aux = reader.read()) != -1)
				System.out.print((char) aux);
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
