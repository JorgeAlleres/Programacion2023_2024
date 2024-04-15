package Sucesiones;

import java.util.Arrays;
import java.util.Scanner;

public class Geometrica {

	// Termino enésimo inicial*razon^n-1
	// an = a1 * r ^ an-1

	/*
	 * 1------> 1 Razon--> 2 2------> 1*2 = 2 3------> 2*2 = 4 4------> 4*2 = 8
	 * 5------> 8*2 = 16
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int suma = 0;
		int[] progresion;
		int inicial, razon, mostrados;

		System.out.println("Termino inicial");
		inicial = sc.nextInt();

		System.out.println("Razon");
		razon = sc.nextInt();

		System.out.println("Nº mostrados");
		mostrados = sc.nextInt();

		progresion = new int[mostrados];

		for (int i = 0; i < mostrados; i++) {
			progresion[i]=(inicial*(int)(Math.pow(razon, i)));
			suma+=progresion[i];
		}
		
		System.out.println(Arrays.toString(progresion));
		System.out.println("La suma de los " + mostrados + " primeros términos de una \n"
				+ "progresión aritmética de término inicial \n" + inicial + " y razon "
				+ razon + " es: " + suma);
	}
}
