package ejercicio_01;

import java.io.*;

public class Ejercicio1_3_Insercion {

	public static void main(String[] args) throws IOException {

		// Para que se puedan meter datos, se ha de crear un bufferedreader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Se crea un file y se pone para que se pueda leer y escribir
		File fic = new File("J:\\ADT\\cosa.dat");
		RandomAccessFile file = new RandomAccessFile(fic, "rw");

		// Se pide la id
		System.out.println("Posicion del id: ");
		int id = Integer.parseInt(br.readLine());

		// se establece la posición
		long pos = (id - 1) * 36;
		file.seek(pos);

		// se pide el departamento y se almacena en un array
		System.out.println("Departamento: ");
		int dep = Integer.parseInt(br.readLine());
		int[] departamento = { dep };

		// Se pide el apellido
		System.out.println("Introduce el apellido: ");
		String apell = br.readLine();
		String[] apellido = { apell };

		// se pide el salario
		System.out.println("Introduce el salario: ");
		double salar = Double.parseDouble(br.readLine());
		double[] salario = { salar };

		// se crea un buffer vacio donde se almacena el apellido
		StringBuffer buffer = null;

		/*
		 * recorriendo con un bucle tantas veces como el largo del string de apellido,
		 * se establecen el id, el departamento, el apellido y el salario
		 */
		for (int i = 0; i < apellido.length; i++) {
			file.writeInt(id);
			buffer = new StringBuffer(apellido[i]);
			buffer.setLength(10);
			file.writeChars(buffer.toString());
			file.writeInt(departamento[i]);
			file.writeDouble(salario[i]);
		}

		// se cierra el archivo
		file.close();
	}

}
