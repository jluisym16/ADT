package pruebainicial;
//package ej1;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedHashSet;
//
//public class Aplicacion {
//
//	public static void main(String[] args)throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Baño b;
//		Persona persona;
//		int opcion=0;
//		
//		boolean dia=true;
//		LinkedHashSet<Persona> log = new LinkedHashSet<>();
//		
//		menu();
//		while(dia=true) {
//		switch (opcion){
//		case 1:
//		//	entrar(b);
//			break;
//		case 2: 
//			//salir(b);
//			break;
//		}
//			
//		}
//		
//	}
//
//	private static void salir(Baño baño) {
//		baño.ocupado=false;
//	}
//
//	private static void entrar(Baño baño) {
//		if(baño.ocupado) {
//			System.out.println("El baño está ocupado, no puedes entrar");
//		}
//		else {
//			System.out.println("Ha de pagar 10 céntimos");
//			baño.recaudacion+=0.1;
//			baño.ocupado=true;
//		}
//	}
//
//	private static void menu() {
//		System.out.println("INDIQUE LA OPCION");
//		System.out.println("1- Entrar al baño");
//		System.out.println("2- Salir del baño");
//		}
//	
//	
//
//}
