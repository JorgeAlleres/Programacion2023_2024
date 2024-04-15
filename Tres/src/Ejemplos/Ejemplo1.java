package Ejemplos;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Un ejemplo de la utilización de estas estructuras es el siguiente:
		int a;

		System.out.println("Introduce numero");
		a = sc.nextInt();
		
		// Solo if
		if (a == 4) {
			System.out.println("La variable es igual a 4");
		}

		// If - else
		if (a > 5) {
			System.out.println("La variable es mayor a 5");
		} else {
			System.out.println("La variable es menor que 6");
		}
		
		//If - else if - else
		if (a > 5) {
			System.out.println("La variable es mayor a 5");
		} else if (a == 5) {
			System.out.println("La variable es igual a 5");
		} else {
			System.out.println("La variable es menor que 5");
		}
	}
}