package movidarepaso.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class aleatorio {
	/*
	 *cabecera: 4bytes
	 *byte: 1byte
	 *caracteres: 2bytes
	 *short: 2bytes
	 *int: 4bytes
	 *float: 4bytes
	 *double: 8bytes 
	 */

	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("J:\\ADT\\directorio\\aleatoriorep.dat","rw");
			System.out.println("introduce el id ");
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("" +raf.read());
		}catch(IOException e) {
			
		}
	}

	private static void escribir() throws FileNotFoundException, IOException {
		File f= new File ("J:\\ADT\\directorio\\aleatoriorep.dat");
		RandomAccessFile rand= new RandomAccessFile(f, "rw");
		
		// datos
		String apellidos[]= {"ap1", "ap2"};
		int dep[]= {1,2};
		Double sal[]= {11.11,22.22};
				
		for(int i=0; i<dep.length;i++) {
			rand.writeInt(i); //escribe el id de la persona
			rand.writeChars(apellidos[i].toString());
			rand.writeDouble(sal[i]);
		}
		rand.close();
	}

}
