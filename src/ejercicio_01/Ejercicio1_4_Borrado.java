package ejercicio_01;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.InputStreamReader;
//import java.io.RandomAccessFile;
//
//public class Ejercicio1_4_Borrado {
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	File f = new File ("J:\\ADT\\cosa.dat");
//	RandomAccessFile r = new RandomAccessFile(f, "rw");
//	//no se porque hay fallo
//	//System.out.println("Introduzca el ID del empleado a modificar: ");
//	int id = Integer.parseInt(br.readLine());
//	int idDel = -1;
//	int depDel = 0;
//	double salDel = 0;
//	long pos = (id - 1) * 36;
//	//char [] apellido = new char[10];
//	//aqui tampoco
//	//char aux;
//	for (int i = 0; i < 1; i++) {
//		aux = (char) id;
//		apellido[i] = aux;
//	}
//	r.seek(pos);
//	r.writeInt(idDel);
//	String a = new String (apellido);
//	r.writeChars(a);
//	r.writeInt(depDel);
//	r.writeDouble(salDel);
//}
//}
