package Boletin1;

import java.util.Scanner;

/*Pedir números hasta que se teclee un negativo, y mostrar cuantos numero has introducido*/

public class Ejercicio4 {

	public static boolean esPositivo(int num) {
		boolean resultado;
		if (num >= 0)
			resultado=true;
		else
			resultado=false;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, acumulador = 0;

		do {
			System.out.println("Introduce número");
			num = sc.nextInt();
			acumulador++;
			System.out.println("-----------------");
		} while (esPositivo(num)==true);
		System.out.println("Has escrito " + acumulador);
	}
}
