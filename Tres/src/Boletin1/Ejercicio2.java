package Boletin1;

import java.util.Scanner;

/*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta se introduzca un 0.*/

public class Ejercicio2 {

	public static void esPositivo(int num) {
		if (num > 0)
			System.out.println("Es positivo");
		if (num < 0)
			System.out.println("Es negativo");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Introduce número");
			num = sc.nextInt();
			esPositivo(num);
			System.out.println("-----------------");
		} while (num != 0);
	}
}
