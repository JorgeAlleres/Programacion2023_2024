package Propuestos;

import java.util.Scanner;

public class Once {

	// Devuelve el número de clientes que puede atender el restaurante
	public static int getComensales(double papas, double chocos) {
		int comensales = 0;
		boolean seguir = false;
		do {
			if (papas >= 1 && chocos >= 0.5) {
				comensales += 3;
				papas -= 1;
				chocos -= 0.5;
			} else {
				seguir = true;
			}
		} while (!seguir);
		return comensales;
	}

	// Devuelve el número de clientes que puede atender el restaurante
	public static int getComensales2(double papas, double chocos) {
		int comensales = 0;
		if (papas >= 2 * chocos) {
			comensales = 3 * (int) (chocos / 0.5);
		} else {
			comensales =3 * (int) (papas / 1);
		}
		return comensales;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double patatas, chocos;

		System.out.println("Patatas (KG):");
		patatas = sc.nextDouble();
		System.out.println("Chocos (KG):");
		chocos = sc.nextDouble();

		System.out.println("Número de comensales: " + getComensales(patatas, chocos));
		System.out.println("Número de comensales: " + getComensales2(patatas, chocos));
	}
}
