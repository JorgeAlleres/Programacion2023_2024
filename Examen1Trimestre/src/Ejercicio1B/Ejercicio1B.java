package Ejercicio1B;

import java.util.Scanner;

/*Programar un algoritmo recursivo que permita invertir un número.
Ejemplo: Entrada: 1234 Salida: 4321*/

public class Ejercicio1B {
	
	private static int darVuelta(int num) {
		int numeroInvertido = 0;
		int digito;
		while (num != 0) {
			digito = num % 10;
			numeroInvertido = numeroInvertido * 10 + digito;
			num /= 10;
		}
		return numeroInvertido;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Introduce número");
		num = sc.nextInt();
		
		System.out.println("El número es: " + num);
		num=darVuelta(num);
		System.out.println("El número dado la vuelta es: " + num);
	}
}
