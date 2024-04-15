package IfElse;

import java.util.Scanner;

public class CuadraticaEcuacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=0, b=0, c=0;
		double disc=0;
		
		System.out.println("Dame a");
		a=sc.nextDouble();
		System.out.println("Dame b");
		b=sc.nextDouble();
		System.out.println("Dame c");
		c=sc.nextDouble();
		
		System.out.println();
		
		System.out.println("La ecuación es:");
		System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
		
		disc=Math.pow(b, 2) - (4 * a * c);
		
		if(disc>0 ) {
			System.out.println("La ecuación tiene 2 soluciones.");
		} else if (disc<0) {
			System.out.println("La ecuación no tiene solucion real.");
		} else {
			System.out.println("La ecuación tiene 1 solución.");
		}
	}
}
