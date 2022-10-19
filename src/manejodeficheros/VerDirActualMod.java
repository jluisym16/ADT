package manejodeficheros;

import java.io.File;

public class VerDirActualMod {
	public static void main(String[] args) {
		//Con esto se define la direccion
		String dir = args[1]; 
		//Escribe la ruta 
		System.out.println("Archivos en el directorio " +dir); 
		//Los contenidos de la ruta se guardan en un file
		File f = new File(dir); 
		 //Se crea un array y se guardan los nombres del file en éste
		String[] archivos= f.list();
		 //Se cuentan los archivos que hay dentro del array
		System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
		//Recorre el array
		for(int i= 0; i < archivos.length; i++) {
			File f2= new File(f, archivos[i]);
			System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", archivos[i], f2.isFile(), f2.isDirectory());
		}
	}
}
