package manejodeficheros.clasesasociadas;

import java.io.File;

public class VerInf {

	public static void main(String[] args) {
		File f = new File ("J:\\ADT\\ficheroaleatorio.dat");
		if(f.exists()) {
			System.out.println("Nombre: "+f.getName());
			System.out.println("Ruta: "+f.getPath());
			System.out.println("Ruta absoluta: "+f.getAbsolutePath());
			System.out.println("Se puede leer: "+f.canRead());
			System.out.println("Se puede escribir: "+f.canWrite());
			System.out.println("Tamaño: "+f.length());
			System.out.println("Es un directorio: "+f.isDirectory());
			System.out.println("Es un fichero: "+f.isFile());
			System.out.println("Nombre del directorio padre: " +f.getParent());
		}
	}

}
