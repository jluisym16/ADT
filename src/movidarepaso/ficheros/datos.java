package movidarepaso.ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class datos {

	public static void main(String[] args) throws IOException {
		File f = new File("J:\\ADT\\directorio\\cosadatos.dat");
		String[] nombres = {"nom1", "nom2"};
		int[]edad= {1,2};
		try {
			DataOutputStream datOS= new DataOutputStream (new FileOutputStream(f));
			
			for(int i=0;i<edad.length;i++) {
				datOS.writeUTF(nombres[i]);
				datOS.writeInt(edad[i]);
				datOS.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			/*
			 * Para crear un archivo de objetos, se tiene que instanciar el directorio, para 
			 * mas adelante, dentro de un try-catch poder ahcer un bucle donde se escriban los datos
			 */
		}
		DataInputStream datIS = new DataInputStream ( new FileInputStream(f));
		String nom;
		int ed;
	
			try {
				while(true) {
					nom= datIS.readUTF();
					ed= datIS.readInt();
					System.out.println("Nombre: "+nom+" edad: "+ed);
				
}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		datIS.close();
	}
	/*
	 * para leer los datos de un archivo .dat primero se ha de acceder a el con un datainputstream, para mas tarde 
	 * obetener sus datos y almacenarlos en una variable local con la que mas tarde se escribirá dentro de un while
	 */

}
