package Recursos;

import java.util.Scanner;

public class Potencia {

	private static int potencia(int base, int exponente) {
		int resultado = 1;
		for(int i=0;i<exponente;i++) {
			resultado*=base;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, exponente;
		
		System.out.println("Introduce base");
		base=sc.nextInt();
		System.out.println("Introduce exponente");
		exponente=sc.nextInt();
		
		System.out.println("La potencia es: " + potencia(base, exponente));
		
	}
}
