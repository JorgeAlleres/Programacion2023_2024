package ejemplo3_2;

import java.util.Scanner;

public class LecturaPalabras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num_palabras;
		
		System.out.println("Nº palabras introducir");
		num_palabras=sc.nextInt();
		String[] words = new String[num_palabras];
		
		System.out.println("Escribe " + num_palabras + " palabras separadas por espacios.");
		System.out.println("Las puede escribir en líneas de texto diferentes");
		
		for(int i=0; i<num_palabras; i++) {
			String palabra = sc.next();
			System.out.println("Palabra " + i + ": Has escrito \" " + palabra + " \".");
		}
		sc.nextLine();
	}
}
