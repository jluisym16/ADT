package movidarepaso.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) throws IOException {
		File f = new File ("J:\\ADT\\directorio\\leerficherotexto.txt");
		try {
			FileReader fic = new FileReader(f);
			int i;
			while((i= fic.read()) != -1) {
				System.out.print((char)i);
			}
			fic.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
