package Recursos;

import java.util.Scanner;

public class Factorial {

	public static int factorialRepetitivo (int numero) {
		int factorial=1;
		for(int i=numero;i>0;i--) {
			factorial*=i;
		}
		return factorial;
	}
	
	public static int factorialRecursivo (int numero) {
		if(numero>1)
			return numero*factorialRecursivo(numero-1);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce número, el rango es 1-9");
		numero=sc.nextInt();
		
		System.out.println("El factorial repetitivo es " + factorialRepetitivo(numero));
		System.out.println("El factorial recursivo es " + factorialRecursivo(numero));
	}
}
