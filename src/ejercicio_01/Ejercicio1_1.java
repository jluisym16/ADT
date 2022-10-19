package ejercicio_01;

import java.io.File;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		if (args.length !=1) {
			System.out.println("Hay que introducir un argumnento");
			System.exit(0);
		}
		String dir = args[0];
		File ds = new File(dir);
		if(ds.exists()) {
			File lista[]= ds.listFiles();
			for(int i=0; i<lista.length;i++) {
				System.out.println(lista[i]);
			}
		}else {
			System.out.println("Directorio inexistente");
		}
	}
}
