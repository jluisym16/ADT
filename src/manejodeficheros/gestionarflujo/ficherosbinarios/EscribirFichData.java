package manejodeficheros.gestionarflujo.ficherosbinarios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFichData {
	public static void main(String[]args)throws IOException{
	File fic= new File ("J:\\ADT\\directorio\\FichData.dat");
	DataOutputStream dos = new DataOutputStream (new FileOutputStream(fic));
	String nombre[]= {"Ana","Luis","Miguel"};
	int edad[]= {1,2,3};
	for(int i=0; i<edad.length;i++) {
		dos.writeUTF(nombre[i]);
		dos.writeInt(edad[i]);
	}
	dos.close();
}
}
