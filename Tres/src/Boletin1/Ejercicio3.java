package Boletin1;

import java.util.Scanner;

/*Leer numeros hasta que se introduzca un 0. Para cada uno indicar si es par o impar,*/

public class Ejercicio3 {

	public static void esPar(int num) {
		if (num % 2 == 0)
			System.out.println("Es par");
		else
			System.out.println("Es impar");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Introduce número");
			num = sc.nextInt();
			esPar(num);
			System.out.println("-----------------");
		} while (num != 0);
	}
}
