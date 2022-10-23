package ejercicio_01;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1_3_Consulta {
	public static void main(String[] args) {
		//Se crea un scanner y un randomaccessfile para poder introducir datos y poder recorrer el archivo de manera no secuencial
		Scanner scanner = new Scanner(System.in);
		RandomAccessFile file;
		
		//Se introduce un id para comparar si existe en el archivo un id que no sea número
		System.out.println("ID: ");
		int id = 0;
		try {
			id = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Numero de empleado incorrecto.");
		}
		
		//Se crea un registro
		int registro;
		try {
			char [] apellido = new char[10];//se limita el tamaño que muestra a 10 caracteres
			File fic = new File("J:\\ADT\\cosa.dat");//directorio del archivo
			file = new RandomAccessFile(fic, "r");//se especifica el archivo y que solo se puede leer
			registro = id;
			int d = (registro - 1) * 36;
			if (fic.length() < (d + 1)) //se comprueba si el id es demasiado grande
			{
				System.out.println("ID " + id + ",no valido, no existe empleado, ID demasiado grande.");
				file.close();
			} else 	//en caso de que el id sea valido, se comprueba si el empleado existe
			{
				long pos = d;
				file.seek(pos);
				id = file.readInt();
				char aux;
				for (int i = 0; i < apellido.length; i++) //
				{
					aux = file.readChar();
					apellido[i] = aux;
				}
				String a = new String (apellido);
				int dep = file.readInt();
				double sal = file.readDouble();
				if (registro != id) {
					System.out.println("ID: " + registro + " del empleado no exise, está hueco");
				} else //en el caso de que todo este correcto muestra los datos
					{
					System.out.println("[ID: " + id + "] [DEPARTAMENTO: " + dep + "] [APELLIDO: " + a.trim() + "] [SALARIO: " + sal + "]");
				}
				file.close();
			}
		} catch (EOFException e)//en este catch se esfecifica que el empleado no existe
		{
			System.out.println("ID: " + id + " | No existe empleado, ID demasiado grande.");
		} catch (IOException e) //este catch recoge el resto de excepciones que no esten especificadas
		{
			System.out.println("IOException");
			e.printStackTrace();
		} 
	scanner.close();	
	}
}
