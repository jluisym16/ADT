package ejercicio_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class Ejercicio1_4_Mod {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File fic = new File ("J:\\ADT\\cosa.dat");
		RandomAccessFile file = new RandomAccessFile(fic, "rw");
		System.out.println("Introduzca el ID del empleado a modificar: ");
		int id = Integer.parseInt(br.readLine());
		long pos = (id - 1) * 36;
		file.seek(pos + 4);
		char [] apellido = new char[10];
		char aux;
		for (int i = 0; i < apellido.length; i++) {
			aux = file.readChar();
			apellido[i] = aux;
		}
		String a = new String (apellido);
		file.seek(pos + 28);
		double sal = file.readDouble();
		double sal_old = sal;
		System.out.println("Introduzca el salario a añadir: ");
		double add = Double.parseDouble(br.readLine());
		sal += add;
		file.seek(pos + 28);
		file.writeDouble(sal);
		System.out.println("apellido: " + a.trim() + "salario antes: " + sal_old + "salario ahora: " + sal );
	}

}
