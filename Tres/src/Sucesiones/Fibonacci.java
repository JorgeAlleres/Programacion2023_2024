package Sucesiones;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	// Termino enésimo inicial*razon^n-1
	// an = a1 * r ^ an-1

	/*
	 * 1------> 0+1 = 1
	 * 2------> 1+1 = 2
	 * 3------> 2+3 = 5
	 * 4------> 3+5 = 8
	 * 5------> 8+5 = 13
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int suma = 0;
		int[] progresion;
		int t0=0,t1=1, mostrados;
		int aux;

		System.out.println("Nº mostrados");
		mostrados = sc.nextInt();

		progresion = new int[mostrados];

		for (int i = 1; i < mostrados; i++) {
			aux= t0 + t1;
			progresion[i]=t0+t1;
			t0=t1;
			t1=aux;
			suma+=progresion[i];
		}
		
		System.out.println(Arrays.toString(progresion));
		System.out.println("La suma de los " + mostrados + " primeros términos de una \n"
				+ "progresión de fibonacci es: " + suma);
	}
}
