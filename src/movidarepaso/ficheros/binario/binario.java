package movidarepaso.ficheros.binario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class binario {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * para escribir y guardar objetos en binario, es lo mismo que escribir datos,
		 * pero esta vez se escriben para un objeto, entonces se tienen que usar los
		 * metodos ObjectOutputStream o input adicionalmente
		 * 
		 */
		
		Persona persona;
		File f = new File ("J:\\ADT\\directorio\\FichPersonaRep.dat");
		FileOutputStream fic = new FileOutputStream(f, true);
		ObjectOutputStream fiche= new ObjectOutputStream(fic);
		
		String nombres[]= {"nom1", "nom2", "nom3"};
		int edad[]= {1,2,3};
		
		for(int i=0; i<nombres.length;i++) {
			persona= new Persona(nombres[i], edad[i]);
			fiche.writeObject(persona);
		}
		fiche.close();
		
		FileInputStream fich= new FileInputStream(f);
		ObjectInputStream leerfiche= new ObjectInputStream(fich);
		try {
			while(true) {
				//Como se lee un objeto se requiere de un cast y se obtienen los datos con el readObject
				persona = (Persona) leerfiche.readObject();
				System.out.println(persona.getEdad()+" "+persona.getNombre());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		leerfiche.close();
		
	}

}
