package Boletin2;

import java.util.Scanner;

/*14. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.*/

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sueldo, acumulador = 0, suma = 0, acumulador2 = 0;

		do {
			System.out.println("Introduce sueldo");
			sueldo = sc.nextInt();
			acumulador++;
			suma = suma +sueldo;
			if (sueldo > 1000)
				acumulador2++;
		} while (acumulador != 10);

		System.out.println("La suma es " + suma);
		System.out.println("Sueldos mayores a 1000 hay " + acumulador2);
	}
}
